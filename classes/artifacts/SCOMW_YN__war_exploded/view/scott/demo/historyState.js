$package('jeecg.historyState');
var startTime=null;
var endTime=null;
$(function () {  
	jeecg.historyState.proccbInit();
	jeecg.historyState.TimeInit();
	jeecg.historyState.showhistoryState();
	$('#searchHistoryState').click(SerachHistory);
	
});
jeecg.historyState = function(){ 
	var _box = null;
	var _this = {
			//初始化下拉框
			proccbInit:function(){
				var proccb_data,json;
				proccb_data = [];
				var url=ctxPath +"/systemState/getData.do";
				 $.ajax({
			         async: false,
			         cache: false,
			         type: 'POST',
			         url: url, 
			         error: function(){// 请求失败处理函数
			        	 alert("false");
			         },
			         success: function(data){
			        	 for(var i=0;i<data.length;i++)
			        		 proccb_data.push({ "text":data[i].pname, "value":data[i].pid});
			         }
				 });
				$("#proccb").combobox("loadData", proccb_data);
				$("#proccb").combobox('select',proccb_data[0].value);
			},
			//初始化表格
			showhistoryState:function(){
				var startTime = $('#startTime').datebox('getValue');
				var endTime = $('#endTime').datebox('getValue'); 
				var pid = $('#proccb').datebox('getValue');
				var table_name="#historyList";
				_box = null;
				_this.config.dataGrid.url="gethistoryList.do?id="+pid+"&startTime="+startTime+"&endTime="+endTime;
				_box = new YDataGrid(_this.config,table_name,false,true,true,true);
				_box.init();
			},
			config:{
				dataGrid:{
					title:'系统状态',
		            columns:  [[{
		                field: 'pname',
		                title: '程序名', 
		                width:130,
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.pname;
		                } 
		            },  
		            {
		                field: 'systime',
		                title: '采集时间',
		                width:80,
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.systime;
		                } 
		            },{
		                field: 'cpu',
		                title: 'CPU占用率',
		                width:80,
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.cpu;
		                } 
		            }, 
		            {
		                field: 'mem',
		                title: '内存占用率',
		                width:80,
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.mem;
		                } 
	                }]]
				}
				
			},
			//默认初始时间为最新一周
			TimeInit:function(){
				var curr_time = new Date(); 
				var stat_time=new Date(curr_time.getTime()-1000*60*60*24*7);
				$("#startTime").datebox("setValue",myformatter(stat_time)); 
				$("#endTime").datebox("setValue",myformatter(curr_time));
			}
	};
	return _this;
}();

function SerachHistory() {
	
	jeecg.historyState.showhistoryState();
}
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


