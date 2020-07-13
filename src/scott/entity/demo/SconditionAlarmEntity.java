package scott.entity.demo;

import com.base.entity.BaseEntity;

public class SconditionAlarmEntity extends BaseEntity {
	private java.lang.String DeviceID;// 设备ID
	private double OilTempThresHold;//顶层油温上限(℃)
	private java.lang.String   ConstMember;// 参数名(遥信表)
	private java.lang.String   Value;// 参数值(遥信表)


	public java.lang.String getConstMember() {
		return ConstMember;
	}
	public void setConstMember(java.lang.String constMember) {
		ConstMember = constMember;
	}
	public java.lang.String getValue() {
		return Value;
	}
	public void setValue(java.lang.String value) {
		Value = value;
	}
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public double getOilTempThresHold() {
		return OilTempThresHold;
	}
	public void setOilTempThresHold(double oilTempThresHold) {
		OilTempThresHold = oilTempThresHold;
	}
}
