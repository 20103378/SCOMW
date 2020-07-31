<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <%@include file="/view/resource.jsp" %>
        <script type="text/javascript" src="<%=basePath%>/js/jquery-easyui-1.3.2/jquery.mask.js"></script>
        <link href="../css/systemConfig.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="easyui-layout">

        <div region="center" border="false" style="width:600px;height:400px;">
            <button id="serverRestart" name="server" style="width:100px;margin-top:20px;margin-left:30px;">重启</button>
        </div>
        <script type="text/javascript" src="<%=basePath%>/js/Innerjs/systemConfiguration.js"></script>
        
    </body>
</html>

