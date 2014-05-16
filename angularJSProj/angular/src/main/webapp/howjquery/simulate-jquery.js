(function() {
  var jque = function(arg) { // core constructor
    // ensure to use the `new` operator
    if (!(this instanceof jque))
      return new jque(arg);
    // store an argument for this example
    this.myArg = arg;
    //..
  };

  // create `fn` alias to `prototype` property
  jque.fn = jque.prototype = {
    init: function () {/*...*/}
    //...
  };

  // expose the library
  window.jque = jque;
})();

// Extension:

jque.fn.myPlugin = function () {
  console.log(this.myArg);
  return this; // return `this` for chainability
};

jque("bar").myPlugin(); // alerts "bar"