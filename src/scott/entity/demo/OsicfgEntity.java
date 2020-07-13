package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class OsicfgEntity extends BaseEntity {
	public OsicfgEntity() {
		super();
	}
	private java.lang.String iedid;
	private java.lang.String NetAddr;
	private java.lang.String AR_Name;
	private java.lang.String AR_Name_old;
	
	
	public java.lang.String getIedid() {
		return iedid;
	}
	public void setIedid(java.lang.String iedid) {
		this.iedid = iedid;
	}
	public java.lang.String getAR_Name_old() {
		return AR_Name_old;
	}
	public void setAR_Name_old(java.lang.String aR_Name_old) {
		AR_Name_old = aR_Name_old;
	}
	public java.lang.String getNetAddr() {
		return NetAddr;
	}
	public void setNetAddr(java.lang.String netAddr) {
		NetAddr = netAddr;
	}
	public java.lang.String getAR_Name() {
		return AR_Name;
	}
	public void setAR_Name(java.lang.String aR_Name) {
		AR_Name = aR_Name;
	}
}

