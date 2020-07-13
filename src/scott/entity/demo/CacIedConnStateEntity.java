package scott.entity.demo;
/**
 * 
 * @author zhou_wang
 *	2018-7-20
 *  Description:cac与各装置通讯日志
 */
public class CacIedConnStateEntity {

	private String state_time;
	
	private int conn_state;
	
	private String ied_name;
	
	private String ied_ip;

	public String getState_time() {
		return state_time;
	}

	public void setState_time(String state_time) {
		this.state_time = state_time;
	}

	public int getConn_state() {
		return conn_state;
	}

	public void setConn_state(int conn_state) {
		this.conn_state = conn_state;
	}

	public String getIed_name() {
		return ied_name;
	}

	public void setIed_name(String ied_name) {
		this.ied_name = ied_name;
	}

	public String getIed_ip() {
		return ied_ip;
	}

	public void setIed_ip(String ied_ip) {
		this.ied_ip = ied_ip;
	}
	
	
}
