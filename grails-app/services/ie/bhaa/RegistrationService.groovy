package ie.bhaa

/**
 * http://www.kromhouts.net/blog/?p=9
 * @author assure
 */
class RegistrationService {

    static transactional = false

	def listAll(param) {
		def result
		result.list = Registration.list()
		result.total = Registration.count()
		return result
	}
	
    def serviceMethod() {
    }
}
