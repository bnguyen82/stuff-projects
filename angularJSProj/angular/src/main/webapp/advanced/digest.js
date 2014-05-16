var myapp = angular.module('myapp', []);
myapp.factory('myService',function($q){
	var service = new MyService($q);
	return service;
});
function MyService($q){
	this.$q = $q;
	this.name = "Bao";
};

function MainCtrl($scope){
	$scope.message = "Hello World";
	$scope.showFlag = true;
	
	$scope.log = function(){
		console.log("2 Called before timeout");
	}
	$scope.show = function() {
		$scope.showFlag = !$scope.showFlag;
	};
	
	//This method is called automatically each time showFlag is changed
	//because it's a model and then watched by Angular
	$scope.isShow = function() {
		return $scope.showFlag;
	};
	
//	setTimeout(function() {
//		$scope.message = "Called";
//	}, 1000);
	
	//Call apply of angular to explicitly bind value change in timeout
	//Also note that event timeout callback just be handle after this controller
	//finishes its all line codes
	setTimeout(function() {
		$scope.$apply(function() {
			$scope.message = "Called";
		});
	}, 20);
	
	//Illustrate that below lines are always called before timeout callback
	//even through timeout is 0
	console.log("1 Called before timeout");
	$scope.log();
	console.log("3 Called before timeout");
}