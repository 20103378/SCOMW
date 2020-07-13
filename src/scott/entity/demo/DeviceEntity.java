package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class DeviceEntity extends BaseEntity {
	
	private java.lang.String DeviceID;//设备ID	private java.lang.String DeviceName;//设备名称
	private java.lang.String DeviceType;//设备类型
	private java.lang.String ManufactoryName;//制造厂家
	private java.lang.String DeviceProductID;//出厂ID
	private java.lang.String DeviceLocation;//设备地址
	private java.lang.String StartOperateTime;//投运时间
	private java.lang.String EquipmentID;//主设备ID
	private java.lang.String IED_IP;//设备ip
	private java.lang.Double PosY;//地图y坐标
	private java.lang.Double PosX;//地图x坐标
	private java.lang.String IEC61850LD_LN;//61850id
	private java.lang.String StopSoundAlarm;//关闭告警音
	private java.lang.String StopUse;//是否停用
	private java.lang.String Remark;//备注
	private java.lang.String Space;//设备区域
	private java.lang.String Phase;//设备相别
	private java.lang.String Smperiod;//采样周期
	
	
	public java.lang.String getSmperiod() {
		return Smperiod;
	}
	public void setSmperiod(java.lang.String smperiod) {
		Smperiod = smperiod;
	}
	public java.lang.String getIED_IP() {
		return IED_IP;
	}
	public void setIED_IP(java.lang.String iED_IP) {
		IED_IP = iED_IP;
	}
	public java.lang.String getPhase() {
		return Phase;
	}
	public void setPhase(java.lang.String phase) {
		Phase = phase;
	}
	public java.lang.Double getPosY() {
		return PosY;
	}
	public void setPosY(java.lang.Double posY) {
		PosY = posY;
	}
	public java.lang.Double getPosX() {
		return PosX;
	}
	public void setPosX(java.lang.Double posX) {
		PosX = posX;
	}
	public java.lang.String getSpace() {
		return Space;
	}
	public void setSpace(java.lang.String space) {
		Space = space;
	}
	public java.lang.String getIEC61850LD_LN() {
		return IEC61850LD_LN;
	}
	public void setIEC61850LD_LN(java.lang.String iEC61850LD_LN) {
		IEC61850LD_LN = iEC61850LD_LN;
	}
	public java.lang.String getStopSoundAlarm() {
		return StopSoundAlarm;
	}
	public void setStopSoundAlarm(java.lang.String stopSoundAlarm) {
		StopSoundAlarm = stopSoundAlarm;
	}
	public java.lang.String getStopUse() {
		return StopUse;
	}
	public void setStopUse(java.lang.String stopUse) {
		StopUse = stopUse;
	}
	public java.lang.String getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.String remark) {
		Remark = remark;
	}
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(java.lang.String deviceName) {
		DeviceName = deviceName;
	}
	public java.lang.String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(java.lang.String deviceType) {
		DeviceType = deviceType;
	}
	public java.lang.String getManufactoryName() {
		return ManufactoryName;
	}
	public void setManufactoryName(java.lang.String manufactoryName) {
		ManufactoryName = manufactoryName;
	}
	public java.lang.String getDeviceProductID() {
		return DeviceProductID;
	}
	public void setDeviceProductID(java.lang.String deviceProductID) {
		DeviceProductID = deviceProductID;
	}
	public java.lang.String getDeviceLocation() {
		return DeviceLocation;
	}
	public void setDeviceLocation(java.lang.String deviceLocation) {
		DeviceLocation = deviceLocation;
	}
	public java.lang.String getStartOperateTime() {
		return StartOperateTime;
	}
	public void setStartOperateTime(java.lang.String startOperateTime) {
		StartOperateTime = startOperateTime;
	}
	public java.lang.String getEquipmentID() {
		return EquipmentID;
	}
	public void setEquipmentID(java.lang.String equipmentID) {
		EquipmentID = equipmentID;
	}
	}

