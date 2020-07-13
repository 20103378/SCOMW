package scott.entity.demo;

import com.base.entity.BaseEntity;

public class SMOAM_dataEntity extends BaseEntity {
	private String DeviceName;
	private java.lang.String DeviceID;// 设备ID
	private java.lang.String   SampleTime;// 采集时间
	private java.lang.Double TotA;	  // 全电流
	private java.lang.Double RisA;	  // 阻性电流
	private java.lang.Double RisCaRte;// 阻容比
	private java.lang.Double LastLigTm;// 最近动作时间
	private java.lang.Integer LigCnt;// 动作次数
	private java.lang.Integer Remark;// 备注

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
	public java.lang.Double getTotA() {
		return TotA;
	}
	public void setTotA(java.lang.Double totA) {
		TotA = totA;
	}
	public java.lang.Double getRisA() {
		return RisA;
	}
	public void setRisA(java.lang.Double risA) {
		RisA = risA;
	}
	public java.lang.Double getRisCaRte() {
		return RisCaRte;
	}
	public void setRisCaRte(java.lang.Double risCaRte) {
		RisCaRte = risCaRte;
	}
	public java.lang.Double getLastLigTm() {
		return LastLigTm;
	}
	public void setLastLigTm(java.lang.Double lastLigTm) {
		LastLigTm = lastLigTm;
	}
	public java.lang.Integer getLigCnt() {
		return LigCnt;
	}
	public void setLigCnt(java.lang.Integer ligCnt) {
		LigCnt = ligCnt;
	}
	public java.lang.Integer getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.Integer remark) {
		Remark = remark;
	}


}
