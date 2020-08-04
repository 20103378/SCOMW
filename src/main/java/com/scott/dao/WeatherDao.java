package com.scott.dao;

import java.util.List;

import com.base.dao.BaseDao;

/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface WeatherDao<T> extends
		BaseDao<T> {
	// public interface BaseTbldevicechannelDao<T1,T2,T3> {

	public List<T> getWeather();
}
