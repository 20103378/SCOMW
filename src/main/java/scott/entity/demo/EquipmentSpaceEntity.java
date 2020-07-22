package scott.entity.demo;

import com.base.entity.BaseEntity;
import lombok.Data;

/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Data
public class EquipmentSpaceEntity extends BaseEntity {


	private java.lang.String SpaceId;//区域ID
	private java.lang.String SpaceName;//区域名称
	private java.lang.String ObjectVoltage;//电压等级
    private int SpaceTag;//区域标签
}

