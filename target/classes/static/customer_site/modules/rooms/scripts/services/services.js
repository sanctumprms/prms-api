'use strict';
define(['app'], function(app){
    app.factory('rooms', ['$resource',
        function($resource){
            return $resource('modules/rooms/jsons/rooms.json', {}, {
            get: {method:'GET', params:{}, isArray:true}
        });
    }]);
});
