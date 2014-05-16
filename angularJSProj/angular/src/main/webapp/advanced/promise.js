function PromiseCtrl($scope, myService){
	function addAsync(a, b) {
	    var deferred = myService.$q.defer();
	    // Wait 2 seconds and then add a + b
	    setTimeout(function() {
	        deferred.resolve(a + b);
	    }, 2000);
	    return deferred.promise;
	};
	
	myService.$q.all([
	    addAsync(1, 1),
	    addAsync(2, 2),
	    addAsync(3, 3)
	]).then(function(result1, result2, result3) {
	    console.log(result1 + result2 + result3);
	});
	
	addAsync(3, 4).then(function(result) {
	    console.log(result);
	});
}