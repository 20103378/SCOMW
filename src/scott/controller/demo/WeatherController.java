package scott.controller.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scott.entity.demo.WeatherEntity;
import scott.service.demo.WeatherService;

import com.base.util.HtmlUtil;
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
@RequestMapping("/Weather")
public class WeatherController extends BaseAction {

	private final static Logger log = Logger
			.getLogger(WeatherController.class);

	// Servrice start
	@Autowired(required = false)
	// 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
	private WeatherService<WeatherEntity> WeatherService;

    @RequestMapping("/getWeather")
    public void getOsicfgXml(String time ,HttpServletResponse response,HttpServletRequest request) throws Exception {
        time = time+"%";
        List<WeatherEntity> weather = WeatherService.getWeather(time);
        if(weather.size()==0){
            WeatherEntity Sf6YxEntity_null=new WeatherEntity(1);
            weather.add(Sf6YxEntity_null);
        }
        if(weather.get(0)==null){
            weather.remove(0);
            WeatherEntity weather_null=new WeatherEntity(1);
            weather.add(weather_null);
        }
          HtmlUtil.writerJson(response, weather);
    }
}
