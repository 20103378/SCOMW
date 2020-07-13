package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class ProcstateEntity extends BaseEntity {
	
	private java.lang.String pid;//程序ID
	private java.lang.String pname;//程序名称
	private java.lang.String systime;//采集时间
	private java.lang.String cpu;//CPU使用率
	private java.lang.String mem;//内存使用率
	public java.lang.String getPid() {
		return pid;
	}
	public void setPid(java.lang.String pid) {
		this.pid = pid;
	}
	public java.lang.String getPname() {
		return pname;
	}
	public void setPname(java.lang.String pname) {
		this.pname = pname;
	}
	public java.lang.String getSystime() {
		return systime;
	}
	public void setSystime(java.lang.String systime) {
		this.systime = systime;
	}
	public java.lang.String getCpu() {
		return cpu;
	}
	public void setCpu(java.lang.String cpu) {
		this.cpu = cpu;
	}
	public java.lang.String getMem() {
		return mem;
	}
	public void setMem(java.lang.String mem) {
		this.mem = mem;
	}
}

