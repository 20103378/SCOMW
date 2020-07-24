package scott.dao.demo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import scott.entity.demo.SpaceEntity;

import com.base.dao.BaseDao;

/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface TreeDeviceDao<T, T1, T2, T3, T4, T5, T6> extends
		BaseDao<T> {
	// public interface BaseTbldevicechannelDao<T1,T2,T3> {

	//injectXml获取ID和Type
	public List<T> getIDandTypeToinjectXml(String space);
	public List<T> getIDandTypeToinjectXmlInSpace();

	public List<T> getZoneEmuList();
	public List<T> getUnitinfo();
	public List<T> getPubspaceName();
	public List<T> getEquipmentName();
	public List<T> getPubspaceNameByType(String Type);
	public List<T> getImgList(java.util.Map<String, Object> param);
	public List<Integer> getPubDeviceTypeList();
	public List<T> getAmcImgList(java.util.Map<String, Object> param);
	public List<T> getOtherAmcImgList(String SampleTime);
	public List<T> getOtherImgList(String SampleTime);
	public List<String> getRemarkImgList();
    public List<T> getImgListBySelect(@Param("Space")String Space,@Param("DeviceType")String DeviceType);
    public List<T> getOtherImgListBySelect(@Param("SampleTime")String SampleTime,@Param("Space")String Space,@Param("DeviceType")String DeviceType);

	public List<T1> getEmuListData();

	public List<T1> getEmuListDataID(java.util.Map<String, Object> param);

	public List<T2> getSf6ListData(java.util.Map<String, Object> param);

	public List<T3> getStomListData(java.util.Map<String, Object> param);

	public List<T4> getSmoamListData(java.util.Map<String, Object> param);

	public List<T5> getScomListData(java.util.Map<String, Object> param);

	public List<T6> getSpdmData(java.util.Map<String, Object> param);

	public List<T2> getSf6AllData();

	public List<T3> getStomAllData();

	public List<T4> getSmoamAllData();

	public List<T5> getScomAllData();

}
