<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>软件激活</title>
	<%@include file="/view/resource.jsp" %>
	<script type="text/javascript">
		$(function(){
		  $("#uploadFileBtn").click(function(){
			  var fileUrl =  $("#fileUrl").val();
              if(fileUrl){
              	  $('#pdfForm').form({   
              		      url:"uploadlic.do", 
              		      async:false,
    						  cache:false,
              		      onSubmit: function(){   
              		      },   
              		      success:function(data){  
              		    	location.href = JSON.parse(data).dir;
              		      }   
              		});   
              		 // 提交 form   
              		$('#pdfForm').submit(); 
              }else{
                      alert("上传的文件不可为空");
              }
			  
			  
		  })
			
		});
	</script>
</head>
<body>
<div data-options="region:'north',split:true" style="padding:10px">
<br/><br/>
	<div style="magin:20px;font-size:15px"> &nbsp;软件未激活，请联系厂家 ，上传正确的许可文件</div>
<br/>
    <form id="pdfForm" enctype="multipart/form-data" method="post">
        <input id="fileUrl" type="file" style="width: 160px;" name="uploadFile"/>
        <input id="uploadFileBtn" type="button" value="上传" class="btn" style="margin-top: 0px;"/>
    </form>
</div>

</body>
</html>