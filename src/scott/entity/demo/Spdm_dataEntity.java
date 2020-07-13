package scott.entity.demo;

import com.base.entity.BaseEntity;

public class Spdm_dataEntity extends BaseEntity {
	private String DeviceName;
	private java.lang.String DeviceID;//
	private java.util.Date SampleTime;//
	private java.lang.Double AcuPaDsch;//
	private java.lang.Double UhfPaDsch;//
	private java.lang.Double Phase;//
	private java.lang.Double PlsNum;//
	private java.lang.Double Remark;//
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
	public java.util.Date getSampleTime() {
		return SampleTime;
	}
	public void setSampleTime(java.util.Date sampleTime) {
		SampleTime = sampleTime;
	}
	public java.lang.Double getAcuPaDsch() {
		return AcuPaDsch;
	}
	public void setAcuPaDsch(java.lang.Double acuPaDsch) {
		AcuPaDsch = acuPaDsch;
	}
	public java.lang.Double getUhfPaDsch() {
		return UhfPaDsch;
	}
	public void setUhfPaDsch(java.lang.Double uhfPaDsch) {
		UhfPaDsch = uhfPaDsch;
	}
	public java.lang.Double getPhase() {
		return Phase;
	}
	public void setPhase(java.lang.Double phase) {
		Phase = phase;
	}
	public java.lang.Double getPlsNum() {
		return PlsNum;
	}
	public void setPlsNum(java.lang.Double plsNum) {
		PlsNum = plsNum;
	}
	public java.lang.Double getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.Double remark) {
		Remark = remark;
	}


}
