package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class TreeConnEntity extends BaseEntity {
	
	private java.lang.String id;
	private java.lang.String text;//逻辑设备名
	private java.lang.String iedstate;//61850连通状态
	private java.lang.String datastate;//数据通信状态
	private java.lang.String systime;//数据通信状态
	private java.lang.String deviceip;//设备ip
	private java.lang.String updatetime;
	private boolean checked; //是否被选中
	
	
	public java.lang.String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(java.lang.String updatetime) {
		this.updatetime = updatetime;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public java.lang.String getDeviceip() {
		return deviceip;
	}
	public void setDeviceip(java.lang.String deviceip) {
		this.deviceip = deviceip;
	}
	public java.lang.String getSystime() {
		return systime;
	}
	public void setSystime(java.lang.String systime) {
		this.systime = systime;
	}
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getText() {
		return text;
	}
	public void setText(java.lang.String text) {
		this.text = text;
	}
	public java.lang.String getIedstate() {
		return iedstate;
	}
	public void setIedstate(java.lang.String iedstate) {
		this.iedstate = iedstate;
	}
	public java.lang.String getDatastate() {
		return datastate;
	}
	public void setDatastate(java.lang.String datastate) {
		this.datastate = datastate;
	}
	
	
}

