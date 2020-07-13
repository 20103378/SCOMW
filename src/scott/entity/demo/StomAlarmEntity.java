package scott.entity.demo;

import com.base.entity.BaseEntity;

public class StomAlarmEntity extends BaseEntity {
	private java.lang.String DeviceID;// 设备ID
	private double H2ThresHold;//氢气上限值(ppm)
	private double C2H2ThresHold;//乙炔上限值(ppm)
	private double THThresHold;//总烃上限值(ppm)
	private double H2Change;//氢气变化率(ppm/day)
	private double C2H2Change;//乙炔变化率(ppm/5day)
	private double THChange;//总烃变化率(ppm/day)
	private double MstThresHold;//微水上限值(mg/m3)
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public double getH2ThresHold() {
		return H2ThresHold;
	}
	public void setH2ThresHold(double h2ThresHold) {
		H2ThresHold = h2ThresHold;
	}
	public double getC2H2ThresHold() {
		return C2H2ThresHold;
	}
	public void setC2H2ThresHold(double c2h2ThresHold) {
		C2H2ThresHold = c2h2ThresHold;
	}
	public double getTHThresHold() {
		return THThresHold;
	}
	public void setTHThresHold(double tHThresHold) {
		THThresHold = tHThresHold;
	}
	public double getH2Change() {
		return H2Change;
	}
	public void setH2Change(double h2Change) {
		H2Change = h2Change;
	}
	public double getC2H2Change() {
		return C2H2Change;
	}
	public void setC2H2Change(double c2h2Change) {
		C2H2Change = c2h2Change;
	}
	public double getTHChange() {
		return THChange;
	}
	public void setTHChange(double tHChange) {
		THChange = tHChange;
	}
	public double getMstThresHold() {
		return MstThresHold;
	}
	public void setMstThresHold(double mstThresHold) {
		MstThresHold = mstThresHold;
	}




}
