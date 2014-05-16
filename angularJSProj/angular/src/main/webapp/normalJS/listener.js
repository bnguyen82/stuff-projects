document.querySelector('input[type="button"]').addEventListener('click', function() {
  var el = document.createElement('li');
  var id = new Date().getTime().toString();
  el.id = id;
  el.innerHTML = id;
  document.querySelector('.ct').appendChild(el);
});

document.querySelector('body').addEventListener('click', function(event) {
  if (event.target.tagName.toLowerCase() === 'li') {
    alert(event.target.id);
  }
});

//Clousure
var ob = (function(){
	var name = 'Bao';
	var fnShow = function(){
		return name;
	};
	return {
		ten : 'Good',
		show : fnShow,
		edit : function() {
			name = 'Ha';
		}
	};
})();

var name = ob.show();
ob.edit();
var name2 = ob.show();

//New object anonymos
var ob1 = new function(){
	var name = 'Bao';
	var fnShow = function(){
		return name;
	};
	this.ten = 'Good';
	this.show = fnShow;
	this.edit = function() {
			name = 'Ha';
	};
}();

var name = ob1.show();
ob1.edit();
var name2 = ob1.show();
  