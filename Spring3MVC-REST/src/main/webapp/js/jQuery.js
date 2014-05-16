$(function() {
	var url = "/SpringMVC/movie/ironMan";
	var callback = function(data){
		console.log(data);
	}
	
	$.ajax({
        type: 'POST',
        url: url,
        cache: false,
        contentType: 'application/json',
        dataType: 'json',
        data: {},
        async: false,
        success: callback
    });
	
})
