package com.scott.entity;

import com.base.entity.BaseEntity;
import lombok.Data;

/**
 * 
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Data
public class BaseMonitorEntity extends BaseEntity {
	
	private java.lang.String DeviceID;//设备ID
	private java.lang.String StrName;//告警名称
	private java.lang.String StrValue;//告警值
	
}

