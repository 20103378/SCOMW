package com.scott.dao;

import java.util.List;

import com.scott.entity.AlarmRecordEntity;
import com.base.dao.BaseDao;
import com.base.page.BasePage;

/**
 * <br>
 * <b>功能：</b>JeecgPersonDao<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public interface EventRecordDao<T> extends BaseDao<T> {
    /**
     * 分页查询告警事件记录总页数
     *
     * @param page
     * @return
     */
     int AlarmRecordCount(BasePage page);

    /**
     * 分页查询告警事件记录
     *
     * @param page
     * @return
     */
     List<AlarmRecordEntity> getAlarmRecordList(BasePage page);
}

