todoApp.controller('LoginCtrl', function($scope, $state, $stateParams, authManager, $timeout, $ionicModal, Projects, $ionicSideMenuDelegate) {
	console.log('Hello Bao');
	
	$scope.login = function(){
		
	};
	$scope.logout = function(){
		//authManager.logout();
		var clientRef = new Firebase("https://fiery-fire-2200.firebaseio.com/client");
		clientRef.update({hanguyen: {first : 'Fred', last : 'Swanson'}});
		console.log(clientRef.child('avaxnguyen'));
	};
	$scope.register = function(){
		$state.goTo('register');
	};
	
	$scope.loginGoogle = function(){
		authManager.login('google');
	};
	
	$scope.doRegister = function(){
		var clientRef = new Firebase("https://fiery-fire-2200.firebaseio.com/client");
		clientRef.update({first : 'Fred', last : 'Swanson'});
	};
})

.controller('PollListCtrl', function($scope, $state, $stateParams, authManager, $timeout, $ionicModal, Projects, $ionicSideMenuDelegate) {
	console.log('Hello Bao');
	$scope.poll = {};
	$scope.pollList = [{
				title: "Best IDE",
				type: true
			},
			{
				title: "Dinner tonight",
				type: false
			}];
	$scope.createNew = function(){
		console.log($scope.poll.title);
	};
})

.controller('TodoCtrl', function($scope, $state, $stateParams, $timeout, $ionicModal, Projects, $ionicSideMenuDelegate) {

  // A utility function for creating a new project
  // with the given projectTitle
  var createProject = function(projectTitle) {
    var newProject = Projects.newProject(projectTitle);
    $scope.projects.push(newProject);
    Projects.save($scope.projects);
    $scope.selectProject(newProject, $scope.projects.length-1);
  }

  // Load or initialize projects
  $scope.projects = Projects.all();

  // Grab the last active, or the first project
  $scope.activeProject = $scope.projects[Projects.getLastActiveIndex()];

  // Called to create a new project
  $scope.newProject = function() {
    var projectTitle = prompt('Project name');
    if(projectTitle) {
      createProject(projectTitle);
    }
  };

  // Called to select the given project
  $scope.selectProject = function(project, index) {
    $scope.activeProject = project;
    Projects.setLastActiveIndex(index);
    $ionicSideMenuDelegate.toggleLeft(false);
  };

  // Create our modal
  $ionicModal.fromTemplateUrl('views/partials/tasks/new.html', function(modal) {
    $scope.taskModal = modal;
  }, {
    scope: $scope
  });

  $scope.createTask = function(task) {
    if(!$scope.activeProject || !task) {
      return;
    }
    $scope.activeProject.tasks.push({
      title: task.title
    });
    $scope.taskModal.hide();

    // Inefficient, but save all the projects
    Projects.save($scope.projects);

    task.title = "";
  };

  $scope.newTask = function() {
    $scope.taskModal.show();
  };

  $scope.closeNewTask = function() {
    $scope.taskModal.hide();
  }

  $scope.toggleProjects = function() {
    $ionicSideMenuDelegate.toggleLeft();
  };
  
  $scope.login = function() {
	  $state.transitionTo('login');
  };


  // Try to create the first project, make sure to defer
  // this by using $timeout so everything is initialized
  // properly
  $timeout(function() {
    if($scope.projects.length == 0) {
      while(true) {
        var projectTitle = prompt('Your first project title:');
        if(projectTitle) {
          createProject(projectTitle);
          break;
        }
      }
    }
  });

});