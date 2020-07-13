package scott.dao.demo;


import scott.entity.demo.OsicfgEntity;

import com.base.dao.BaseDao;

/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface LEDConfigurationDao<T> extends BaseDao<T> {
	
	public void update_osicfg(OsicfgEntity entity);
	public String getId();
	public int updateFlag(OsicfgEntity entity);
	public void add_osicfg(OsicfgEntity entity);
	public void del_osicfg(OsicfgEntity entity);
	public void del_yc_inst(OsicfgEntity entity);
	public void del_yx_inst(OsicfgEntity entity);
	public void del_yk_inst(OsicfgEntity entity);
	public void del_yc_instAll();
	
}
