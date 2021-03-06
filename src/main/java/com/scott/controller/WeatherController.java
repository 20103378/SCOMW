package com.scott.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scott.entity.WeatherEntity;
import com.scott.service.WeatherService;

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
@RequestMapping("/Weather")
public class WeatherController extends BaseAction {

    private final static Logger log = Logger
            .getLogger(WeatherController.class);

    // Servrice start
    @Autowired(required = false)
    // 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
    private WeatherService<WeatherEntity> WeatherService;

    @RequestMapping("/getCurrentWeather")
    public void getOsicfgXml(HttpServletResponse response, HttpServletRequest request) throws Exception {
        List<WeatherEntity> weather = WeatherService.getWeather();
        WeatherEntity weatherEntity = new WeatherEntity();
        if(CollectionUtils.isEmpty(weather)){
            weatherEntity.setTemperature("--");
            weatherEntity.setHumidity("--");
            weatherEntity.setWindDirection("--");
            weatherEntity.setWindSpeed("--");
        }else {
            weatherEntity = weather.get(0);
        }
        HtmlUtil.writerJson(response, weatherEntity);
    }
}
