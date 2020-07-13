package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class EquipmentEntity extends BaseEntity {

	private java.lang.String EquipmentID;//设备编码
	private java.lang.String EquipmentName;//设备名称
	private java.lang.String Phase;//设备相别	private java.lang.Integer DeviceType;//   设备类型	private java.lang.String ObjectVoltage;// 电压等级
	private java.lang.String SpaceId;// 区域ID
	public java.lang.String getSpaceId() {
		return SpaceId;
	}
	public void setSpaceId(java.lang.String spaceId) {
		SpaceId = spaceId;
	}
	public java.lang.String getEquipmentID() {
		return EquipmentID;
	}
	public void setEquipmentID(java.lang.String equipmentID) {
		EquipmentID = equipmentID;
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
	public java.lang.Integer getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(java.lang.Integer deviceType) {
		DeviceType = deviceType;
	}
	public java.lang.String getObjectVoltage() {
		return ObjectVoltage;
	}
	public void setObjectVoltage(java.lang.String objectVoltage) {
		ObjectVoltage = objectVoltage;
	}
	public java.lang.String getSpaceName() {
		return SpaceName;
	}
	public void setSpaceName(java.lang.String spaceName) {
		SpaceName = spaceName;
	}
	public java.lang.String getManufactoryName() {
		return ManufactoryName;
	}
	public void setManufactoryName(java.lang.String manufactoryName) {
		ManufactoryName = manufactoryName;
	}
	private java.lang.String SpaceName;// 设备区域
	private java.lang.String ManufactoryName;// 制造厂家
	private java.lang.String Remark;
	public java.lang.String getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.String remark) {
		Remark = remark;
	}
}

