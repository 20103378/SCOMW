package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class AlarmRecordEntity extends BaseEntity {
	
	private java.lang.String DeviceType;//设备类型
	private java.lang.String EquipmentName;//主设备名
	private java.lang.String Phase;//设备相别
	private java.lang.String Space;//设备区域
	private java.lang.String DeviceName;//设备区域
	private java.lang.String Trigger_Date;//日期
	private java.lang.Double RecordType;//告警类型
	
	public java.lang.String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(java.lang.String deviceType) {
		DeviceType = deviceType;
	}
	public java.lang.String getEquipmentName() {
		return EquipmentName;
	}
	public void setEquipmentName(java.lang.String equipmentName) {
		EquipmentName = equipmentName;
	}
	public java.lang.String getPhase() {
		return Phase;
	}
	public void setPhase(java.lang.String phase) {
		Phase = phase;
	}
	public java.lang.String getSpace() {
		return Space;
	}
	public void setSpace(java.lang.String space) {
		Space = space;
	}
	public java.lang.String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(java.lang.String deviceName) {
		DeviceName = deviceName;
	}
	public java.lang.String getTrigger_Date() {
		return Trigger_Date;
	}
	public void setTrigger_Date(java.lang.String trigger_Date) {
		Trigger_Date = trigger_Date;
	}
	public java.lang.Double getRecordType() {
		return RecordType;
	}
	public void setRecordType(java.lang.Double recordType) {
		RecordType = recordType;
	}
	
	
	
	}

