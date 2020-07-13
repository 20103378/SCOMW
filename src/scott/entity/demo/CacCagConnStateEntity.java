package scott.entity.demo;
/**
 * 
 * @author zhou_wang
 *	2018-7-20
 *  Description:cac与cag通讯日志
 */
public class CacCagConnStateEntity {

	private String state_time;
	
	private int conn_state;
	
	private String client_name;
	
	private String client_ip;

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

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_ip() {
		return client_ip;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}
	
	
}
