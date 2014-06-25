<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<input type="text" id="some-input" />
<span id="counter"></span> character(s) remaining

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.10/angular.min.js"></script>

<!-- <script>
	AUI().use('get', function(A){
	   	A.Get.script('http://ajax.googleapis.com/ajax/libs/angularjs/1.2.10/angular.min.js', {  });
	   /* 	A.Get.script('app.js', {  }); */
	});
</script>  --> 



<div ng-app="ngAppDemo">
	<label>Name:</label> <input ng-model="name" placeholder="Enter a name here" type="text" />
	<h1>Hello {{name}}!</h1>
	<label>Name:</label> <input ng-model="yourName" placeholder="Enter a name here" type="text" />
	<hr />
	<h1>Hello {{yourName}}!</h1>


	<div ng-controller="ngAppDemoController">
    	<h1>I can get variable controller {{a}} ! </h1>
    </div>

</div> 