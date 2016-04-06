'use strict';
define(['app'], function(app)
{
    app.directive('mainHeader', function() {
        return {
            restrict: 'E',
            transclude: true,
            scope: {
                "menuNavigation" : "="
            },
            controller: function($scope, $element, $location) {
                $scope.selectMenu = function(obj, sel){
                    angular.forEach(obj.main, function(v, k){
                        if(obj.main[k].key === sel.key){
                            obj.main[k].selected = true;
                        }else{
                            obj.main[k].selected = false;
                        }
                    });

                    angular.forEach(obj.user, function(v, k){
                        if(obj.user[k].key === sel.key){
                            obj.user[k].selected = true;
                        }else{
                            obj.user[k].selected = false;
                        }
                    });
                }

                $scope.init = function(){
                    var selKey = $location.url().split('/');
                    var sel = {
                        "key" : selKey[1]
                    }

                    $scope.selectMenu($scope.menuNavigation, sel);
                }

                $scope.init();
            },
            templateUrl:'views/header.html',
            replace: true
        };
    });

    app.directive('mainFooter', function() {
        return {
            restrict: 'E',
            transclude: false,
            templateUrl:'views/footer.html'
        };
    });

    app.directive('carousel', function() {
        return {
            restrict: 'E',
            transclude: true,
            templateUrl:'views/carousel.html'
        };
    });

    app.directive('sap', function() {
        return {
            restrict: 'E',
            transclude: true,
            template:'<div style="width: 100%;height: 25px;margin: 0 auto;text-align: center;padding: 70px 0">' +
                        '<img src="imgs/sap.png"/>'+
                    '</div>'
        };
    });

    app.directive('datePicker', function () {
        return {
            restrict: 'A',
            link: function (scope, element, attrs, ngModelCtrl) {
                $(element).datepicker({
                    dateFormat: 'dd MM, yy',
                    onSelect: function (date) {
                    }
                });
                element.parent().append('<i class="fa fa-calendar date-picker-calender"></i>');
            }
        };
    });

    app.directive('room', function() {
        return {
            restrict: 'AE',
            transclude: true,
            scope:{
                obj:"="
            },
            controller: function ($scope, $element, $attrs) {
            },
            templateUrl:'views/room-list-card.html'
        };
    });


});