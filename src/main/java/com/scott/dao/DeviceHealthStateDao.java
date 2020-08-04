package com.scott.dao;


import java.util.List;
import java.util.Map;

import com.scott.entity.DataEntity;
import com.scott.entity.DeviceEntity;
import com.scott.entity.MessageEntity;
import com.scott.entity.SCOM_dataEntity;
import com.scott.entity.SMOAM_dataEntity;
import com.scott.entity.SbushDataEntity;
import com.scott.entity.ScomYxEntity;
import com.scott.entity.Sf6YxEntity;
import com.scott.entity.SmoamYxEntity;
import com.scott.entity.SpdmYxEntity;
import com.scott.entity.Spdm_dataEntity;
import com.scott.entity.Sf6_dataEntity;
import com.scott.entity.StomYxEntity;
import com.scott.entity.WeatherEntity;
import com.scott.entity.YXhistroyData;
import com.scott.entity.stom_dataEntity;
import com.scott.page.HistoryPage;

import com.base.dao.BaseDao;
import com.base.page.BasePage;
/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface DeviceHealthStateDao<T> extends BaseDao<T> {
//    public List<DataEntity> getYXHistoryRefname(HistoryPage page);
    public List<DataEntity> getYXHistoryByrefname(HistoryPage page);
    public int YXHistoryCountByrefname(HistoryPage page);
    public List<DataEntity> exportYXHistory(BasePage page);

    //获取SpaceDetail实时数据
    public List<DeviceEntity> getDetailListDevice(String Type);

//    public List<StomAlarmEntity> getStomAlarm();
//    public List<Sf6AlarmEntity> getSf6Alarm();
//    public List<SmoamAlarmEntity> getSmoamAlarm();
//    public List<ScomAlarmEntity> getScomAlarm();
//    public List<SpdmAlarmEntity> getSpdmAlarm();

    public List<StomYxEntity> getStomDetail();
    public List<Sf6YxEntity> getSf6Detail();
    public List<SmoamYxEntity> getSmoamDetail();
    public List<ScomYxEntity> getScomDetail();
    public List<SpdmYxEntity> getSpdmDetail();
    public List<WeatherEntity> getWeatherDetail();
    public List<DeviceEntity> getEquipment(String equipmentId);

    public List<StomYxEntity> getStomDetail(String equipmentId);
    public List<Sf6YxEntity> getSf6Detail(String equipmentId);
    public List<SmoamYxEntity> getSmoamDetail(String equipmentId);
    public List<ScomYxEntity> getScomDetail(String equipmentId);
    public List<SpdmYxEntity> getSpdmDetail(String equipmentId);
    public List<WeatherEntity> getWeatherDetail(String equipmentId);

    public List<StomYxEntity> getStomDetailDate();
    public List<Sf6YxEntity> getSf6DetailDate();
    public List<SmoamYxEntity> getSmoamDetailDate();
    public List<ScomYxEntity> getScomDetailDate();
    public List<SpdmYxEntity> getSpdmDetailDate();
    public List<WeatherEntity> getWeatherDetailDate();

    public List<StomYxEntity> getStomDetailByDate(String _time);
    public List<Sf6YxEntity> getSf6DetailByDate(String _time);
    public List<SmoamYxEntity> getSmoamDetailByDate(String _time);
    public List<ScomYxEntity> getScomDetailByDate(String _time);
    public List<SpdmYxEntity> getSpdmDetailByDate(String _time);
    public List<WeatherEntity> getWeatherDetailByDate(String _time);

    public List<StomYxEntity> getStomDetailDateByDate(String _time);
    public List<Sf6YxEntity> getSf6DetailDateByDate(String _time);
    public List<SmoamYxEntity> getSmoamDetailDateByDate(String _time);
    public List<ScomYxEntity> getScomDetailDateByDate(String _time);
    public List<SpdmYxEntity> getSpdmDetailDateByDate(String _time);
    public List<WeatherEntity> getWeatherDetailDateByDate(String _time);

    public List<StomYxEntity> getStomDetailBySpace(String Space);
    public List<Sf6YxEntity> getSf6DetailBySpace(String Space);
    public List<SmoamYxEntity> getSmoamDetailBySpace(String Space);
    public List<ScomYxEntity> getScomDetailBySpace(String Space);
    public List<SpdmYxEntity> getSpdmDetailBySpace(String Space);
    public List<WeatherEntity> getWeatherDetailBySpace(String Space);

    public List<StomYxEntity> getStomDetailDateBySpace(String Space);
    public List<Sf6YxEntity> getSf6DetailDateBySpace(String Space);
    public List<SmoamYxEntity> getSmoamDetailDateBySpace(String Space);
    public List<ScomYxEntity> getScomDetailDateBySpace(String Space);
    public List<SpdmYxEntity> getSpdmDetailDateBySpace(String Space);
    public List<WeatherEntity> getWeatherDetailDateBySpace(String Space);

    public int YSPHistoryCount(BasePage page);
	public List<stom_dataEntity> getYSPHistory(BasePage page);
	public List<stom_dataEntity> exportYSPHistory(BasePage page);
	public String getDeviceName(String id);

	public void deleteStom();

	public int InfraredHistoryCount(BasePage page);
	public List<Sf6_dataEntity> getInfraredHistory(BasePage page);
	public List<Sf6_dataEntity> exportInfraredHistory(BasePage page);
	public List<Sf6_dataEntity> getInfraredChart_history(Map<String, Object> param);


	public int SF6HistoryCount(BasePage page);
	public List<Sf6_dataEntity> getSF6History(BasePage page);
	public List<Sf6_dataEntity> exportSF6History(BasePage page);

	public int SMOAMHistoryCount(BasePage page);
	public List<SMOAM_dataEntity> getSMOAMHistory(BasePage page);
	public List<SMOAM_dataEntity> exportSMOAMHistory(BasePage page);

	public int SCOMHistoryCount(BasePage page);
	public List<SCOM_dataEntity> getSCOMHistory(BasePage page);
	public List<SCOM_dataEntity> exportSCOMHistory(BasePage page);

	public int SpdmHistoryCount(BasePage page);
	public List<Spdm_dataEntity> getSpdmHistoryData(BasePage page);
	public List<Spdm_dataEntity> exportSpdmHistoryData(BasePage page);

	public int WeatherHistoryCount(BasePage page);
	public List<WeatherEntity> getWeatherHistory(BasePage page);
	public List<WeatherEntity> exportWeatherHistory(BasePage page);

	public List<DeviceEntity> getInfraredByType();

	public List<DeviceEntity> getDeviceByType(String DeviceType);

	public List<Sf6_dataEntity> getSF6Chart_history(Map<String, Object> param);
	public List<Sf6_dataEntity> getSF6Chart_dealt(Map<String, Object> param);

	public List<stom_dataEntity> getStomChart_history(Map<String, Object> param);
	public List<stom_dataEntity> getStomChart_dealt(Map<String, Object> param);

	public List<SMOAM_dataEntity> getSmoamChart_history(Map<String, Object> param);
	public List<SMOAM_dataEntity> getSmoamChart_dealt(Map<String, Object> param);

	public List<SCOM_dataEntity> getScomChart_history(Map<String, Object> param);
	public List<SCOM_dataEntity> getScomChart_dealt(Map<String, Object> param);

	public List<WeatherEntity> getWeatherChart_history(Map<String, Object> param);
	public List<WeatherEntity> getWeatherChart_dealt(Map<String, Object> param);

	public List<Spdm_dataEntity> getSpdmChart_history(Map<String, Object> param);


	public List<MessageEntity> getMessage();

	public String  getDeviceLN(String id);
	//遥信数据
//	public String getyxlnldByid(String id);
	public String getyxLDLN(String IEC61850LD_LN);
	public String getyxDesc(String refname);
	public List<DataEntity> getYXData (String IEC61850LD_LN);
	public List<DataEntity> getYCData(HistoryPage page);
//	public int getYCDataCount(HistoryPage page);
    public List<DataEntity> getYCData_yc(HistoryPage page);
    public int getYCDataCount_yc(HistoryPage page);
    public List<DataEntity> getYCData_yx(HistoryPage page);
    public int getYCDataCount_yx(HistoryPage page);

	public List<StomYxEntity> getStomYx(Map<String, Object> param );
	public List<StomYxEntity> getStomYxDate(Map<String, Object> param );

	public List<Sf6YxEntity> getInfraredYx(Map<String, Object> param );
	public List<Sf6YxEntity> getInfraredYxDate(Map<String, Object> param );

	public List<Sf6YxEntity> getSf6Yx(Map<String, Object> param );
	public List<Sf6YxEntity> getSf6YxDate(Map<String, Object> param );

	public List<SmoamYxEntity> getSmoamYx(Map<String, Object> param );
	public List<SmoamYxEntity> getSmoamYxDate(Map<String, Object> param );

	public List<ScomYxEntity> getScomYx(Map<String, Object> param );
	public List<ScomYxEntity> getScomYxDate(Map<String, Object> param );

	public List<SpdmYxEntity> getSpdmYx(Map<String, Object> param );
	public List<SpdmYxEntity> getSpdmYxDate(Map<String, Object> param );

	//遥信历史数据
	public int StomYXHistoryCount(BasePage page);
	public List<YXhistroyData> getstomYXHistoryData(BasePage page);

	public int Sf6YXHistoryCount(BasePage page);
	public List<YXhistroyData> getSf6YXHistoryData(BasePage page);

	public int SmoamYXHistoryCount(BasePage page);
	public List<YXhistroyData> getSmoamYXHistoryData(BasePage page);

	public int ScomYXHistoryCount(BasePage page);
	public List<YXhistroyData> getScomYXHistoryData(BasePage page);

	public int SpdmYXHistoryCount(BasePage page);
	public List<YXhistroyData> getSpdmYXHistoryData(BasePage page);
	public List<SbushDataEntity> getSbushHistoryData(HistoryPage page);
	public int getSbushHistoryDataCount(HistoryPage page);
	public List<SbushDataEntity> getSpdcHistoryData(HistoryPage page);
	public int getSpdcHistoryDataCount(HistoryPage page);
	//油色谱实时数据
	public List<DataEntity> getStomYXData(String id);

}
