package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
public class OperaterRecordEntity extends BaseEntity {
	
	private java.lang.String UserName;//操作人
	private java.lang.String Trigger_Date;//事件
	private java.lang.Integer RecordType;//操作类型
	private java.lang.String Remark;//备注
	public java.lang.String getUserName() {
		return UserName;
	}
	public void setUserName(java.lang.String userName) {
		UserName = userName;
	}
	public java.lang.String getTrigger_Date() {
		return Trigger_Date;
	}
	public void setTrigger_Date(java.lang.String trigger_Date) {
		Trigger_Date = trigger_Date;
	}
	public java.lang.Integer getRecordType() {
		return RecordType;
	}
	public void setRecordType(java.lang.Integer recordType) {
		RecordType = recordType;
	}
	public java.lang.String getRemark() {
		return Remark;
	}
	public void setRemark(java.lang.String remark) {
		Remark = remark;
	}
	
	
	}

