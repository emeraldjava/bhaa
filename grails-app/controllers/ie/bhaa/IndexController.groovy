package ie.bhaa

class IndexController {

	def registrationService
	
    def index = { 
		
		//flash.message = "index.index"
		[ message : "this is a message from the controller" ]
		println "this is a println from the controller"
		//def reg = Registration.findAllBy()
		def map = [ registrations : Registration.getAll() ]
		render(view:"/index", model:map)
		
		//[registrations = registrationService.listAll(params)]
	}
	
	def time = {
		render "${new Date()}"
	}
}
