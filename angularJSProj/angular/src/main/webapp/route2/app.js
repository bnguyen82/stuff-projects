var app = angular.module('app', ['ui.router']);
app.config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/home')
    $stateProvider.
          state('users', 
              {url: "/users", 
        	  views: {
        		  "main": {
        			  templateUrl: "user-list.html",   
                	  controller: UserListController
        		  }
        	  }
              })
//    	  .state('users.opp', 
//    		  {url: "/opp", 
//    		  abstract: true,
//    		  template: '<ui-view/>',   
//    		  })
          .state('users.edit',
              {url: "/edit/:uid", 
        	  views: {
        		  "": {
		        	  templateUrl: "user-edit.html", 
		        	  controller: UserEditController
        		  }
        	  }
        	  })
    	  .state('users.editEs',
    			  {url: "/editEs/:uid", 
    		  views: {
    			  "": {
    				  templateUrl: "user-edit.html", 
    				  controller: UserEditController
    			  },
    			  "modal@": {
    				  templateUrl: "modal.html",
    				  controller: UserEditModalController
    			  }
    		  }
    			  })
          .state('users.add',
              {url: '/add', 
        	  templateUrl: 'user-add.html', 
        	  controller: UserAddController})
          .state('home', {
			url: "/home",
			template: "Hello World!",
			controller: function(){
				console.log("Enter Home Controller");
			}
    
    })
});
function MainCtrl(){
};
function UserListController($scope, $state){
	$scope.userList = [{
		uid: "1",
		name: "Bao"
	},
	{
		uid: "2",
		name: "Ha"
	}];
};
function UserEditController($scope, $stateParams){
	$scope.user = {uid: $stateParams.uid, name: "Bao1"};
}
function UserAddController($scope, $stateParams){
}
function UserEditModalController($scope, $stateParams){
	console.log("Enter modal controller");
}