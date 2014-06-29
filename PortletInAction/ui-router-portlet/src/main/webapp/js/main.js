(function(Liferay, angular) {
	angular.portlet.add("portlet-portlet", "poc-angular-portlet",
		function() {
			var myModule = angular.module("myModule", ['ui.router']);
			
			myModule.config(function($stateProvider, $urlRouterProvider) {
			    
			    
			    
			    $stateProvider
			        
			        // HOME STATES AND NESTED VIEWS ========================================
			        .state('home', {
			            url: '/home',
			            templateUrl: '/portlet-portlet/partial-home.html'
			        })
			        
			        // nested list with custom controller
			        .state('home.list', {
			            url: '/list',
			            templateUrl: '/portlet-portlet/partial-home-list.html',
			            controller: function($scope) {
			                $scope.dogs = ['Bernese', 'Husky', 'Goldendoodle'];
			            }
			        })
			        
			        // nested list with just some random string data
			        .state('home.paragraph', {
			            url: '/paragraph',
			            template: 'I could sure use a drink right now.'
			        })
			        
			        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
			        .state('about', {
			            url: '/about',
			            views: {
			                '': { templateUrl: '/portlet-portlet/partial-about.html' },
			                'columnOne@about': { template: 'Look I am a column!' },
			                'columnTwo@about': { 
			                    templateUrl: '/portlet-portlet/table-data.html',
			                    controller: 'scotchController'
			                }
			            }
			            
			        });
			        
			});
			
			myModule.controller('scotchController', function($scope) {
			    
			    $scope.message = 'test';
			   
			    $scope.scotches = [
			        {
			            name: 'Macallan 12',
			            price: 50
			        },
			        {
			            name: 'Chivas Regal Royal Salute',
			            price: 10000
			        },
			        {
			            name: 'Glenfiddich 1937',
			            price: 20000
			        }
			    ];
			    
			});
			
			
//			Basic controllers
			myModule.controller("MyController", function($scope) {
				$scope.mythings = [ {
					name : "Thing 1"
				}, {
					name : "Thing 2",
				} ];

				$scope.add = function() {
					$scope.mythings.push({name: $scope.newThing.name});
				};

				$scope.remove = function(index) {
					$scope.mythings.splice(index, 1);
				};
			});
			myModule.controller("MyCounter", function($scope) {
				$scope.counter = 1;

				$scope.decrease = function() {
					if ($scope.counter > 0) {
						$scope.counter--;
					}
				};

				$scope.increase = function(index) {
					if ($scope.counter < 100) {
						$scope.counter++;
					}
				};
			});	
			myModule.controller("CurrentURL", function($scope) {
				$scope.Liferay = Liferay;
				
			});	
			return [ myModule.name ];
		});
})(Liferay, angular);