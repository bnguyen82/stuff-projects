var Foo = function(age) {
    this.age = age;
}
Foo.prototype.meth = function(){
    console.log();
}
var b = new Foo(3);
var c = new Object();

console.log("");