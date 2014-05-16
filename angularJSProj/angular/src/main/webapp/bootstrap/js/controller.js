angular.module('BootstrapUI', ['$strap.directives'])
.controller("MainCtrl", function($scope, $window, $location) {
 	$scope.fire = function() {
 	 	console.log('Good work');
 	}
 	
 	//Angular Strap
	// Select directive
	$scope.selects = [
	    {id: '1', name: '<i class="icon-star"></i>&nbsp;foo'},
	    {id: '2', name: '<i class="icon-heart"></i>&nbsp;bar'},
	    {id: '3', name: '<i class="icon-fire"></i>&nbsp;baz'}
	];
	$scope.selectedItem = '1';
	$scope.selectedItems = ['1'];
	$scope.pushSelect = function() {
	 	$scope.selects.push({id : $scope.selects.length, 
	 		name : '<i class="icon-globe"></i>&nbsp;bao'});
	};
})

$(function() {
  $("html").removeClass("no-js").addClass("js");
	var $window = $(window);
  new FastClick(document.body);
	$(document).ready(function($) {
		// Disable certain links in docs
		$('section [href^=#]').click(function (e) {
			e.preventDefault();
		});
		// Make code pretty
		window.prettyPrint && window.prettyPrint();
	});
});