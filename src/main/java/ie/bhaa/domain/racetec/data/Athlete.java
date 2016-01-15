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
