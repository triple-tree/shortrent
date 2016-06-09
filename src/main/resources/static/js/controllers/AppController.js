angular
	.module('ngShortrent')
	.controller('AppController', ['$scope','HouseInfoService', function($scope,HouseInfoService){
	    // $scope.hello = "hello world";
	  $scope.cribs;
		HouseInfoService.getHouseInfo().success(function(data){
			$scope.cribs =  data;
		}).error(function(error){
			console.log(error);
		});

		$scope.priceInfo ={
			min: 0,
			max:1000
		};
		$scope.hello = function(){
			console.log("hello!!!");
			// $scope.showMessage = true;
		};
	}]);