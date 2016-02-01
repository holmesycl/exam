<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contextPath = pageContext.getServletContext().getContextPath();
%>
<html>
<head>
    <meta charset="utf-8">
    <title>创建新的考试</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Loading Bootstrap -->
    <link href="<%=contextPath %>/resources/Flat-UI/css/vendor/bootstrap.min.css" rel="stylesheet">
    <!-- Loading Flat UI -->
    <link href="<%=contextPath %>/resources/Flat-UI/css/flat-ui.min.css" rel="stylesheet">
    <link href="<%=contextPath %>/resources/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="<%=contextPath %>/resources/Flat-UI/js/vendor/html5shiv.js"></script>
    <script src="<%=contextPath %>/resources/Flat-UI/js/vendor/respond.min.js"></script>
    <![endif]-->
</head>
	<body>
		
		
		<div class="container">
			<h3>创建一个考试</h3>
			<hr>
			<form>
				<div class="form-group">
			    	<label class="control-label" for="exampleInputEmail1">这次考试是干嘛的</label>
			    	<select class="form-control" name="examType" id="examType" aria-describedby="examTypeHelpBlock">
			    		<option value="1">入职考试</option>
			    	</select>
			    	<span id="examTypeHelpBlock" class="help-block">慎重选择，不同的考试类型，对应的试题是不一样的</span>
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label" for="examName">如何称呼这次考试</label>
			    	<input type="text" class="form-control" name="examName" id="examName" placeholder="比如：上海亚信入职考试" aria-describedby="examNameHelpBlock">
			  		<span id="examNameHelpBlock" class="help-block">试卷的标题是根据这个值生成的</span>
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label" for="examAddr">去哪里参加考试呢</label>
			    	<input type="text" class="form-control" name="examAddr" id="examAddr" placeholder="比如：虹漕路421号61号楼4楼" aria-describedby="examAddrHelpBlock">
			  		<span id="examAddrHelpBlock" class="help-block">考试是去这里参加考试的哦</span>
			  	</div>
			  	<button type="submit" class="btn btn-primary">下一步</button>
			</form>
		</div>
	
		<!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
	   	<script src="<%=contextPath %>/resources/Flat-UI/js/vendor/jquery.min.js"></script>
	   	<!-- Include all compiled plugins (below), or include individual files as needed -->
	   	<script src="<%=contextPath %>/resources/Flat-UI/js/flat-ui.min.js"></script>
	   	<script src="<%=contextPath %>/resources/js/lib/lodash.js"></script>
	   	<script src="<%=contextPath %>/resources/js/lib/moment.js"></script>
	   	<script src="<%=contextPath %>/resources/js/app/inputExamName.js"></script>
   	</body>
</html>
