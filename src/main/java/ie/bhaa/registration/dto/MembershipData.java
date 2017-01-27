package ie.bhaa.registration.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pauloconnell on 27/01/17.
 */
public class MembershipData implements Serializable {

    private Integer count;
    private String date;
    private List<Runner> runners;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MembershipData{");
        sb.append("count=").append(count);
        sb.append(", date='").append(date).append('\'');
        sb.append(", runners='").append(runners).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
