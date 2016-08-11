The BHAA web based registration application.

http://alexo.github.io/wro4j/
https://spring.io/blog/2015/01/12/spring-and-angular-js-a-secure-single-page-application
https://spring.io/blog/2015/08/19/migrating-a-spring-web-mvc-application-from-jsp-to-angularjs

# MVP
https://github.com/sockeqwe/Vaadin-MVP-Lite/wiki/Model-View-Presenter:-Using-MVP-Lite
https://vaadin.com/web/magi/home/-/blogs/model-view-presenter-pattern-with-vaadin
https://vaadin.com/blog/-/blogs/is-mvp-a-best-practice-
https://nirajrules.wordpress.com/2009/07/18/mvc-vs-mvp-vs-mvvm/

# Vaadin & mongo db
http://ralf.schaeftlein.de/2015/03/26/using-vaadin-ui-with-spring-boot-for-spring-data-backend-based-on-mongodb/
https://github.com/theMightyFly/demo-spring-vaadin/blob/master/src/main/java/demo/DemoApplication.java
http://spring.io/guides/gs/crud-with-vaadin/

# Mongo DB

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

racetec
data
Athlete

package ie.bhaa.domain.racetec.data;

import org.springframework.data.annotation.Id;

public class Athlete {
	
	@Id
    private long athleteId;
    private String firstName;
    private String lastName;
    
    public Athlete(){
    	
    }
    
    public Athlete(long athleteId, String firstName, String lastName) {
		this.athleteId = athleteId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
	public long getAthleteId() {
		return athleteId;
	}
	public void setAthleteId(long athleteId) {
		this.athleteId = athleteId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Athlete [athleteId=").append(athleteId)
				.append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append("]");
		return builder.toString();
	}
    
    

}

Club

package ie.bhaa.domain.racetec.data;

import org.springframework.data.annotation.Id;

/**
 * Created by pauloconnell on 28/06/15.
 *
 * CREATE TABLE Club
 (
 ClubId SMALLINT PRIMARY KEY NOT NULL,
 ClubCode VARCHAR(10) NOT NULL,
 ClubName VARCHAR(100),
 CountryId SMALLINT,
 StateId SMALLINT,
 ContactName VARCHAR(50),
 Address1 VARCHAR(50),
 Address2 VARCHAR(50),
 Address3 VARCHAR(50),
 Address4 VARCHAR(50),
 AddressPostalCode VARCHAR(20),
 PhoneHome VARCHAR(20),
 PhoneWork VARCHAR(20),
 PhoneFax VARCHAR(20),
 PhoneCell VARCHAR(20),
 EMail VARCHAR(50),
 WebSite VARCHAR(100),
 IsActive BIT NOT NULL,
 ReplStatus TINYINT
 );
 CREATE UNIQUE INDEX UIDX_ClubName ON Club (ClubName);
 */

public class Club {

    @Id
    private long clubId;
    private String clubCode;// VARCHAR(10) NOT NULL,
    private String clubName;// VARCHAR(100),
    //CountryId SMALLINT,
    //StateId SMALLINT,
    //ContactName VARCHAR(50),
    //Address1 VARCHAR(50),
    //Address2 VARCHAR(50),
    //Address3 VARCHAR(50),
    //Address4 VARCHAR(50),
    //AddressPostalCode VARCHAR(20),
    //PhoneHome VARCHAR(20),
    //PhoneWork VARCHAR(20),
    //PhoneFax VARCHAR(20),
    //PhoneCell VARCHAR(20),
    //EMail VARCHAR(50),
    //WebSite VARCHAR(100),
    private boolean isActive; //BIT NOT NULL,
    //ReplStatus TINYINT

    public Club(){}

    public Club(long clubId, String clubCode, String clubName, boolean isActive) {
        this.clubId = clubId;
        this.clubCode = clubCode;
        this.clubName = clubName;
        this.isActive = isActive;
    }

    public long getClubId() {
        return clubId;
    }

    public void setClubId(long clubId) {
        this.clubId = clubId;
    }

    public String getClubCode() {
        return clubCode;
    }

    public void setClubCode(String clubCode) {
        this.clubCode = clubCode;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Club club = (Club) o;

        return clubId == club.clubId;

    }

    @Override
    public int hashCode() {
        return (int) (clubId ^ (clubId >>> 32));
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", clubCode='" + clubCode + '\'' +
                ", clubName='" + clubName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}


domain
Runner

package ie.bhaa.domain.racetec.domain;

/**
 * Created by pauloconnell on 26/06/15.
 */
public class Runner {
    private final long id;
    private final String name;

    public Runner(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


repository
RacetecJpaController

package ie.bhaa.domain.racetec;


import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by pauloconnell on 16/07/15.
 */
//@Configuration
//@EnableJpaRepositories(basePackages = "ie.bhaa.domain.racetec.repository")
//@EntityScan(basePackages = "ie.bhaa.domain.racetec.data")
public class RacetecJpaController {

    //
    @Bean
    @ConfigurationProperties(prefix = "datasource.sqlserver")
    public DataSource postgresDataSource() {
        return DataSourceBuilder.create().build();
    }
}



repository
UserRepository

package ie.bhaa.domain.wordpress.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ie.bhaa.domain.racetec.data.Club;


/**
 * Created by pauloconnell on 16/07/15.
 */
public interface UserRepository extends MongoRepository<Club, Long> {

    //List<User> findByLastName(String lastName);
}



Runner

package ie.bhaa.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by pauloconnell on 17/01/16.
 */
@Document(collection = "runner")
public class Runner {

    @Id
    Long id;
    String firstname;
    String lastname;
}

RunnerRepository

package ie.bhaa.domain;

import ie.bhaa.domain.racetec.data.Club;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pauloconnell on 17/01/16.
 * http://ralf.schaeftlein.de/2015/03/26/using-vaadin-ui-with-spring-boot-for-spring-data-backend-based-on-mongodb/
 */
public interface RunnerRepository extends MongoRepository<Runner, Long> {

    Runner findByFirstName(String firstname);
}
 