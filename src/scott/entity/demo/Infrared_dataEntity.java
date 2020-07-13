package scott.entity.demo;

import com.base.entity.BaseEntity;

public class Infrared_dataEntity extends BaseEntity {

	private java.lang.String DeviceID;// 设备ID
	private java.util.Date SampleTime;// 采集时间
	private String DeviceName;
	private java.lang.Double Tmp;// 温度
	private java.lang.Integer Remark; // 状态


	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.util.Date getSampleTime() {
		return SampleTime;
	}
	public void setSampleTime(java.util.Date sampleTime) {
		SampleTime = sampleTime;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public java.lang.Double getTmp() {
		return Tmp;
	}
	public void setTmp(java.lang.Double tmp) {
		Tmp = tmp;
	}
	public java.lang.Integer getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.Integer remark) {
		Remark = remark;
	}



}
