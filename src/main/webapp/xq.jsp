<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./resource/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="./resource/js/jquery-1.8.3.js"></script>
</head>
<body>
<table>
	<tr>
		<th>
			<input type="checkbox" onclick="choose(this)">
		</th>
		<th>商品编号</th>
		<th>商品名称</th>
		<th>英文名称</th>
		<th>商品品牌</th>
		<th>商品种类</th>
		<th>尺寸</th>
		<th>单价(元)</th>
		<th>数量</th>
		<th>标签</th>
		<th>商品图片上传</th>
	</tr>
	<c:forEach items="${list }" var="g" varStatus="count">
		<tr>
			<td>
				<input type="checkbox" name="check" value="${g.gid}">
			</td>
			<td>${count.count+startRow }</td>
			<td>${g.gname }</td>
			<td>${g.gengName }</td>
			<td>${g.bid.bname}</td>
			<td>${g.kid.ktype}</td>
			<td>${g.size }</td>
			<td>${g.price }</td>
			<td>${g.num }</td>
			<td>${g.meett }</td>
			<td>
				<img alt="图片丢失" src="load/'${g.phone}'" style="width: 100px; height: 100px;">
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>