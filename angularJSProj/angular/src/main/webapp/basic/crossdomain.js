$(function() {
		$.postSync = function(url, data, callback) {
			if(typeof data === "string"){
				return $.ajax({
			        type: 'POST',
			        url: url,
			        cache: false,
			        contentType: 'application/json',
			        data: data,
			        dataType: 'json',
			        async: false,
			        success: callback
			    });
			}else if(window.JSON && window.JSON.stringify){
			    return $.ajax({
			        type: 'POST',
			        url: url,
			        cache: false,
			        contentType: 'application/json',
			        data: window.JSON.stringify(data),
			        dataType: 'json',
			        async: false,
			        success: callback
			    });
			}
			return null;
		};
		
//		var iposUrl = "http://localhost:8080/ipos-web";
//		 $.ajax({
//		    type: "POST",
//		    url: iposUrl + "/ajaxlogin?ajax=true",
//		    cache: false,
//		    contentType: 'application/json',
//		    data: { j_username: 'super@ipos.com' , j_password: 'password'},
//		    dataType: 'json',
//		    async: false,
//		    success: function(json) {
//		    	console.log(json);
//		    },
//		    error: function(XMLHttpRequest, textStatus, errorThrown){
//		    	console.log("error");
//		    }
//		  });		


		var url = "http://localhost:8080/ipos-web/" + "resource/i18n/prefix" ;
//		var url = "http://localhost:28080/SpringMVC/movie/ironMan" ;
		$.postSync(url, ['workspace'], function(data){
			console.log(data);
		});
})  			