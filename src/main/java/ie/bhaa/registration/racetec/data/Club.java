package ie.bhaa.registration.racetec.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

@Entity
@Table(schema = "dbo")
public class Club {

    @Id
    @Column(name="ClubId")
    private long clubId;
    @Column(name="ClubCode")
    private String clubCode;// VARCHAR(10) NOT NULL,
    @Column(name="ClubName")
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
    @Column(name="IsActive", nullable = false, columnDefinition = "TINYINT", length = 1)
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
