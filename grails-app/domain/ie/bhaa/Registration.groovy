package ie.bhaa

class Registration {

	Long id
	Event event;
	Runner runner
	
    static constraints = {
    }
	
	def String toString(){
		return "$id" // "${runner.id},${runner.surname},${runner.firstname},${runner.company.id}"
	}
}
