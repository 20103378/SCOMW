package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>油色谱遥信实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class ScomYxEntity extends BaseEntity {
	//
	private Object CGAmp;
	//
	private String DeviceName;
	private String SupDevRun;  //监测设备运行异常
	private String MoDevConf;
	private String CGAlm;
	private String Amp1;//夹件电流
	private String MainOil;//本体主油箱磁力式油位
	private String PreOil;//本体主油箱压力式油位
	private String SltcOil;//"有载开关油位"
	private String Tmp1;//"网侧绕组温度
	private String Tmp2;//"油面温度
	private String Tmp3;//"备用
	private String Tmp4;//"顶层油温1
	private String Tmp5;//"顶层油温2
	private String Tmp6;//"底层油温1
	private String Tmp7;//"底层油温2
	private String Tmp8;//"环境温度
	private String Pre1;//"阀侧首端套管SF6压力
	private String Pre2;//"阀侧末端套管SF6压力
	private String Health;
	private String DeviceID;
	private String SampleTime;
	private String Type;
	private String Remark;

	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getAmp1() {
		return Amp1;
	}
	public void setAmp1(String amp1) {
		Amp1 = amp1;
	}
	public String getMainOil() {
		return MainOil;
	}
	public void setMainOil(String mainOil) {
		MainOil = mainOil;
	}
	public String getPreOil() {
		return PreOil;
	}
	public void setPreOil(String preOil) {
		PreOil = preOil;
	}
	public String getSltcOil() {
		return SltcOil;
	}
	public void setSltcOil(String sltcOil) {
		SltcOil = sltcOil;
	}
	public String getTmp1() {
		return Tmp1;
	}
	public void setTmp1(String tmp1) {
		Tmp1 = tmp1;
	}
	public String getTmp2() {
		return Tmp2;
	}
	public void setTmp2(String tmp2) {
		Tmp2 = tmp2;
	}
	public String getTmp3() {
		return Tmp3;
	}
	public void setTmp3(String tmp3) {
		Tmp3 = tmp3;
	}
	public String getTmp4() {
		return Tmp4;
	}
	public void setTmp4(String tmp4) {
		Tmp4 = tmp4;
	}
	public String getTmp5() {
		return Tmp5;
	}
	public void setTmp5(String tmp5) {
		Tmp5 = tmp5;
	}
	public String getTmp6() {
		return Tmp6;
	}
	public void setTmp6(String tmp6) {
		Tmp6 = tmp6;
	}
	public String getTmp7() {
		return Tmp7;
	}
	public void setTmp7(String tmp7) {
		Tmp7 = tmp7;
	}
	public String getTmp8() {
		return Tmp8;
	}
	public void setTmp8(String tmp8) {
		Tmp8 = tmp8;
	}
	public String getPre1() {
		return Pre1;
	}
	public void setPre1(String pre1) {
		Pre1 = pre1;
	}
	public String getPre2() {
		return Pre2;
	}
	public void setPre2(String pre2) {
		Pre2 = pre2;
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
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public ScomYxEntity() {
	}
	public ScomYxEntity(int l) {
        this.CGAmp="无数据";
    }

	public String getCGAlm() {
		return CGAlm;
	}
	public void setCGAlm(String cGAlm) {
		CGAlm = cGAlm;
	}
	public Object getCGAmp() {
		return CGAmp;
	}
	public void setCGAmp(Object cGAmp) {
		CGAmp = cGAmp;
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
	public String getHealth() {
		return Health;
	}
	public void setHealth(String health) {
		Health = health;
	}

}

