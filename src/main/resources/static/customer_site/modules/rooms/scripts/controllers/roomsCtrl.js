'use strict';
define(['app'], function(app)
{
    app.controller('roomsCtrl',
        function($scope, $location,rooms)
        {

        	/*Variable*/
        	$scope.rooms = undefined;


        	/*Function for processing*/
            $scope.getRooms = function(){
            	rooms.get(function(data){
            		$scope.rooms = data;
            	}, function(error){
					$scope.rooms = error;
            	})

            	console.debug($scope.rooms);
            }

            /*Initial function calls*/
            $scope.init = function(){
				$scope.getRooms();
            }

            $scope.init();
        }
    );
});