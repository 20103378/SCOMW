package scott.entity.demo;
/**
 * 
 * @author li_xujun
 *	2018-7-11
 *  Description:程序状态类
 */
public class CacExeStateEntity {

	private String exeName;
	
	private int exeState;
	
	private String exeStateTimestamp;
	
	private String updateStateTimestamp;
	
	private int runNum;

	public String getExeName() {
		return exeName;
	}

	public void setExeName(String exeName) {
		this.exeName = exeName;
	}

	public int getExeState() {
		return exeState;
	}

	public void setExeState(int exeState) {
		this.exeState = exeState;
	}

	public String getExeStateTimestamp() {
		return exeStateTimestamp;
	}

	public void setExeStateTimestamp(String exeStateTimestamp) {
		this.exeStateTimestamp = exeStateTimestamp;
	}

	public String getUpdateStateTimestamp() {
		return updateStateTimestamp;
	}

	public void setUpdateStateTimestamp(String updateStateTimestamp) {
		this.updateStateTimestamp = updateStateTimestamp;
	}

	public int getRunNum() {
		return runNum;
	}

	public void setRunNum(int runNum) {
		this.runNum = runNum;
	}	
}
