var title = "Nguyen";
var dog = (function(){
  var name = "Bun";
  var noise = function(){
    console.log(name + " Gau Gau");
  };
  
  return {
     name: name, 
     action: noise
  }
})();
exports.dog = dog;
exports.title = title;