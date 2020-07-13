package scott.dao.demo;
import java.util.List;

import scott.entity.demo.AlarmRecordEntity;
import scott.entity.demo.OperaterRecordEntity;
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
public interface EventRecordDao<T> extends BaseDao<T> {
	
	public int AlarmRecordCount(BasePage page);	
	public List<AlarmRecordEntity> getAlarmRecordList(BasePage page);
	
	public int OperaterRecordCount(BasePage page);	
	public List<OperaterRecordEntity> getOperaterRecordList(BasePage page);
	
	
}

