package scott.dao.demo;
import java.util.List;

import scott.entity.demo.ProcstateEntity;
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
	
	
	public List<ProcstateEntity> getData();
	public List<ProcstateEntity> gethistoryList(BasePage page);
	public int historyListCount(BasePage page);
	public List<ProcstateEntity> getOsData();
	public List<ProcstateEntity> getCpData();
	
	
}
