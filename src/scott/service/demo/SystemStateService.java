package scott.service.demo;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scott.dao.demo.SystemStateDao;
import scott.entity.demo.ProcstateEntity;
import com.base.page.BasePage;
import com.base.service.BaseService;

/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonService<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Service("SystemStateService")
public class SystemStateService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(SystemStateService.class);
	

	

	@Autowired
    private SystemStateDao<T> dao;
	
	@Override
	public SystemStateDao<T> getDao() {return dao;}
	
	public List<ProcstateEntity> getData()throws Exception{
		return getDao().getData();
	}
	public List<ProcstateEntity> getOsData()throws Exception{
		return getDao().getOsData();
	}
	public List<ProcstateEntity> getCpData()throws Exception{
		return getDao().getCpData();
	}
	
	public int historyListCount(BasePage page)throws Exception{
		return getDao().historyListCount(page);
	}
	public List<ProcstateEntity> gethistoryList(BasePage page)throws Exception{
		Integer rowCount = historyListCount(page);
		page.getPager().setRowCount(rowCount);
		return getDao().gethistoryList(page);
	}
	
	
	

	
}
