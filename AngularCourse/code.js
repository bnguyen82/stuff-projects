myApp.controller('PersonController', function (s) {
    this.model = s.getPerson();
});

myApp.factory('unicornLauncher', ["apiToken", function(apiToken) {
  return new UnicornLauncher(apiToken);
}]);

myApp.service('unicornLauncher', ["apiToken", UnicornLauncher]);


 myApp.provider('unicornLauncher', function UnicornLauncherProvider() {
  var useTinfoilShielding = false;

  this.useTinfoilShielding = function(value) {
    useTinfoilShielding = !!value;
  };

  this.$get = ["apiToken", function unicornLauncherFactory(apiToken) {
  	return new UnicornLauncher(apiToken, useTinfoilShielding);
  }];
});

myApp.config(["unicornLauncherProvider", function(unicornLauncherProvider) {
  unicornLauncherProvider.useTinfoilShielding(true);
}]);


myApp.value('clientId', 'a12345654321x');


myApp.controller('DemoController', ['clientId', function DemoController(clientId) {
  this.clientId = clientId;
}]);


myApp.constant('planetName', 'Greasy Giant');

myApp.config(['unicornLauncherProvider', 'planetName', function(unicornLauncherProvider, planetName) {
  unicornLauncherProvider.useTinfoilShielding(true);
  unicornLauncherProvider.stampText(planetName);
}]);


{{1+2}}
{{a+b}}
{{user.name}}


{{ expression | filter }}  


module.filter(“upperCase”, function(text) {
     return  text.toUpperCase();;
});




angular.module('form-example2', []).directive('contenteditable', function() {
  return {
    require: 'ngModel',
    link: function(scope, elm, attrs, ctrl) {
      // view -> model
      elm.on('blur', function() {
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



module.directive('normalizedName', factoryFn);


angular.module('docsRestrictDirective', [])
  .controller('Controller', ['$scope', function($scope) {
    $scope.customer = {
      name: 'Naomi',
      address: '1600 Amphitheatre'
    };
  }])
  .directive('myCustomer', function() {
    return {
      restrict: 'E',
      templateUrl: 'my-customer.html'
    };
  });


angular.module('docsRestrictDirective', [])
  .directive('myCustomer', function() {
    return {
      restrict: 'E',
      scope: {
        customerInfo: '=info'
      },
      templateUrl: 'my-customer-iso.html'
    };
  });


function link(scope, element, attrs) { ... }

angular.module('docsTransclusionDirective', [])
  .directive('myDialog', function() {
    return {
      restrict: 'E',
      transclude: true,
      templateUrl: 'my-dialog.html'
    };
  });

 
service = $injector.get('basicService');
ctrl = $controller('MainCtrl', {$scope: $scope, basicService: service});


describe("A suite", function() {
  var foo;

  beforeEach(function() {
    foo = 0;
    foo += 1;
  });

  afterEach(function() {
    foo = 0;
  });
  it("contains spec with an expectation", function() {
    expect(foo).toEqual(1);
  });
});


// Karma configuration
// Generated on Fri May 16 2014 11:53:35 GMT+0700 (SE Asia Standard Time)

module.exports = function(config) {
  config.set({
    // base path that will be used to resolve all patterns (eg. files, exclude)
    basePath: './',
    frameworks: ['jasmine'],
    // list of files / patterns to load in the browser
    files: [
      'angular.min.js',
      'angular-mock.js',
      '*.js',
    ],
    exclude: [
      
    ],
    preprocessors: {
    
    },
    reporters: ['progress'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['Chrome'],
    singleRun: false
  });
};

npm install -g karma;

npm install -g karma-cli;

karma init my.conf.js;

karma start my.conf.js;

angular.module('moduleA', ['moduleB', 'moduleC']);


myApp.constant('planetName', 'Greasy Giant');
myApp.config(['unicornLauncherProvider', 'planetName', function(unicornLauncherProvider, planetName) {
  unicornLauncherProvider.stampText(planetName);
}]);


phonecatApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/phones', {
        templateUrl: 'partials/phone-list.html',
        controller: 'PhoneListCtrl'
      }).
      when('/phones/:phoneId', {
        templateUrl: 'partials/phone-detail.html',
        controller: 'PhoneDetailCtrl'
      }).
      otherwise({
        redirectTo: '/phones'
      });
  }]);

myApp.service('mathService', function(win) {
  this.pi = 3.14;
  this.add = function(x, y) {
    return x + y;
  }

  this.multiply = function(x, y) {
    return x * y;
  }
});

{{ expression | filter }} 

myApp.controller('PersonController', function (s) {
    this.model = s.getPerson();
});

myApp.factory('unicornLauncher', ["apiToken", function(apiToken) {
  return new UnicornLauncher(apiToken);
}]);

myApp.service('unicornLauncher', ["apiToken", UnicornLauncher]);


 myApp.provider('unicornLauncher', function UnicornLauncherProvider() {
  var useTinfoilShielding = false;

  this.useTinfoilShielding = function(value) {
    useTinfoilShielding = !!value;
  };

  this.$get = ["apiToken", function unicornLauncherFactory(apiToken) {
    return new UnicornLauncher(apiToken, useTinfoilShielding);
  }];
});

myApp.config(["unicornLauncherProvider", function(unicornLauncherProvider) {
  unicornLauncherProvider.useTinfoilShielding(true);
}]);


myApp.value('clientId', 'a12345654321x');


myApp.controller('DemoController', ['clientId', function DemoController(clientId) {
  this.clientId = clientId;
}]);



{{1+2}}
{{a+b}}
{{user.name}}


{{ expression | filter }}  


module.filter(“upperCase”, function(text) {
     return  text.toUpperCase();;
});




angular.module('form-example2', []).directive('contenteditable', function() {
  return {
    require: 'ngModel',
    link: function(scope, elm, attrs, ctrl) {
      // view -> model
      elm.on('blur', function() {
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



module.directive('normalizedName', factoryFn);


angular.module('docsRestrictDirective', [])
  .controller('Controller', ['$scope', function($scope) {
    $scope.customer = {
      name: 'Naomi',
      address: '1600 Amphitheatre'
    };
  }])
  .directive('myCustomer', function() {
    return {
      restrict: 'E',
      templateUrl: 'my-customer.html'
    };
  });


angular.module('docsRestrictDirective', [])
  .directive('myCustomer', function() {
    return {
      restrict: 'E',
      scope: {
        customerInfo: '=info'
      },
      templateUrl: 'my-customer-iso.html'
    };
  });


function link(scope, element, attrs) { ... }

angular.module('docsTransclusionDirective', [])
  .directive('myDialog', function() {
    return {
      restrict: 'E',
      transclude: true,
      templateUrl: 'my-dialog.html'
    };
  });

 
service = $injector.get('basicService');
ctrl = $controller('MainCtrl', {$scope: $scope, basicService: service});


describe("A suite", function() {
  var foo;

  beforeEach(function() {
    foo = 0;
    foo += 1;
  });

  afterEach(function() {
    foo = 0;
  });
  it("contains spec with an expectation", function() {
    expect(foo).toEqual(1);
  });
});


// Karma configuration
// Generated on Fri May 16 2014 11:53:35 GMT+0700 (SE Asia Standard Time)

module.exports = function(config) {
  config.set({
    // base path that will be used to resolve all patterns (eg. files, exclude)
    basePath: './',
    frameworks: ['jasmine'],
    // list of files / patterns to load in the browser
    files: [
      'angular.min.js',
      'angular-mock.js',
      '*.js',
    ],
    exclude: [
      
    ],
    preprocessors: {
    
    },
    reporters: ['progress'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['Chrome'],
    singleRun: false
  });
};

npm install -g karma;

npm install -g karma-cli;

karma init my.conf.js;

karma start my.conf.js;

angular.module('moduleA', ['moduleB', 'moduleC']);


myApp.constant('planetName', 'Greasy Giant');
myApp.config(['unicornLauncherProvider', 'planetName', function(unicornLauncherProvider, planetName) {
  unicornLauncherProvider.stampText(planetName);
}]);


phonecatApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/phones', {
        templateUrl: 'partials/phone-list.html',
        controller: 'PhoneListCtrl'
      }).
      when('/phones/:phoneId', {
        templateUrl: 'partials/phone-detail.html',
        controller: 'PhoneDetailCtrl'
      }).
      otherwise({
        redirectTo: '/phones'
      });
  }]);

myApp.service('mathService', function(win) {
  this.pi = 3.14;
  this.add = function(x, y) {
    return x + y;
  }

  this.multiply = function(x, y) {
    return x * y;
  }
});


myApp.controller('MyController', function($scope, mathService) {
    $scope.sum = function(a, b) {
      return mathService(a, b);
    };
  });


myApp.controller('MyController', ['mathService', function(mathService) { ... }]);


var MyController = function(mathService) { ... };
MyController.$inject = ['mathService'];
myApp.controller('MyController', MyController);


$http({method: 'GET', url: '/someUrl'}).
  success(function(data, status, headers, config) {
    // this callback will be called asynchronously
    // when the response is available
  }).
  error(function(data, status, headers, config) {
    // called asynchronously if an error occurs
    // or server returns response with an error status.
});


myApp.controller('MyController', ['$scope', function($scope) {
    $scope.naomi = { name: 'Naomi', 
                    address: '1600 Amphitheatre' 
                  };
    

  }])