<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'edit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h2>审批活动:</h2>
   <form action="saveapprove">
  <table border="1" width="60%" align="center">
  	<tr style="display: none">
      <td>活动编号：</td>
      <td><input type="text" name="aid" value="${act.aid }"></td>
  	</tr>
   	<tr>
 	<td>活动名称：</td>
 	<td><input type="text" name="aname" value="${act.aname }"></td>
  	</tr>
  	<tr>
		<td>活动内容:</td>
		<td><textarea name="content" cols="40" rows="10"  style="border:1px solid black;">${act.content }</textarea></td>
 	</tr>
 	<tr>
		<td>活动经费:</td>
		<td><input type="text" name="money" value="${act.money}"></td>
 	</tr>
 


 	<tr>
 	
 		<td>审批状态：</td>
 	<td>
 	
		通过:<input type="radio" name="result"  value="1">
		未通过:<input type="radio" name="result"  value="3">
	
	</td>
	
	 
 	</tr>
 
 		<tr>
 	
 		<td>审批意见：</td> 	
		<td><textarea name="idea" cols="40" rows="10"  style="border:1px solid black;"></textarea></td>	 
 		</tr>
 
 
 
 	<tr>
 	<td></td>
 	<td><input type="submit" value="提交"></td>  	
   	</tr>
   
 </table>  
   </form>
  </body>
</html>
