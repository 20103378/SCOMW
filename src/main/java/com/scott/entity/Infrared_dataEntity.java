package com.scott.entity;

import com.base.entity.BaseEntity;
import lombok.Data;

@Data
public class Infrared_dataEntity extends BaseEntity {

	private java.lang.String DeviceID;// 设备ID
	private java.util.Date SampleTime;// 采集时间
	private String DeviceName;
	private java.lang.Double Tmp;// 温度
	private java.lang.Integer Remark; // 状态
}
