package com.scott.entity;

import com.base.entity.BaseEntity;
import lombok.Data;

@Data
public class I2TableEntity extends BaseEntity {

	private java.lang.String i2id;  //i2id
	private java.lang.String i1type;  //i1类型
	private java.lang.String i1id;  //i1id
	private java.lang.String i2_refname;//名称
	private java.lang.String i2_desc;//备注

	public I2TableEntity(String i2id, String i1type, String i1id, String i2_refname, String i2_desc) {
		this.i2id = i2id;
		this.i1type = i1type;
		this.i1id = i1id;
		this.i2_refname = i2_refname;
		this.i2_desc = i2_desc;
	}
}
