package com.scott.entity;

import com.base.entity.BaseEntity;
import lombok.Data;

/**
 * 
 * <br>
 * <b>功能：</b>设备实体类<br>
 * <b>作者：</b>xjiawei<br>
 * <b>日期：</b> 9, 7, 2015 <br>
 */
@Data
public class MessageEntity extends BaseEntity {
	private java.lang.String DeviceID;//告警类型
	private java.lang.String Remark;//告警类型
	private java.lang.String DeviceType;//设备类型
	private java.lang.String Space;//设备区域
	private java.lang.String DeviceName;//设备区域
}

