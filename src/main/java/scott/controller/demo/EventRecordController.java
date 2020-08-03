package scott.controller.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import scott.entity.demo.AlarmRecordEntity;
import scott.entity.demo.JeecgPersonEntity;
import scott.entity.demo.OperaterRecordEntity;
import scott.page.demo.AlarmRecordPage;
import scott.service.demo.EventRecordService;


import com.base.util.HtmlUtil;
import com.base.web.BaseAction;

/**
 * <br>
 * <b>功能：</b>JeecgPersonController<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Controller
@RequestMapping("/eventRecord")
public class EventRecordController extends BaseAction {

    private final static Logger log = Logger
            .getLogger(EventRecordController.class);

    // Servrice start
    @Autowired(required = false)
    // 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
    private EventRecordService<JeecgPersonEntity> eventRecordService;

    /**
     * 跳转事件记录
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    public ModelAndView list() throws Exception {
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/eventRecord", context);
    }

    /**
     * 获取告警事件记录
     *
     * @param url
     * @param classifyId
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAlarmRecordList")
    public void getAlarmRecordList(AlarmRecordPage page,
                                   HttpServletResponse response, HttpServletRequest request) throws Exception {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        List<AlarmRecordEntity> dataList = eventRecordService.getAlarmRecordList(page);
        jsonMap.put("total", page.getPager().getRowCount());
        jsonMap.put("rows", dataList);
        HtmlUtil.writerJson(response, jsonMap);
    }

    /**
     * 获取操作事件记录
     *
     * @param url
     * @param classifyId
     * @return
     * @throws Exception
     */
    @RequestMapping("/getOperaterRecordList")
    public void getOperaterRecordList(AlarmRecordPage page,
                                      HttpServletResponse response, HttpServletRequest request) throws Exception {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        List<OperaterRecordEntity> dataList = eventRecordService.getOperaterRecordList(page);
        jsonMap.put("total", page.getPager().getRowCount());
        jsonMap.put("rows", dataList);
        HtmlUtil.writerJson(response, jsonMap);
    }


}
