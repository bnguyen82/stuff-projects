angular.module('AipoUI', [])
.controller("MainCtrl", function($scope, $window, $location) {
//	$scope.showDropdownPanel = function() {
//	 	$('#dropdownPanel').show();
//	}
	$scope.showDropdownPanel = function() {
	 	$('#dropdownPanel').show();
	 	$('#dropdownPanel').addClass("dropdown");
	 	
	}
})

$(function($) {
	$('#dropdownPanel').hide();
})(jQuery);

function bao(param) {
 	var  a = new Array;
 	var b = a.length;
}