angular.module('HttpService', []).
factory('httpInterceptor', function(){
	return function(promise){
		return promise.then(
				function(response){
			var statusBar = $('#statusBar');
			statusBar.hide();
			response.interceptor = "Interceptor added";
			return response;
		},
				function(response){
			alert("Failed");
			return $q.reject(response);
		});
	}
})