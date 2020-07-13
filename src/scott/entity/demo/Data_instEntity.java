package scott.entity.demo;

/**
 * iec61850_yx_data_inst,iec61850_yc_data_inst,iec61850_yk_data_inst 表实体类
 */

import com.base.entity.BaseEntity;

public class Data_instEntity extends BaseEntity {
	private Integer yx_id ;
	private Integer ied_type_id;
	private String ld_inst_name;
	private String ln_inst_name;
	private String yx_refname;
	private String yx_desc;
	private String fc;
	private String desc;
	private String link_yc_refname;

	public String getLink_yc_refname() {
		return link_yc_refname;
	}
	public void setLink_yc_refname(String link_yc_refname) {
		this.link_yc_refname = link_yc_refname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public Integer getYx_id() {
		return yx_id;
	}
	public void setYx_id(Integer yx_id) {
		this.yx_id = yx_id;
	}
	public Integer getIed_type_id() {
		return ied_type_id;
	}
	public void setIed_type_id(Integer ied_type_id) {
		this.ied_type_id = ied_type_id;
	}
	public String getLd_inst_name() {
		return ld_inst_name;
	}
	public void setLd_inst_name(String ld_inst_name) {
		this.ld_inst_name = ld_inst_name;
	}
	public String getLn_inst_name() {
		return ln_inst_name;
	}
	public void setLn_inst_name(String ln_inst_name) {
		this.ln_inst_name = ln_inst_name;
	}
	public String getYx_refname() {
		return yx_refname;
	}
	public void setYx_refname(String yx_refname) {
		this.yx_refname = yx_refname;
	}
	public String getYx_desc() {
		return yx_desc;
	}
	public void setYx_desc(String yx_desc) {
		this.yx_desc = yx_desc;
	}
}
