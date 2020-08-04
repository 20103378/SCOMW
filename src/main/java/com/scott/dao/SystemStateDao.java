package com.scott.dao;
import java.util.List;

import com.scott.entity.ProcstateEntity;
import com.base.dao.BaseDao;
import com.base.page.BasePage;
/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface SystemStateDao<T> extends BaseDao<T> {

	/**
	 * cpu使用率
	 * @return
	 */
	 List<ProcstateEntity> getData();

	/**
	 * 内存使用率
	 * @return
	 */
	 List<ProcstateEntity> getOsData();

	/**
	 * 内存cpu使用率
	 * @return
	 */
	 List<ProcstateEntity> getCpData();
}
