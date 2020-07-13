package scott.entity.demo;

import com.base.entity.BaseEntity;

public class I2TableEntity extends BaseEntity {

	private java.lang.String i2id;  //i2id
	private java.lang.String i1type;  //i1类型
	private java.lang.String i1id;  //i1id
	private java.lang.String i2_refname;//名称
	private java.lang.String i2_desc;//备注

    public I2TableEntity() {

    }
    public I2TableEntity(String i2id, String i1type, String i1id,String i2_refname,String i2_desc) {
    this.i2id = i2id;
    this.i1type = i1type;
    this.i1id = i1id;
    this.i2_refname = i2_refname;
    this.i2_desc = i2_desc;
    }
	public java.lang.String getI2id() {
		return i2id;
	}
	public void setI2id(java.lang.String i2id) {
		this.i2id = i2id;
	}
	public java.lang.String getI1type() {
		return i1type;
	}
	public void setI1type(java.lang.String i1type) {
		this.i1type = i1type;
	}
	public java.lang.String getI1id() {
		return i1id;
	}
	public void setI1id(java.lang.String i1id) {
		this.i1id = i1id;
	}
	public java.lang.String getI2_refname() {
		return i2_refname;
	}
	public void setI2_refname(java.lang.String i2_refname) {
		this.i2_refname = i2_refname;
	}
	public java.lang.String getI2_desc() {
		return i2_desc;
	}
	public void setI2_desc(java.lang.String i2_desc) {
		this.i2_desc = i2_desc;
	}

}
