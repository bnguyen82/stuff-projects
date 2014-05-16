
function PhoneService($http, $location){
   this.http = $http;
   this.location = $location;
}
PhoneService.prototype.getJson = function(fnSuccess){
   var self = this;
   self.http.get("data/phones.json").success(function(data,status, headers, config){
	    fnSuccess.call(self, data);
  });
};
PhoneService.prototype.gotoPage = function(path){
	$location.path(path);
};