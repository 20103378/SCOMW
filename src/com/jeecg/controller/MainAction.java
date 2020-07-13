package com.jeecg.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.base.annotation.Auth;
import com.base.entity.TreeNode;
import com.base.entity.BaseEntity.DELETED;
import com.base.entity.BaseEntity.STATE;
import com.base.util.DateUtil;
import com.base.util.HtmlUtil;
import com.base.util.MethodUtil;
import com.base.util.SessionUtils;
import com.base.util.TreeUtil;
import com.base.util.URLUtils;
import com.base.util.UrlUtil;
import com.base.util.Constant.SuperAdmin;
import com.base.web.BaseAction;
import com.jeecg.entity.SysMenu;
import com.jeecg.entity.SysMenuBtn;
import com.jeecg.entity.SysUser;
import com.jeecg.page.SysUserModel;
import com.jeecg.service.SysMenuBtnService;
import com.jeecg.service.SysMenuService;
import com.jeecg.service.SysUserService;

@Controller
public class MainAction extends BaseAction {

	private final static Logger log = Logger.getLogger(MainAction.class);
	private String message = null;
	// Servrice start
	@Autowired(required = false)
	private SysMenuService<SysMenu> sysMenuService;

	@Autowired(required = false)
	private SysUserService<SysUser> sysUserService;

	@Autowired(required = false)
	private SysMenuBtnService<SysMenuBtn> sysMenuBtnService;

	/**
	 * 登录页面
	 * 
	 * @param url
	 * @param classifyId
	 * @return
	 */
	@Auth(verifyLogin = false, verifyURL = false)
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> context = getRootMap();
		return forword("login", context);
	}

	/**
	 * 检查用户名称
	 * 
	 * @param user
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@Auth(verifyLogin = false, verifyURL = false)
	@RequestMapping("/checkuser")
	public void checkuser(SysUserModel user, HttpServletRequest req,
			HttpServletResponse response) throws Exception {
		SysUser u = sysUserService.queryLogin(user.getEmail(),
				MethodUtil.MD5(user.getPwd()));
		if (u != null) {
			message = "用户: " + u.getNickName() + "登录成功";
			// -------------------------------------------------------
			// 登录次数加1 修改登录时间
			int loginCount = 0;
			if (u.getLoginCount() != null) {
				loginCount = u.getLoginCount();
			}
			u.setLoginCount(loginCount + 1);
			u.setLoginTime(DateUtil.getDateByString(""));
			sysUserService.update(u);
			// 设置User到Session
			SessionUtils.setUser(req, u);
			// 记录成功登录日志
			log.debug(message);
			sendSuccessMessage(response, message);
			// -------------------------------------------------------
		} else {
			sendFailureMessage(response, "用户名或密码错误!");
		}
	}

	/**
	 * 登录
	 * 
	 * @param email
	 *            邮箱登录账号
	 * @param pwd
	 *            密码
	 * @param verifyCode
	 *            验证码
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@Auth(verifyLogin = false, verifyURL = false)
	@RequestMapping("/toLogin")
	public void toLogin(String email, String pwd, String verifyCode,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String vcode = SessionUtils.getValidateCode(request);
		SessionUtils.removeValidateCode(request);// 清除验证码，确保验证码只能用一次
		if (StringUtils.isBlank(verifyCode)) {
			sendFailureMessage(response, "验证码不能为空.");
			return;
		}
		// 判断验证码是否正确
		if (!verifyCode.toLowerCase().equals(vcode)) {
			sendFailureMessage(response, "验证码输入错误.");
			return;
		}
		if (StringUtils.isBlank(email)) {
			sendFailureMessage(response, "账号不能为空.");
			return;
		}
		if (StringUtils.isBlank(pwd)) {
			sendFailureMessage(response, "密码不能为空.");
			return;
		}
		String msg = "用户登录日志:";
		SysUser user = sysUserService.queryLogin(email, MethodUtil.MD5(pwd));
		if (user == null) {
			// 记录错误登录日志
			log.debug(msg + "[" + email + "]" + "账号或者密码输入错误.");
			sendFailureMessage(response, "账号或者密码输入错误.");
			return;
		}
		if (STATE.DISABLE.key == user.getState()) {
			sendFailureMessage(response, "账号已被禁用.");
			return;
		}
		// 登录次数加1 修改登录时间
		int loginCount = 0;
		if (user.getLoginCount() != null) {
			loginCount = user.getLoginCount();
		}
		user.setLoginCount(loginCount + 1);
		user.setLoginTime(DateUtil.getDateByString(""));
		sysUserService.update(user);
		// 设置User到Session
		SessionUtils.setUser(request, user);
		// 记录成功登录日志
		log.debug(msg + "[" + email + "]" + "登录成功");
		sendSuccessMessage(response, "登录成功.");
	}

	/**
	 * 退出登录
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@Auth(verifyLogin = false, verifyURL = false)
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SessionUtils.removeUser(request);
		response.sendRedirect("login.shtml");
	}

	/**
	 * 获取Action下的按钮
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@Auth(verifyURL = false)
	@RequestMapping("/getActionBtn")
	public void getActionBtn(String url, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> actionTypes = new ArrayList<String>();
		// 判断是否超级管理员
		if (SessionUtils.isAdmin(request)) {
			result.put("allType", true);
		} else {
			String menuUrl = URLUtils.getReqUri(url);
			menuUrl = StringUtils.remove(menuUrl, request.getContextPath());
			// 获取权限按钮
			actionTypes = SessionUtils.getMemuBtnListVal(request,
					StringUtils.trim(menuUrl));
			result.put("allType", false);
			result.put("types", actionTypes);
		}
		result.put(SUCCESS, true);
		HtmlUtil.writerJson(response, result);
	}

	/**
	 * 修改密码
	 * 
	 * @param url
	 * @param classifyId
	 * @return
	 * @throws Exception
	 */
	@Auth(verifyURL = false)
	@RequestMapping("/modifyPwd")
	public void modifyPwd(String oldPwd, String newPwd,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SysUser user = SessionUtils.getUser(request);
		if (user == null) {
			sendFailureMessage(response, "对不起,登录超时.");
			return;
		}
		SysUser bean = sysUserService.queryById(user.getId());
		if (bean.getId() == null || DELETED.YES.key == bean.getDeleted()) {
			sendFailureMessage(response, "对不起,用户不存在.");
			return;
		}
		if (StringUtils.isBlank(newPwd)) {
			sendFailureMessage(response, "密码不能为空.");
			return;
		}
		// 不是超级管理员，匹配旧密码
		if (!MethodUtil.ecompareMD5(oldPwd, bean.getPwd())) {
			sendFailureMessage(response, "旧密码输入不匹配.");
			return;
		}
		bean.setPwd(MethodUtil.MD5(newPwd));
		sysUserService.update(bean);
		sendSuccessMessage(response, "Save success.");
	}

	/**
	 * ilook 首页
	 * 
	 * @param url
	 * @param classifyId
	 * @return
	 */
	@Auth(verifyURL = false)
	@RequestMapping("/main")
	public ModelAndView main(HttpServletRequest request) {
		Map<String, Object> context = getRootMap();
		SysUser user = SessionUtils.getUser(request);
		List<SysMenu> rootMenus = null;
		List<SysMenu> childMenus = null;
		List<SysMenuBtn> childBtns = null;
		// 超级管理员
		if (user != null && SuperAdmin.YES.key == user.getSuperAdmin()) {
			rootMenus = sysMenuService.getRootMenu(null);// 查询所有根节点
			childMenus = sysMenuService.getChildMenu();// 查询所有子节点
		} else {
			rootMenus = sysMenuService.getRootMenuByUser(user.getId());// 根节点
			childMenus = sysMenuService.getChildMenuByUser(user.getId());// 子节点
			childBtns = sysMenuBtnService.getMenuBtnByUser(user.getId());// 按钮操作
			buildData(childMenus, childBtns, request); // 构建必要的数据
		}
		context.put("user", user);
		context.put("menuList", treeMenu(rootMenus, childMenus));
		return forword("main/main", context);
	}

	/**
	 * md5验证
	 * 
	 * @param url
	 * @param classifyId
	 * @return
	 */
	@Auth(verifyLogin = false, verifyURL = false)
	@RequestMapping("/checkMd5")
	public void checkMd5(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		/*
		 * 登录时空指针异常代码无用 String path =
		 * request.getSession().getServletContext().getRealPath("/");
		 * 
		 * log.error(path); Map<String, Object> jsonMap = new HashMap<String,
		 * Object>(); GetMacAddr macAddr = new GetMacAddr(); //获取本地机器码 String
		 * addr = macAddr.getMACAddr().toUpperCase(); String
		 * lcMd5=MethodUtil.MD5(addr); log.error(addr); log.error(lcMd5);
		 * //获取文件中的机器码 String dirMd5 =macAddr.getlic(path);
		 * if(lcMd5.equals(dirMd5)){ jsonMap.put("data", "1"); }else{
		 * jsonMap.put("data", "0"); } HtmlUtil.writerJson(response, jsonMap);
		 */
	}

	/**
	 * md5验证
	 * 
	 * @param url
	 * @param classifyId
	 * @return
	 */
	@Auth(verifyLogin = false, verifyURL = false)
	@RequestMapping("/uploadlic")
	public void uploadlic(HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		// 获取文件夹名
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(2 * 1024 * 1024);
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> fileList = upload.parseRequest(request);// 这里可以有多个文件，
			InputStream is = null;
			String tkdm = null;
			String fileName = null;
			String path = request.getSession().getServletContext()
					.getRealPath("/");
			for (FileItem item : fileList) {
				fileName = item.getName();// 上传文件的名字
				is = item.getInputStream();// 上传文件流
			}
			// 如果不存在licence则创建
			File file = new File(path + "licence");
			// 如果文件夹不存在则直接返回
			// if (!file .exists())
			// {
			file.createNewFile();
			// }
			BufferedReader in2 = new BufferedReader(new InputStreamReader(is,
					"utf-8"));
			// 创建输出流
			File icdFile = new File(path + "licence");
			OutputStreamWriter os = new OutputStreamWriter(
					new FileOutputStream(icdFile), "UTF-8");
			PrintWriter pw = new PrintWriter(os);
			String y = "";
			while ((y = in2.readLine()) != null) {// 一行一行读
				pw.println(y);
			}
			Map<String, Object> jsonMap = new HashMap<String, Object>();
			jsonMap.put("dir", UrlUtil.getUrlUtil().getProj());
			pw.close();
			os.close();
			in2.close();
			is.close();
			HtmlUtil.writerJson(response, jsonMap);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 构建树形数据
	 * 
	 * @return
	 */
	private List<TreeNode> treeMenu(List<SysMenu> rootMenus,
			List<SysMenu> childMenus) {
		TreeUtil util = new TreeUtil(rootMenus, childMenus);
		return util.getTreeNode();
	}

	/**
	 * 构建树形数据
	 * 
	 * @return
	 */
	private void buildData(List<SysMenu> childMenus,
			List<SysMenuBtn> childBtns, HttpServletRequest request) {
		// 能够访问的url列表
		List<String> accessUrls = new ArrayList<String>();
		// 菜单对应的按钮
		Map<String, List> menuBtnMap = new HashMap<String, List>();
		for (SysMenu menu : childMenus) {
			// 判断URL是否为空
			if (StringUtils.isNotBlank(menu.getUrl())) {
				List<String> btnTypes = new ArrayList<String>();
				for (SysMenuBtn btn : childBtns) {
					if (menu.getId().equals(btn.getMenuid())) {
						btnTypes.add(btn.getBtnType());
						URLUtils.getBtnAccessUrls(menu.getUrl(),
								btn.getActionUrls(), accessUrls);
					}
				}
				menuBtnMap.put(menu.getUrl(), btnTypes);
				URLUtils.getBtnAccessUrls(menu.getUrl(), menu.getActions(),
						accessUrls);
				accessUrls.add(menu.getUrl());
			}
		}
		SessionUtils.setAccessUrl(request, accessUrls);// 设置可访问的URL
		SessionUtils.setMemuBtnMap(request, menuBtnMap); // 设置可用的按钮
	}
}
