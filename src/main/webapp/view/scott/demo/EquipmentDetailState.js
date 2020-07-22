$package('jeecg.EquipmentDetailState');
var _st=null;
var _et=null;
var _off = false;
var _time = null;
$(function(){
	jeecg.EquipmentDetailState.getData();
//	$("#Detail_but").unbind('click').click(function(){
//		export_Word();
//  	});
//	$("#search_but").unbind('click').click(function(){
//		$("#showdata_div").empty();
//
//		_off=true;
//		jeecg.EquipmentDetailState.showDataList();
//  	});
});
jeecg.EquipmentDetailState = function(){
    var _this = {
	getData:function(equipment){
		var equipmentId = $("#txtID").val();
    	$.ajax({
        	async: false,
        	cache: false,
        	type: 'POST',
        	url:ctxPath + '/deviceHealthState/getEquipmentDetailList.do?equipmentId='+equipmentId,
        	error: function(){// 请求失败处理函数
        		jeecg.alert('错误信息', '数据请求失败', 'error');
        	},
        	success: function(data){
        		jeecg.EquipmentDetailState.showDataList(data);
        		}
        	});
		},
    showDataList:function(data){
 		for(var n=0;n<data.length;n++){
				var html1 = "";
           		var tableid ="data_list_"+n;
           		var type = data[n].type;
       			var tran = getRemark(type,data[n].remark);
           		switch(type)
           		{
           		case "1":
           			html1 +="<div id='"+tableid+"' style='width:600px; float:left; margin:10px; padding:10px; border: 1px solid #ccc;background:#f8f8f8;'>";
    	    		html1 +="<div style='font-family:Microsoft YaHei;font-size:18;float:left;background:#9CF;width:560px;padding:20px;' " +
    	    				"onclick='toCurrentData("+JSON.stringify(data[n])+")'>"+data[n].deviceName+"<br>采集时间："+data[n].sampleTime+"</div>";
    	    		html1 +="<table class='Detailtb' style='margin:auto;font-size:16px;width:100%;'>";
    	    		html1 +="<tr style='background-color:transparent'><th>监测量名称</th><th>检测量值</th></tr>";
    	    		html1 +="<tr><td>甲烷(ppm)</td><td style='color:#c0e76f;'>"+data[n].CH4ppm+"</td></tr>";
    	    		html1 +="<tr><td>乙烯(ppm)</td><td style='color:#c0e76f;'>"+data[n].c2H4ppm+"</td></tr>";
    	    		html1 +="<tr><td>乙炔(ppm)</td><td style='color:#c0e76f;'>"+data[n].c2H2ppm+"</td></tr>";
    	    		html1 +="<tr><td>氢气(ppm)</td><td style='color:#c0e76f;'>"+data[n].h2ppm+"</td></tr>";
    	    		html1 +="<tr><td>一氧化碳(ppm)</td><td style='color:#c0e76f;'>"+data[n].COppm+"</td></tr>";
    	    		html1 +="<tr><td>二氧化碳(ppm)</td><td style='color:#c0e76f;'>"+data[n].CO2ppm+"</td></tr>";
    	    		html1 +="<tr><td>总烃(ppm)</td><td style='color:#c0e76f;'>"+data[n].totHyd+"</td></tr>";
    	    		html1 +="<tr><td>油位(ppm)</td><td style='color:#c0e76f;'>"+data[n].oilTmp+"</td></tr>";
    	    		html1 +="<tr><td>油色谱微水(ppm)</td><td style='color:#c0e76f;'>"+data[n].mst+"</td></tr>";
    	    		html1 +="<tr><td>状态</td>"+tran+"</tr>";
    	    		html1 +="</table>";
    	    		html1 +="</div>";
    	    		$("#showdata_div").append(html1);
           			break;
           		case "2":
    	    		html1 +="<div id='"+tableid+"' style='width:600px; float:left; margin:10px; padding:10px; border: 1px solid #ccc;background:#f8f8f8;'>";
    	    		html1 +="<div style='font-family:Microsoft YaHei;font-size:18;float:left;background:#9CF;width:560px;padding:20px;' " +
    	    				"onclick='toCurrentData("+JSON.stringify(data[n])+")'>"+data[n].deviceName+"<br>采集时间："+data[n].sampleTime+"</div>";
    	    		html1 +="<table class='Detailtb' style='margin:auto;font-size:16px;width:100%;'>";
    	    		html1 +="<tr style='background-color:transparent'><th>监测量名称</th><th>检测量值</th></tr>";
    	    		html1 +="<tr><td>温度</td><td style='color:#c0e76f;'>"+data[n].tmp+"</td></tr>";
    	    		html1 +="<tr><td>压力</td><td style='color:#c0e76f;'>"+data[n].pres+"</td></tr>";
    	    		html1 +="<tr><td>湿度</td><td style='color:#c0e76f;'>"+data[n].hum+"</td></tr>";
    	    		html1 +="<tr><td>状态</td>"+tran+"</tr>";
    	    		html1 +="</table>";
    	    		html1 +="</div>";
    	    		$("#showdata_div").append(html1);
           			break;
           		case "3":
           			html1 +="<div id='"+tableid+"' style='width:600px; float:left; margin:10px; padding:10px; border: 1px solid #ccc;background:#f8f8f8;'>";
    	    		html1 +="<div style='font-family:Microsoft YaHei;font-size:18;float:left;background:#9CF;width:560px;padding:20px;' " +
    	    				"onclick='toCurrentData("+JSON.stringify(data[n])+")'>"+data[n].deviceName+"<br>采集时间："+data[n].sampleTime+"</div>";
    	    		html1 +="<table class='Detailtb' style='margin:auto;font-size采集时间：16px;width:100%;'>";
    	    		html1 +="<tr style='background-color:transparent'><th>监测量名称</th><th>检测量值</th></tr>";
    	    		html1 +="<tr><td>全电流</td><td style='color:#c0e76f;'>"+data[n].totA+"</td></tr>";
    	    		html1 +="<tr><td>阻性电流</td><td style='color:#c0e76f;'>"+data[n].risA+"</td></tr>";
    	    		html1 +="<tr><td>阻容比</td><td style='color:#c0e76f;'>"+data[n].risCaRte+"</td></tr>";
    	    		html1 +="<tr><td>最近落雷时间</td><td style='color:#c0e76f;'>"+data[n].lastLigTm+"</td></tr>";
    	    		html1 +="<tr><td>落雷次数</td><td style='color:#c0e76f;'>"+data[n].ligCnt+"</td></tr>";
    	    		html1 +="<tr><td>状态</td>"+tran+"</tr>";
    	    		html1 +="</table>";
    	    		html1 +="</div>";
    	    		$("#showdata_div").append(html1);
           			break;
         		case "4":
         			html1 +="<div id='"+tableid+"' style='width:600px; float:left; margin:10px; padding:10px; border: 1px solid #ccc;background:#f8f8f8;'>";
    	    		html1 +="<div style='font-family:Microsoft YaHei;font-size:18;float:left;background:#9CF;width:560px;padding:20px;' " +
    	    				"onclick='toCurrentData("+JSON.stringify(data[n])+")'>"+data[n].deviceName+"<br>采集时间："+data[n].sampleTime+"</div>";
    	    		html1 +="<table class='Detailtb' style='margin:auto;font-size:16px;width:100%;'>";
    	    		html1 +="<tr style='background-color:transparent'><th>监测量名称</th><th>检测量值</th></tr>";
    	    		html1 +="<tr><td>泄露电流(Am)</td><td style='color:#c0e76f;'>"+data[n].CGAmp+"</td></tr>";
    	    		html1 +="<tr><td>夹件电流(Am)</td><td style='color:#c0e76f;'>"+data[n].amp1+"</td></tr>";
    	    		html1 +="<tr><td>本体主油箱磁力式油位</td><td style='color:#c0e76f;'>"+data[n].mainOil+"</td></tr>";
    	    		html1 +="<tr><td>本体主油箱压力式油位</td><td style='color:#c0e76f;'>"+data[n].preOil+"</td></tr>";
    	    		html1 +="<tr><td>有载开关油位</td><td style='color:#c0e76f;'>"+data[n].sltcOil+"</td></tr>";
    	    		html1 +="<tr><td>阀侧首端套管SF6压力(Bar)</td><td style='color:#c0e76f;'>"+data[n].pre1+"</td></tr>";
    	    		html1 +="<tr><td>阀侧末端套管SF6压力(Bar)</td><td style='color:#c0e76f;'>"+data[n].pre2+"</td></tr>";
    	    		html1 +="<tr><td>网侧绕组温度(℃)</td><td style='color:#c0e76f;'>"+data[n].tmp1+"</td></tr>";
    	    		html1 +="<tr><td>油面温度(℃)</td><td style='color:#c0e76f;'>"+data[n].tmp2+"</td></tr>";
    	    		html1 +="<tr><td>顶层油温1</td><td style='color:#c0e76f;'>"+data[n].tmp4+"</td></tr>";
    	    		html1 +="<tr><td>顶层油温2</td><td style='color:#c0e76f;'>"+data[n].tmp5+"</td></tr>";
       	    		html1 +="<tr><td>底层油温1</td><td style='color:#c0e76f;'>"+data[n].tmp6+"</td></tr>";
    	    		html1 +="<tr><td>底层油温2</td><td style='color:#c0e76f;'>"+data[n].tmp7+"</td></tr>";
    	    		html1 +="<tr><td>环境温度</td><td style='color:#c0e76f;'>"+data[n].Tmp8+"</td></tr>";
    	    		html1 +="<tr><td>状态</td>"+tran+"</tr>";
    	    		html1 +="</table>";
    	    		html1 +="</div>";
    	    		$("#showdata_div").append(html1);
         			break;
         		case "8":
         			html1 +="<div id='"+tableid+"' style='width:600px; float:left; margin:10px; padding:10px; border: 1px solid #ccc;background:#f8f8f8;'>";
    	    		html1 +="<div style='font-family:Microsoft YaHei;font-size:18;float:left;background:#9CF;width:560px;padding:20px;' " +
    	    				"onclick='toCurrentData("+JSON.stringify(data[n])+")'>"+data[n].deviceName+"<br>采集时间："+data[n].sampleTime+"</div>";
    	    		html1 +="<table class='Detailtb' style='margin:auto;font-size:16px;width:100%;'>";
    	    		html1 +="<tr style='background-color:transparent'><th>监测量名称</th><th>检测量值</th></tr>";
    	    		html1 +="<tr><td>温度</td><td style='color:#c0e76f;'>"+data[n].temperature+"</td></tr>";
    	    		html1 +="<tr><td>湿度</td><td style='color:#c0e76f;'>"+data[n].humidity+"</td></tr>";
    	    		html1 +="<tr><td>风向</td><td style='color:#c0e76f;'>"+data[n].windDirection+"</td></tr>";
    	    		html1 +="<tr><td>风速</td><td style='color:#c0e76f;'>"+data[n].windSpeed+"</td></tr>";
    	    		html1 +="<tr><td>状态</td>"+tran+"</tr>";
    	    		html1 +="</table>";
    	    		html1 +="</div>";
    	    		$("#showdata_div").append(html1);
         			break;
         		case "19":
         			html1 +="<div id='"+tableid+"' style='width:600px; float:left; margin:10px; padding:10px; border: 1px solid #ccc;background:#f8f8f8;'>";
    	    		html1 +="<div style='font-family:Microsoft YaHei;font-size:18;float:left;background:#9CF;width:560px;padding:20px;' " +
    	    				"onclick='toCurrentData("+JSON.stringify(data[n])+")'>"+data[n].deviceName+"<br>采集时间："+data[n].sampleTime+"</div>";
    	    		html1 +="<table class='Detailtb' style='margin:auto;font-size:16px;width:100%;'>";
    	    		html1 +="<tr style='background-color:transparent'><th>监测量名称</th><th>检测量值</th></tr>";
    	    		html1 +="<tr><td>局放声学水平</td><td style='color:#c0e76f;'>"+data[n].acuPaDsch+"</td></tr>";
    	    		html1 +="<tr><td>局放UHF水平</td><td style='color:#c0e76f;'>"+data[n].uhfPaDsch+"</td></tr>";
    	    		html1 +="<tr><td>放电相位</td><td style='color:#c0e76f;'>"+data[n].phase+"</td></tr>";
    	    		html1 +="<tr><td>脉冲次数</td><td style='color:#c0e76f;'>"+data[n].plsNum+"</td>/tr>";
    	    		html1 +="<tr><td>状态</td>"+ret+"<td></td><td></td></tr>";
    	    		html1 +="</table>";
    	    		html1 +="</div>";
    	    		$("#showdata_div").append(html1);
         			break;
           		default:
           		}
 		}

    }
    };
    return _this;
}();

function linkToData(devId,name,type) {
	var url=encodeURI(ctxPath + '/deviceHealthState/DeviceDetail.do?DeviceID='+devId+'&DeviceType='+type+'&DeviceName='+name);
	parent.jeecg.main.addTab(name,url);
}
//监测是否超时
function returntime(starttime,myDate){

   		starttime= starttime.replace(new RegExp("-","gm"),"/");
   		starttime= (new Date(starttime)).getTime(); //得到毫秒数
   		if(starttime<myDate){
   			return "<td style='color:#ea5f5f'>超时</td>";
//   			return "<td style='color:#c0e76f'>正常</td>";
   		}else{
   			return "<td style='color:#c0e76f'>正常</td>";
   		}
}

function toCurrentData(data){
	var nodetype=data.type;
	var id=data.deviceID;
	var nodetxt=data.deviceName;
	var url=encodeURI(ctxPath + '/deviceHealthState/DeviceDetail.do?DeviceID='+id+'&DeviceType='+nodetype+'&DeviceName='+nodetxt);
	parent.jeecg.main.addTab(nodetxt,url);
}
function reflash_Word(){

}
function export_Word(){
	var type = $("#txtType").val();
	if(type=="1"){
		$.ajax({
	    	async: false,
	    	cache: false,
	    	type: 'POST',
	//    	url: ctxPath + '/deviceHealthState/getStomDetailListExportWord',
	    	url: ctxPath + '/deviceHealthState/getStomDetailListExportWord.do',
	//    	error: function(){// 请求失败处理函数
	//    		jeecg.alert('错误信息', '数据请求失败', 'error');
	//    	},
	    	success: function(data){
	    		var head_data,json;
	    		head_data = [];
	    		head_data.push({"title":"甲烷","value":"CH4ppm"},
	    		{"title":"乙烯","value":"c2H4ppm"},{"title":"乙炔","value":"c2H2ppm"},
	    		{"title":"乙炔阈值状态","value":"c2H2Alm"},{"title":"氢气","value":"h2ppm"},{"title":"氢气阈值状态","value":"h2Alm"},
	    		{"title":"一氧化碳","value":"COppm"},{"title":"二氧化碳","value":"CO2ppm"},{"title":"总烃","value":"totHyd"},
	    		{"title":"总烃阈值状态","value":"totHydcAlm"},{"title":"油位","value":"oilTmp"},{"title":"油色谱微水","value":"mst"},
	    		{"title":"状态","value":"type"});
	    		tableExport_test(data,head_data,"doc","油色谱及微水设备报表");

	    	}
		});
	}
	if(type=="2"){
		$.ajax({
	    	async: false,
	    	cache: false,
	    	type: 'POST',
	    	url: ctxPath + '/deviceHealthState/getSf6DetailListExportWord.do',
	//    	error: function(){// 请求失败处理函数
	//    		jeecg.alert('错误信息', '数据请求失败', 'error');
	//    	},
	    	success: function(data){
	    		var head_data,json;
	    		head_data = [];
	    		head_data.push(
	    		{"title":"温度","value":"tmp"},{"title":"压力","value":"pres"},
	    		{"title":"压力阈值状态","value":"denAlm"},{"title":"湿度","value":"hum"},
	    		{"title":"状态","value":"type"});
	    		tableExport_test(data,head_data,"doc","SF6气体压力设备报表");
	    	}
		});
	}
	if(type=="3"){
		$.ajax({
	    	async: false,
	    	cache: false,
	    	type: 'POST',
	    	url: ctxPath + '/deviceHealthState/getSmoamDetailListExportWord.do',
//	    	error: function(){// 请求失败处理函数
//	    		jeecg.alert('错误信息', '数据请求失败', 'error');
//	    	},
	    	success: function(data){
	    		var head_data,json;
	    		head_data = [];
	    		head_data.push(
	    		{"title":"全电流","value":"totA"},{"title":"全电流阈值状态","value":"totAAlm"},{"title":"阻性电流","value":"risA"},
	    		{"title":"阻容比","value":"risCaRte"},{"title":"最近落雷时间","value":"lastLigTm"},{"title":"落雷次数","value":"ligCnt"},
	    		{"title":"状态","value":"type"});
	    		tableExport(data,head_data,"doc","避雷器及动作次数设备报表");
	    	}
		});
	}
	if(type=="4"){
		$.ajax({
	    	async: false,
	    	cache: false,
	    	type: 'POST',
	    	url: ctxPath + '/deviceHealthState/getScomDetailListExportWord.do',
//	    	error: function(){// 请求失败处理函数
//	    		jeecg.alert('错误信息', '数据请求失败', 'error');
//	    	},
	    	success: function(data){
	    		var head_data,json;
	    		head_data = [];
	    		head_data.push(
	    	    		{"title":"泄露电流","value":"CGAmp"},
	    	    		{"title":"夹件电流(Am)","value":"amp1"},
	    	    		{"title":"本体主油箱磁力式油位","value":"mainOil"},
	    	    		{"title":"本体主油箱压力式油位","value":"preOil"},
	    	    		{"title":"有载开关油位","value":"sltcOil"},
	    	    		{"title":"阀侧首端套管SF6压力(Bar)","value":"pre1"},
	    	    		{"title":"阀侧末端套管SF6压力(Bar)","value":"pre2"},
	    	    		{"title":"网侧绕组温度(℃)","value":"tmp1"},
	    	    		{"title":"油面温度(℃)","value":"tmp2"},
	    	    		{"title":"顶层油温1","value":"tmp4"},
	    	    		{"title":"顶层油温2","value":"tmp5"},
	    	    		{"title":"底层油温1","value":"tmp6"},
	    	    		{"title":"底层油温2","value":"tmp7"},
	    	    		{"title":"环境温度","value":"Tmp8"},
	    	    		{"title":"泄露电流阈值状态","value":"CGAlm"},
	    	    		{"title":"状态","value":"type"});
	    		tableExport(data,head_data,"doc","避雷器及动作次数设备报表");
	    	}
		});
	}
	if(type=="19"){
		$.ajax({
	    	async: false,
	    	cache: false,
	    	type: 'POST',
	    	url: ctxPath + '/deviceHealthState/getSpdmDetailListExportWord.do',
	//    	error: function(){// 请求失败处理函数
	//    		jeecg.alert('错误信息', '数据请求失败', 'error');
	//    	},
	    	success: function(data){
	    		var head_data,json;
	    		head_data = [];
	    		head_data.push(
	    	    		{"title":"局放声学水平","value":"acuPaDsch"},{"title":"局放声学水平阈值状态","value":"paDschAlm"},{"title":"局放UHF水平","value":"uhfPaDsch"},
	    	    		{"title":"放电相位","value":"phase"},{"title":"脉冲次数","value":"plsNum"},
	    	    		{"title":"状态","value":"type"});
	    		tableExport(data,head_data,"doc","铁芯泄露电流设备报表");
	    	}
		});
	}
}
function toEquipmentData(data){
	if(data=="1"){
		nodetxt="油色谱及微水";
	}else if(data=="2"){
		nodetxt="SF6气体压力";
	}else if(data=="3"){
		nodetxt="避雷器及动作次数";
	}else if(data=="4"){
		nodetxt="铁芯泄露电流";
	}else if(data=="5"){
		nodetxt="换流变运行工况	";
	}else if(data=="8"){
		nodetxt="气象信息";
	}else if(ln=="19"=="19"){
		nodetxt="局放";
	}else {
		nodetxt="未定义";
	}
	var url=encodeURI(ctxPath + '/deviceHealthState/EquipmentDetail.do');
	parent.jeecg.main.addTab(nodetxt,url);
}

//去除所有空格
function Trim(str)
{
    return str.replace(/\s+/g,"");
}
//日历初始化
function myformatter(date){
    var y = date.getFullYear();
    var m = date.getMonth()+1;
    var d = date.getDate();
    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}
function myparser(s){
    if (!s) return new Date();
    var ss = (s.split('-'));
    var y = parseInt(ss[0],10);
    var m = parseInt(ss[1],10);
    var d = parseInt(ss[2],10);
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
        return new Date(y,m-1,d);
    } else {
        return new Date();
    }
}
function getRemark(deviceType,remark){
	if(remark == 0){
		return "<td style='color:#c0e76f'>数据健康正常</td>";
	}else{
		if(deviceType==1){

			return YSP_trans(remark);

		}else if(deviceType==2){

			return SF6_trans(remark);

		}else if(deviceType==3){

			return Smoam_trans(remark);

		}else if(deviceType==4){

			return Scom_trans(remark);

		}else if(deviceType==5){

			return Scondition_trans(remark);

		}else{
			return "<td style='color:#ea5f5f'>告警</td>";
		}
	}

}
//工况告警翻译
function Scondition_trans(a)
{
    var str = "";
    var remark=parseInt(a);

    if ((remark & 0x08000000) == 0x08000000)
    {
        if ((remark & 0x08000800) == 0x08000800)
        {
            str += "<td style='color:#ea5f5f'>套管1三相增量差值告警(日)</td>";
        }else if ((remark & 0x08002000) == 0x08002000)
        {
            str += "<td style='color:#ea5f5f'>套管1三相增量差值告警(周)</td>";
        }else if ((remark & 0x08008000) == 0x08008000)
        {
            str += "<td style='color:#ea5f5f'>套管1三相增量差值告警(月)</td>";
        }else if ((remark & 0x08001000) == 0x08001000)
        {
            str += "<td style='color:#ea5f5f'>套管2三相增量差值告警(日)</td>";
        }else if ((remark & 0x08004000) == 0x08004000)
        {
            str += "<td style='color:#ea5f5f'>套管2三相增量差值告警(周)</td>";
        }else if ((remark & 0x08010000) == 0x08010000)
        {
            str += "<td style='color:#ea5f5f'>套管2三相增量差值告警(月)</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>套管三相增量差值告警</td>";
        }

    }else if ((remark & 0x04000000) == 0x04000000)
    {
        if ((remark & 0x04000200) == 0x04000200)
        {
            str += "<td style='color:#ea5f5f'>套管sf6压力1日变化率告警</td>";
        }else if ((remark & 0x04000400) == 0x04000400)
        {
            str += "<td style='color:#ea5f5f'>套管sf6压力2日变化率告警</td>";
        }else{
        	 str += "<td style='color:#ea5f5f'>套管sf6压力变化率告警</td>";
        }
    }else if ((remark & 0x02000000) == 0x02000000)
    {
    	if ((remark & 0x02000004) == 0x02000004)
        {
            str += "<td style='color:#ea5f5f'>顶层油温阈值告警</td>";
        }else if ((remark & 0x02000004) == 0x02000008)
        {
            str += "<td style='color:#ea5f5f'>网侧绕组温度阈值告警</td>";
        }else if ((remark & 0x02000010) == 0x02000010)
        {
            str += "<td style='color:#ea5f5f'>阀侧绕组温度阈值告警</td>";
        }else if ((remark & 0x02000020) == 0x02000020)
        {
            str += "<td style='color:#ea5f5f'>套管sf6压力1阈值告警</td>";
        }else if ((remark & 0x02000040) == 0x02000040)
        {
            str += "<td style='color:#ea5f5f'>套管sf6压力2阈值告警</td>";
        }else if ((remark & 0x02000080) == 0x02000080)
        {
            str += "<td style='color:#ea5f5f'>有载开关油位阈值告警</td>";
        }else if ((remark & 0x02000100) == 0x02000100)
        {
            str += "<td style='color:#ea5f5f'>主油箱油位阈值告警</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>绝对阈值告警</td>";
        }
    }else if ((remark & 0x01000000) == 0x01000000)
    {
    	if ((remark & 0x01000001) == 0x01000001)
        {
            str += "<td style='color:#ea5f5f'>设备连接异常</td>";
        }else if ((remark & 0x01000002) == 0x01000002)
        {
            str += "<td style='color:#ea5f5f'>设备采集异常</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>装置自检告警</td>";
        }
    }else{
  	  str += "<td style='color:#ea5f5f'>数据异常</td>";
    }
    return str;
}

/// 铁芯告警翻译
function Scom_trans(rek)
{
	var str = "";
    var remark=parseInt(rek);
    if ((remark & 0x02000000) == 0x02000000)
    {
    	if ((remark & 0x02000004) == 0x02000004)
        {
            str += "<td style='color:#ea5f5f'>接地电流阈值告警</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>绝对阈值告警</td>";
        }
    }else if ((remark & 0x01000000) == 0x01000000)
    {
    	if ((remark & 0x01000001) == 0x01000001)
        {
            str += "<td style='color:#ea5f5f'>设备连接异常</td>";
        }else if ((remark & 0x01000002) == 0x01000002)
        {
            str += "<td style='color:#ea5f5f'>设备采集异常</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>装置自检告警</td>";
        }
    }else{
  	  str += "<td style='color:#ea5f5f'>数据异常</td>";
    }
    return str;
}

/// 避雷器告警翻译
function Smoam_trans(rek)
{
	var str = "";
    var remark=parseInt(rek);
    if ((remark & 0x02000000) == 0x02000000)
    {
    	if ((remark & 0x02000004) == 0x02000004)
        {
            str += "<td style='color:#ea5f5f'>接地电流阈值告警</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>绝对阈值告警</td>";
        }
    }else if ((remark & 0x01000000) == 0x01000000)
    {
    	if ((remark & 0x01000001) == 0x01000001)
        {
            str += "<td style='color:#ea5f5f'>设备连接异常</td>";
        }else if ((remark & 0x01000002) == 0x01000002)
        {
            str += "<td style='color:#ea5f5f'>设备采集异常</td>";
        }else{
        	str += "<td style='color:#ea5f5f'>装置自检告警</td>";
        }
    }else{
  	  str += "<td style='color:#ea5f5f'>数据异常</td>";
    }
    return str;
}
/// 油色谱告警翻译
  function YSP_trans(rek)
  {
	  var str = "";
	  var remark=parseInt(rek);

	  if ((remark & 0x08000000) == 0x08000000)
      {
		  if ((remark & 0x08001000) == 0x08001000)
          {
              str += "<td style='color:#ea5f5f'>H2三相增量对比告警</td>";
          }else if ((remark & 0x08002000) == 0x08002000)
          {
              str += "<td style='color:#ea5f5f'>C2H2三相增量对比告警</td>";
          }else if ((remark & 0x08004000) == 0x08004000)
          {
              str += "<td style='color:#ea5f5f'>TH三相增量对比告警</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>三相增量对比告警</td>";
          }

      }else if ((remark & 0x04000000) == 0x04000000)
      {
    	  if ((remark & 0x04000008) == 0x04000008)
          {
              str += "<td style='color:#ea5f5f'>H2变化率告警</td>";
          }else if ((remark & 0x04000010) == 0x04000010)
          {
              str += "<td style='color:#ea5f5f'>C2H2变化率告警</td>";
          }else if ((remark & 0x04000020) == 0x04000020)
          {
              str += "<td style='color:#ea5f5f'>TH变化率告警</td>";
          }else if ((remark & 0x04000040) == 0x04000040)
          {
              str += "<td style='color:#ea5f5f'>微水变化率告警</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>变化率告警</td>";
          }
      }else if ((remark & 0x02000000) == 0x02000000)
      {
    	  if ((remark & 0x02000100) == 0x02000100)
          {
              str += "<td style='color:#ea5f5f'>H2阈值告警</td>";
          }else if ((remark & 0x02000200) == 0x02000200)
          {
              str += "<td style='color:#ea5f5f'>C2H2阈值告警</td>";
          }else if ((remark & 0x02000400) == 0x02000400)
          {
              str += "<td style='color:#ea5f5f'>TH阈值告警</td>";
          }else if ((remark & 0x02000800) == 0x02000800)
          {
              str += "<td style='color:#ea5f5f'>微水阈值告警</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>绝对阈值告警</td>";
          }
      }else if ((remark & 0x01000000) == 0x01000000)
      {
      	if ((remark & 0x01000001) == 0x01000001)
          {
              str += "<td style='color:#ea5f5f'>设备连接异常</td>";
          }else if ((remark & 0x01000002) == 0x01000002)
          {
              str += "<td style='color:#ea5f5f'>设备采集异常</td>";
          }else if ((remark & 0x01000004) == 0x01000004){
	      		 str += "<td style='color:#ea5f5f'>载气欠压</td>";
          }else{
	      	  str += "<td style='color:#ea5f5f'>装置自检告警</td>";
          }
      }else{
    	  str += "<td style='color:#ea5f5f'>数据异常</td>";
      }
      return str;
  }

  /// SF6告警翻译
  function SF6_trans(rek)
  {
	  var str = "";
	  var remark=parseInt(rek);

	  if ((remark & 0x08000000) == 0x08000000)
      {
      	  if ((remark & 0x08004000) == 0x08000100)
          {
              str += "<td style='color:#ea5f5f'>SF6月增量告警</td>";
          }else if ((remark & 0x08002000) == 0x08000080)
          {
              str += "<td style='color:#ea5f5f'>SF6周增量告警</td>";
          }else if ((remark & 0x08001000) == 0x08000040)
          {
              str += "<td style='color:#ea5f5f'>SF6日增量告警</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>三相增量对比告警</td>";
          }

      }else if ((remark & 0x04000000) == 0x04000000)
      {
      	  if ((remark & 0x04000008) == 0x04000008)
          {
              str += "<td style='color:#ea5f5f'>Sf6日变化率告警</td>";
          }else if ((remark & 0x04000010) == 0x04000010)
          {
              str += "<td style='color:#ea5f5f'>Sf6周变化率告警</td>";
          }else if ((remark & 0x04000020) == 0x04000020)
          {
              str += "<td style='color:#ea5f5f'>Sf6月变化率告警</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>变化率告警</td>";
          }
      }else if ((remark & 0x02000000) == 0x02000000)
      {
      	if ((remark & 0x02000004) == 0x02000004)
          {
              str += "<td style='color:#ea5f5f'>Sf6压力阈值告警</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>绝对阈值告警</td>";
          }
      }else if ((remark & 0x01000000) == 0x01000000)
      {
      	if ((remark & 0x01000001) == 0x01000001)
          {
              str += "<td style='color:#ea5f5f'>设备连接异常</td>";
          }else if ((remark & 0x01000002) == 0x01000002)
          {
              str += "<td style='color:#ea5f5f'>设备采集异常</td>";
          }else{
        	  str += "<td style='color:#ea5f5f'>设备采集异常</td>";
          }
      }else{
    	  str += "<td style='color:#ea5f5f'>装置自检告警</td>";
      }
      return str;
  }
