package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class DeviceStateEntity extends BaseEntity {
	
		
	private java.lang.String DeviceID;
	private java.lang.String name;
	private java.lang.String remark ;
	private java.lang.String DeviceType;
	
	
	
	public java.lang.String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(java.lang.String deviceID) {
		DeviceID = deviceID;
	}
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	
	public java.lang.String getRemark() {
		return remark;
	}
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	
	public java.lang.String getDeviceType() {
		return DeviceType;
	}
	
	public void setDeviceType(java.lang.String deviceType) {
		DeviceType = deviceType;
	}
	
	/*public java.lang.String getId() {
		return id;
	}


	public java.lang.String getNodetype() {
		return nodetype;
	}


	public void setNodetype(java.lang.String nodetype) {
		this.nodetype = nodetype;
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


	public java.lang.String getParentid() {
		return parentid;
	}


	public void setParentid(java.lang.String parentid) {
		this.parentid = parentid;
	}*/


	//修改该函数实现，将entity各字段组合生成一个实体信息字符串。该方法被日志切面程序自动调用并记录日志
//	@Override
//	public String toLogMsg() {
//		// TODO Auto-generated method stub
//		return "";
//	}
}

