package scott.service.demo;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;

import scott.dao.demo.LEDConfigurationDao;
import scott.entity.demo.OsicfgEntity;



/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonService<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Service("LEDConfigurationService")
public class LEDConfigurationService<T> extends BaseService<T>{
	private final static Logger log= Logger.getLogger(LEDConfigurationService.class);

	@Autowired
    private LEDConfigurationDao<T> dao;
	
	@Override
	public LEDConfigurationDao<T> getDao() {
		return dao;
	}
	
	public void update_osicfg(OsicfgEntity entity) throws Exception{
		getDao().update_osicfg(entity);
	}
	public String getId() throws Exception{
		return getDao().getId();
	}
	public int updateFlag(OsicfgEntity entity){
		return getDao().updateFlag(entity);
	}
	
	public void add_osicfg(OsicfgEntity entity){
		getDao().add_osicfg(entity);
	}
	public void del_osicfg(OsicfgEntity entity){
		getDao().del_osicfg(entity);
	}
	public void del_yc_inst(OsicfgEntity entity){
		getDao().del_yc_inst(entity);
	}
	public void del_yx_inst(OsicfgEntity entity){
		getDao().del_yx_inst(entity);
	}
	public void del_yk_inst(OsicfgEntity entity){
		getDao().del_yk_inst(entity);
	}

	public int del_yc_instAll() {
		//getDao().del_yc_instAll();
		return 1;
	}
	
	
}
