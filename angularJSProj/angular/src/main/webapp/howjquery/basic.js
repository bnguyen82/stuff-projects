$(document).ready(function(){
	var $testing = $("#testing").data('foo', 52);
	var $myBold = $(".myBold");
	var a = $(".myBold").index();
	var b = $(".myBold").index("div");
	var c = $("div").index($testing);
	var c = $("div").index($myBold);

	console.log($testing.data('foo'));
	
});