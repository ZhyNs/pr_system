<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入JSTL核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>科技创新智能互助平台</title>
	
	<style type="text/css">
		.main-content2 {
			width: 90%;
			font-size: 14px;
			font-family: "微软雅黑";
			font-weight: lighter;
			margin: 30px auto;
			padding: 100px 20px 80px 20px;
			background-color: #fff;
		}
		
		.form-group label {
			font-family: '微软雅黑';
			font-weight: lighter !important; 
			font-size: 14px;
		}
	</style>
</head>

<body>
	<div class="main-content2 form-horizontal">
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group">
		    		<label class="col-sm-3 control-label">姓名</label>
		    		<div class="col-sm-8">
		    			<span class = "form-control">${user.name}</span>
		    		</div>
		    	</div>
		    </div>
		    <div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-2 control-label">工号</label>
		    		<div class="col-sm-8">
		    			<span class = "form-control">${login.number}</span>
		    		</div>
		    	</div>
		    </div>
		</div>
	   	<div class="row">
			<div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-3 control-label">学院</label>
		    		<div class="col-sm-8">
		    			<input class = "form-control" type="text" name="academy" id="academy" value="${user.academy}">
		    		</div>
		    	</div>
		    </div>
		    <div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-2 control-label">职称</label>
		    		<div class="col-sm-8">
		    			<c:if test="${user.level == '0'}">
			 			<select class = "form-control" name="level" id="level">
			 				<option value="0" selected>教授</option>
			 				<option value="1">副教授</option>
			 				<option value="2">讲师</option>
			 			</select>
			 			</c:if>
			 			<c:if test="${user.level == '1'}">
			 			<select class = "form-control" name="level" id="level">
			 				<option value="0">教授</option>
			 				<option value="1" selected>副教授</option>
			 				<option value="2">讲师</option>
			 			</select>
			 			</c:if>
			 			<c:if test="${user.level == '2'}">
			 			<select class = "form-control" name="level" id="level">
			 				<option value="0">教授</option>
			 				<option value="1">副教授</option>
			 				<option value="2" selected>讲师</option>
			 			</select>
			 			</c:if>
		    		</div>
		    	</div>
		    </div>
		 </div>
		 <div class="row">
			<div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-3 control-label">性别</label>
		    		<div class="col-sm-8">
		    			<c:if test="${user.sex == '0'}">
		    			<label><input type="radio" name="sex" value="0" checked>男</label>&nbsp;&nbsp;
		    			<label><input type="radio" name="sex"value="1">女</label>
		    			</c:if>
		    			<c:if test="${user.sex == '1'}">
		    			<label><input type="radio" name="sex" value="0">男</label>&nbsp;&nbsp;
		    			<label><input type="radio" name="sex"value="1" checked>女</label>
		    			</c:if>
		    		</div>
		    	</div>
		    </div>
		    <div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-2 control-label">号码</label>
		    		<div class="col-sm-8">
		    			<input class = "form-control" type="text" name="telephone" id="telephone" value="${user.telephone}">
		    		</div>
		    	</div>
		    </div>
		 </div>
		 <div class="row">
			<div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-3 control-label">短号</label>
		    		<div class="col-sm-8">
		    			<input class = "form-control" type="text" name="cornet" id="cornet" value="${user.cornet}">
		    		</div>
		    	</div>
		    </div>
		    <div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-2 control-label">QQ</label>
		    		<div class="col-sm-8">
		    			<input class = "form-control" type="text" name="qq" id="qq" value="${user.qq}">
		    		</div>
		    	</div>
		    </div>
		</div>
		<div class="row">
			<div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-3 control-label">邮箱</label>
		    		<div class="col-sm-8">
		    			<input class = "form-control" type="text" name="email" id="email" value="${user.email}">
		    		</div>
		    	</div>
		    </div>
		</div>
		<div class="row">
		    <div class="col-xs-6">
		    	<div class="form-group">
		    		<label class="col-sm-3 control-label">简介</label>
		    		<div class="col-sm-8">
		    			<textarea class = "form-control" name="description" id="description" style="width:100%; height:80px;vertical-align:top;resize:none;">${user.description}</textarea>
		    		</div>
		    	</div>
		    </div>
		</div>
		<div class="row" style="margin-top: 30px;">
	    	<div class="form-group">
	    		<div class="col-sm-4 col-sm-offset-5">
	    		<a class="btn btn-info" href="javascript:void(0);" onclick="teacher_update(${user.id})" style="font-size: 13px;">提交修改</a>&nbsp;&nbsp;&nbsp;
	    		<a class="btn btn-info" href="javascript:void(0);" onclick="teacher_delete(${login.id}, ${user.id})" style="font-size: 13px;">删除用户</a>
	    		</div>
	    	</div>
	    </div>
	</div>

<script type="text/javascript">
	function teacher_update(userId) {
		$.ajax({
			type : 'post',
			url : 'teacher_update.action',
			data : {
				id : userId,
				academy: $('#academy').val(),
				level: $('#level').val(),
				sex: $("input[name='sex']:checked").val(),
				telephone: $('#telephone').val(),
				cornet: $('#cornet').val(),
				qq: $('#qq').val(),
				email: $('#email').val(),
				description: $('#description').val()
			},
			success : function(data) {
				window.location.href = "content/teacher/teacher.jsp";
			}, 
			error : function(data) {
				window.location.href = "content/teacher/teacher.jsp";
			}
		});
	}
	
	function teacher_delete(loginId, userId) {
		$.ajax({
			type : 'post',
			url : 'teacher_delete.action',
			data : {
				loginId : loginId,
				userId : userId
			},
			success : function(data) {
				window.location.href = "content/teacher/teacher.jsp";
			}, 
			error : function(data) {
				window.location.href = "content/teacher/teacher.jsp";
			}
		});
	}
</script>
</body>
</html>