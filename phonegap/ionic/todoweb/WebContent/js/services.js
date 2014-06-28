/**
 * The Projects factory handles saving and loading projects
 * from local storage, and also lets us save and load the
 * last active project index.
 */
todoApp.factory('Projects', function() {
  return {
    all: function() {
      var projectString = window.localStorage['projects'];
      if(projectString) {
        return angular.fromJson(projectString);
      }
      return [];
    },
    save: function(projects) {
      window.localStorage['projects'] = angular.toJson(projects);
    },
    newProject: function(projectTitle) {
      // Add a new project
      return {
        title: projectTitle,
        tasks: []
      };
    },
    getLastActiveIndex: function() {
      return parseInt(window.localStorage['lastActiveProject']) || 0;
    },
    setLastActiveIndex: function(index) {
      window.localStorage['lastActiveProject'] = index;
    }
  }
})
   /**
    * A service that authenticates against Fireabase using simple login
    */
   .factory('authManager', ['firebaseRef', '$firebaseSimpleLogin', 'authScopeUtil', 'authProviders', '$rootScope', function(firebaseRef, $firebaseSimpleLogin, authScopeUtil, authProviders, $rootScope) {
      var auth = $firebaseSimpleLogin(firebaseRef());
      var providers = {};
      angular.forEach(authProviders, function(p) {
         providers[p.id] = angular.extend({preferred: false}, p);
      });

      // provide some convenience wrappers on $firebaseSimpleLogin so it's easy to extend behavior and isolate upgrades
      var inst = {
         login: function(providerId) {
            auth.$login(providerId, { rememberMe: false, scope: 'email'});
         },

         logout: function() {
//            $rootScope.$broadcast('authManager:beforeLogout', auth);//baonht : for feeds function???
            auth.$logout();
         },

         getProviders: function() {
            return providers;
         },

         setPreferred: function(newProvider) {
            angular.forEach(providers, function(p, k) {
            	p.preferred = (k === newProvider)
            });
         },

         addToScope: function($scope) {
            authScopeUtil($scope);
            $scope.login = inst.login;
            $scope.logout = inst.logout;
            $scope.providers = providers;
         }
      };

      return inst;
   }])
	
   /**
    * A simple utility to monitor changes to authentication and set some values in scope for use in bindings/directives/etc
    */
   .factory('authScopeUtil', ['$log', 'updateScope', 'localStorage', '$location', function($log, updateScope, localStorage, $location) {
      return function($scope) {
         $scope.auth = {
            authenticated: false,
            user: null,
            name: null,
            provider: localStorage.get('authProvider')
         };

         $scope.$on('$firebaseSimpleLogin:login', _loggedIn);
         $scope.$on('$firebaseSimpleLogin:error', function(err) {
            $log.error(err);
            _loggedOut();
         });
         $scope.$on('$firebaseSimpleLogin:logout', _loggedOut);

         function parseName(user) {
            switch(user.provider) {
               case 'persona':
                  return (user.id||'').replace(',', '.');
               default:
                  return user.id;
            }
         }

         function _loggedIn(evt, user) {
            localStorage.set('authProvider', user.provider);
            $scope.auth = {
               authenticated: true,
               user: user.id,
               name: parseName(user),
               provider: user.provider
            };
            updateScope($scope, 'auth', $scope.auth, function() {
            	$location.path('/poll/list');
            	/*//baonht 
            	if( !($location.path()||'').match('/hearth') ) {
                  $location.path('/hearth');
               }
               */
            });
         }

         function _loggedOut() {
            $scope.auth = {
               authenticated: false,
               user: null,
               name: null,
               provider: $scope.auth && $scope.auth.provider
            };
            updateScope($scope, 'auth', $scope.auth, function() {
            	//baonht 
               //$location.search('feed', null);
               $location.path('/login');
               
            });
         }
      }
   }])
   
	.factory('updateScope', ['$timeout', '$parse', function($timeout, $parse) {
	    return function(scope, name, val, cb) {
	       $timeout(function() {
	          $parse(name).assign(scope, val);
	          cb && cb();
	       });
	    }
	}])
	
	   /**
    * A utility to store variables in local storage, with a fallback to cookies if localStorage isn't supported.
    */
   .factory('localStorage', ['$log', function($log) {
      //todo should handle booleans and integers more intelligently?
      var loc = {
         /**
          * @param {string} key
          * @param value  objects are converted to json strings, undefined is converted to null (removed)
          * @returns {localStorage}
          */
         set: function(key, value) {
//               $log.debug('localStorage.set', key, value);
            var undefined;
            if( value === undefined || value === null ) {
               // storing a null value returns "null" (a string) when get is called later
               // so to make it actually null, just remove it, which returns null
               loc.remove(key);
            }
            else {
               value = angular.toJson(value);
               if( typeof(localStorage) === 'undefined' ) {
                  cookie(key, value);
               }
               else {
                  localStorage.setItem(key, value);
               }
            }
            return loc;
         },
         /**
          * @param {string} key
          * @returns {*} the value or null if not found
          */
         get: function(key) {
            var v = null;
            if( typeof(localStorage) === 'undefined' ) {
               v = cookie(key);
            }
            else {
               //todo should reconstitute json values upon retrieval
               v = localStorage.getItem(key);
            }
            return angular.fromJson(v);
         },
         /**
          * @param {string} key
          * @returns {localStorage}
          */
         remove: function(key) {
            if( typeof(localStorage) === 'undefined' ) {
               cookie(key, null);
            }
            else {
               localStorage.removeItem(key);
            }
            return loc;
         }
      };

      //debug just a temporary tool for debugging and testing
      angular.resetLocalStorage = function() {
         $log.info('resetting localStorage values');
         _.each(['authUser', 'authProvider', 'sortBy'], loc.remove);
      };

      return loc;
   }])