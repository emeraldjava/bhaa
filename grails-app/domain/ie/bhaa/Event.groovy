package ie.bhaa

class Event {

	static hasMany = [races:Race]

	Long id
	String name
	String tag
	String location
	Date date
	String type

	static constraints = {
	}
	
	static mapping = { 
		version false 
	}
	
	def String toString() {
		return "${name}"
	}
}
