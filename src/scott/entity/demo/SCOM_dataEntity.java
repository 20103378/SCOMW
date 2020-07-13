package scott.entity.demo;

import com.base.entity.BaseEntity;

public class SCOM_dataEntity extends BaseEntity {
	private String DeviceName;
	private java.lang.String DeviceID;// 设备ID
	private java.lang.String SampleTime;// 采集时间
	private java.lang.Double CGAmp;//铁芯接地电流
	private java.lang.Double ClpGAmp;//夹件接地电流
	private java.lang.Double Amp1;//夹件电流
	private java.lang.Double MainOil;//本体主油箱磁力式油位
	private java.lang.Double PreOil;//本体主油箱压力式油位
	private java.lang.Double SltcOil;//"有载开关油位"
	private java.lang.Double Tmp1;//"网侧绕组温度
	private java.lang.Double Tmp2;//"油面温度
	private java.lang.Double Tmp3;//"备用
	private java.lang.Double Tmp4;//"顶层油温1
	private java.lang.Double Tmp5;//"顶层油温2
	private java.lang.Double Tmp6;//"底层油温1
	private java.lang.Double Tmp7;//"底层油温2
	private java.lang.Double Tmp8;//"环境温度
	private java.lang.Double Pre1;//"阀侧首端套管SF6压力
	private java.lang.Double Pre2;//"阀侧末端套管SF6压力

	private java.lang.Integer Remark;//状态

	
	
	public java.lang.Double getClpGAmp() {
		return ClpGAmp;
	}
	public void setClpGAmp(java.lang.Double clpGAmp) {
		ClpGAmp = clpGAmp;
	}
	public java.lang.Double getAmp1() {
		return Amp1;
	}
	public void setAmp1(java.lang.Double amp1) {
		Amp1 = amp1;
	}
	public java.lang.Double getMainOil() {
		return MainOil;
	}
	public void setMainOil(java.lang.Double mainOil) {
		MainOil = mainOil;
	}
	public java.lang.Double getPreOil() {
		return PreOil;
	}
	public void setPreOil(java.lang.Double preOil) {
		PreOil = preOil;
	}
	public java.lang.Double getSltcOil() {
		return SltcOil;
	}
	public void setSltcOil(java.lang.Double sltcOil) {
		SltcOil = sltcOil;
	}
	public java.lang.Double getTmp1() {
		return Tmp1;
	}
	public void setTmp1(java.lang.Double tmp1) {
		Tmp1 = tmp1;
	}
	public java.lang.Double getTmp2() {
		return Tmp2;
	}
	public void setTmp2(java.lang.Double tmp2) {
		Tmp2 = tmp2;
	}
	public java.lang.Double getTmp3() {
		return Tmp3;
	}
	public void setTmp3(java.lang.Double tmp3) {
		Tmp3 = tmp3;
	}
	public java.lang.Double getTmp4() {
		return Tmp4;
	}
	public void setTmp4(java.lang.Double tmp4) {
		Tmp4 = tmp4;
	}
	public java.lang.Double getTmp5() {
		return Tmp5;
	}
	public void setTmp5(java.lang.Double tmp5) {
		Tmp5 = tmp5;
	}
	public java.lang.Double getTmp6() {
		return Tmp6;
	}
	public void setTmp6(java.lang.Double tmp6) {
		Tmp6 = tmp6;
	}
	public java.lang.Double getTmp7() {
		return Tmp7;
	}
	public void setTmp7(java.lang.Double tmp7) {
		Tmp7 = tmp7;
	}
	public java.lang.Double getTmp8() {
		return Tmp8;
	}
	public void setTmp8(java.lang.Double tmp8) {
		Tmp8 = tmp8;
	}
	public java.lang.Double getPre1() {
		return Pre1;
	}
	public void setPre1(java.lang.Double pre1) {
		Pre1 = pre1;
	}
	public java.lang.Double getPre2() {
		return Pre2;
	}
	public void setPre2(java.lang.Double pre2) {
		Pre2 = pre2;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.String getSampleTime() {
		return SampleTime;
	}
	public void setSampleTime(java.lang.String sampleTime) {
		SampleTime = sampleTime;
	}
	public java.lang.Double getCGAmp() {
		return CGAmp;
	}
	public void setCGAmp(java.lang.Double cGAmp) {
		CGAmp = cGAmp;
	}
	public java.lang.Integer getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.Integer remark) {
		Remark = remark;
	}


}
