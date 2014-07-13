var app = angular.module("nvd3TestApp", ['nvd3ChartDirectives']);


function ExampleCtrl($scope){
	$scope.toolTipContentFunction = function(){
		return function(key, x, y, e, graph) {
	    	return  'Super New Tooltip' +
	        	'<h1>' + key + '</h1>' +
	            '<p>' +  y + ' at ' + x + '</p>'
		}
	};
     $scope.exampleData = [
         {
             "key": "Series 1",
             "values": [ [ 1 , 1] , [ 2 , 6] , [ 3 , 7]]
         },
         {
             "key": "Series 2",
             "values": [ [ 1 , 1] , [ 2 , 2] , [ 3 , 5] , [ 4 , 3] ]
         },
         {
             "key": "Series 3",
             "values": [ [ 0 , 1] , [ 2 , -3] , [ 3 , 5] ]
         },
     ];
 }