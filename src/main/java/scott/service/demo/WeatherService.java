package scott.service.demo;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scott.dao.demo.WeatherDao;
import com.base.service.BaseService;




/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonService<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Service("WeatherService")
public class WeatherService<T> extends BaseService<T>{
	private final static Logger log= Logger.getLogger(WeatherService.class);


    @Autowired
    private WeatherDao<T> dao;

    @Override
	public WeatherDao<T> getDao() {
        return dao;
    }

    public List<T> getWeather(String time){
        return getDao().getWeather(time);
    };

}