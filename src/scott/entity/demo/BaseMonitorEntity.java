package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class BaseMonitorEntity extends BaseEntity {
	
	private java.lang.String DeviceID;//设备ID	private java.lang.String StrName;//告警名称
	private java.lang.String StrValue;//告警值
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.String getStrName() {
		return StrName;
	}
	public void setStrName(java.lang.String strName) {
		StrName = strName;
	}
	public java.lang.String getStrValue() {
		return StrValue;
	}
	public void setStrValue(java.lang.String strValue) {
		StrValue = strValue;
	}
	}

