package scott.entity.demo;

import com.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Spdm_dataEntity extends BaseEntity {
	private String DeviceName;
	private  String DeviceID;//
	private Date SampleTime;//
	private  Double AcuPaDsch;//
	private  Double UhfPaDsch;//
	private  Double Phase;//
	private  Double PlsNum;//
	private  Double Remark;//


}
