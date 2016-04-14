#Rawchips

http://www.concretepage.com/spring-batch-3/spring-batch-3-annotation-example-using-mysql-gradle

Use a tasklet for final summary report

http://stackoverflow.com/questions/30537527/spring-batch-generating-reports
http://stackoverflow.com/questions/29118156/add-parameter-to-job-context-from-tasklet-step-and-use-in-later-steps-in-spring

    @Bean
    public Step step() { 
        return stepBuilderFactory.get("step")
                .tasklet()
                ...
                
http://stackoverflow.com/questions/21943215/spring-batch-with-annotations
https://numberformat.wordpress.com/2013/12/27/hello-world-with-spring-batch-3-0-x-with-pure-annotations/
