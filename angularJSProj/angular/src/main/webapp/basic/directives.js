angular.module('phoneDirectives', [])
.directive("hello", function(){
	return {
		restrict: "E",
		template: "<div>Good Morning</div>"
	}
})
.directive("enter", function() {
	return function(scope, element, attrs) {
	 	element.bind("mouseenter", function() {
//		 	scope.$emit('click');
//	 	 	console.log("Finish emit events");
//	 		element.addClass(attrs.enter);
	 		scope.$apply('loadTweets()');
	 	});
	}
})
.directive("leave", function() {
	return function(scope, element, attrs) {
	 	element.bind("mouseleave", function() {
//	 		element.removeClass(attrs.enter);
	 		scope.$apply("deleteTweets()");
	 	});
	}
})
.directive("superhero", function() {
	return {
		restrict: "E",
		controller: function ($scope){
			$scope.abilities = [];
			this.addStrength = function() {
			 	$scope.abilities.push("Strength");
			}
		},
	
		link: function(scope, element, attrs) {
	 	 	console.log("Begin linking");
		 	element.bind("mouseenter", function() {
		 	 	console.log("Abilities: " + scope.abilities);
		 	})
		}
	
	}
})
.directive("strength", function() {
	return {
		require: "superhero",
		link: function(scope, element, attrs, superheroCtrl) {
			 superheroCtrl.addStrength();
		}
	
	}
})
.directive("welcome", function() {
 	return {
 		restrict:"A",
 		scope: {
 			greeting: "@" 
 		},
 		template:'<div>{{greeting}}</div>',
// 		link: function(scope, element, attr){
// 			scope.greeting = attr.greeting;
// 		}
 	
 	}
 	
})