package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>油色谱遥信实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class Sf6YxEntity extends BaseEntity {

	//
	private String DeviceName;
	private Object Tmp;// 温度
	private Object Pres;// 压力
	private Object Hum;// 湿度
	//
	private String SupDevRun;  //监测设备运行异常
	private String MoDevConf;
	private String DenAlm;
	private String Health;
	private String DeviceID;
	private String SampleTime;
	private String Type;
	private String Remark;
	public Sf6YxEntity() {

	}

    public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
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

	public String getDeviceName() {
		return DeviceName;
	}

	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}

	public Sf6YxEntity(int l) {
        this.Tmp="无数据";
        this.Pres="无数据";
        this.Hum="无数据";
    }
	public Object getTmp() {
		return Tmp;
	}
	public void setTmp(Object tmp) {
		Tmp = tmp;
	}
	public Object getPres() {
		return Pres;
	}
	public void setPres(Object pres) {
		Pres = pres;
	}
	public Object getHum() {
		return Hum;
	}
	public void setHum(Object hum) {
		Hum = hum;
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
	public String getDenAlm() {
		return DenAlm;
	}
	public void setDenAlm(String denAlm) {
		DenAlm = denAlm;
	}
	public String getHealth() {
		return Health;
	}
	public void setHealth(String health) {
		Health = health;
	}
}

