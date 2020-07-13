package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>F
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class DataEntity extends BaseEntity {
	private java.lang.String id;
	private java.lang.String refname;
	private java.lang.String time;
	private java.lang.String value;
	private java.lang.String ln_inst_name;
	private java.lang.String ld_inst_name;
	private java.lang.String ied_type_id;
	private java.lang.String quality;

	public java.lang.String getQuality() {
		return quality;
	}
	public void setQuality(java.lang.String quality) {
		this.quality = quality;
	}
	public java.lang.String getIed_type_id() {
		return ied_type_id;
	}
	public void setIed_type_id(java.lang.String ied_type_id) {
		this.ied_type_id = ied_type_id;
	}
	public java.lang.String getLd_inst_name() {
		return ld_inst_name;
	}
	public void setLd_inst_name(java.lang.String ld_inst_name) {
		this.ld_inst_name = ld_inst_name;
	}
	public java.lang.String getLn_inst_name() {
		return ln_inst_name;
	}
	public void setLn_inst_name(java.lang.String ln_inst_name) {
		this.ln_inst_name = ln_inst_name;
	}
	public java.lang.String getValue() {
		return value;
	}
	public void setValue(java.lang.String value) {
		this.value = value;
	}
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getRefname() {
		return refname;
	}
	public void setRefname(java.lang.String refname) {
		this.refname = refname;
	}
	public java.lang.String getTime() {
		return time;
	}
	public void setTime(java.lang.String time) {
		this.time = time;
	}
}

