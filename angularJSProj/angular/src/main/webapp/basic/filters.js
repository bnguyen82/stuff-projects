angular.module('phonecatFilters', [])
.filter('checkmark', function() {
  return function(input) {
	  return input=='LG'?'Korea':'Others';
  };
});