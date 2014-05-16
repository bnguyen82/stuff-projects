angular.module('myapp', [])
.directive('posPhonenumber', function(){
	return {
		require: '?ngModel',
		link: function(scope, element, attrs, model){
			if (model != null){
				//view -> model
				element.bind("keyup blur", function(e) {
					var number = element.val();
					if(model.$viewValue !== undefined && !scope.$$phase){
						return scope.$apply(function(){
							model.$setViewValue(number)
						});
					};
					return false;
				});
				//model -> view
				model.$render = function(){
					var value = model.$viewValue;
					if(hasValueNotEmpty(value))
						element.val(value);
						element.keyup();
				};
			}
			element.intlTelInput();
		}
	};
});
function hasValueNotEmpty(variable){
	return (typeof variable !== 'undefined') && (variable !== null) && (variable.length !== 0);
}
function AppCtrl($scope){
	$scope.number = "+84 3333222";
	console.log("Hello");
};
