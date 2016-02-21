<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contextPath = pageContext.getServletContext().getContextPath();
%>
<!DOCTYPE html>
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
    <link href="<%=contextPath %>/resources/css/lib/bootstrap-datetimepicker.css" rel="stylesheet">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="<%=contextPath %>/resources/Flat-UI/js/vendor/html5shiv.js"></script>
    <script src="<%=contextPath %>/resources/Flat-UI/js/vendor/respond.min.js"></script>
    <![endif]-->
</head>
	<body>
		<div class="container">
			<h3>创建一场考试</h3>
			<hr>
			<form action="<%=contextPath %>/examination/createExamination" method="post">
				<div class="form-group hide">
			    	<label class="control-label" for="examType">考试类型</label>
			    	<select class="form-control" name="examType" id="examType">
			    		<option value="1" selected>入职考试</option>
			    	</select>
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label" for="examName">考试称呼</label>
			    	<input type="text" class="form-control" name="examName" id="examName" placeholder="比如：上海亚信入职考试">
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label" for="examAddr">考试地点</label>
			    	<input type="text" class="form-control" name="examAddr" id="examAddr" placeholder="比如：虹漕路421号61号楼4楼">
			  	</div>
			  	<div class="form-group">
		    		<label class="control-label" for="_answerTime">考试时间</label>
	                <div class="input-group date" id="answerTimeInputGroup">
	                	<!-- 显示 -->
	                    <input type="text" class="form-control" id="_answerTime">
	                    <!-- 实际时间 -->
	                    <input type="hidden" name="answerTime" id="answerTime">
	                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
	                </div>
	            </div>
			  	<div class="form-group">
			    	<label class="control-label" for="examName">考试持续多少分钟</label>
			    	<input type="number" class="form-control" name="durationTime" id="durationTime" placeholder="比如：120">
			  	</div>
			  	<div class="form-group">
			    	<label class="control-label" for="aheadTime">可以提前几分钟进入考场</label>
			    	<input type="number" class="form-control" name="aheadTime" id="aheadTime" placeholder="比如：10">
			  	</div>
			  	<button type="submit" class="btn btn-primary btn-lg btn-block">确认提交</button>
			</form>
			<hr>
		</div>
	
		<!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
	   	<script src="<%=contextPath %>/resources/Flat-UI/js/vendor/jquery.min.js"></script>
	   	<!-- Include all compiled plugins (below), or include individual files as needed -->
	   	<script src="<%=contextPath %>/resources/Flat-UI/js/flat-ui.min.js"></script>
	   	<script src="<%=contextPath %>/resources/js/lib/lodash.js"></script>
	   	<script src="<%=contextPath %>/resources/js/lib/moment.js"></script>
	   	<script src="<%=contextPath %>/resources/js/lib/moment-with-locales.js"></script>
	   	<script src="<%=contextPath %>/resources/js/lib/bootstrap-datetimepicker.js"></script>
	   	<script src="<%=contextPath %>/resources/js/app/createExamination.js"></script>
   	</body>
</html>
