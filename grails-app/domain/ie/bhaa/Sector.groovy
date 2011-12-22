package ie.bhaa

class Sector {

	static hasMany = [companies:Company]
	
	Long id
	String name
	String description

	static mapping = { version false }

	static constraints = {
	}
	
	def String toString() {
		return "${name}"
	}
}
