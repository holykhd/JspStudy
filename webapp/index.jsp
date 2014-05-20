<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
1부터 10까지의 총 합을 구하여 출력하시오.
<%
study.MyCalc c = new study.MyCalc();
int sum = c.myHap();
int sum2 = c.myHap(2,60);
%>
<%=sum %><br />
<%=sum2 %>
</body>
</html>