package scott.controller.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import scott.page.demo.JeecgPersonPage;
import com.base.web.BaseAction;

/**
 * <br>
 * <b>功能：</b>JeecgPersonController<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Controller
@RequestMapping("/Map")
public class MapController extends BaseAction {

    private final static Logger log = Logger
            .getLogger(MapController.class);

    // Servrice start
    @Autowired(required = false)
    // 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
    /**
     * 换流变地图页
     */
    @RequestMapping("/ft_map")
    public ModelAndView ft_map(JeecgPersonPage page, HttpServletRequest request) throws Exception {
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/ftmap", context);
    }

    /**
     * GIS地图页
     */
    @RequestMapping("/gis_map")
    public ModelAndView gis_map(JeecgPersonPage page, HttpServletRequest request) throws Exception {
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/gismap", context);
    }

    /**
     * 直流场地图页
     */
    @RequestMapping("/zlc_map")
    public ModelAndView zlc_map(JeecgPersonPage page, HttpServletRequest request) throws Exception {
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/zlcmap", context);
    }

    /**
     * 交流场
     */
    @RequestMapping("/jlc_map")
    public ModelAndView jlc_map(JeecgPersonPage page, HttpServletRequest request) throws Exception {
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/jlcmap", context);
    }


}
