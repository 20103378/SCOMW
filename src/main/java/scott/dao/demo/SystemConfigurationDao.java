package scott.dao.demo;


import java.util.List;

import scott.entity.demo.DataEntity;
import scott.entity.demo.Data_instEntity;
import scott.entity.demo.DeviceEntity;
import scott.entity.demo.EquipmentEntity;
import scott.entity.demo.EquipmentSpaceEntity;
import scott.entity.demo.I2TableEntity;
import scott.entity.demo.InfraredTableEntity;
import scott.entity.demo.InstNodeEntity;
import scott.entity.demo.Refname_descEntity;
import scott.entity.demo.ScomAlarmEntity;
import scott.entity.demo.SconditionAlarmEntity;
import scott.entity.demo.Sf6AlarmEntity;
import scott.entity.demo.SmoamAlarmEntity;
import scott.entity.demo.Station_InfoEntity;
import scott.entity.demo.StomAlarmEntity;
import scott.entity.demo.YcDataInstEntity;
import scott.entity.demo.YclysEntity;
import scott.entity.demo.ZJ103Entity;

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
public interface SystemConfigurationDao<T> extends BaseDao<T> {

	public List<DeviceEntity> getDeviceBySpace(String Space);
	public List<DeviceEntity> getDeviceBySpace_ft(String Space);

	public List<Station_InfoEntity> getStation();
	public void updateStation(Station_InfoEntity entity);

	public int EquipmentListCount(BasePage page);
	public List<EquipmentEntity> getEquipmentList(BasePage page);

	public List<Refname_descEntity> getrefname();
	public int getrefnameFlag(Refname_descEntity entity);
	public void update_refname(Refname_descEntity entity);
	public void add_refname(Refname_descEntity entity);
	public void delete_refname(Refname_descEntity entity);

	public int DeviceListCount(BasePage page);
	public List<DeviceEntity> getDeviceList(BasePage page);
	public void update_device(DeviceEntity entity);
	public void insert_device(DeviceEntity entity);
	public String DeviceMaxId();

	public void update_equipment(EquipmentEntity entity);
	public void add_equipment(EquipmentEntity entity);
	public void delete_equipment(EquipmentEntity entity);
	public List<EquipmentSpaceEntity> getEquipmentSapce();
	public String getMAXSapceID();
    public int getinsertFlag_space(EquipmentSpaceEntity space);
    public void updatespace(EquipmentSpaceEntity space);
    public void insertspace(EquipmentSpaceEntity space);
    public void delete_space(EquipmentSpaceEntity space);
	public List<java.lang.String> getNextEquipmentID();
	public void delete_device(DeviceEntity entity);

	public List<Sf6AlarmEntity> getSf6Monitor(Sf6AlarmEntity entity);
	public List<StomAlarmEntity> getStomMonitor(StomAlarmEntity entity);
	public List<SmoamAlarmEntity> getSmoamMonitor(SmoamAlarmEntity entity);
	public List<ScomAlarmEntity> getScomMonitor(ScomAlarmEntity entity);
	public List<SconditionAlarmEntity> getSconditionMonitor(SconditionAlarmEntity entity);
	public List<DeviceEntity> getCheckBox(DeviceEntity entity);

	public void insertSf6Monitor(Sf6AlarmEntity entity);
	public void updateSf6Monitor(Sf6AlarmEntity entity);
	public void insertStomMonitor(StomAlarmEntity entity);
	public void updateStomMonitor(StomAlarmEntity entity);
	public void insertSmoamMonitor(SmoamAlarmEntity entity);
	public void updateSmoamMonitor(SmoamAlarmEntity entity);
	public void insertScomMonitor(ScomAlarmEntity entity);
	public void updateScomMonitor(ScomAlarmEntity entity);
	public void insertSconditionMonitor(SconditionAlarmEntity entity);
	public void updateSconditionMonitor(SconditionAlarmEntity entity);

	public List<DeviceEntity> getExportList();

	public int I2ListCount(BasePage page);
	public int ZJ103Count(BasePage page);
	public int getZJ103CountByln(ZJ103Entity DeviceID);
    public void updateZJ103(ZJ103Entity DeviceID);
    public void insertZJ103(ZJ103Entity DeviceID);
	public String ZJ103DeviceIDMax();
	public String ZJ103_ln(ZJ103Entity DeviceID);
	public List<I2TableEntity> getI2Data(BasePage page);
	public List<ZJ103Entity> getI2Data_103(BasePage page);
	public void Updata_103(ZJ103Entity DeviceID);
	public void submit_103_devPhase(ZJ103Entity DeviceID);
	public void delete_103(ZJ103Entity DeviceID);
	public List<I2TableEntity> getI2Data_export(BasePage page);

	public List<YcDataInstEntity> getycNameList(YcDataInstEntity entity);
	public List<YcDataInstEntity> getyxNameList(YcDataInstEntity entity);
	public List<YcDataInstEntity> getykNameList(YcDataInstEntity entity);

	public Integer getInfraredFlag(InfraredTableEntity entity);
	public void insertInfraredTable(InfraredTableEntity entity);
	public void updateInfraredTable(InfraredTableEntity entity);

	public Integer getinsertFlag(I2TableEntity entity);
	public void insertI2Table(I2TableEntity entity);
	public void updateI2Table(I2TableEntity entity);
	public void delete_I2(I2TableEntity entity);

	public List<YcDataInstEntity> getycIEC61850LD_LN(I2TableEntity entity);
	public List<YcDataInstEntity> getyxIEC61850LD_LN(I2TableEntity entity);
	public List<YcDataInstEntity> getykIEC61850LD_LN(I2TableEntity entity);

	public int getyxCount(Data_instEntity entity);
	public int updateyx(Data_instEntity entity);
	public int insertyx(Data_instEntity entity);
	public void insertyxList(List<Data_instEntity> yxInst);
	public int getycCount(Data_instEntity entity);
	public int updateyc(Data_instEntity entity);
	public int insertyc(Data_instEntity entity);
	public void insertycList(List<Data_instEntity> ycInst);
	public int getykCount(Data_instEntity entity);
	public int updateyk(Data_instEntity entity);
	public int insertyk(Data_instEntity entity);
	public int insertSGCByk(Data_instEntity entity);

	public int getLnCount(InstNodeEntity entity);
	public int updateLn(InstNodeEntity entity);
	public int insertLn(InstNodeEntity entity);
	//根据ln获取点序号
	public List<YclysEntity> getyxByld(YclysEntity entity);
	public List<YclysEntity> getycByld(YclysEntity entity);
	public List<YclysEntity> getykByld(YclysEntity entity);


	public List<DataEntity> getYXDataRefname ();
	public List<String> getNextDeviceID();
	
	

}
