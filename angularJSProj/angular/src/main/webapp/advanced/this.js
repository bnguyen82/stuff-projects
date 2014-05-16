function myobject()
{
	this.value = 5;
}

myobject.prototype.add = function()
{
	value++;
}

var o = new myobject();
console.log(o.value); // o.value = 5
o.add();
console.log(o.value); // o.value = 6

function objectchanger(fnc)
{
	this.fnc(); // runs the function being passed in
}

objectchanger(o.add);

console.log(o.value); // sorry, still just 6