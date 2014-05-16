var foo = (function(){
 
	// Create a private variable
	var name = "Spock";
 
	// Create a private function
	var greeting = function() {
		return "Hello " + name;
	};
 
	// Return an object that exposes our greeting function publicly
	return {
		greeting: greeting
	};
 
})();

console.log( foo.greeting());