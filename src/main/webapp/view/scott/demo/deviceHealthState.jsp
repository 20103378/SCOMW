<!-- 健康设备状态页 -->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <%@include file="/view/resource.jsp" %>
        <script type="text/javascript" src="<%=basePath%>/js/fusioncharts/FusionCharts.js"></script>
<%--		<script type="text/javascript" src="<%=basePath%>/js/fusioncharts/fusioncharts.js"></script>--%>
	<%--		<script type="text/javascript" src="<%=basePath%>/js/commons/swfobject.js"></script>--%>
		<script type="text/javascript" >

//	    	function Run(strPath)
//	    	{
//	    	   try
//	    	   {
//	    	    var objShell = new ActiveXObject("wscript.shell");
//	    	    objShell.Run(strPath);
//	    	    objShell = null;
//	    	   }
//	    	   catch(e)
//	    	   {
//	    	        alert('找不到文件"'+strPath+'"(或它的组件之一)。请确定路径和文件名是否正确.')
//	    	   }
//	    	}
    	</script>
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
            }

        </style>
    </head>
    <body class="easyui-layout">
        <!--显示设备健康状态信息-->
        <div class="easyui-tabs" id="eTab" region="center" border="false" data-options="tools:'#tab-tools'" style="width:700px;height:200px;padding:10px;">
        	<div title="设备健康状态信息"  data-options="closable:false" style="padding:10px;">
        	<!--  a href="#" onclick="Run('file:///D:/Tencent/QQ/Bin/QQScLauncher.exe')">打开QQ</a -->
        		<table>
					<td>设备区域：</td>
					<td>
						<select id="DeviceArea" class="easyui-combobox" style="width:200px;height:30px" panelHeight="200px">
						</select>
					</td>
					<td>设备类型：</td>
					<td>
						<select id="DeviceType" class="easyui-combobox" style="width:200px;height:30px" panelHeight="200px" "></select>
					</td>
					
				</table>
        		<div id="showdata" style="height:95%">
        		</div>
				<div id="ShowDevice-window" title="实时数据" style="width:400px;height:150px;font-size: 16" data-options="region:'north',split:true">
				    <table id="yx_data-list" title="实时数据" style="padding:10px"></table>
				</div>
		 	</div>
        	
        <input type="hidden" id="txtID" name="hiddenField" value=
        <%=(String)session.getAttribute("DeviceID")%>
		/>
		<input type="hidden" id="txtMap" name="hiddenField" value=
        <%=(String)session.getAttribute("map")%>
		/>
		<div data-options="region:'south'" style=" text-align:center;height:20px;">
		  <img src="<%=basePath%>/images/state/Green.png" >正常</img>
		  <img src="<%=basePath%>/images/state/Yellow.png" >故障</img>
		  <img src="<%=basePath%>/images/state/Red.png" >告警</img>
		  <img src="<%=basePath%>/images/state/Gray.png" >停用</img>
		</div>
        <script type="text/javascript" src="<%=basePath%>/view/scott/demo/deviceHealthState.js"></script>
<%--        <script type="text/javascript">--%>
<%--        	function UpdateMap(devId,y, x) {--%>
<%--	            var tab = $('#eTab').tabs('getSelected');--%>
<%--	            var index = $('#eTab').tabs('getTabIndex', tab);--%>
<%--	            var info = devId + "," + y + "," + x + "," + index;--%>
<%--	            $.ajax({--%>
<%--	            	 async: false,--%>
<%--			         cache: false,--%>
<%--			         type: 'POST',--%>
<%--			         url: "UpdateMap.do?info="+info,--%>
<%--			         success:function(data){--%>
<%--			         },--%>
<%--			         error:function(){--%>
<%--			        	 alert("error");--%>
<%--			         }--%>
<%--	            });--%>
<%--	            ajaxUpdateMap(info);--%>
<%--            }--%>
<%--        </script>--%>
    </body>
</html>
