//Method 1
function loadList(url){
	var items = undefined;
	//Asynchronous call
	ajax.get(url, function(data) {
	 	items = data;
	 	processList(data);
	});
	
	//Execution may jump to below before results are retrieved
	if (items != undefined){
		renderList(items);
		alert("Retrieve " item.length + "items");
	}
	else{
		alert("Can't retrieve list");
	}
}

loadList('user/list');

function processList(data) {
 	///do something
}
function renderList(data) {
 	///do something else
}





//##############################
//Method 2
function loadList_2(url, fnSuccess){
	ajax.get(url, function (data) {
	 	self.processList(data);
	 	if (fnSuccess != undefined){
	 		fnSuccess.call(this, data);
	 	}
	});
}

loadList_2(url, function(items) {
	renderList(items);
	alert("Retrieve " item.length + "items")
})

loadList_2(url);


