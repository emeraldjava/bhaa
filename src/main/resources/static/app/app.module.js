/**
 * Created by pauloconnell on 26/06/15.
 */
//angular.module('bhaaWebApp',['ui.bootstrap']);

angular.module('app',['ui.bootstrap','service','ngRoute'])
    .controller('memberTypeaheadCtrl', function($scope, $http) {
        var _selected;

        //$http.get('./js/bhaa_members.js').success(function(data) {
        //    $scope.runners = data;
        //});
        //$scope.runners=[{"id":"dard":"19"}];

        $scope.runners=window.bhaa_members;
    })
    .controller('tabsDemoCtrl', function ($scope, $window) {
        $scope.tabs = [
            { title:'Dynamic Title 1', content:'Dynamic content 1' },
            { title:'Dynamic Title 2', content:'Dynamic content 2', disabled: true }
        ];

        $scope.alertMe = function() {
            setTimeout(function() {
                $window.alert('You selected the alert tab!');
            });
        };
    })
    .controller('home', function($scope) {
        $scope.greeting = {id: 'xxx', content: 'Hello World!'}
    })
    .controller('InvoiceController', ['currencyConverter', function(currencyConverter) {
        this.qty = 1;
        this.cost = 2;
        this.inCurr = 'EUR';
        this.currencies = currencyConverter.currencies;

        this.total = function total(outCurr) {
            return currencyConverter.convert(this.qty * this.cost, this.inCurr, outCurr);
        };
        this.pay = function pay() {
            window.alert("Thanks!");
        };
    }]);

//function Hello($scope, $http) {
//    $http.get('http://localhost:8080/api/runners').
//        success(function(data) {
//            $scope.greeting = data;
//        });
//}