$package('jeecg.history');
var id=null;
var state=null;
var value_select=null;
var startTime=null;
var endTime=null;
var ln_inst_name=null;
var rows;
var chart,json;
var rowslength;
$(function () {
	//设置初始时间
	$(".tabs li:eq(1)").click(function(){
	$("#d1").show();
	jeecg.history.setTime();
	jeecg.history.ShowHistoryData();
	});
	$('#searchHistory').unbind('click').click(function(){
		_st = $('#startTime').datebox('getValue');
		_et = $('#endTime').datebox('getValue');
		jeecg.history.ShowHistoryData();
	});
});
jeecg.history = function(){
	var _box = null;
	var cst;
	var cet;
	var _this = {
			//初始化时间
			setTime:function(){
				var curr_time = new Date();
				var stat_time=new Date(curr_time.getTime()-1000*60*60*24*7);
				if(_st==null){
					_st=myformatter(stat_time);
				}
				if(_et==null){
					_et=myformatter(curr_time);
				}
				$("#startTime").datebox("setValue",_st);
				$("#endTime").datebox("setValue",_et);
			},
			//数据展示
			ShowHistoryData:function(){
				var node = $('#ZoneEmuList').tree('getSelected');
				var table_name="#history";
				var DeviceType=$("#txtType").val();
				id=$("#txtID").val();
				startTime = $('#startTime').datebox('getValue')+" 00-00-00";
				endTime = $('#endTime').datebox('getValue')+" 24-00-00";
				state = $('#state').datebox('getValue');
				
				switch(DeviceType){
				case "1":
					_box = null;
					_this.showYSPData.dataGrid.url="getstomHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showYSPData,table_name,false,true,true,true);
					_box.init();
					break;
				case "2":
					_box = null;
					_this.showSF6Data.dataGrid.url="getSf6HistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSF6Data,table_name,false,true,true,true);
					_box.init();
					break;
				case "3":
					_box = null;
					_this.showSMOAMData.dataGrid.url="getSMOAMHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSMOAMData,table_name,false,true,true,true);
					_box.init();
					break;
				case "4":
					_box = null;
					_this.showSCOMData.dataGrid.url="getSCOMHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSCOMData,table_name,false,true,true,true);
					_box.init();
					break;
				case "7":
					_box = null;
					_this.showSbushData.dataGrid.url="getSbushHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSbushData,table_name,false,true,true,true);
					_box.init();
					break;
				case "28":
					_box = null;
					_this.showSpdcData.dataGrid.url="getSpdcHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSpdcData,table_name,false,true,true,true);
					_box.init();
					break;
				case "19":
					_box = null;
					_this.showSPDMData.dataGrid.url="getSPDMHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSPDMData,table_name,false,true,true,true);
					_box.init();
					break;
				case "20":
					_box = null;
					_this.showSpdcData.dataGrid.url="getSpdcHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showSpdcData,table_name,false,true,true,true);
					_box.init();
					break;
				case "amc":
					ln_inst_name=$('#txtName').val();
					ln_inst_name=ln_inst_name.replace("#","@");
					id=id.substring(2);
					_box = null;
				    _this.showYXData.dataGrid.url="getYXHistoryDataByRefname.do?ln_inst_name="+ln_inst_name+"&id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
				    _box = new YDataGrid(_this.showYXData,table_name,false,true,true,true);
				    _box.init();
				    break;
				case "hwcw":
					_box = null;
					_this.showInfraredData.dataGrid.url="getInfraredHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
					_box = new YDataGrid(_this.showInfraredData,table_name,false,true,true,true);
					_box.init();
				}
				$(".datagrid-toolbar").remove();
			},
			//套管配置
			showSbushData:{
				dataGrid:{
//					title: $("#txtName").val(),
					//3相设备
					/*columns:  [[{
		                field: 'id',
		                title: '设备Id',
		                width:fixWidth(0.04),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.id;
		                }
		            },{
		                field: 'sampleTime',
		                title: '采集时间',
		                align: 'center',
		                sortable: true,
		                width: fixWidth(0.08),
		                formatter: function(value, row, index){
		                    return row.sampleTime;
		                }
		            },{
		                field: 'leakAA',
		                title: 'A相泄漏电流',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.leakAA;
		                }
		            },{
		                field: 'absReactA',
		                title: 'A相绝对电容',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.absReactA;
		                }
		            },
		            {
		                field: 'dieLossA',
		                title: 'A相介质损耗因数',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	return row.dieLossA;
		                }
		            },{
		                field: 'leakAB',
		                title: 'B相泄漏电流',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.leakAB;
		                }
		            },{
		                field: 'absReactB',
		                title: 'B相绝对电容',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.absReactB;
		                }
		            },
		            {
		                field: 'dieLossB',
		                title: 'B相介质损耗因数',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	return row.dieLossB;
		                }
		            },{
		                field: 'leakAC',
		                title: 'C相泄漏电流',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.leakAC;
		                }
		            },{
		                field: 'absReactC',
		                title: 'C相绝对电容',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.absReactC;
		                }
		            },
		            {
		                field: 'dieLossC',
		                title: 'C相介质损耗因数',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	return row.dieLossC;
		                }
		            },{
		                field: 'totRelA',
		                title: '三相泄漏电流之和',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.totRelA;
		                }
		            },
		            {
		                field: 'remark',
		                title: '品质',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	return row.remark;
		                }
		            }
		            ]]*/
			
			//单相设备
			columns:  [[{
                field: 'id',
                title: '设备Id',
                width:fixWidth(0.04),
                align: 'center',
                sortable: true,
                formatter: function(value, row, index){
                    return row.id;
                }
            },{
                field: 'sampleTime',
                title: '采集时间',
                align: 'center',
                sortable: true,
                width: fixWidth(0.08),
                formatter: function(value, row, index){
                    return row.sampleTime;
                }
            },{
                field: 'lscAmp',
                title: '末屏电流',
                width:fixWidth(0.08),
                align: 'center',
                sortable: true,
                formatter: function(value, row, index){
                    return row.lscAmp;
                }
            },{
                field: 'equCa',
                title: '等值电容',
                width:fixWidth(0.08),
                align: 'center',
                sortable: true,
                formatter: function(value, row, index){
                    return row.equCa;
                }
            },
            {
                field: 'losFact',
                title: '介质损耗因数',
                width:fixWidth(0.08),
                align: 'center',
                sortable: true,
                formatter: function(value, row, index){
                	return row.losFact;
                }
            }
            ]]
				}
			},
			//局放配置
			showSpdcData:{
				dataGrid:{
//					title: $("#txtName").val(),
					columns:  [[{
		                field: 'id',
		                title: '设备Id',
		                width:fixWidth(0.04),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.id;
		                }
		            },{
		                field: 'sampleTime',
		                title: '采集时间',
		                align: 'center',
		                sortable: true,
		                width: fixWidth(0.08),
		                formatter: function(value, row, index){
		                    return row.sampleTime;
		                }
		            },{
		                field: 'appPaDsch',
		                title: '视在局放峰值',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.appPaDsch;
		                }
		            },{
		                field: 'acuPaDsch',
		                title: '噪声水平',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.acuPaDsch;
		                }
		            },
		            {
		                field: 'avDsch',
		                title: '放电信号均值',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	return row.avDsch;
		                }
		            },{
		                field: 'maxDsch',
		                title: '放电信号峰值',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.maxDsch;
		                }
		            },
		            {
		                field: 'dschCnt',
		                title: '放电频次',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	return row.dschCnt;
		                }
		            }
		            ]]
				}
			},
			//红外测温配置
			showInfraredData:{
				dataGrid:{
					title: $("#txtName").val(),
					 columns: [[{
			                field: 'deviceID',
			                title: '设备ID',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.deviceID;
			                }
			            }, {
			                field: 'sampleTime',
			                title: '采集时间',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.sampleTime;
			                }
			            }, {
			                field: 'tmp',
			                title: '温度(℃)',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.tmp;
			                }
			            }
			            ]]
				}
			},
			//油色谱配置
			showYSPData:{
				dataGrid:{
					title: $("#txtName").val(),
					url:'getstomHistoryData.do',
					columns:  [[{
		                field: 'deviceID',
		                title: '设备ID',
		                align: 'center',
		                sortable: true,
		                width: fixWidth(0.05),
		                formatter: function(value, row, index){
		                    return row.deviceID;
		                }
		            },{
		                field: 'sampleTime',
		                title: '采集时间',
		                width:fixWidth(0.12),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.sampleTime;
		                }
		            },
		            {
		                field: 'h2ppm',
		                title: '氢气(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.h2ppm;
		                }
		            },{
		                field: 'COppm',
		                title: '一氧化碳(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.COppm;
		                }
		            },
		            {
		                field: 'CO2ppm',
		                title: '二氧化碳(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.CO2ppm;
		                }
		            },
		            {
		                field: 'CH4ppm',
		                title: '甲烷(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.CH4ppm;
		                }
		            },
		            {
		                field: 'c2H2ppm',
		                title: '乙炔(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.c2H2ppm;
		                }
		            },
		            {
		                field: 'c2H4ppm',
		                title: '乙烯(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.c2H4ppm;
		                }
		            },
		            {
		                field: 'c2H6ppm',
		                title: '乙烷(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.c2H6ppm;
		                }
		            },
		            {
		                field: 'totHyd',
		                title: '总可燃气体(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.totHyd;
		                }
		            },  {
		                field: 'n2',
		                title: '氮气(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	if(row.n2==null){
		                		return "无数据";
		                	}
		                    return row.n2;
		                }
		            },  {
		                field: 'oilTmp',
		                title: '油位(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	if(row.oilTmp==null){
		                		return "无数据";
		                	}
		                    return row.oilTmp;
		                }
		            },  {
		                field: 'gasPres',
		                title: '载气压力(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.gasPres;
		                }
		            }, {
		                field: 'mst',
		                title: '微水(ppm)',
		                width:fixWidth(0.06),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.mst;
		                }
		            }
//		            ,{
//		                field: 'remark',
//		                title: '状态',
//		                align: 'center',
//		                sortable: true,
//		                width:fixWidth(0.04),
//		                formatter: function(value, row, index){
//		                	var mark = parseInt(row.remark) & 0xff000000;
//		                	var img_path = "";
//		                	 if((mark&0x01000000 - 0x01000000)==0){
//		                     	img_path = basePath + "/images/state/Yellow.gif";
//		                     }
//		                     if((mark&0x02000000 - 0x02000000)==0||(mark&0x04000000 - 0x04000000)==0 ||(mark&0x08000000 - 0x08000000)==0){
//		                     	img_path = basePath + "/images/state/Red.gif";
//		                     }
//		             		 if(mark==0){
//		             			img_path = basePath + "/images/state/Green.gif";
//		             		}
//		                    return '<div class="tt-inner" style="width: 12px; height: 12px;padding:0" ><img src=' + img_path + ' style="width: 12px; height: 12px;"/><img></div>';
//		                }
//		            }
		            ]]
				}
		},
		//六氟化硫配置
			showSF6Data:{
				dataGrid:{
					title: $("#txtName").val(),
//					url:'getSf6HistoryData.do',
					 columns: [[{
			                field: 'deviceID',
			                title: '设备ID',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.deviceID;
			                }
			            }, {
			                field: 'sampleTime',
			                title: '采集时间',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.sampleTime;
			                }
			            }, {
			                field: 'tmp',
			                title: '温度(℃)',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.tmp;
			                }
			            }, {
			                field: 'pres',
			                title: '压力(Mpa)',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.pres;
			                }
			            }, {
			                field: 'hum',
			                title: '湿度',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.hum;
			                }
			            }, {
			                field: 'dun',
			                title: '密度',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.den;
			                }
			            }, {
			                field: 'micrWat',
			                title: '微水',
			                align: 'center',
			                sortable: true,
			                width: fixWidth(0.12),
			                formatter: function(value, row, index){
			                    return row.hum;
			                }
			            }
//			            , {
//			                field: 'remark',
//			                title: '状态',
//			                align: 'center',
//			                sortable: true,
//			                width: fixWidth(0.12),
//			                formatter: function(value, row, index){
//			                	var mark = parseInt(row.remark) & 0xff000000;
//			                	var img_path = "";
//			                	 if((mark&0x01000000 - 0x01000000)==0){
//			                     	img_path = basePath + "/images/state/Yellow.gif";
//			                     }
//			                     if((mark&0x02000000 - 0x02000000)==0||(mark&0x04000000 - 0x04000000)==0 ||(mark&0x08000000 - 0x08000000)==0){
//			                     	img_path = basePath + "/images/state/Red.gif";
//			                     }
//			             		 if(mark==0){
//			             			img_path = basePath + "/images/state/Green.gif";
//			             		}
//			                    return '<div class="tt-inner" style="width: 12px; height: 12px;padding:0" ><img src=' + img_path + ' style="width: 12px; height: 12px;"/><img></div>';
//			                }
//			            }
			            ]]
				}
		},
		//避雷器配置
			showSMOAMData:{
				dataGrid:{
					title: $("#txtName").val(),
					columns:  [[{
		                field: 'deviceID',
		                title: '设备ID',
		                align: 'center',
		                sortable: true,
		                width: fixWidth(0.12),
		                formatter: function(value, row, index){
		                    return row.deviceID;
		                }
		            }, {
		                field: 'sampleTime',
		                title: '采集时间',
		                width: fixWidth(0.12),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.sampleTime;
		                }
		            },
		            {
		                field: 'totA',
		                title: '全电流(mA)',
		                width: fixWidth(0.12),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.totA;
		                }
		            },{
		                field: 'risA',
		                title: '阻性电流(mA)',
		                width: fixWidth(0.12),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.risA;
		                }
		            },{
		                field: 'risCaRte',
		                title: '阻容比',
		                width: fixWidth(0.12),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.risCaRte;
		                }
		            },{
		                field: 'lastLigTm',
		                title: '最近动作时间',
		                width: fixWidth(0.12),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                	if(row.lastLigTm="0"){
		                		return "未发生雷击";
		                	}
		                    return row.lastLigTm;
		                }
		            }, {
		                field: 'ligCnt',
		                title: '动作次数',
		                width: fixWidth(0.1),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.ligCnt;
		                }
		            }
//		            ,{
//		                field: 'remark',
//		                title: '状态',
//		                align: 'center',
//		                sortable: true,
//		                width: fixWidth(0.1),
//		                formatter: function(value, row, index){
//		                	var mark = parseInt(row.remark) & 0xff000000;
//		                	var img_path = "";
//		                	 if((mark&0x01000000 - 0x01000000)==0){
//		                     	img_path = basePath + "/images/state/Yellow.gif";
//		                     }
//		                     if((mark&0x02000000 - 0x02000000)==0||(mark&0x04000000 - 0x04000000)==0 ||(mark&0x08000000 - 0x08000000)==0){
//		                     	img_path = basePath + "/images/state/Red.gif";
//		                     }
//		             		 if(mark==0){
//		             			img_path = basePath + "/images/state/Green.gif";
//		             		}
//		                    return '<div class="tt-inner" style="width: 12px; height: 12px;padding:0" ><img src=' + img_path + ' style="width: 12px; height: 12px;"/><img></div>';
//		                }
//		            }
		            ]]
				}
	},
	//铁芯配置
			showSCOMData:{
				dataGrid:{
					title: $("#txtName").val(),
		//			url:'getSCOMHistoryData.do',
					columns:  [[{
		                field: 'deviceID',
		                title: '设备ID',
		                align: 'center',
		                sortable: true,
		                width: fixWidth(0.1),
		                formatter: function(value, row, index){
		                    return row.deviceID;
		                }
		            }, {
		                field: 'sampleTime',
		                title: '采集时间',
		                width: fixWidth(0.2),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.sampleTime;
		                }
		            },
		            {
		                field: 'CGAmp',
		                title: '铁芯接地电流(mA)',
		                width: fixWidth(0.2),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.CGAmp;
		                }
		            }, {
		                field: 'ClpGAmp',
		                title: '夹件接地电流(mA)',
		                width:fixWidth(0.2),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.clpGAmp;
		                }
		            }/*, {
		                field: 'Pre1',
		                title: '阀侧首端套管SF6压力',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.pre1;
		                }
		            }, {
		                field: 'Pre2',
		                title: '阀侧末端套管SF6压力',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.pre2;
		                }
		            }, {
		                field: 'SltcOil',
		                title: '有载开关油位',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.sltcOil;
		                }
		            }, {
		                field: 'Tmp1',
		                title: '网侧绕组温度',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp1;
		                }
		            }, {
		                field: 'Tmp2',
		                title: '油面温度',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp2;
		                }
		            }, {
		                field: 'Tmp4',
		                title: '顶层油温1',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp4;
		                }
		            }, {
		                field: 'Tmp5',
		                title: '顶层油温2',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp5;
		                }
		            }, {
		                field: 'Tmp6',
		                title: '底层油温1',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp6;
		                }
		            }, {
		                field: 'Tmp7',
		                title: '底层油温2',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp7;
		                }
		            }, {
		                field: 'Tmp8',
		                title: '环境温度',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp8;
		                }
		            },{
		                field: 'MainOil',
		                title: '本体主油箱磁力式油位',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.mainOil;
		                }
		            }, {
		                field: 'PreOil',
		                title: '本体主油箱压力式油位',
		                width:fixWidth(0.08),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.preOil;
		                }
		            }, {
		                field: 'Tmp3',
		                title: '备用',
		                width:fixWidth(0.05),
		                align: 'center',
		                sortable: true,
		                formatter: function(value, row, index){
		                    return row.tmp3;
		                }
		            }*/
//		            , {
//		                field: 'remark',
//		                title: '状态',
//		                align: 'center',
//		                sortable: true,
//		                width: fixWidth(0.12),
//		                formatter: function(value, row, index){
//		                	var mark = parseInt(row.remark) & 0xff000000;
//		                	var img_path = "";
//		                	 if((mark&0x01000000 - 0x01000000)==0){
//		                     	img_path = basePath + "/images/state/Yellow.gif";
//		                     }
//		                     if((mark&0x02000000 - 0x02000000)==0||(mark&0x04000000 - 0x04000000)==0 ||(mark&0x08000000 - 0x08000000)==0){
//		                     	img_path = basePath + "/images/state/Red.gif";
//		                     }
//		             		 if(mark==0){
//		             			img_path = basePath + "/images/state/Green.gif";
//		             		}
//		                    return '<div class="tt-inner" style="width: 12px; height: 12px;padding:0" ><img src=' + img_path + ' style="width: 12px; height: 12px;"/><img></div>';
//		                }
//		            }
		            ]]
				}
		},showSPDMData:{
			dataGrid:{
				title: $("#txtName").val(),
	//			url:'getSCOMHistoryData.do',
				columns:  [[{
	                field: 'deviceID',
	                title: '设备ID',
	                align: 'center',
	                sortable: true,
	                width: fixWidth(0.12),
	                formatter: function(value, row, index){
	                    return row.deviceID;
	                }
	            }, {
	                field: 'sampleTime',
	                title: '采集时间',
	                width: fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                    return row.sampleTime;
	                }
	            },{
	                field: 'uhfPaDsch',
	                title: '局放UHF水平(mA)',
	                width: fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                    return row.uhfPaDsch;
	                }
	            },{
	                field: 'acuPaDsch',
	                title: '局放声学水平(mA)',
	                width: fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                    return row.acuPaDsch;
	                }
	            },{
	                field: 'phase',
	                title: '相别',
	                width: fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                    return row.phase;
	                }
	            },{
	                field: 'plsNum',
	                title: '放电次数',
	                width: fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                    return row.plsNum;
	                }
	            }
//	            ,{
//	                field: 'remark',
//	                title: '状态',
//	                align: 'center',
//	                sortable: true,
//	                width: fixWidth(0.12),
//	                formatter: function(value, row, index){
//	                	var mark = parseInt(row.remark) & 0xff000000;
//	                	var img_path = "";
//	                	 if((mark&0x01000000 - 0x01000000)==0){
//	                     	img_path = basePath + "/images/state/Yellow.gif";
//	                     }
//	                     if((mark&0x02000000 - 0x02000000)==0||(mark&0x04000000 - 0x04000000)==0 ||(mark&0x08000000 - 0x08000000)==0){
//	                     	img_path = basePath + "/images/state/Red.gif";
//	                     }
//	             		 if(mark==0){
//	             			img_path = basePath + "/images/state/Green.gif";
//	             		}
//	                    return '<div class="tt-inner" style="width: 12px; height: 12px;padding:0" ><img src=' + img_path + ' style="width: 12px; height: 12px;"/><img></div>';
//	                }
//	            }
	            ]]
			}
		},
		//YX表格数据插入
		showYXData:{
			dataGrid:{
				title: $("#txtName").val(),
//				url:'getstomHistoryData.do',
				columns:  [[{
	                field: 'refname',
	                title: '参数名',
	                width:fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                	return row.refname;
	                }
	            },{
	                field: 'time',
	                title: '采集时间',
	                width:fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                	return row.time;
	                }
	            },{
	                field: 'value',
	                title: '参数值',
	                width:fixWidth(0.12),
	                align: 'center',
	                sortable: true,
	                formatter: function(value, row, index){
	                    var value=row.value;
//	                    if(value=="1"){
//	                    	value="正常";
//	                    }else if(value=="0"){
//	                    	value="异常";
//	                    }
	                	return value;
	                }
	            }
	            ]]
			}
		}
	}
	return _this;
}();



//获取选中行
function getSelected() {
    var selected = $('#history').datagrid('getSelected');
    if (selected) {
        //alert(selected.code + ":" + selected.name + ":" + selected.addr + ":" + selected.col4);
        return selected.id;
    }
}

//获取多个选中行
function getSelections() {
    var ids = [];
    var rows = $('#history').datagrid('getSelections');
    for (var i = 0; i < rows.length; i++) {
        ids.push(rows[i].id);
    }
    //alert(ids.join(','));
    return ids.join(',');
}
//导出
$("#export").unbind('click').click(function(){
	var DeviceType=$("#txtType").val();
	if(DeviceType==1){
	var _url="exportstomHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
	$.ajax({
         async: false,
         cache: false,
         type: 'POST',
         url: _url,
         error: function(){// 请求失败处理函数
        	 alert("连接数据库失败");
         },
         success: function(data){
    	        	var head_data,json;
    	        	head_data = [];
    	        	head_data.push({"title":"设备ID","value":"deviceID"},{"title":"采集时间","value":"sampleTime"},
    	        			{"title":"氢气(ppm)","value":"h2ppm"},{"title":"一氧化碳(ppm","value":"COppm"},
    	        			{"title":"二氧化碳(ppm)","value":"CO2ppm"},{"title":"甲烷(ppm)","value":"CH4ppm"},
    	        			{"title":"乙炔(ppm)","value":"c2H2ppm"},{"title":"乙烯(ppm)","value":"c2H4ppm"},
    	        			{"title":"乙烷(ppm)","value":"c2H6ppm"},{"title":"总可燃气体(ppm)","value":"totHyd"},
    	        			{"title":"氮气(ppm)","value":"n2"},{"title":"油位(ppm)","value":"oilTmp"},
    	        			{"title":"载气压力(ppm)","value":"gasPres"},{"title":"微水(ppm)","value":"mst"});
    	        	tableExport(data,head_data,"excel","油色谱历史数据表_"+data.dataList[0].deviceName);
     }
	});
	}
	if(DeviceType==2){
		var _url="exportSf6HistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
	$.ajax({
         async: false,
         cache: false,
         type: 'POST',
         url: _url,
         error: function(){// 请求失败处理函数
        	 alert("连接数据库失败");
         },
         success: function(data){
	        	var head_data,json;
	        	head_data = [];
	        	head_data.push({"title":"设备ID","value":"deviceID"},{"title":"采集时间","value":"sampleTime"},
	        			{"title":"温度(℃)","value":"tmp"},{"title":"压力(Mpa)","value":"pres"},
	        			{"title":"湿度","value":"hum"});
	        	tableExport(data,head_data,"excel","SF6历史数据表");
         }
	});
	}
	if(DeviceType==3){
		var _url="exportSMOAMHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
		$.ajax({
	         async: false,
	         cache: false,
	         type: 'POST',
	         url: _url,
	         error: function(){// 请求失败处理函数
	        	 alert("连接数据库失败");
	         },
	         success: function(data){
		        	var head_data,json;
		        	for(var i=0;i<data.dataList.length;i++){
	    	        		if(data.dataList[i].lastLigTm='0'){
	    	        			data.dataList[i].lastLigTm="未发生雷击";
	    	        		}
	    	        	}
		        	head_data = [];
		        	head_data.push({"title":"设备ID","value":"deviceID"},{"title":"采集时间","value":"sampleTime"},
		        			{"title":"全电流(mA)","value":"totA"},{"title":"阻性电流(mA)","value":"risA"},
		        			{"title":"阻容比","value":"risCaRte"},{"title":"最近动作时间","value":"lastLigTm"},
		        			{"title":"动作次数","value":"ligCnt"});
		        	tableExport(data,head_data,"excel","避雷器历史数据表");
	         }
		});
	}
	if(DeviceType==4){
		var _url="exportSCOMHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
		$.ajax({
	         async: false,
	         cache: false,
	         type: 'POST',
	         url: _url,
	         error: function(){// 请求失败处理函数
	        	 alert("连接数据库失败");
	         },
	         success: function(data){
		        	var head_data,json;
		        	head_data = [];
		        	head_data.push({"title":"设备ID","value":"deviceID"},{"title":"采集时间","value":"sampleTime"},
		        			{"title":"泄漏电流(mA)","value":"CGAmp"});
		        	tableExport(data,head_data,"excel","铁芯历史数据表");
	         }
		});
	}
	if(DeviceType==8){
		var _url="exportSPDMHistoryData.do?id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
		$.ajax({
	         async: false,
	         cache: false,
	         type: 'POST',
	         url: _url,
	         error: function(){// 请求失败处理函数
	        	 alert("连接数据库失败");
	         },
	         success: function(data){
		        	var head_data,json;
		        	head_data = [];
		        	head_data.push({"title":"设备ID","value":"deviceID"},{"title":"采集时间","value":"sampleTime"},
		        			{"title":"局放UHF水平(mA)","value":"uhfPaDsch"},{"title":"局放声学水平(mA)","value":"acuPaDsch"},
		        			{"title":"相别","value":"phase"},{"title":"放电次数","value":"plsNum"});
		        	tableExport(data,head_data,"excel","局放历史数据表");
	         }
		});
	}
	if(DeviceType=="amc"){
		ln_inst_name=$('#txtName').val();
		ln_inst_name=ln_inst_name.replace("#","@");
		var _url="exportYXHistory.do?ln_inst_name="+ln_inst_name+"&id="+id+"&startTime="+startTime+"&endTime="+endTime+"&state="+state;
		$.ajax({
	         async: false,
	         cache: false,
	         type: 'POST',
	         url: _url,
	         error: function(){// 请求失败处理函数
	        	 alert("连接数据库失败");
	         },
	         success: function(data){
		        	var head_data,json;
		        	head_data = [];
		        	head_data.push({"title":"监测点","value":"refname"},{"title":"采集时间","value":"time"},
		        			{"title":"检测状态","value":"value"});
		        	tableExport(data,head_data,"excel","辅助设备历史数据表");
	         }
		});
	}
});



