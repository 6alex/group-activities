<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'activity.jsp' starting page</title>
    
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
 
    <table border="1" width="100%" class="tab">
            <tr>
                <th><input type="checkbox" id="chbAll"></th>
                <th>活动编号</th>
                <th>活动名称</th>
                <th>活动内容</th>
                <th>活动经费</th>
                <th>审批状态</th>
                <th>审批意见</th>
       
                <th>操作</th>
            </tr>
            <c:forEach var="m" items="${list}" varStatus="status">
                <tr>
                    <th><input type="checkbox" name="id" value="${m.aid}"></th>
                    <td>${m.aid}</td>
                    <td>${m.aname}</td>
                    <td>${m.content}</td>
                    <td>${m.money}</td>
 					<c:if test="${m.state == 1}"><td>通过</td></c:if>
  					<c:if test="${m.state == 3}"><td>未通过</td></c:if>
  					<c:if test="${m.state == 2}"><td>未审批</td></c:if>
  					<td></td>                  
                    <td>
                    <a href="${pageContext.request.contextPath }/appedit/${m.aid}">审批</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
      
    
  </body>
</html>
