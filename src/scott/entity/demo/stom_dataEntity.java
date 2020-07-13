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
public class stom_dataEntity extends BaseEntity {
	private String DeviceName;
	private String DeviceID;
	private String SampleTime;
	private Double H2ppm;
	private Double COppm;
	private Double CO2ppm;
	private Double CH4ppm;
	private Double C2H2ppm;
	private Double C2H4ppm;
	private Double C2H6ppm;
	private Double TotHyd;//总烃
	private Double N2;
	private Double OilTmp;
	private Double GasPres;//载气压力
	private Double Mst;//微水
	private java.lang.Integer Remark; // 状态

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
	public Double getH2ppm() {
		return H2ppm;
	}
	public void setH2ppm(Double h2ppm) {
		H2ppm = h2ppm;
	}
	public Double getCOppm() {
		return COppm;
	}
	public void setCOppm(Double cOppm) {
		COppm = cOppm;
	}
	public Double getCO2ppm() {
		return CO2ppm;
	}
	public void setCO2ppm(Double cO2ppm) {
		CO2ppm = cO2ppm;
	}
	public Double getCH4ppm() {
		return CH4ppm;
	}
	public void setCH4ppm(Double cH4ppm) {
		CH4ppm = cH4ppm;
	}
	public Double getC2H2ppm() {
		return C2H2ppm;
	}
	public void setC2H2ppm(Double c2h2ppm) {
		C2H2ppm = c2h2ppm;
	}
	public Double getC2H4ppm() {
		return C2H4ppm;
	}
	public void setC2H4ppm(Double c2h4ppm) {
		C2H4ppm = c2h4ppm;
	}
	public Double getC2H6ppm() {
		return C2H6ppm;
	}
	public void setC2H6ppm(Double c2h6ppm) {
		C2H6ppm = c2h6ppm;
	}
	public Double getTotHyd() {
		return TotHyd;
	}
	public void setTotHyd(Double totHyd) {
		TotHyd = totHyd;
	}
	public Double getN2() {
		return N2;
	}
	public void setN2(Double n2) {
		N2 = n2;
	}
	public Double getOilTmp() {
		return OilTmp;
	}
	public void setOilTmp(Double oilTmp) {
		OilTmp = oilTmp;
	}
	public Double getGasPres() {
		return GasPres;
	}
	public void setGasPres(Double gasPres) {
		GasPres = gasPres;
	}
	public Double getMst() {
		return Mst;
	}
	public void setMst(Double mst) {
		Mst = mst;
	}
	public java.lang.Integer getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.Integer remark) {
		Remark = remark;
	}


}

