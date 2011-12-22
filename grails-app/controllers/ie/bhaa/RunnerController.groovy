package ie.bhaa

import grails.converters.JSON

class RunnerController {

	def scaffold = Runner
	
	def findrunner =
	{
		render ie.bhaa.Runner.findAllBySurnameLike("%"+params.surnamematch+"%") as JSON
	}
}