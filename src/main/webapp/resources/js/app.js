/**
 * Created by pauloconnell on 26/06/15.
 */
function Hello($scope, $http) {
    $http.get('http://localhost:8080/index').
        success(function(data) {
            $scope.greeting = data;
        });
}