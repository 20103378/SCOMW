package scott.entity.demo;

import com.base.entity.BaseEntity;

public class SmoamAlarmEntity extends BaseEntity {
	private java.lang.String DeviceID;// 设备ID
	private double TotalCurrentThresHold;//泄漏电流上限(mA)
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public double getTotalCurrentThresHold() {
		return TotalCurrentThresHold;
	}
	public void setTotalCurrentThresHold(double totalCurrentThresHold) {
		TotalCurrentThresHold = totalCurrentThresHold;
	}

}
