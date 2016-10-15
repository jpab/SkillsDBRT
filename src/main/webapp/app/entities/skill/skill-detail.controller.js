(function() {
    'use strict';

    angular
        .module('skillsDbrtApp')
        .controller('SkillDetailController', SkillDetailController);

    SkillDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Skill', 'Project'];

    function SkillDetailController($scope, $rootScope, $stateParams, previousState, entity, Skill, Project) {
        var vm = this;

        vm.skill = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('skillsDbrtApp:skillUpdate', function(event, result) {
            vm.skill = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
