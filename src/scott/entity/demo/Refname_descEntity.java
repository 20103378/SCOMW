package scott.entity.demo;

import com.base.entity.BaseEntity;

/**
*
* <br>
* <b>功能：</b>测量点名称实体类<br>
* <b>作者：</b>gehanyun<br>
* <b>日期：</b> 2, 27, 2017 <br>
*/
public class Refname_descEntity extends BaseEntity {
	private java.lang.String refname;	//测量点
	private java.lang.String refdesc; // 描述

    public Refname_descEntity() {

    }
	public Refname_descEntity(String refname, String refdesc) {
        this.refname = refname;
        this.refdesc = refdesc;
        }

	public java.lang.String getRefname() {
		return refname;
	}

	public void setRefname(java.lang.String refname) {
		this.refname = refname;
	}

	public java.lang.String getRefdesc() {
		return refdesc;
	}

	public void setRefdesc(java.lang.String refdesc) {
		this.refdesc = refdesc;
	}

}
