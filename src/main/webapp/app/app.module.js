/**
 * Created by pauloconnell on 26/06/15.
 */
angular.module('bhaaWebApp', ['ui.bootstrap']);

angular.module('bhaaWebApp').controller('TabsDemoCtrl', function ($scope, $window) {
    $scope.tabs = [
        { title:'Dynamic Title 1', content:'Dynamic content 1' },
        { title:'Dynamic Title 2', content:'Dynamic content 2', disabled: true }
    ];

    $scope.alertMe = function() {
        setTimeout(function() {
            $window.alert('You\'ve selected the alert tab!');
        });
    };
});


function Hello($scope, $http) {
    $http.get('http://localhost:8080/rest').
        success(function(data) {
            $scope.greeting = data;
        });
}