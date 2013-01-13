<%@ page language="java" import="java.util.*,com.archivesManagement.domain.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>档案存放位置管理画面</title>
    <meta http-equiv="Content-Type" content="text/html;chatset=GBK">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- 获取已有的档案管理存放位置-->
  <%
  	List listPositions = (List)request.getAttribute("listPosition");
  	//设定系统中共有多少个档案存放位置已注册
  	int m = 0;
   %>
  <body>
    This is my JSP page. <br>
    <form name="form1" action="" method="post">
    	<table width="776" border="0.5">
    		<tr>
    			<td height="38" colspan="1"><div align="center">消息提示：${msg}</div></td>
    		</tr>
    		<tr>
    			<td height="27">选择</td>
    			<td>档案存放的位置</td>
    		</tr>
    		<%
    			//循环输出档案存放的位置
    			for(int i=0;listPositions!=null && i<listPositions.size();i++){
    				Position position = (Position)listPositions.get(i);
    				m++;
    		 %>
    		 <tr>
    		 	<td><input type="checkbox" name="checkbox" value=""<%=i%>/></td>
    		 	<td><input type="hidden" name="positionId<%=i %>" width="320" value="<%=position.getId() %>"/></td>
    		 	<td><input type="text" name="detail<%=i %>" value="<%=position.getDetail() %>"/></td>
    		 </tr>
    		 <%} %>
    		 <!-- 始终保持一个空行以供输入 -->
    		 <tr>
    		 	<td><input type="checkbox" name="checkbox" value="<%=m %>"/></td>
    		 	<td><input type="text" name="detail<%=m %>" value=""/></td>
    		 </tr>
    		 <tr>
    		  	<td colspan="1"><div align="center"></div><div align="center"><!-- 按钮操作是要处理的动作 -->
    		  		<input type="button" name="create" value="create" onClick="return check('create')"/>
    		  		<input type="button" name="update" value="update" onClick="return check('update')"/>
    		  		<input type="button" name="delete" value="delete" onClick="return check('delete')"/>
    		  	</div></td>
    		 </tr>
    	</table>
    </form>
    <!-- 页面提交时对多动作的处理 -->
    <script language=javascript>
    	function check(action){
    		document.forms[0].action = "positionAction"+action+".action";
    		document.form[0].submit();
    	}
    </script>
  </body>
</html>
