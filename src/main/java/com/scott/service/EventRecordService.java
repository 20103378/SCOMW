package com.scott.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scott.dao.EventRecordDao;
import com.scott.entity.AlarmRecordEntity;

import com.base.page.BasePage;
import com.base.service.BaseService;

/**
 * <br>
 * <b>功能：</b>JeecgPersonService<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Service("EventRecordService")
public class EventRecordService<T> extends BaseService<T> {
    private final static Logger log = Logger.getLogger(EventRecordService.class);

    @Autowired
    private EventRecordDao<T> dao;

    @Override
    public EventRecordDao<T> getDao() {
        return dao;
    }

    public int AlarmRecordCount(BasePage page) throws Exception {
        return getDao().AlarmRecordCount(page);
    }

    public List<AlarmRecordEntity> getAlarmRecordList(BasePage page) throws Exception {
        Integer rowCount = AlarmRecordCount(page);
        page.getPager().setRowCount(rowCount);
        return getDao().getAlarmRecordList(page);
    }
}
