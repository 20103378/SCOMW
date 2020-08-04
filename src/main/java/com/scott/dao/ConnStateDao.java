package com.scott.dao;
import java.util.List;
import java.util.Map;

import com.scott.entity.CacCagConnStateEntity;
import com.scott.entity.CacExeStateEntity;
import com.scott.entity.CacIedConnStateEntity;
import com.scott.entity.TreeConnEntity;

import com.base.dao.BaseDao;
/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface ConnStateDao<T> extends BaseDao<T> {
	
	
	public List<TreeConnEntity> getEmuListData();
	
	public List<TreeConnEntity> getDataByID(String id);
	
	public List<TreeConnEntity> getHistoryData(Map<String, Object> jsonMap);

	public List<TreeConnEntity> getAMCListData();

	public List<TreeConnEntity> get104connData();

	//得到程序运行状态
	public List<CacExeStateEntity> getProgramListData();
	//cac与各装置通讯日志
	public List<CacIedConnStateEntity> getCACStateListData();
	//cac与cag通讯日志
	public List<CacCagConnStateEntity> getCAGStateListData();
}

