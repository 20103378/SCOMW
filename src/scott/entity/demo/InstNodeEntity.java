package scott.entity.demo;

/**
 * iec61850_ln_inst表实体类
 */

import com.base.entity.BaseEntity;

public class InstNodeEntity extends BaseEntity {
	private String ied_name;
	private String ied_desc;
	private String ld_inst_name;
	private String ld_inst_desc;
	private String ln_inst_name;
	private String ln_inst_desc;
	public String getIed_name() {
		return ied_name;
	}
	public void setIed_name(String ied_name) {
		this.ied_name = ied_name;
	}
	public String getIed_desc() {
		return ied_desc;
	}
	public void setIed_desc(String ied_desc) {
		this.ied_desc = ied_desc;
	}
	public String getLd_inst_name() {
		return ld_inst_name;
	}
	public void setLd_inst_name(String ld_inst_name) {
		this.ld_inst_name = ld_inst_name;
	}
	public String getLd_inst_desc() {
		return ld_inst_desc;
	}
	public void setLd_inst_desc(String ld_inst_desc) {
		this.ld_inst_desc = ld_inst_desc;
	}
	public String getLn_inst_name() {
		return ln_inst_name;
	}
	public void setLn_inst_name(String ln_inst_name) {
		this.ln_inst_name = ln_inst_name;
	}
	public String getLn_inst_desc() {
		return ln_inst_desc;
	}
	public void setLn_inst_desc(String ln_inst_desc) {
		this.ln_inst_desc = ln_inst_desc;
	}
	
}
