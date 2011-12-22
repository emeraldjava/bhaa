package ie.bhaa

class Company {

	static hasMany = [runners:Runner]
	static belongsTo = Sector
	
	Long id
	String name
	Sector sector
	String website
	String image

	static mapping = { 
		version false 
		sector column:"sector"
	}
	
	static constraints = {
	}
	
	def String toString() {
		return "${name}"
	}
}