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
public class ProcstateEntity extends BaseEntity {
	
	private java.lang.String pid;//程序ID
	private java.lang.String pname;//程序名称
	private java.lang.String systime;//采集时间
	private java.lang.String cpu;//CPU使用率
	private java.lang.String mem;//内存使用率
}

