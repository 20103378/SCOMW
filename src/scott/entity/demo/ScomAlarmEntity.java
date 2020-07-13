package scott.entity.demo;

import com.base.entity.BaseEntity;

public class ScomAlarmEntity extends BaseEntity {
	private java.lang.String DeviceID;// 设备ID
	private java.lang.Double CGAmpThresHold;//泄漏电流上限(mA)
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.Double getCGAmpThresHold() {
		return CGAmpThresHold;
	}
	public void setCGAmpThresHold(java.lang.Double cGAmpThresHold) {
		CGAmpThresHold = cGAmpThresHold;
	}

}
