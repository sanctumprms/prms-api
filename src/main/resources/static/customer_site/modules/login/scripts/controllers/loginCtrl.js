'use strict';
define(['app'], function(app){
    app.controller('loginCtrl',function($scope, $cookies, $location){
        $scope.user = '';
        $scope.pass = '';

        function onLoginSuccess() {
            $scope.$parent.message = '';
            $location.path('/home');
            $scope.loading = false;
        }

        function onLoginFailed() {
            $scope.$parent.message = 'invalid credentials';
            $scope.loading = false;
        }

        $scope.submit = function () {
            $scope.$parent.message = 'loading...';
            $scope.loading = true;

            auth.signin({
                connection: 'Username-Password-Authentication',
                username: $scope.user,
                password: $scope.pass,
                authParams: {
                    scope: 'openid name email'
                }
            }, onLoginSuccess, onLoginFailed);
        };

        $scope.doGoogleAuthWithPopup = function () {
            $scope.$parent.message = 'loading...';
            $scope.loading = true;

            auth.signin({
                popup: true,
                connection: 'google-oauth2',
                scope: 'openid name email'
            }, onLoginSuccess, onLoginFailed);
        };
    });
});