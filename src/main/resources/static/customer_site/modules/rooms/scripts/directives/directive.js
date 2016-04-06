'use strict';
define(['app'], function(app){
    app.directive('menuFilter', function() {
        return {
            restrict: 'E',
            transclude: true,
            scope: {

            },
            controller: function($scope, $element) {

            },
            templateUrl:'modules/rooms/views/menu-filter.html',
            replace: true
        };
    });
    app.directive('filter', function() {
        return {
            restrict: 'E',
            transclude: true,
            scope: {

            },
            controller: function($scope, $element) {

            },
            templateUrl:'modules/rooms/views/filter.html',
            replace: true
        };
    });
});

