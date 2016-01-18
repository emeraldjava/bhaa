The BHAA web based registration application.

- vaadin & mongo db
http://ralf.schaeftlein.de/2015/03/26/using-vaadin-ui-with-spring-boot-for-spring-data-backend-based-on-mongodb/
https://github.com/theMightyFly/demo-spring-vaadin/blob/master/src/main/java/demo/DemoApplication.java
http://spring.io/guides/gs/crud-with-vaadin/

-- Mongo DB

[12:01:23@~]$ brew install mongodb
==> Downloading https://homebrew.bintray.com/bottles/mongodb-3.2.1.yosemite.bott
######################################################################## 100.0%
==> Pouring mongodb-3.2.1.yosemite.bottle.tar.gz
==> Caveats
To reload mongodb after an upgrade:
  launchctl unload ~/Library/LaunchAgents/homebrew.mxcl.mongodb.plist
  launchctl load ~/Library/LaunchAgents/homebrew.mxcl.mongodb.plist
Or, if you don't want/need launchctl, you can just run:
  mongod --config /usr/local/etc/mongod.conf
==> Summary
🍺  /usr/local/Cellar/mongodb/3.2.1: 17 files, 208.4M

- A REST-full server

https://spring.io/guides/gs/actuator-service/
https://github.com/spinner0815/spring-data-rest-angularjs/blob/master/src/main/resources/spring/appServlet/servlet-context.xml

- Angularjs Client

http://angular-ui.github.io/

-- Caching and filtering of fullname
http://jmdobry.github.io/angular-cache/
http://stackoverflow.com/questions/20977703/filter-multiple-fields-using-single-input-in-angularjs

- Running

java -jar target/myproject-0.0.1-SNAPSHOT.jar
mvn spring-boot:run
mvn tomcat:run

- Spring boot and compiling JSP seems to be an issue
https://github.com/kamoor/spring-boot-sample
http://stackoverflow.com/questions/20602010/jsp-file-not-rendering-in-spring-boot-web-application
https://github.com/spring-projects/spring-boot/tree/v1.1.8.RELEASE/spring-boot-samples/spring-boot-sample-web-jsp

http://stackoverflow.com/questions/1483063/spring-mvc-3-and-handling-static-content-am-i-missing-something