# BHAA Registration Application

Used on race days to register runners.

## Features

A basic spring boot application with JSP for frontend screens.
Loads user data via REST API from main bhaa webserver
Uses EhCache to maintain the list of currently entered users (no DB).

### Travis CI

[![Build Status](https://travis-ci.org/emeraldjava/bhaa.svg?branch=master)](https://travis-ci.org/emeraldjava/bhaa)

### Code Coverage

[![codecov](https://codecov.io/gh/emeraldjava/bhaa/branch/master/graph/badge.svg)](https://codecov.io/gh/emeraldjava/bhaa)

### Heroku

https://dashboard.heroku.com/apps/bhaa
https://bhaa.herokuapp.com/

https://lima.codeclimate.com/github/emeraldjava/bhaa

https://github.com/webjars/bootstrap-3-typeahead
https://github.com/BlackrockDigital/startbootstrap-grayscale


Autocomplete
- java endpoint to generate small xml file with details
- java writes json file to some location and includes in the jsp file
- standard ui typeahead logic
- caching of the xml file details

http://stackoverflow.com/questions/25871131/how-to-dynamically-add-static-resources-to-spring-boot-jar-application

## REST API

https://github.com/georgestephanis/application-passwords

 Your new password for bhaa-registration-application is: souu f0od bheo VQl5 ESW6 pMye	

Be sure to save this in a safe location. You will not be able to retrieve it.


echo -n "webmaster:Pqov Lud4 un5L 0LPY 4OQV hbcu" | base64 -> d2VibWFzdGVyOnNvdXUgZjBvZCBiaGVvIFZRbDUgRVNXNiBwTXll


curl --header "Authorization: Basic d2VibWFzdGVyOnNvdXUgZjBvZCBiaGVvIFZRbDUgRVNXNiBwTXll" -X GET https://bhaa.ie/wp-json/wp/v2/posts

https://github.com/Afrozaar/wp-api-v2-client-java

spring rest template

http://stackoverflow.com/questions/23207928/how-to-use-resttemplate-with-basic-auth

http://stackoverflow.com/questions/32082922/restrict-access-to-wordpress-rest-api

http://stackoverflow.com/questions/36470998/cant-authenticate-with-basic-authentication-using-wp-rest-api-2-0-plugin?rq=1

function no_valid_user_no_rest($user) {
    if (!$user) {
        add_filter('rest_enabled', '__return_false');
        add_filter('rest_jsonp_enabled', '__return_false');
    }
    return $user;
}
add_filter('determine_current_user', 'no_valid_user_no_rest', 50);