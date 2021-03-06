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
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface DeviceHealthStateDao<T> extends BaseDao<T> {
    //     List<DataEntity> getYXHistoryRefname(HistoryPage page);
//    List<DataEntity> getYXHistoryByrefname(HistoryPage page);

//    int YXHistoryCountByrefname(HistoryPage page);

//    List<DataEntity> exportYXHistory(BasePage page);

    //获取SpaceDetail实时数据
    List<DeviceEntity> getDetailListDevice(String Type);

//     List<StomAlarmEntity> getStomAlarm();
//     List<Sf6AlarmEntity> getSf6Alarm();
//     List<SmoamAlarmEntity> getSmoamAlarm();
//     List<ScomAlarmEntity> getScomAlarm();
//     List<SpdmAlarmEntity> getSpdmAlarm();

    List<StomYxEntity> getStomDetail();

    List<Sf6YxEntity> getSf6Detail();

    List<SmoamYxEntity> getSmoamDetail();

    List<ScomYxEntity> getScomDetail();

    List<SpdmYxEntity> getSpdmDetail();

//    List<WeatherEntity> getWeatherDetail();

//    List<DeviceEntity> getEquipment(String equipmentId);
//
//    List<StomYxEntity> getStomDetail(String equipmentId);
//
//    List<Sf6YxEntity> getSf6Detail(String equipmentId);
//
//    List<SmoamYxEntity> getSmoamDetail(String equipmentId);
//
//    List<ScomYxEntity> getScomDetail(String equipmentId);
//
//    List<SpdmYxEntity> getSpdmDetail(String equipmentId);
//
//    List<WeatherEntity> getWeatherDetail(String equipmentId);

    List<StomYxEntity> getStomDetailDate();

    List<Sf6YxEntity> getSf6DetailDate();

    List<SmoamYxEntity> getSmoamDetailDate();

    List<ScomYxEntity> getScomDetailDate();

    List<SpdmYxEntity> getSpdmDetailDate();


    List<StomYxEntity> getStomDetailByDate(String _time);

    List<Sf6YxEntity> getSf6DetailByDate(String _time);

    List<SmoamYxEntity> getSmoamDetailByDate(String _time);

    List<ScomYxEntity> getScomDetailByDate(String _time);

    List<SpdmYxEntity> getSpdmDetailByDate(String _time);


    List<StomYxEntity> getStomDetailDateByDate(String _time);

    List<Sf6YxEntity> getSf6DetailDateByDate(String _time);

    List<SmoamYxEntity> getSmoamDetailDateByDate(String _time);

    List<ScomYxEntity> getScomDetailDateByDate(String _time);

    List<SpdmYxEntity> getSpdmDetailDateByDate(String _time);


    List<StomYxEntity> getStomDetailBySpace(String Space);

    List<Sf6YxEntity> getSf6DetailBySpace(String Space);

    List<SmoamYxEntity> getSmoamDetailBySpace(String Space);

    List<ScomYxEntity> getScomDetailBySpace(String Space);

    List<SpdmYxEntity> getSpdmDetailBySpace(String Space);

    List<StomYxEntity> getStomDetailDateBySpace(String Space);

    List<Sf6YxEntity> getSf6DetailDateBySpace(String Space);

    List<SmoamYxEntity> getSmoamDetailDateBySpace(String Space);

    List<ScomYxEntity> getScomDetailDateBySpace(String Space);

    List<SpdmYxEntity> getSpdmDetailDateBySpace(String Space);

//    List<WeatherEntity> getWeatherDetailDateBySpace(String Space);

    int YSPHistoryCount(BasePage page);

    List<stom_dataEntity> getYSPHistory(BasePage page);

    List<stom_dataEntity> exportYSPHistory(BasePage page);

    String getDeviceName(String id);


    int InfraredHistoryCount(BasePage page);

    List<Sf6_dataEntity> getInfraredHistory(BasePage page);

    List<Sf6_dataEntity> exportInfraredHistory(BasePage page);

    List<Sf6_dataEntity> getInfraredChart_history(Map<String, Object> param);


    int SF6HistoryCount(BasePage page);

    List<Sf6_dataEntity> getSF6History(BasePage page);

    List<Sf6_dataEntity> exportSF6History(BasePage page);

    int SMOAMHistoryCount(BasePage page);

    List<SMOAM_dataEntity> getSMOAMHistory(BasePage page);

    List<SMOAM_dataEntity> exportSMOAMHistory(BasePage page);

    int SCOMHistoryCount(BasePage page);

    List<SCOM_dataEntity> getSCOMHistory(BasePage page);

    List<SCOM_dataEntity> exportSCOMHistory(BasePage page);

    int SpdmHistoryCount(BasePage page);

    List<Spdm_dataEntity> getSpdmHistoryData(BasePage page);

    List<Spdm_dataEntity> exportSpdmHistoryData(BasePage page);

//    int WeatherHistoryCount(BasePage page);

//    List<WeatherEntity> getWeatherHistory(BasePage page);

//    List<WeatherEntity> exportWeatherHistory(BasePage page);

    List<DeviceEntity> getInfraredByType();

    List<DeviceEntity> getDeviceByType(String DeviceType);

    List<Sf6_dataEntity> getSF6Chart_history(Map<String, Object> param);

    List<Sf6_dataEntity> getSF6Chart_dealt(Map<String, Object> param);

    List<stom_dataEntity> getStomChart_history(Map<String, Object> param);

    List<stom_dataEntity> getStomChart_dealt(Map<String, Object> param);

    List<SMOAM_dataEntity> getSmoamChart_history(Map<String, Object> param);

    List<SMOAM_dataEntity> getSmoamChart_dealt(Map<String, Object> param);

    List<SCOM_dataEntity> getScomChart_history(Map<String, Object> param);

    List<SCOM_dataEntity> getScomChart_dealt(Map<String, Object> param);

//    List<WeatherEntity> getWeatherChart_history(Map<String, Object> param);

//    List<WeatherEntity> getWeatherChart_dealt(Map<String, Object> param);

    List<Spdm_dataEntity> getSpdmChart_history(Map<String, Object> param);


//    List<MessageEntity> getMessage();

    String getDeviceLN(String id);

    //遥信数据
//	 String getyxlnldByid(String id);
    String getyxLDLN(String IEC61850LD_LN);

    String getyxDesc(String refname);

    List<DataEntity> getYXData(String IEC61850LD_LN);

//    List<DataEntity> getYCData(HistoryPage page);

    //	 int getYCDataCount(HistoryPage page);
//    List<DataEntity> getYCData_yc(HistoryPage page);
//
//    int getYCDataCount_yc(HistoryPage page);
//
//    List<DataEntity> getYCData_yx(HistoryPage page);
//
//    int getYCDataCount_yx(HistoryPage page);

    List<StomYxEntity> getStomYx(Map<String, Object> param);

    List<StomYxEntity> getStomYxDate(Map<String, Object> param);

    List<Sf6YxEntity> getInfraredYx(Map<String, Object> param);

    List<Sf6YxEntity> getInfraredYxDate(Map<String, Object> param);

    List<Sf6YxEntity> getSf6Yx(Map<String, Object> param);

    List<Sf6YxEntity> getSf6YxDate(Map<String, Object> param);

    List<SmoamYxEntity> getSmoamYx(Map<String, Object> param);

    List<SmoamYxEntity> getSmoamYxDate(Map<String, Object> param);

    List<ScomYxEntity> getScomYx(Map<String, Object> param);

    List<ScomYxEntity> getScomYxDate(Map<String, Object> param);

    List<SpdmYxEntity> getSpdmYx(Map<String, Object> param);

    List<SpdmYxEntity> getSpdmYxDate(Map<String, Object> param);

    //遥信历史数据
    int StomYXHistoryCount(BasePage page);

    List<YXhistroyData> getstomYXHistoryData(BasePage page);

    int Sf6YXHistoryCount(BasePage page);

    List<YXhistroyData> getSf6YXHistoryData(BasePage page);

    int SmoamYXHistoryCount(BasePage page);

    List<YXhistroyData> getSmoamYXHistoryData(BasePage page);

    int ScomYXHistoryCount(BasePage page);

    List<YXhistroyData> getScomYXHistoryData(BasePage page);

    int SpdmYXHistoryCount(BasePage page);

    List<YXhistroyData> getSpdmYXHistoryData(BasePage page);

    List<SbushDataEntity> getSbushHistoryData(HistoryPage page);

    int getSbushHistoryDataCount(HistoryPage page);

    List<SbushDataEntity> getSpdcHistoryData(HistoryPage page);

    int getSpdcHistoryDataCount(HistoryPage page);
//	//油色谱实时数据
//	 List<DataEntity> getStomYXData(String id);

}
