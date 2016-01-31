package ie.bhaa.registration.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by pauloconnell on 26/06/15.
 */
public class Runner implements Serializable, Cloneable {

    @Id
    private String id;
    private Long bhaaId;
    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String email = "";
    private Date birthDate;

    public Runner() {
    }

    public Runner(Long bhaaId, String firstName, String lastName) {
        this.bhaaId = bhaaId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public Long getBhaaId() {
        return bhaaId;
    }

    public void setBhaaId(Long bhaaId) {
        this.bhaaId = bhaaId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
