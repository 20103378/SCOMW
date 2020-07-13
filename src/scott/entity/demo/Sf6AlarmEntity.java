package scott.entity.demo;

import com.base.entity.BaseEntity;

public class Sf6AlarmEntity extends BaseEntity {
	private java.lang.String DeviceID;// 设备ID
	private double PressureThreshold;//压力告警值
	private java.lang.String PressureThresholdName;//压力告警值
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public double getPressureThreshold() {
		return PressureThreshold;
	}
	public void setPressureThreshold(double pressureThreshold) {
		PressureThreshold = pressureThreshold;
	}
	public java.lang.String getPressureThresholdName() {
		return PressureThresholdName;
	}
	public void setPressureThresholdName(java.lang.String pressureThresholdName) {
		PressureThresholdName = pressureThresholdName;
	}

}
