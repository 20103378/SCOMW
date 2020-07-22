package scott.entity.demo;

import com.base.entity.BaseEntity;
import lombok.Data;

/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
@Data
public class AlarmRecordEntity extends BaseEntity {
	
	private java.lang.String DeviceType;//设备类型
	private java.lang.String EquipmentName;//主设备名
	private java.lang.String Phase;//设备相别
	private java.lang.String Space;//设备区域
	private java.lang.String DeviceName;//设备区域
	private java.lang.String Trigger_Date;//日期
	private java.lang.Double RecordType;//告警类型
	
	
	
	
}

