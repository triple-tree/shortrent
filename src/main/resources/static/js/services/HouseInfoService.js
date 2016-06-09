angular
	.module('ngShortrent')
	.factory('HouseInfoService', ['$http', function($http){
		function getHouseInfo(){
			return $http.get("/data/data.json");
		};

		return {
			getHouseInfo: getHouseInfo
		}
	}])