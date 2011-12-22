package ie.bhaa

/**
 * http://work.msanjay.in/2010/04/01/importing-some-initial-test-data-into-a-grails-application/
 * @author assure
 *
 */
class LoadDBService {

	boolean transactional = true
    def rootDir = './data/csv'

    // a set method for property rootDir
    public void setRootDir(String dir) {

        rootDir = dir
        if (! (dir.endsWith("/") || dir.endsWith("\\")))
            rootDir += File.separator
    }

    def load() { 
		
		def runner = new Runner();
		
	
		// csv 	
	}
}
