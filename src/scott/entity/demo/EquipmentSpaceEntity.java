package scott.entity.demo;

import com.base.entity.BaseEntity;
/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class EquipmentSpaceEntity extends BaseEntity {

	private java.lang.String SpaceId;//区域ID
	private java.lang.String SpaceName;//区域名称
	private java.lang.String ObjectVoltage;//电压等级
    private int SpaceTag;//区域标签


    public int getSpaceTag() {
        return SpaceTag;
    }

    public void setSpaceTag(int spaceTag) {
        SpaceTag = spaceTag;
    }
    public java.lang.String getSpaceId() {
		return SpaceId;
	}
	public void setSpaceId(java.lang.String spaceId) {
		SpaceId = spaceId;
	}
	public java.lang.String getSpaceName() {
		return SpaceName;
	}
	public void setSpaceName(java.lang.String spaceName) {
		SpaceName = spaceName;
	}
	public java.lang.String getObjectVoltage() {
		return ObjectVoltage;
	}
	public void setObjectVoltage(java.lang.String objectVoltage) {
		ObjectVoltage = objectVoltage;
	}

}

