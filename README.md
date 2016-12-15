# BHAA Registration Application

Used on race days to register runners.

## Features

A basic spring boot application with JSP for frontend screens.
Loads user data via REST API from main bhaa webserver
Uses EhCache to maintain the list of currently entered users (no DB).

### Travis CI

[![Build Status](https://travis-ci.org/emeraldjava/bhaa.svg?branch=master)](https://travis-ci.org/emeraldjava/bhaa)

### Heroku

https://dashboard.heroku.com/apps/bhaa
https://bhaa.herokuapp.com/


Autocomplete
- java endpoint to generate small xml file with details
- java writes json file to some location and includes in the jsp file
- standard ui typeahead logic
- caching of the xml file details

http://stackoverflow.com/questions/25871131/how-to-dynamically-add-static-resources-to-spring-boot-jar-application
