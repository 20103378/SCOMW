package scott.service.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scott.dao.demo.SystemConfigurationDao;
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
import com.base.page.BasePage;
import com.base.service.BaseService;

/**
 *
 * <br>
 * <b>功能：</b>JeecgPersonService<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Service("SystemConfigurationService")
public class SystemConfigurationService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(SystemConfigurationService.class);




	@Autowired
    private SystemConfigurationDao<T> dao;

	@Override
	public SystemConfigurationDao<T> getDao() {return dao;}

	public List<Station_InfoEntity> getStation() throws Exception{
		return getDao().getStation();
	}
	public void updateStation(Station_InfoEntity entity){
		getDao().updateStation(entity);
	}
	/**
	    *查询主设备数据
		*@return
	 */
	public int EquipmentListCount(BasePage page)throws Exception{
		return getDao().EquipmentListCount(page);
	}
	public List<EquipmentEntity> getEquipmentList(BasePage page) throws Exception{
		Integer rowCount = EquipmentListCount(page);
		page.getPager().setRowCount(rowCount);
		return getDao().getEquipmentList(page);
	}
	/**
	 * 查询测量点名称
	 * @return
	 */
	public List<Refname_descEntity> getrefname()throws Exception{
		return getDao().getrefname();
	};
	public int getrefnameFlag(Refname_descEntity entity)throws Exception{
		return getDao().getrefnameFlag(entity);
	};
	public void update_refname(Refname_descEntity entity) throws Exception{
		getDao().update_refname(entity);
	}
	public void add_refname(Refname_descEntity entity) throws Exception{
		getDao().add_refname(entity);
	}

	public void delete_refname(Refname_descEntity entity) throws Exception{
		getDao().delete_refname(entity);
	}
	/**
	    *根据主设备ID查询设备数据
		*@return
	 */
	public int DeviceListCount(BasePage page)throws Exception{
		return getDao().DeviceListCount(page);
	}
	public List<DeviceEntity> getDeviceList(BasePage page) throws Exception{
		Integer rowCount = DeviceListCount(page);
		page.getPager().setRowCount(rowCount);
		return getDao().getDeviceList(page);
	}
	public void update_device(DeviceEntity entity) throws Exception{
		getDao().update_device(entity);
	}

	public void insert_device(DeviceEntity entity) throws Exception{
		getDao().insert_device(entity);
	}
	public String DeviceMaxId() throws Exception{
		return getDao().DeviceMaxId();
	}

	public void update_equipment(EquipmentEntity entity) throws Exception{
		getDao().update_equipment(entity);
	}
	public void add_equipment(EquipmentEntity entity) throws Exception{
		getDao().add_equipment(entity);
	}

	public void delete_equipment(EquipmentEntity entity) throws Exception{
		getDao().delete_equipment(entity);
	}

	public List<EquipmentSpaceEntity> getEquipmentSapce() throws Exception{
		return getDao().getEquipmentSapce();
	}
    public String getMAXSapceID() throws Exception{
        return getDao().getMAXSapceID();
    }
	public int getinsertFlag_space(EquipmentSpaceEntity space) throws Exception{
        return getDao().getinsertFlag_space(space);
    }
    public void updatespace(EquipmentSpaceEntity space) throws Exception{
       getDao().updatespace(space);
    }
    public void insertspace(EquipmentSpaceEntity space) throws Exception{
       getDao().insertspace(space);
    }
    public void delete_space(EquipmentSpaceEntity space) throws Exception{
        getDao().delete_space(space);
    }

	public List<java.lang.String> getNextEquipmentID() throws Exception{
		return getDao().getNextEquipmentID();
	}
	public void delete_device(DeviceEntity entity){
		getDao().delete_device(entity);
	}

	public List<Sf6AlarmEntity> getSf6Monitor(Sf6AlarmEntity entity) throws Exception{
		return getDao().getSf6Monitor(entity);
	}
	public List<StomAlarmEntity> getStomMonitor(StomAlarmEntity entity) throws Exception{
		return getDao().getStomMonitor(entity);
	}
	public List<SmoamAlarmEntity> getSmoamMonitor(SmoamAlarmEntity entity) throws Exception{
		return getDao().getSmoamMonitor(entity);
	}
	public List<ScomAlarmEntity> getScomMonitor(ScomAlarmEntity entity) throws Exception{
		return getDao().getScomMonitor(entity);
	}
	public List<SconditionAlarmEntity> getSconditionMonitor(SconditionAlarmEntity entity) throws Exception{
		return getDao().getSconditionMonitor(entity);
	}

	public List<DeviceEntity> getCheckBox(DeviceEntity entity) throws Exception{
		return getDao().getCheckBox(entity);
	}
	//修改和插入sf6告警值
	public void updateSf6Monitor(Sf6AlarmEntity entity){
		getDao().updateSf6Monitor(entity);
	}
	public void insertSf6Monitor(Sf6AlarmEntity entity){
		getDao().insertSf6Monitor(entity);
	}
	//修改和插入stom告警值
	public void updateStomMonitor(StomAlarmEntity entity){
		getDao().updateStomMonitor(entity);
	}
	public void insertStomMonitor(StomAlarmEntity entity){
		getDao().insertStomMonitor(entity);
	}
	//修改和插入smoam告警值
	public void updateSmoamMonitor(SmoamAlarmEntity entity){
		getDao().updateSmoamMonitor(entity);
	}
	public void insertSmoamMonitor(SmoamAlarmEntity entity){
		getDao().insertSmoamMonitor(entity);
	}
	//修改和插入scom告警值
	public void updateScomMonitor(ScomAlarmEntity entity){
		getDao().updateScomMonitor(entity);
	}
	public void insertScomMonitor(ScomAlarmEntity entity){
		getDao().insertScomMonitor(entity);
	}
	//修改和插入工况告警值
	public void updateSconditionMonitor(SconditionAlarmEntity entity){
		getDao().updateSconditionMonitor(entity);
	}
	public void insertSconditionMonitor(SconditionAlarmEntity entity){
		getDao().insertSconditionMonitor(entity);
	}

	public List<DeviceEntity> getExportList() throws Exception{
		return getDao().getExportList();
	}
	//生成地图XML文件
	public List<DeviceEntity> getDeviceBySpace(String Space){
		return getDao().getDeviceBySpace(Space);
	}
	public List<DeviceEntity> getDeviceBySpace_ft(String Space){
		return getDao().getDeviceBySpace_ft(Space);
	}
	//查询主设备数据
	public int I2ListCount(BasePage page)throws Exception{
		return getDao().I2ListCount(page);
	}
	public List<I2TableEntity> getI2Data(BasePage page) throws Exception{
		Integer rowCount = I2ListCount(page);
		page.getPager().setRowCount(rowCount);
		return getDao().getI2Data(page);
	}
    public void updateZJ103(ZJ103Entity DeviceID) throws Exception{
        getDao().updateZJ103(DeviceID);
    }
    public void insertZJ103(ZJ103Entity DeviceID) throws Exception{
        getDao().insertZJ103(DeviceID);
    }
	public int ZJ103Count(BasePage page)throws Exception{
        return getDao().ZJ103Count(page);
    }
    public String ZJ103DeviceIDMax()throws Exception{
        return getDao().ZJ103DeviceIDMax();
    }
    public String ZJ103_ln(ZJ103Entity DeviceID)throws Exception{
        return getDao().ZJ103_ln(DeviceID);
    }
    public int getZJ103CountByln(ZJ103Entity DeviceID)throws Exception{
        return getDao().getZJ103CountByln(DeviceID);
    }
    public List<ZJ103Entity> getI2Data_103(BasePage page) throws Exception{
        Integer rowCount = ZJ103Count(page);
        page.getPager().setRowCount(rowCount);
        return getDao().getI2Data_103(page);
    }
    public void Updata_103(ZJ103Entity DeviceID) throws Exception{
        getDao().Updata_103(DeviceID);
    }
    public void submit_103_devPhase(ZJ103Entity DeviceID) throws Exception{
        getDao().submit_103_devPhase(DeviceID);
    }
    public void delete_103(ZJ103Entity DeviceID) throws Exception{
        getDao().delete_103(DeviceID);
    }
	//导出EXCEL
	public List<I2TableEntity> getI2Data_export(BasePage page) throws Exception{
	    Integer rowCount = I2ListCount(page);
	    page.getPager().setRowCount(rowCount);
	    return getDao().getI2Data_export(page);
	    }
	//查询i1表中的字段名
	public List<YcDataInstEntity> getycNameList(YcDataInstEntity entity) throws Exception{
		return getDao().getycNameList(entity);
	}
	public List<YcDataInstEntity> getyxNameList(YcDataInstEntity entity) throws Exception{
		return getDao().getyxNameList(entity);
	}
	public List<YcDataInstEntity> getykNameList(YcDataInstEntity entity) throws Exception{
		return getDao().getykNameList(entity);
	}
	//红外测温增删改
	public Integer getInfraredFlag(InfraredTableEntity entity) throws Exception{
		return getDao().getInfraredFlag(entity);
	}
	public void insertInfraredTable(InfraredTableEntity entity) throws Exception{
		getDao().insertInfraredTable(entity);
	}
	public void updateInfraredTable(InfraredTableEntity entity) throws Exception{
		getDao().updateInfraredTable(entity);
	}
	//增删改
	public Integer getinsertFlag(I2TableEntity entity) throws Exception{
		return getDao().getinsertFlag(entity);
	}
	public void insertI2Table(I2TableEntity entity) throws Exception{
		getDao().insertI2Table(entity);
	}
	public void updateI2Table(I2TableEntity entity) throws Exception{
		getDao().updateI2Table(entity);
	}
	public void delete_I2(I2TableEntity entity) throws Exception{
		getDao().delete_I2(entity);
	}
	//获取遥信遥测遥控的61850ln_id
	public List<YcDataInstEntity> getycIEC61850LD_LN(I2TableEntity entity) throws Exception{
		return getDao().getycIEC61850LD_LN(entity);
	}
	public List<YcDataInstEntity> getyxIEC61850LD_LN(I2TableEntity entity) throws Exception{
		return getDao().getyxIEC61850LD_LN(entity);
	}
	public List<YcDataInstEntity> getykIEC61850LD_LN(I2TableEntity entity) throws Exception{
		return getDao().getykIEC61850LD_LN(entity);
	}
	//是否已经存在id从而进行修改或者添加操作
	public int getyxCount(Data_instEntity entity)throws Exception{
		return getDao().getyxCount(entity);
	}
	public void updateyx(Data_instEntity entity)throws Exception{
		getDao().updateyx(entity);
	}
	public void insertyx(Data_instEntity entity)throws Exception{
		getDao().insertyx(entity);
	}
	public void insertyxList(List<Data_instEntity> yxInst) {
		getDao().insertyxList(yxInst);
	}
	public int getycCount(Data_instEntity entity)throws Exception{
		return getDao().getycCount(entity);
	}
	public void updateyc(Data_instEntity entity)throws Exception{
		getDao().updateyc(entity);
	}
	public void insertyc(Data_instEntity entity)throws Exception{
		getDao().insertyc(entity);
	}
	public void insertycList(List<Data_instEntity> ycInst) {
		getDao().insertycList(ycInst);
	}
	public int getykCount(Data_instEntity entity)throws Exception{
		return getDao().getykCount(entity);
	}
	public void updateyk(Data_instEntity entity)throws Exception{
		getDao().updateyk(entity);
	}
	public void insertyk(Data_instEntity entity)throws Exception{
		getDao().insertyk(entity);
	}
	public void insertSGCByk(Data_instEntity entity)throws Exception{
		getDao().insertSGCByk(entity);
	}
	//对ln表进行操作
	public int getLnCount(InstNodeEntity entity)throws Exception{
		return getDao().getLnCount(entity);
	}
	public void updateLn(InstNodeEntity entity)throws Exception{
		getDao().updateLn(entity);
	}
	public void insertLn(InstNodeEntity entity)throws Exception{
		getDao().insertLn(entity);
	}
	//根据ln获取点序号
	public List<YclysEntity> getyxByld(YclysEntity entity)throws Exception{
		return getDao().getyxByld(entity);
	}
	public List<YclysEntity> getycByld(YclysEntity entity)throws Exception{
		return getDao().getycByld(entity);
	}
	public List<YclysEntity> getykByld(YclysEntity entity)throws Exception{
		return getDao().getykByld(entity);
	}

	public List<DataEntity> getYXDataRefname() throws Exception{
        return getDao().getYXDataRefname();
     }

	public List<String> getNextDeviceID() throws Exception{
		return getDao().getNextDeviceID();
	}



	

}
