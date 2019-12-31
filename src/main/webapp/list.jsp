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
<script type="text/javascript">
	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	
	function choose(own){
		$("[name=check]").prop("checked",own.checked)
	}
	
	function del(gid){
		alert(gid);
		$.post("del.do",{gid:gid},function(flag){
				if (flag) {
					alert("删除成功")
					location = "list.do";
				}else {
					alert("删除失败");
				}
		},"json");
	}
	
	
	function delAll() {
		$.post("del.do",{gid:gid},function(flag){
			if (flag) {
				alert("删除成功")
				location = "list.do";
			}else {
				alert("删除失败");
			}
		},"json");
	}
	
	function add(){
		location = "toAdd.do";
	}
	

</script>
</head>
<body>
<form action="list.do" method="post">
	<input type="hidden" name="pageNum">
	商品名称:<input type="text" name="gname" value="${vo.gname}">
	<button>查询</button>
</form>
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
		<th>操作
			<button onclick="add()">增加</button>
		</th>
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
			<td>
				<button onclick="upd(${g.gid})">修改</button>
				<button onclick="del(${g.gid})">删除</button>
				<button onclick="xq(${g.gid})">详情</button>
			</td>
		</tr>
	</c:forEach>
		<tr>
			<td colspan="10">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?'1':page.prePage})">上一页</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>&nbsp;&nbsp;
				当前${page.pageNum }/${page.pages }页,共${page.total }条
				&nbsp;&nbsp;&nbsp;&nbsp;

					<button onclick="delAll()">批量删除</button>
				
				
			</td>
		</tr>
</table>

</body>
</html>