package ie.bhaa.registration.form;

import ie.bhaa.registration.dto.Runner;

/**
 * Created by pauloconnell on 27/01/17.
 */
public class RaceEntry extends Runner {

    private String racenumber;
    private String money;

    public String getRacenumber() {
        return racenumber;
    }

    public void setRacenumber(String racenumber) {
        this.racenumber = racenumber;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
