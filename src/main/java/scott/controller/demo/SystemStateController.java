package scott.controller.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.base.entity.BaseEntity;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import scott.entity.demo.ProcstateEntity;
import scott.page.demo.HistoryPage;
import scott.service.demo.SystemStateService;

import com.base.util.HtmlUtil;
import com.base.web.BaseAction;

/**
 * <br>
 * <b>功能：</b>JeecgPersonController<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Controller
@RequestMapping("/systemState")
public class SystemStateController extends BaseAction {

    private final static Logger log = Logger
            .getLogger(SystemStateController.class);

    @Autowired(required = false)
    // 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
    private SystemStateService<BaseEntity> systemStateService;

    /**
     * @param url
     * @param classifyId
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    public ModelAndView list() throws Exception {
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/systemState", context);
    }

    @RequestMapping("/getData")
    public void getData(HttpServletResponse response, HttpServletRequest request) throws Exception {
        List<ProcstateEntity> dataList = systemStateService.getData();
        List<ProcstateEntity> OsList = systemStateService.getOsData();
        List<ProcstateEntity> CpList = systemStateService.getCpData();
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("dataList", dataList);
        jsonMap.put("OsList", OsList);
        jsonMap.put("CpList", CpList);
        HtmlUtil.writerJson(response, jsonMap);
    }

    @RequestMapping("/gethistoryList")
    public void gethistoryList(HistoryPage page, HttpServletResponse response, HttpServletRequest request) throws Exception {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        List<ProcstateEntity> dataList = systemStateService.gethistoryList(page);
        jsonMap.put("total", page.getPager().getRowCount());
        jsonMap.put("rows", dataList);
        HtmlUtil.writerJson(response, jsonMap);
    }


}
