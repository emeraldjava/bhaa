import ie.bhaa.LoadDBService;

class BootStrap {

    def init = { servletContext ->
		def dbs = new LoadDBService()
		dbs.rootDir = servletContext.getRealPath("/data/")
		println "loading data... " + dbs.rootDir
		dbs.load()
    }	
    def destroy = {
    }
}
