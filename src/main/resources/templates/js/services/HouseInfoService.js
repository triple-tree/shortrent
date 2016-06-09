angular
	.module('ngShortrent')
	.factory('HouseInfoService', ['$http', function($http){
		function getHouseInfo(){
			return $http.get("/shortrent/data/data.json");
		};

		return {
			getHouseInfo: getHouseInfo
		}
	}])