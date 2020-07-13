package scott.entity.demo;

import com.base.entity.BaseEntity;

public class Sf6_dataEntity extends BaseEntity {
	private String DeviceName;
	private java.lang.String DeviceID;// 设备ID
	private java.lang.String SampleTime;// 采集时间
	private java.lang.Double Tmp;// 温度
	private java.lang.Double Pres;// 压力
	private java.lang.Double Hum;// 湿度
	private java.lang.Double Den;// 密度
	private java.lang.Double MicrWat;// 微水
	private java.lang.Integer Remark; // 状态


	
	public java.lang.Double getDen() {
		return Den;
	}
	public void setDen(java.lang.Double den) {
		Den = den;
	}
	public java.lang.Double getMicrWat() {
		return MicrWat;
	}
	public void setMicrWat(java.lang.Double micrWat) {
		MicrWat = micrWat;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.String getSampleTime() {
		return SampleTime;
	}
	public void setSampleTime(java.lang.String sampleTime) {
		SampleTime = sampleTime;
	}
	public java.lang.Double getTmp() {
		return Tmp;
	}
	public void setTmp(java.lang.Double tmp) {
		Tmp = tmp;
	}
	public java.lang.Double getPres() {
		return Pres;
	}
	public void setPres(java.lang.Double pres) {
		Pres = pres;
	}
	public java.lang.Double getHum() {
		return Hum;
	}
	public void setHum(java.lang.Double hum) {
		Hum = hum;
	}
	public java.lang.Integer getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.Integer remark) {
		Remark = remark;
	}



}
