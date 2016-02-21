<%@page import="com.asiainfo.exam.domain.Examination"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contextPath = pageContext.getServletContext().getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>考试信息</title>
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
			<h3>考试信息</h3>
			<hr>
			<form class="form-horizontal">
			  <div class="form-group">
			    <label class="col-sm-1 control-label">考试名称</label>
			    <div class="col-sm-11">
			      <p class="form-control-static">${exam.examName }</p>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-1 control-label">考试地点</label>
			    <div class="col-sm-11">
			      <p class="form-control-static">${exam.examAddr }</p>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-1 control-label">考试时间</label>
			    <div class="col-sm-11">
			      <p class="form-control-static">${exam.formatAnswer }</p>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-1 control-label">考试时长</label>
			    <div class="col-sm-11">
			      <p class="form-control-static">${exam.durationTime }<span>（分钟）</span></p>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-1 control-label">提前入场</label>
			    <div class="col-sm-11">
			      <p class="form-control-static">${exam.aheadTime }<span>（分钟）</span></p>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-1 control-label">入场证号</label>
			    <div class="col-sm-11">
			      <p class="form-control-static">${exam.enterCode }</p>
			    </div>
			  </div>
			</form>
			<hr>
		</div>
	
		<!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
	   	<script src="<%=contextPath %>/resources/Flat-UI/js/vendor/jquery.min.js"></script>
	   	<!-- Include all compiled plugins (below), or include individual files as needed -->
	   	<script src="<%=contextPath %>/resources/Flat-UI/js/flat-ui.min.js"></script>
   	</body>
</html>
