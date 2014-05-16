ns=require("./namespace");

ns.namespace('my.package1', function(){
    // not bad
    var badPublic = 'its bad public variable';

    // the same class
    function MyClass(){
        this.myMethod = function(){
            alert('Hello world!');
        }
    }

    // turn public MyClass
    return { MyClass: MyClass };
});
var MyClass = my.package1.MyClass;
var myClass = new MyClass();
myClass.myMethod();
