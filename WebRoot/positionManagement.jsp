<%@ page language="java" import="java.util.*,com.archivesManagement.domain.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�������λ�ù�����</title>
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
  <!-- ��ȡ���еĵ���������λ��-->
  <%
  	List listPositions = (List)request.getAttribute("listPosition");
  	//�趨ϵͳ�й��ж��ٸ��������λ����ע��
  	int m = 0;
   %>
  <body>
    This is my JSP page. <br>
    <form name="form1" action="" method="post">
    	<table width="776" border="0.5">
    		<tr>
    			<td height="38" colspan="1"><div align="center">��Ϣ��ʾ��${msg}</div></td>
    		</tr>
    		<tr>
    			<td height="27">ѡ��</td>
    			<td>������ŵ�λ��</td>
    		</tr>
    		<%
    			//ѭ�����������ŵ�λ��
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
    		 <!-- ʼ�ձ���һ�������Թ����� -->
    		 <tr>
    		 	<td><input type="checkbox" name="checkbox" value="<%=m %>"/></td>
    		 	<td><input type="text" name="detail<%=m %>" value=""/></td>
    		 </tr>
    		 <tr>
    		  	<td colspan="1"><div align="center"></div><div align="center"><!-- ��ť������Ҫ����Ķ��� -->
    		  		<input type="button" name="create" value="create" onClick="return check('create')"/>
    		  		<input type="button" name="update" value="update" onClick="return check('update')"/>
    		  		<input type="button" name="delete" value="delete" onClick="return check('delete')"/>
    		  	</div></td>
    		 </tr>
    	</table>
    </form>
    <!-- ҳ���ύʱ�Զද���Ĵ��� -->
    <script language=javascript>
    	function check(action){
    		document.forms[0].action = "positionAction"+action+".action";
    		document.form[0].submit();
    	}
    </script>
  </body>
</html>
