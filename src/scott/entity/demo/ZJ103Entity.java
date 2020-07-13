package scott.entity.demo;

import com.base.entity.BaseEntity;

public class ZJ103Entity extends BaseEntity {

	private java.lang.String DeviceID;  //i2id
	private java.lang.String DeviceName;  //i1类型
	private int CommAddress;  //i1id
	private int DeviceType;//名称
	private java.lang.String IEC61850LD_LN;//备注
    private int DevPhase;//备注

    public ZJ103Entity() {

    }
    public ZJ103Entity(String DeviceID, String DeviceName, int CommAddress,int DeviceType,String IEC61850LD_LN,int DevPhase) {
    this.DeviceID = DeviceID;
    this.DeviceName = DeviceName;
    this.CommAddress = CommAddress;
    this.DeviceType = DeviceType;
    this.IEC61850LD_LN = IEC61850LD_LN;
    this.DevPhase = DevPhase;
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

    public int getCommAddress() {
        return CommAddress;
    }

    public void setCommAddress(int commAddress) {
        CommAddress = commAddress;
    }

    public int getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(int deviceType) {
        DeviceType = deviceType;
    }

    public java.lang.String getIEC61850LD_LN() {
        return IEC61850LD_LN;
    }

    public void setIEC61850LD_LN(java.lang.String iEC61850LD_LN) {
        IEC61850LD_LN = iEC61850LD_LN;
    }

    public int getDevPhase() {
        return DevPhase;
    }

    public void setDevPhase(int devPhase) {
        DevPhase = devPhase;
    }


}
