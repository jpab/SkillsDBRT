(function() {
    'use strict';

    angular
        .module('skillsDbrtApp')
        .controller('HomeController', ProjectController);

    ProjectController.$inject = ['$scope', '$state', 'Project', 'Skill'];

    function ProjectController ($scope, $state, Project, Skill) {
        var vm = this;

        vm.projects = [];
        vm.skills = [];
        loadAllP();
        loadAllS();

        function loadAllP() {
            Project.query(function(result) {
                vm.projects = result;
            });
        }
        function loadAllS() {
            ProjectSkills.get({id:1},function(result) {
                vm.skills = result;
                    });
                }
    }
})();


/*(function() {
    'use strict';

    angular
        .module('skillsDbrtApp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$scope', 'Principal', 'LoginService', '$state'];

    function HomeController ($scope, Principal, LoginService, $state) {
        var vm = this;

        vm.account = null;
        vm.isAuthenticated = null;
        vm.login = LoginService.open;
        vm.register = register;
        $scope.$on('authenticationSuccess', function() {
            getAccount();
        });

        getAccount();

        function getAccount() {
            Principal.identity().then(function(account) {
                vm.account = account;
                vm.isAuthenticated = Principal.isAuthenticated;
            });
        }
        function register () {
            $state.go('register');
        }
    }
})();
*/
