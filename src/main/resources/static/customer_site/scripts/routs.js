'use strict';
define([], function()
{
    return {
        defaultRoutePath: '/home',
        routes: {
            '/home': {
                templateUrl: 'modules/home/views/home.html',
                controller:'homeCtrl',
                dependencies: ['../modules/home/scripts/controllers/homeCtrl']
            },
            '/': {
                templateUrl: 'modules/home/views/home.html',
                controller:'homeCtrl',
                dependencies: ['../modules/home/scripts/controllers/homeCtrl']
            },
            '/about': {
                templateUrl: 'modules/about/views/about.html',
                controller:'',
                dependencies: []
            },
            '/profile': {
                templateUrl: 'modules/profile/views/profile.html',
                controller:'',
                dependencies: []
            },
            '/rooms/index': {
                templateUrl: 'modules/rooms/views/index.html',
                controller:'roomsCtrl',
                dependencies: ['../modules/rooms/scripts/controllers/roomsCtrl',
                                '../modules/rooms/scripts/directives/directive',
                                '../modules/rooms/scripts/services/services']
            },
            '/rooms/show/:id': {
                templateUrl: 'modules/rooms/views/show.html',
                controller:'',
                dependencies: ['../modules/rooms/scripts/controllers/roomsCtrl',
                    '../modules/rooms/scripts/directives/directive']
            }
        }
    };
});