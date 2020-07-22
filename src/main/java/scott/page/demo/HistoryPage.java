package scott.page.demo;

import com.base.page.BasePage;

/**
 *
 * <br>
 * <b>功能：</b>历史页面<br>
 * <b>作者：</b>XJW<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class HistoryPage extends BasePage {


	private java.lang.String id;//
	private java.lang.String startTime;//
	private java.lang.String endTime;//
	private java.lang.String state;//
    private java.lang.String ln_inst_name;
    private java.lang.String ld_inst_name;
    private java.lang.String refname;

	public java.lang.String getLn_inst_name() {
        return ln_inst_name;
    }

    public void setLn_inst_name(java.lang.String ln_inst_name) {
        this.ln_inst_name = ln_inst_name;
    }

    public java.lang.String getLd_inst_name() {
        return ld_inst_name;
    }

    public void setLd_inst_name(java.lang.String ld_inst_name) {
        this.ld_inst_name = ld_inst_name;
    }

    public java.lang.String getRefname() {
        return refname;
    }

    public void setRefname(java.lang.String refname) {
        this.refname = refname;
    }
    public java.lang.String getState() {
		return state;
	}
	public void setState(java.lang.String state) {
		this.state = state;
	}
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getStartTime() {
		return startTime;
	}
	public void setStartTime(java.lang.String startTime) {
		this.startTime = startTime;
	}
	public java.lang.String getEndTime() {
		return endTime;
	}
	public void setEndTime(java.lang.String endTime) {
		this.endTime = endTime;
	}


}
