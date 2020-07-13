	<!-- 二级设备报表页 -->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
    <meta http-equiv="refresh" content="600">
        <%@include file="/view/resource.jsp" %>
        <script type="text/javascript" src="<%=basePath%>/js/commons/datagrid-transposedview.js"></script>
        <style type="text/css">
            #d .mini-button {
                margin-right: 10px;
                margin-bottom: 10px;
            } #d .mini-button {
                margin-right: 10px;
                margin-bottom: 10px;
            } .tt-inner {
                display: inline-block;
                line-height: 22px;
                padding-top: 10px;
            } .tt-inner img {
                border: 0;
                margin-right: 30px;
                margin-bottom: 30px;
            }#history_div{
				height:95%;
				margin-riht: 0px;
                margin-bottom: 0px;
            }#chartdiv{
           		float:left;
            }#dataSpan
       	 	{
	            width: 100%;
	        }
	        #tab_inf{
	        	width:1000px;
	        	height:700px
	        }
	        .Detailtb td{
	        	margin:0;
	        	padding:0;
	        	font-size:18px;
	        	font-family:Microsoft YaHei;
	        	font-size:15;
	        	text-align:center;
	        	color:#ffffff
	        }
    	    .Detailtb tr{
	        	font-size:16px;
	        	background:#566071;
	        }
	        .Detailtb th{
	        	font-size:16px
	        }
	        .Detailtb{
	        border-collapse:collapse;
	        }
	        #TypeDevice td{
	        	border:1px solid #9CF;
	        	margin:0;
	        	padding:0;

	        }
	        #cll td{
	        	border:1px solid #9CF;
	        	margin:0;
	        	padding:0;

	        }
	         #tab_inf tr{
	        	margin:0;
	        	padding:0;
	        }#tab_inf{
	        	margin:0;
	        	padding:0;
	        }.datagrid-btable tbody tr{
	        	height:30px;
	        }
        </style>
    </head>
	<body class="easyui-layout">
	<!-- 也哦猜测历史数据页面 -->
		<!--显示设备健康状态信息-->
		<div class="easyui-tabs" region="center" border="false"
			data-options="tools:'#tab-tools'" style="width: 700px; height: 250px">
        	<div title="二级目录实时信息"  data-options="closable:false" style="padding:10px;">
        		<!--  <table>
					<td>设备区域：</td>
					<td>
						<a id="search_but" href="#" class="easyui-linkbutton" iconCls="icon-search">查询</a>&nbsp;
						<input type="button" value="导出" onclick="$('#data_list_0_tb').tableExport({type:'pdf',escape:'false'})">
					</td><td>设备选择：</td>
					<td>
						<select id="Device" class="easyui-combobox" style="width:200px;height:30px" panelHeight="200px" "></select>
					</td>
				</table>-->
        		<table id="showdata_div" style="height:95%;">
        		</table>
		 	</div>
	 		<div title="二级目录历史数据" data-options="closable:false"
				style="padding: 10px; height: 50%; display: none" id="d1">
				<div>开始时间: <input id="startTime" value="" class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser"
						style="width: 100px"> 结束时间: <input id="endTime" value=""
						class="easyui-datebox"
						data-options="formatter:myformatter,parser:myparser"
						style="width: 100px"> &nbsp;
					<div style="display: none">
						设备状态:<select id="state" class="easyui-combobox"
							style="width: 100px;">
							<option value="0">全部</option>
							<option value="1">正常</option>
							<option value="2">故障</option>
							<option value="3">告警</option>
							<option value="4">停用</option>
						</select>
					</div>
					<a id="searchHistory" href="#" class="easyui-linkbutton"
						iconCls="icon-search">查询</a> <a id="export" href="#"
						class="easyui-linkbutton" iconCls="icon-ok">导出成EXCEL</a>
				</div>
				<!-- <div id="history_checkbox" style= "padding: 10px; height: 10px; width:100%">
				</div> -->
				<div id="history_div">
					<table id="history"></table>
				</div>
			</div>
		</div>
		<div data-options="region:'south'"
			style="text-align: center; height: 20px; display: none">
			<img src="<%=basePath%>/images/state/Green.png">正常</img> <img
				src="<%=basePath%>/images/state/Yellow.png">故障</img> <img
				src="<%=basePath%>/images/state/Red.png">告警</img> <img
				src="<%=basePath%>/images/state/Gray.png">停用</img>
		</div>
		<input type="hidden" id="txtType" name="hiddenField"
			value=<%=(String)session.getAttribute("DeviceType")%> />
		<input type="hidden" id="txtName" name="hiddenField"
			value=<%=(String)session.getAttribute("DeviceName")%> />
		<input type="hidden" id="txtID" name="hiddenField"
			value=<%=(String)session.getAttribute("DeviceID")%>
		/>
		<script type="text/javascript" src="<%=basePath%>/view/scott/demo/EquipmentDetailState.js"></script>

		<!-- script type="text/javascript" src="<%=basePath%>/view/scott/demo/yxHistory.js"></script -->
	</body>
</html>
