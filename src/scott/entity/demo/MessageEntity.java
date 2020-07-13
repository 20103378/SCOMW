package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class MessageEntity extends BaseEntity {
	private java.lang.String DeviceID;//告警类型
	private java.lang.String Remark;//告警类型
	private java.lang.String DeviceType;//设备类型
	private java.lang.String Space;//设备区域
	private java.lang.String DeviceName;//设备区域
	
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.String getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.String remark) {
		Remark = remark;
	}
	public java.lang.String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(java.lang.String deviceType) {
		DeviceType = deviceType;
	}
	public java.lang.String getSpace() {
		return Space;
	}
	public void setSpace(java.lang.String space) {
		Space = space;
	}
	public java.lang.String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(java.lang.String deviceName) {
		DeviceName = deviceName;
	}
	
	
	}

