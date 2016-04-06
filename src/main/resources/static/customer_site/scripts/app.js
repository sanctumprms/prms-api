define(['routs','services/dependencyResolverFor'], function(config, dependencyResolverFor)
{
    var app = angular.module('app', ['ngRoute', 'ngAnimate', 'ngResource', 'ngCookies']);

    app.config(
    [
        '$routeProvider',
        '$locationProvider',
        '$controllerProvider',
        '$compileProvider',
        '$filterProvider',
        '$provide',
        '$httpProvider',

        function($routeProvider, $locationProvider, $controllerProvider, $compileProvider, $filterProvider,
                 $provide, $httpProvider)
        {
	        app.controller = $controllerProvider.register;
	        app.directive  = $compileProvider.directive;
	        app.filter     = $filterProvider.register;
	        app.factory    = $provide.factory;
	        app.service    = $provide.service;
            
            $httpProvider.defaults.headers.post['Content-Type'] = 'application/json';
            
            if(config.routes !== undefined)
            {
                angular.forEach(config.routes, function(route, path)
                {
                    $routeProvider.when(path, {templateUrl:route.templateUrl, controller:route.controller,
                        resolve:dependencyResolverFor(route.dependencies)});
                });
            }

            if(config.defaultRoutePaths !== undefined)
            {
                $routeProvider.otherwise({redirectTo:config.defaultRoutePaths});
            }
        }
    ]);

   return app;
});