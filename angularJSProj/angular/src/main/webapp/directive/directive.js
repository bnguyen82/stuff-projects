function Ctrl1($scope) {
};
 
angular.module('renderModule', [])
.directive('contenteditable', function() {
  return {
    require: '?ngModel',
    link: function(scope, elm, attrs, ctrl) {
      // view -> model
      elm.bind('blur', function() {
        scope.$apply(function() {
          ctrl.$setViewValue(elm.html());
        });
      });
 
      // model -> view
      ctrl.$render = function() {
        elm.html(ctrl.$viewValue);
      };
 
      // load init value from DOM
      ctrl.$setViewValue(elm.html());
    }
  };
});

function Ctrl3($scope) {
	  $scope.title = 'Auto Binding';
	  $scope.text = 'Neque porro quisquam est qui dolorem ipsum quia dolor...';
	  var prev = $scope.title ;
	  $scope.isTitleChanged = function(title){
		  return title;
	  }
	  
	  $scope.format = 'M/d/yy h:mm:ss a';
}

angular.module('zippyModule', [])
  .directive('zippy', function(){
    return {
      restrict: 'C',
      // This HTML will replace the zippy directive.
      replace: true,
      transclude: true,
      scope: { title:'@zippyTitle' },
      controller: 
    	  ["$scope", "$element", "$attrs", "$transclude", 
          function($scope, $element, $attrs, $transclude, otherInjectables){
    		  console.log($scope);
      }],
      template: '<div>' +
                  '<div class="title">{{title}}</div>' +
                  '<div class="body" ng-transclude></div>' +
                '</div>',
      // The linking function will add behavior to the template
      link: function(scope, element, attrs) {
            // Title element
        var title = angular.element(element.children()[0]),
            // Opened / closed state
            opened = true;
 
        // Clicking on title should open/close the zippy
        title.bind('click', toggle);
 
        // Toggle the closed/opened state
        function toggle() {
          opened = !opened;
          element.removeClass(opened ? 'closed' : 'opened');
          element.addClass(opened ? 'opened' : 'closed');
        }
 
        // initialize the zippy
        toggle();
      }
    }
  })
  // Register the 'myCurrentTime' directive factory method.
  // We inject $timeout and dateFilter service since the factory method is DI.
  .directive('myCurrentTime', function($timeout, dateFilter) {
    // return the directive link function. (compile function not needed)
    return {
      link: function(scope, element, attrs) {
	      var format,  // date format
	          timeoutId; // timeoutId, so that we can cancel the time updates
	 
	      // used to update the UI
	      function updateTime() {
	        element.text(dateFilter(new Date(), format));
	      }
	 
	      // watch the expression, and update the UI on change.
	      scope.$watch(attrs.myCurrentTime, function(value) {
	        format = value;
	        updateTime();
	      });
	 
	      // schedule update in one second
	      function updateLater() {
	        // save the timeoutId for canceling
	        timeoutId = $timeout(function() {
	          updateTime(); // update DOM
	          updateLater(); // schedule another update
	        }, 1000);
	      }
	 
	      // listen on DOM destroy (removal) event, and cancel the next UI update
	      // to prevent updating time after the DOM element was removed.
	      element.bind('$destroy', function() {
	        $timeout.cancel(timeoutId);
	      });
	 
	      updateLater(); // kick off the UI update process.
	    }
    }
  });