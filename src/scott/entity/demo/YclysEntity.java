package scott.entity.demo;

/**
 * 遥测量映射实体类
 */

import com.base.entity.BaseEntity;

public class YclysEntity extends BaseEntity {
	private String iedName;
	private String apName;
	private String sel_zh;   //组号
	private String sel_dxh;   //点序号
	private String ldinst;  //设备inst
	private String lnClass;  //LN中的lnClass
	private String lninst;  //LN inst
	private String lnType;  //ln中的lnType
	private String fc;      // da中的fc
	private String doName;  //do中的name
	private String typeName; //DA中的name
	private String DatypeName; //DAType中的name(da中有type的时候)
	private String DbaType; //Dba有type的时候
	private String Desc; //DU有DESC的时候


	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public String getDbaType() {
		return DbaType;
	}
	public void setDbaType(String dbaType) {
		DbaType = dbaType;
	}
	public String getDatypeName() {
		return DatypeName;
	}
	public void setDatypeName(String datypeName) {
		DatypeName = datypeName;
	}
	public String getIedName() {
		return iedName;
	}
	public void setIedName(String iedName) {
		this.iedName = iedName;
	}
	public String getApName() {
		return apName;
	}
	public void setApName(String apName) {
		this.apName = apName;
	}
	public String getSel_zh() {
		return sel_zh;
	}
	public void setSel_zh(String sel_zh) {
		this.sel_zh = sel_zh;
	}
	public String getSel_dxh() {
		return sel_dxh;
	}
	public void setSel_dxh(String sel_dxh) {
		this.sel_dxh = sel_dxh;
	}
	public String getLdinst() {
		return ldinst;
	}
	public void setLdinst(String ldinst) {
		this.ldinst = ldinst;
	}
	public String getLnClass() {
		return lnClass;
	}
	public void setLnClass(String lnClass) {
		this.lnClass = lnClass;
	}
	public String getLninst() {
		return lninst;
	}
	public void setLninst(String lninst) {
		this.lninst = lninst;
	}
	public String getLnType() {
		return lnType;
	}
	public void setLnType(String lnType) {
		this.lnType = lnType;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getDoName() {
		return doName;
	}
	public void setDoName(String doName) {
		this.doName = doName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


}
