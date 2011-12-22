package ie.bhaa

class RegistrationController {

	def registrationService
    def scaffold = Registration
	
	def registered() {
		//http://www.ibm.com/developerworks/java/library/j-grails03118/
		
		//def registrations = Registration.findAllBy();
		//redirect(controllerName:index)
		[registrations : Registration.findAllBy()]
	}
}
