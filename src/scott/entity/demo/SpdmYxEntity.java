package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>遥信遥信实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class SpdmYxEntity extends BaseEntity {
	//
	private String DeviceName;
	private Object AcuPaDsch;
	private Object UhfPaDsch;
	private Object Phase;
	private Object PlsNum;
	//
	private String PaDschAlm;
	private String SupDevRun;
	private String MoDevConf;
	private String Health;
	private String DeviceID;
	private String SampleTime;
	private String Type;
	private String Remark;

	public SpdmYxEntity() {
	}
	public SpdmYxEntity(int l) {
        this.AcuPaDsch="无数据";
        this.UhfPaDsch="无数据";
        this.Phase="无数据";
        this.PlsNum="无数据";
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
	public Object getAcuPaDsch() {
		return AcuPaDsch;
	}
	public void setAcuPaDsch(Object acuPaDsch) {
		AcuPaDsch = acuPaDsch;
	}
	public Object getUhfPaDsch() {
		return UhfPaDsch;
	}
	public void setUhfPaDsch(Object uhfPaDsch) {
		UhfPaDsch = uhfPaDsch;
	}
	public Object getPhase() {
		return Phase;
	}
	public void setPhase(Object phase) {
		Phase = phase;
	}
	public Object getPlsNum() {
		return PlsNum;
	}
	public void setPlsNum(Object plsNum) {
		PlsNum = plsNum;
	}
	public String getPaDschAlm() {
		return PaDschAlm;
	}
	public void setPaDschAlm(String paDschAlm) {
		PaDschAlm = paDschAlm;
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

