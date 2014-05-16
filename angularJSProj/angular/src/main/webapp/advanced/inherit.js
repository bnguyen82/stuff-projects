function Foo(){
	this.a = 3;
	this.ob = {id: 8};
};

Foo.prototype.b = 4;

var c = new Foo();

c.a = 8;

Foo.prototype.b = 5;

c.ob.id = 9;