package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>油色谱遥信实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class StomYxEntity extends BaseEntity {

	//
	private String DeviceName;
	private Object H2ppm;
	private Object COppm;
	private Object CO2ppm;
	private Object CH4ppm;
	private Object C2H2ppm;
	private Object C2H4ppm;
	private Object C2H6ppm;
	private Object TotHyd;//总烃
	private Object N2;
	private Object OilTmp;
	private Object GasPres;//载气压力
	private Object Mst;//微水
	//
	private String GasUnPresAlm;
	private String SupDevRun;
	private String MoDevConf;
	private String GasLowPresAlm;
	private String ActCyGasSta;
	private String GasBot;
	private String Health;
	private String H2Alm;
	private String C2H2Alm;
	private String TotHydcAlm;
	private String DeviceID;
	private String SampleTime;
	private String Type;
	private String Remark;
   public StomYxEntity() {
   }
   public StomYxEntity(int l) {
        this.H2ppm="无数据";
        this.COppm="无数据";
        this.CO2ppm="无数据";
        this.CH4ppm="无数据";
        this.C2H2ppm="无数据";
        this.C2H4ppm="无数据";
        this.C2H6ppm="无数据";
        this.N2="无数据";
        this.OilTmp="无数据";
        this.TotHyd="无数据";
    }

    public String getRemark() {
	return Remark;
}
public void setRemark(String remark) {
	Remark = remark;
}
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Object getH2ppm() {
		return H2ppm;
	}
	public void setH2ppm(Object h2ppm) {
		H2ppm = h2ppm;
	}
	public Object getCOppm() {
		return COppm;
	}
	public void setCOppm(Object cOppm) {
		COppm = cOppm;
	}
	public Object getCO2ppm() {
		return CO2ppm;
	}
	public void setCO2ppm(Object cO2ppm) {
		CO2ppm = cO2ppm;
	}
	public Object getCH4ppm() {
		return CH4ppm;
	}
	public void setCH4ppm(Object cH4ppm) {
		CH4ppm = cH4ppm;
	}
	public Object getC2H2ppm() {
		return C2H2ppm;
	}
	public void setC2H2ppm(Object c2h2ppm) {
		C2H2ppm = c2h2ppm;
	}
	public Object getC2H4ppm() {
		return C2H4ppm;
	}
	public void setC2H4ppm(Object c2h4ppm) {
		C2H4ppm = c2h4ppm;
	}
	public Object getC2H6ppm() {
		return C2H6ppm;
	}
	public void setC2H6ppm(Object c2h6ppm) {
		C2H6ppm = c2h6ppm;
	}
	public Object getTotHyd() {
		return TotHyd;
	}
	public void setTotHyd(Object totHyd) {
		TotHyd = totHyd;
	}
	public Object getN2() {
		return N2;
	}
	public void setN2(Object n2) {
		N2 = n2;
	}
	public Object getOilTmp() {
		return OilTmp;
	}
	public void setOilTmp(Object oilTmp) {
		OilTmp = oilTmp;
	}
	public Object getGasPres() {
		return GasPres;
	}
	public void setGasPres(Object gasPres) {
		GasPres = gasPres;
	}
	public Object getMst() {
		return Mst;
	}
	public void setMst(Object mst) {
		Mst = mst;
	}
	public String getGasUnPresAlm() {
		return GasUnPresAlm;
	}
	public void setGasUnPresAlm(String gasUnPresAlm) {
		GasUnPresAlm = gasUnPresAlm;
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
	public String getGasLowPresAlm() {
		return GasLowPresAlm;
	}
	public void setGasLowPresAlm(String gasLowPresAlm) {
		GasLowPresAlm = gasLowPresAlm;
	}
	public String getActCyGasSta() {
		return ActCyGasSta;
	}
	public void setActCyGasSta(String actCyGasSta) {
		ActCyGasSta = actCyGasSta;
	}
	public String getGasBot() {
		return GasBot;
	}
	public void setGasBot(String gasBot) {
		GasBot = gasBot;
	}
	public String getHealth() {
		return Health;
	}
	public void setHealth(String health) {
		Health = health;
	}
	public String getH2Alm() {
		return H2Alm;
	}
	public void setH2Alm(String h2Alm) {
		H2Alm = h2Alm;
	}
	public String getC2H2Alm() {
		return C2H2Alm;
	}
	public void setC2H2Alm(String c2h2Alm) {
		C2H2Alm = c2h2Alm;
	}
	public String getTotHydcAlm() {
		return TotHydcAlm;
	}
	public void setTotHydcAlm(String totHydcAlm) {
		TotHydcAlm = totHydcAlm;
	}
}

