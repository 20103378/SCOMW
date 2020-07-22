package scott.entity.demo;

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
public class OperaterRecordEntity extends BaseEntity {
	
	private java.lang.String UserName;//操作人
	private java.lang.String Trigger_Date;//事件
	private java.lang.Integer RecordType;//操作类型
	private java.lang.String Remark;//备注
}

