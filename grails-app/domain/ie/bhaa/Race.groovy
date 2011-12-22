package ie.bhaa

class Race {
	
	static belongsTo = Event
	
	Long id
	Event event
	Date starttime
	Long distance
	String type
	String unit

	static constraints = {
	}

	static mapping = { 
		version false 
		event column:'event'
	}

	def String toString() {
		return "${type} ${distance} ${unit}"
	}
}