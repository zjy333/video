<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--<base href="http://localhost:8080/Voids/">-->
<base href=".">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>智游教育</title>
		
<link href="/Video/src/main/webapp/js/bootstrap.css" rel="stylesheet">

<script src="/Video/src/main/webapp/js/jquery-1.js"></script>
<script src="/Video/src/main/webapp/js/bootstrap.js"></script>
<script src="/Video/src/main/webapp/js/confirm.js"></script>
<script src="/Video/src/main/webapp/js/jquery.js"></script>
<script src="/Video/src/main/webapp/js/message_cn.js"></script>

		<style type="text/css">
		th {
			text-align: center;
		}
		</style>
	</head>

	<body>
<nav class="navbar-inverse">
	<div class="container">
		
		<div class="navbar-header">
			<a class="navbar-brand">视频管理系统</a>
		</div>

		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
			<ul class="nav navbar-nav">
				<li><a>视频管理</a></li>
				<li><a>主讲人管理</a></li>
				<li class="active"><a>课程管理</a></li>
			</ul>
			<p class="navbar-text navbar-right">
				<span>admin</span>
				 <i class="glyphicon glyphicon-log-in" aria-hidden="true"></i>&nbsp;&nbsp;<a  class="navbar-link">退出</a>
			</p>
		</div>
		<!-- /.navbar-collapse -->


	</div>
	<!-- /.container-fluid -->
</nav>

	
	
		
	
    
    <div class="jumbotron" style="padding-top: 15px;padding-bottom: 15px;">
	  <div class="container">
	          <h2>课程管理</h2>
	  </div>
	</div>
	
	<form action="show">
	<div class="container">
	    <button onclick="showAddPage()" type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		      添加
		</button>
		
		<button onclick="deleteAll()" type="submit" id="btn" class="btn btn-info dropdown-toggle">
		      批量删除
		</button>
	</div>
	
	<div class="container" style="margin-top: 20px;">
		
		<table class="table table-bordered table-hover" style="text-align: center;table-layout:fixed;">
      <thead>
        <tr class="active">
          <th><input type="checkbox" id="all"></th>
          <th>序号</th>
          <th style="width:16%">标题</th>
          <th style="width:60%">简介</th>
          <th>编辑</th>
          <th>删除</th>
        </tr>
      </thead>
      <tbody>
        
        <tr>
          <td><input type="checkbox" ></td>
          <td></td>
          <td></td>
          <td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;"></td>
          <td><a>✎</a></td>
          <td><a onclick="" >X</a></td>
          </tr>
        
        <tr>
          <td><input type="checkbox"></td>
          <td></td>
          <td></td>
          <td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;"></td>
          <td><a>✎</a></td>
          <td><a onclick="" >X</a></td>
          </tr>
        
        <tr>
          <td><input type="checkbox"></td>
          <td>8</td>
          <td>每天20分钟轻松入门React</td>
          <td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;"></td>
          <td><a>✎</a></td>
          <td><a onclick="" >X</a></td>
          </tr>
        
        <tr>
          <td><input type="checkbox"></td>
          <td></td>
          <td></td>
          <td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;"></td>
          <td><a>✎</a></td>
          <td><a onclick="" >X</a></td>
          </tr>
        
        <tr>
          <td><input type="checkbox"></td>
          <td></td>
          <td></td>
          <td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;"></td>
          <td><a>✎</a></td>
          <td><a onclick="">X</a></td>
          </tr>
        
        <tr><td colspan="2">
        <font></font>
	

  
  

<div id="modal-background" class=""></div>
<div id="confirm-modal" class="modal fade role=" dialog"="" tabindex="-1">
<div class="modal-dialog modal-undefined">
<div class="modal-content">
<div class="modal-header">
<button id="modal-upper-close" class="close modal-close" aria-label="Close" type="button">
<span aria-hidden="true">×</span>
</button>
<h4 id="modal-title" class="modal-title">Modal Title</h4>
</div>
<div id="modal-body" class="modal-body"> Modal Message </div>
<div id="modal-footer" class="modal-footer">
</div>
</div>
</div>
</div>
<div id="modal-background" class="">
</div>
</body>
</html>