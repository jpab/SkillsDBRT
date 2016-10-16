/*
(function() {
    'use strict';
    angular
        .module('skillsDbrtApp')
        .factory('Skill', Skill);

    Skill.$inject = ['$resource'];

        function ProjectSkills ($resource) {
            var resourceUrl =  'api/skills/project/:id';

            return $resource(resourceUrl, {}, {
                'get': {
                    method: 'GET',
                    transformResponse: function (data) {
                        if (data) {
                            data = angular.fromJson(data);
                        }
                        return data;
                    }, isArray: true
                }
            });
        }
})();

*/
