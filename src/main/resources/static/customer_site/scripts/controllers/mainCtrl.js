'use strict';
define(['app'], function(app){
    app.controller('mainCtrl',function($scope, $location) {

        $scope.menuConfig = {
            "main":[],
            "user":[]
        }

        $scope.menuConfig.user = [
            {
                "name": "Notifications",
                "key":"notifications",
                "class":"fa fa-bell",
                "url":"#/notifications",
                "selected": false
           },{
                "name": "Mail",
                "key":"mail",
                "class":"fa fa-envelope",
                "url":"#/mail",
                "selected": false
           },{
                "name": "Profile",
                "key":"profile",
                "class":"fa fa-user",
                "url":"#/profile",
                "selected": false
           }
        ]


       $scope.menuConfig.main = [{
                "name": "Home",
                "key":"home",
                "url":"/#/home",
                "selected": true
           },{
                "name": "About",
                "key":"about",
                "url":"/#/about",
                "selected": false
           },{
                "name": "Rooms",
                "key":"rooms",
                "url":"#/rooms/index",
                "selected": false
           },{
                "name": "Restaurant",
                "key":"restaurants",
                "url":"#/restaurants/index",
                "selected": false
           },{
                "name": "Gallery",
                "key":"gallery",
                "url":"#/gallery",
                "selected": false
           },{
                "name": "Contact",
                "key":"contact",
                "url":"#/contact",
                "selected": false
           }]

        $scope.selectMenuOnLoad = function(){
            var path = $location.path().split('/')[1];
            angular.forEach($scope.menuConfig, function(v, k){
                if(v.key === path){
                    $scope.menuConfig[k].selected = true;
                }else{
                    $scope.menuConfig[k].selected = false;
                }
            });
        }

        $scope.$on('$routeChangeSuccess', function(next, current) {
            $scope.selectMenuOnLoad()
        });
    });
});