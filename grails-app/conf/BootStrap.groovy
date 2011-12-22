class BootStrap {

    def init = { servletContext ->
		def dbs = new ie.bhaa.LoadDBService()
		dbs.rootDir = servletContext.getRealPath("/data/")
		println "loading data... " + dbs.rootDir
		dbs.load()
    }	
    def destroy = {
    }
}
