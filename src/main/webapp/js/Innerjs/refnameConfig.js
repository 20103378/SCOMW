//测量量映射配置
$package('jeecg.refnameConfig');
// 定义窗口
$(function () {
	$(".tabs li:eq(8)").click(function(){
		// 开始初始化下拉框
		jeecg.refnameConfig.setEditWin();
		jeecg.refnameConfig.setSel();
		// 加载主设备添加删除窗口
		jeecg.SpaceConfiguration.upload();
	  	$("#bt_refname_desc_downld").unbind('click').click(function(){
	  		jeecg.refnameConfig.space_sub();
	  	});
	  	$("#bt_refname_desc_updt").unbind('click').click(function(){
	  		jeecg.refnameConfig.upload();
	  	});
	});
});

jeecg.refnameConfig = function(){
	var _this = {
		setEditWin:function(){
			deviceWin = $('#refname_desc_window').window({
				href:'',
				title:'添加/修改',
				left:'100px',
				top:'70px',
				closed: true,
				modal: false,
				cache: false,
				minimizable:false,
				maximizable:false,
				collapsible:false,
				shadow: false
			});
			 uploadWin = $('#UploadRefname_window').window({
			        href:'',
				    title:'Excel文件上传',
				    left:'200px',
				    top:'150px',
				    closed: true,
				    modal: false,
				    cache: false,
				    minimizable:false,
				    maximizable:false,
				    collapsible:false,
				    shadow: false
				 });
		},
		setSel:function(){
			var _box = null;
			var tablename="#refname_desc_tb";
// _this.data_config.dataGrid.url="getrefname.do",
			_box = new YDataGrid(_this.data_config,tablename,true,false,true,false);
// _box.grid.datagrid.defaults.onDblClickRow=_this.update;
			_box.init();

		},
		update:function(rowIndex, rowData){
			$("#txt_refname_desc_Refname").val(rowData.refname);
			$('#txt_refname_desc_Refname').attr('disabled',true);
			$("#txt_refname_desc_Desc").val(rowData.refname_desc);
			deviceWin.window('open');
		 },
	data_config:{
		dataGrid:{
// pageSize:10,
// title:'',
   			url:"getrefname.do",
			columns:  [[
			{
                field: 'refname',
                title: 'refname',
                width:fixWidth(0.12),
                align: 'center',
                sortable: true,
                formatter: function(value, row, index){
                    return row.refname;
                }
            },
            {
                field: 'refname_desc',
                title: '描述',
                width:fixWidth(0.12),
                align: 'center',
                sortable: true,
                formatter: function(value, row, index){
                    return row.refdesc;
                }
            },
			{
            	field:'edit',
            	title:'修改',
            	align:'center',
            	sortable:true,
            	width:fixWidth(0.12),
				formatter: function(value,row,index){
                    return "<center><div class='dit' style='width: 12px; height: 12px;' ><a href='javascript:void(0);' onclick='jeecg.refnameConfig.edit_equipment(" +index + ")'>修改</a></div></center>";
	         	            }
			},
			{
				field:'del',
				title:'删除',
				align:'center',
				sortable:true,
				width:fixWidth(0.12),
				formatter: function(value,row,index){
					return "<center><div class='dit' style='width: 12px; height: 12px;' ><a href='javascript:void(0);' onclick='jeecg.refnameConfig.delete_equipment(" +index + ")'>删除</a></div></center>";
	            }
			}
            ]],
		toolbar: ["-", {
  	            id: '',
  	            text: '添加',
  	            iconCls: '',
  	            handler: function () {
  	            	_this.reTextSpace();
  	            	deviceWin.window('open');

  	            }
  	        },"-",{
  	            id: '',
  	            text: '测量量点名导出',
  	            iconCls: '',
  	            handler: function () {
  	            	_this.DownlodeRefName();
  	            }
  	        },"-",{
  	            id: '',
  	            text: '测量量点名导入',
  	            iconCls: '',
  	            handler: function () {
  	            	_this.UpdateRefName();
  	            }
  	        },"-"]
			}
		},
		space_sub:function(){
			 var spaceid=$("#txt_refname_desc_Refname").val();
			 var spaceName=$("#txt_refname_desc_Desc").val();

			 if(spaceid==""){
				 $("#msg_refname_desc_Refname").html("测量点名不能为空!");
				 return;
			 }
			 var formdata={};
			 formdata['refname'] = spaceid;
			 formdata['refdesc'] = spaceName;
			 $.ajax({
				 async:false,
				 cache:false,
				 type:'post',
				 url:"add_refname.do",
				 data:formdata,
				 success:function(data){
					 deviceWin.window('close');
		        	 $('#refname_desc_tb').datagrid('reload');
		        	 return
				 },
				 error:function(){
					 alert("插入失败!");
				 }
			 });


		 },
		upload:function(){
				var File_xls =  $("#File_xls").val();

			        if(File_xls){
			        	if(File_xls.indexOf("/")==-1 || File_xls.indexOf("\\")==-1){
			        		File_xls=File_xls.substring(File_xls.lastIndexOf("\\")+1);
							 }
						 jeecg.progress('正在上传','请稍后...');
						 $('#RefnameForm').form({
			            	async:false,
			      			cache:false,
			                onSubmit: function(){
			                },
			                success:function(data){
			                	jeecg.closeProgress();
			                	if(data){
			                		alert("上传成功!");
			                	};
			                	uploadWin.window("close");
// $('#i2List').datagrid('reload');
			                }
			        	});
			            // 提交 form
			            $('#RefnameForm').attr("action", "getRefname_upload.do").submit();
			         }else if(!File_xls){
			         	alert("请选择要上传的文件");
			         }
		 },
		reTextSpace:function(){
			document.getElementById("txt_refname_desc_Refname").readOnly=false;
	       	$("#txt_refname_desc_Refname").val('');
 			$("#txt_refname_desc_Desc").val('');
		},
		edit_equipment:function(index){
			
			
			var deviceType_data,json;
			var phase_data,json;
			deviceType_data = [];
			phase_data = [];
			var rows = $("#refname_desc_tb").datagrid('getRows');
			var select_data = rows[index];
			// 获取一行数据
			 $("#txt_refname_desc_Refname").val(select_data.refname);
			  $('#txt_refname_desc_Refname').attr('disabled',true);
			 $("#txt_refname_desc_Desc").val(select_data.refdesc);
		
			document.getElementById("txt_refname_desc_Refname").readOnly=true;
			deviceWin.window('open');
		},
		// 删除主设备
		delete_equipment:function(equipmentID){
			if(window.confirm('确定要删除？')){
				var rows = $("#refname_desc_tb").datagrid('getRows');
				var select_data = rows[index];
				var formData = {};
			    var url=ctxPath +"/systemConfiguration/delete_equipment.do",
			    Refname_desc
// ,SpaceId,DeviceType,DeviceName,Phase,ManufactoryName,Remark
			    formData['Refname_desc'] = select_data.refname;
				$.ajax({
			         async: false,
			         cache: false,
			         type: 'POST',
			         url: url,
			         data: formData,
			         error: function(){// 请求失败处理函数
			        	 alert("false");
			         },
			         success: function(data){
// deviceWin.window('close');
			        	 $('#refname_desc_tb').datagrid('reload');
			         }
			     });
             }
		},
		DownlodeRefName:function(){
				 $.ajax({
					 async:false,
					 cache:false,
					 type:'post',
					 url:"getRefnameZip.do",
					 success:function(data){
			        	 $('#refname_desc_tb').datagrid('reload');
			        	 return
					 },
					 error:function(){
						 alert("插入失败!");
					 }
				 });
// var MapUrl= ctxPath+"/view/com.scott/Graphs/data_gis.xml";用不上
// alert("下载");
				var MapUrl="..\\view\\com.scott\\out.xls";
				window.open(MapUrl);
		},
		UpdateRefName:function(){
			uploadWin.window('open');
		}
	}
	return _this;
}();
function fixWidth(percent)
{
    return document.body.clientWidth * percent ;
}