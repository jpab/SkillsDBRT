(function() {
    'use strict';

    angular
        .module('skillsDbrtApp')
        .controller('SkillDialogController', SkillDialogController);

    SkillDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'Skill', 'Project'];

    function SkillDialogController ($timeout, $scope, $stateParams, $uibModalInstance, entity, Skill, Project) {
        var vm = this;

        vm.skill = entity;
        vm.clear = clear;
        vm.save = save;
        vm.projects = Project.query();

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.skill.id !== null) {
                Skill.update(vm.skill, onSaveSuccess, onSaveError);
            } else {
                Skill.save(vm.skill, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('skillsDbrtApp:skillUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }


    }
})();
