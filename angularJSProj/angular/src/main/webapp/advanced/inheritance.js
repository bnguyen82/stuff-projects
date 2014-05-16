function Foo(age) {
    this.age = age;
}

function Bar() {
    this.name = "baz"; 
}

Bar.prototype = new Foo(42); 
var b = new Bar;    
console.log(b.constructor); // "Foo". That's OK because we inherit `Foo`'s prototype.

Bar.prototype.constructor = Bar;
var b1 = new Bar;

console.log(b.constructor); // "Foo". That's OK because we inherit `Foo`'s prototype.
console.log(b.name);        // "baz". Shows that Bar() was called as constructor.
console.log(b.age);         // "42", inherited from `Foo`.

//Example 2
function Person(gender) {
	this.gender = gender;
}

Person.prototype.sayGender = function()
{
  console.log(this.gender);
};

var person1 = new Person('Male');
var genderTeller = person1.sayGender;

person1.sayGender(); // console.logs 'Male'
genderTeller(); // console.logs undefined
Person.prototype.sayGender();
Person.prototype.constructor.call(person1);

console.log(genderTeller === person1.sayGender); // console.logs true
console.log(genderTeller === Person.prototype.sayGender); // console.logs true


//Example 3 Mozila
//define the Person Class
function Person() {}

Person.prototype.walk = function(){
  alert ('I am walking!');
};
Person.prototype.sayHello = function(){
  alert ('hello');
};

// define the Student class
function Student() {
  // Call the parent constructor
  Person.call(this);
}

// inherit Person
Student.prototype = new Person();

// correct the constructor pointer because it points to Person
Student.prototype.constructor = Student;
 
// replace the sayHello method
Student.prototype.sayHello = function(){
  alert('hi, I am a student');
}

// add sayGoodBye method
Student.prototype.sayGoodBye = function(){
  alert('goodBye');
}

var student1 = new Student();
student1.sayHello();
student1.walk();
student1.sayGoodBye();

// check inheritance
alert(student1 instanceof Person); // true 
alert(student1 instanceof Student); // true

