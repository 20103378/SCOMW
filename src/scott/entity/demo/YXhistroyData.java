package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class YXhistroyData extends BaseEntity {
	
	private java.lang.String deviceID;//设备ID	private java.lang.String sampleTime;//
	private java.lang.Integer phyHealth;//
	private java.lang.Integer supDevRun;//运行异常告警
	private java.lang.Integer moDevConf;//通讯异常告警
	private java.lang.Integer health;//
	private java.lang.Integer gasUnPresAlm;//载气欠压告警
	private java.lang.Integer gasLowPresAlm;//载气低压告警
	private java.lang.Integer actCyGasSta;//实际气瓶供气状态
	private java.lang.Integer gasBot;//气瓶状态
	private java.lang.Integer gasLowPresAlm2;//载气2低压告警
	private java.lang.Integer gasUnPresAlm2;//载气2欠压告警
	
	public java.lang.String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		this.deviceID = deviceID;
	}
	public java.lang.String getSampleTime() {
		return sampleTime;
	}
	public void setSampleTime(java.lang.String sampleTime) {
		this.sampleTime = sampleTime;
	}
	public java.lang.Integer getPhyHealth() {
		return phyHealth;
	}
	public void setPhyHealth(java.lang.Integer phyHealth) {
		this.phyHealth = phyHealth;
	}
	public java.lang.Integer getSupDevRun() {
		return supDevRun;
	}
	public void setSupDevRun(java.lang.Integer supDevRun) {
		this.supDevRun = supDevRun;
	}
	public java.lang.Integer getMoDevConf() {
		return moDevConf;
	}
	public void setMoDevConf(java.lang.Integer moDevConf) {
		this.moDevConf = moDevConf;
	}
	public java.lang.Integer getHealth() {
		return health;
	}
	public void setHealth(java.lang.Integer health) {
		this.health = health;
	}
	public java.lang.Integer getGasUnPresAlm() {
		return gasUnPresAlm;
	}
	public void setGasUnPresAlm(java.lang.Integer gasUnPresAlm) {
		this.gasUnPresAlm = gasUnPresAlm;
	}
	public java.lang.Integer getGasLowPresAlm() {
		return gasLowPresAlm;
	}
	public void setGasLowPresAlm(java.lang.Integer gasLowPresAlm) {
		this.gasLowPresAlm = gasLowPresAlm;
	}
	public java.lang.Integer getActCyGasSta() {
		return actCyGasSta;
	}
	public void setActCyGasSta(java.lang.Integer actCyGasSta) {
		this.actCyGasSta = actCyGasSta;
	}
	public java.lang.Integer getGasBot() {
		return gasBot;
	}
	public void setGasBot(java.lang.Integer gasBot) {
		this.gasBot = gasBot;
	}
	public java.lang.Integer getGasLowPresAlm2() {
		return gasLowPresAlm2;
	}
	public void setGasLowPresAlm2(java.lang.Integer gasLowPresAlm2) {
		this.gasLowPresAlm2 = gasLowPresAlm2;
	}
	public java.lang.Integer getGasUnPresAlm2() {
		return gasUnPresAlm2;
	}
	public void setGasUnPresAlm2(java.lang.Integer gasUnPresAlm2) {
		this.gasUnPresAlm2 = gasUnPresAlm2;
	}
	
	}

