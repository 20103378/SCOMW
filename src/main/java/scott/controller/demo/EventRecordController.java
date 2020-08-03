package scott.controller.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.base.entity.BaseEntity;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import scott.entity.demo.AlarmRecordEntity;
import scott.page.demo.AlarmRecordPage;
import scott.service.demo.EventRecordService;


import com.base.util.HtmlUtil;
import com.base.web.BaseAction;

/**
 * 系统状态--事件记录页
 */
@Controller
@RequestMapping("/eventRecord")
public class EventRecordController extends BaseAction {

    private final static Logger log = Logger
            .getLogger(EventRecordController.class);

    // Servrice start
    @Autowired(required = false)
    // 自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
    private EventRecordService<BaseEntity> eventRecordService;

    /**
     * 跳转事件记录
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    public ModelAndView list(){
        Map<String, Object> context = getRootMap();
        return forword("scott/demo/eventRecord", context);
    }

    /**
     * 获取告警事件记录  yes
     * @param page
     * @param response
     * @throws Exception
     */
    @RequestMapping("/getAlarmRecordList")
    public void getAlarmRecordList(AlarmRecordPage page,
                                   HttpServletResponse response) throws Exception {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        List<AlarmRecordEntity> dataList = eventRecordService.getAlarmRecordList(page);
        jsonMap.put("total", page.getPager().getRowCount());
        jsonMap.put("rows", dataList);
        HtmlUtil.writerJson(response, jsonMap);
    }

}
