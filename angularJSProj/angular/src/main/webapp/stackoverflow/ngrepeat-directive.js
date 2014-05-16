var myApp = angular.module('myApp', []);

function AppCtrl($scope) {
    $scope.itemList = [{
        addressTypes: [{
            name: 'add1',
            addressType: 'Business'
        }, {
            name: 'add2',
            addressType: 'Non Business'
        },{
            name: 'add3',
            addressType: 'Non Business'
        }]
    },
    {
        addressTypes: [{
            name: 'add1',
            addressType: 'Business'
        }, {
            name: 'add2',
            addressType: 'Non Business'
        },{
            name: 'add3',
            addressType: 'Non Business'
        }]
    }];

    $scope.toggleAFlag = function (addressType) {
        if (addressType.addressType == 'Business'){
//        	addressType.AFlag = true;
        	$scope.AFlag = true;
        } else {
//            addressType.AFlag = false;
        	$scope.AFlag = false;
        }
    };
}

myApp.directive('myDirective', function () {
    return {
        require: '?ngModel',
        link: function (scope, element, attrs, model) {
//            scope.$watch(function (oldV, newV) {
//                if(scope.addressType !== undefined)
//                    console.log(scope.addressType.AFlag)
//            })
			attrs.$observe('customAttr',function(value){
			     console.log('multi',attrs.customAttr);
			   },true);

        }
    };
});