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
 /*  .factory('authManager', ['firebaseRef', '$firebaseSimpleLogin', 'authScopeUtil', 'authProviders', '$rootScope', function(firebaseRef, $firebaseSimpleLogin, authScopeUtil, authProviders, $rootScope) {
      var auth = $firebaseSimpleLogin(firebaseRef());
      var providers = {};
      angular.forEach(authProviders, function(p) {
         providers[p.id] = angular.extend({preferred: false}, p);
      });

      // provide some convenience wrappers on $firebaseSimpleLogin so it's easy to extend behavior and isolate upgrades
      var inst = {
         login: function(providerId) {
            auth.$login(providerId, { rememberMe: true, scope: 'email'});
         },

         logout: function() {
            $rootScope.$broadcast('authManager:beforeLogout', auth);
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
   }]);*/