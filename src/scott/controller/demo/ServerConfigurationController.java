package scott.controller.demo;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import scott.entity.demo.JeecgPersonEntity;
import scott.entity.demo.TreeDeviceEntity;
import scott.page.demo.JeecgPersonPage;
import scott.service.demo.LEDConfigurationService;
import scott.service.demo.SystemConfigurationService;

import com.base.web.BaseAction;

/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonController<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Controller
@RequestMapping("/serverConfiguration")
public class ServerConfigurationController extends BaseAction {

	private final static Logger log = Logger
			.getLogger(ServerConfigurationController.class);

	// Servrice start
	@Autowired(required = false)
	// 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
	private SystemConfigurationService<JeecgPersonEntity> systemConfigurationService;
	@Autowired(required = false)
	private LEDConfigurationService<TreeDeviceEntity> LEDService;

	@RequestMapping("/list")
	public ModelAndView list(JeecgPersonPage page, HttpServletRequest request)throws Exception {
		Map<String, Object> context = getRootMap();
		return forword("scott/demo/serverRestart", context);
	}
}
