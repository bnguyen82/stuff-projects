function Car(){
	this.name = 'Honda';
}

Car.prototype.run = function (driver){
	var self = this;
	alert("My name is " + self.name);
	alert(driver + ' is driving');
}

var civic = new Car();
console.log(civic.name);

Car.prototype.run.call(this, "Bao");

Car.prototype.run.call("Bao");

civic.run("Bao");
