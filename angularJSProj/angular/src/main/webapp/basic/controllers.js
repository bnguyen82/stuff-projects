angular.module('phonecat', ['phonecatFilters', 'phoneDirectives', 'HttpService'])
.config(function($httpProvider){
	$httpProvider.responseInterceptors.push('httpInterceptor');
	var spinner = function(data, headersGetter){
		var statusBar = $('#statusBar');
		statusBar.text("Loading ...");
		statusBar.show();
		return data;
	}
	var checker = function(data, headersGetter){
		var statusBar = $('#statusBar');
		statusBar.text("Loaded");
		statusBar.show();
		data.checker="Checker Added";
		return data;
	}
	$httpProvider.defaults.transformRequest.push(spinner);
	$httpProvider.defaults.transformResponse.push(checker);
})
.factory('phoneService',function($http){
	return new PhoneService($http);
})
	  
function PhoneListCtrl($scope, $location, phoneService) {
	phoneService.getJson(function(phones){
		$scope.phones = phones;
	});
	$scope.query='';
	$scope.gotoURL = function(url){
		$location.path(url);
	};
	$scope.service = phoneService;
//	$scope.$emit('displayMes2', [{name:'Bao'}]);
	$scope.$on('click', function(event, mass) {
		console.log('Listening event displayMessage ' + mass[0].name);
	});
	
	$scope.loadTweets = function() {
	 	console.log("Loading tweet");
	}
}

function MainCtrl($scope, $location, $rootScope) {
	$scope.broadcastEvent = function() {
		console.log('Broadcast event displayMessage');
		$scope.$broadcast('displayMes', [{name:'Good news'}]);
	};
//	$rootScope.$broadcast('displayMes2', [{2:5}]);
	$scope.deleteTweets = function() {
		console.log("Deleting tweets");
	}
}
//PhoneListCtrl.$inject = ['phoneService'];