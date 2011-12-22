package ie.bhaa

class Raceresult implements Serializable {

	Race race
	Runner runner
	Date time
	Long position
	Long racenumber

	static mapping = { 
		version false
		table "raceresult"
		id composite: ["race","runner"]
		race column:'race'
		runner column:'runner'
	}
	
	static constraints = {
	}
	
	def String toString() {
		return "${race.event.name}"
	}
}