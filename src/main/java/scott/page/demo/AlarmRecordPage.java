package scott.page.demo;

import com.base.page.BasePage;

/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonPage<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class AlarmRecordPage extends BasePage {
	private java.lang.String Start;//设备ID
	private java.lang.String End;//设备ID
	private java.lang.Integer DeviceType;//设备类型
	private java.lang.Double RecordType;//告警类型
	public java.lang.String getStart() {
		return Start;
	}
	public void setStart(java.lang.String start) {
		Start = start;
	}
	public java.lang.String getEnd() {
		return End;
	}
	public void setEnd(java.lang.String end) {
		End = end;
	}
	public java.lang.Integer getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(java.lang.Integer deviceType) {
		DeviceType = deviceType;
	}
	public java.lang.Double getRecordType() {
		return RecordType;
	}
	public void setRecordType(java.lang.Double recordType) {
		RecordType = recordType;
	}
	}
