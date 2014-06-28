// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
var todoApp = angular.module('todo', ['ionic', 'firebase.utils'])
.constant('FIREBASE_URL', 'https://fiery-fire-2200.firebaseio.com/')
.constant('loginRedirectPath', '/login')
.constant('authProviders', [
  { id: 'persona',  name: 'Persona',  icon: 'icon-user'     },
  { id: 'twitter',  name: 'Twitter',  icon: 'icon-twitter'  },
  { id: 'facebook', name: 'Facebook', icon: 'icon-facebook' },
  { id: 'github',   name: 'GitHub',   icon: 'icon-github'   },
  { id: 'google',   name: 'Google',   icon: 'icon-google'   }
//         { id: 'email',    name: 'Email',    icon: 'icon-envelope' }
])

.run(function($ionicPlatform) {
  $ionicPlatform.ready(function() {
    // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
    // for form inputs)
    if(window.cordova && window.cordova.plugins.Keyboard) {
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
    }
    if(window.StatusBar) {
      StatusBar.styleDefault();
    }
  });
})

  /** AUTHENTICATION
   ***************/
  .run(['$rootScope', 'authManager', function($rootScope, authManager) {
     authManager.addToScope($rootScope);
  }])

.config(function($stateProvider, $urlRouterProvider) {
  $stateProvider
	  .state('login', {
		  url: '/login',
		  views: {
			  'main': {
				  templateUrl: 'views/login.html',
				  controller: 'LoginCtrl'
			  }
		  }
	  })
	  .state('register', {
		  url: '/register',
		  views: {
			  'main': {
				  templateUrl: 'views/register.html',
				  controller: 'LoginCtrl'
			  }
		  }
	  })
	  .state('poll', {
		  url: '/poll',
		  abstract: true,
		  templateUrl: 'views/partials/polls/polls.html'
	  })
	  .state('poll.list', {
		  url: '/poll/list',
		  views: {
			 'main': {
				  templateUrl: 'views/partials/polls/list.html',
				  controller: 'PollListCtrl'
			  }
		  }
	  })

  // if none of the above states are matched, use this as the fallback
  $urlRouterProvider.otherwise('/login');

})
