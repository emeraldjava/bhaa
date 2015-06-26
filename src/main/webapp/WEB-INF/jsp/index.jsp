<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html ng-app>
    <head>
        <title>Hello AngularJS</title>

        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- jQuery -->
        <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>

        <!-- Bootstrap -->
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

        <!-- AngularJS -->
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular-route.min.js"></script>

        <!-- AngularJS -->
        <script src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.10.0.js"></script>

        <!--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>-->
        <script src="../resources/js/app.js"></script>
    </head>

    <body>
    <div ng-controller="Hello">
        <p>The ID is {{greeting.id}}</p>
        <p>The content is {{greeting.name}}</p>
    </div>

    <img src="<c:url value="/resources/images/bhaa-logo.jpg" />" />
    </body>
</html>