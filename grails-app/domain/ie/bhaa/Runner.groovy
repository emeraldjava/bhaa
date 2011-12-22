package ie.bhaa

class Runner {

	static belongsTo = Company
	static hasMany = [results:Raceresult]
	
	Long id
	String firstname
	String surname
	Date dateofbirth
	Long standard
	String email
	String address1
	String address2
	String address3
	String status
	Date insertdate
	Date dateofrenewal
	Company company
	
	static mapping = { 
		version false
		company column:"company"
	}
	
	static constraints = {
		id()
		firstname()
		surname()
		dateofbirth()
		standard()
		company()
	}
	
	def String toString() {
		return "${firstname} ${surname}"
	}
}
