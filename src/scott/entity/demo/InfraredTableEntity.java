package scott.entity.demo;

import com.base.entity.BaseEntity;

public class InfraredTableEntity extends BaseEntity {

	private java.lang.String DeviceID;  //红外测温设备id
	private java.lang.String DeviceName;  //红外测温设备名称


    public InfraredTableEntity() {

    }
    public InfraredTableEntity(String DeviceID, String DeviceName) {
    this.DeviceID = DeviceID;
    this.DeviceName = DeviceName;
    }
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setI2id(java.lang.String DeviceID) {
		this.DeviceID = DeviceID;
	}
	public java.lang.String getDeviceName() {
		return DeviceName;
	}
	public void setI1type(java.lang.String DeviceName) {
		this.DeviceName = DeviceName;
	}


}
