package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>油色谱遥信实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class SmoamYxEntity extends BaseEntity {
	//
	private Object TotA;
	private Object RisA;
	private Object RisCaRte;
	private Object LastLigTm;
	private Object LigCnt;
	private String DeviceName;
	//
	private String SupDevRun;  //监测设备运行异常
	private String MoDevConf;
	private String Health;
	private String TotAAlm;
	private String DeviceID;
	private String SampleTime;
	private String Type;
	private String Remark;

    public SmoamYxEntity() {

    }
    public SmoamYxEntity(int l) {
        this.TotA="无数据";
        this.RisA="无数据";
        this.RisCaRte="无数据";
        this.LastLigTm="无数据";
        this.LigCnt="无数据";
    }

	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public String getTotAAlm() {
		return TotAAlm;
	}
	public void setTotAAlm(String totAAlm) {
		TotAAlm = totAAlm;
	}
	public String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}
	public String getSampleTime() {
		return SampleTime;
	}
	public void setSampleTime(String sampleTime) {
		SampleTime = sampleTime;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Object getTotA() {
		return TotA;
	}
	public void setTotA(Object totA) {
		TotA = totA;
	}
	public Object getRisA() {
		return RisA;
	}
	public void setRisA(Object risA) {
		RisA = risA;
	}
	public Object getRisCaRte() {
		return RisCaRte;
	}
	public void setRisCaRte(Object risCaRte) {
		RisCaRte = risCaRte;
	}
	public Object getLastLigTm() {
		return LastLigTm;
	}
	public void setLastLigTm(Object lastLigTm) {
		LastLigTm = lastLigTm;
	}
	public Object getLigCnt() {
		return LigCnt;
	}
	public void setLigCnt(Object ligCnt) {
		LigCnt = ligCnt;
	}
	public String getSupDevRun() {
		return SupDevRun;
	}
	public void setSupDevRun(String supDevRun) {
		SupDevRun = supDevRun;
	}
	public String getMoDevConf() {
		return MoDevConf;
	}
	public void setMoDevConf(String moDevConf) {
		MoDevConf = moDevConf;
	}
	public String getHealth() {
		return Health;
	}
	public void setHealth(String health) {
		Health = health;
	}

}

