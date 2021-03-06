package com.scott.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.base.dao.BaseDao;

/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface TreeDeviceDao<T, T1, T2, T3, T4, T5, T6> extends BaseDao<T> {

	//injectXml获取ID和Type
	 List<T> getIDandTypeToinjectXml(String space);
	 List<T> getIDandTypeToinjectXmlInSpace();

	 List<T> getZoneEmuList();
	 List<T> getUnitinfo();
	 List<T> getPubspaceName();
	 List<T> getEquipmentName();
	 List<T> getPubspaceNameByType(String Type);
	 List<T> getImgList(java.util.Map<String, Object> param);
	 List<Integer> getPubDeviceTypeList();
	 List<T> getOtherImgList(String SampleTime);
	 List<String> getRemarkImgList();
     List<T> getImgListBySelect(@Param("Space")String Space,@Param("DeviceType")String DeviceType);
     List<T> getOtherImgListBySelect(@Param("SampleTime")String SampleTime,@Param("Space")String Space,@Param("DeviceType")String DeviceType);

	 List<T1> getEmuListData();

	 List<T1> getEmuListDataID(java.util.Map<String, Object> param);

	 List<T2> getSf6ListData(java.util.Map<String, Object> param);

	 List<T3> getStomListData(java.util.Map<String, Object> param);

	 List<T4> getSmoamListData(java.util.Map<String, Object> param);

	 List<T5> getScomListData(java.util.Map<String, Object> param);

	 List<T6> getSpdmData(java.util.Map<String, Object> param);

	 List<T2> getSf6AllData();

	 List<T3> getStomAllData();

	 List<T4> getSmoamAllData();

	 List<T5> getScomAllData();

}
