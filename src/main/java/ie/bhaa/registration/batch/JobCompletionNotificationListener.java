package ie.bhaa.registration.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

/**
 * Created by pauloconnell on 17/12/2016.
 */
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void afterJob(JobExecution jobExecution) {

    }
}
