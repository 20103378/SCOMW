package scott.entity.demo;

import com.base.entity.BaseEntity;

public class SpdmAlarmEntity extends BaseEntity {
	private java.lang.String DeviceID;// 设备ID
	private double PaDschThresHold;//压力告警值
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public double getPaDschThresHold() {
		return PaDschThresHold;
	}
	public void setPaDschThresHold(double paDschThresHold) {
		PaDschThresHold = paDschThresHold;
	}
}
