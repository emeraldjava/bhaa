package ie.bhaa.rawchips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauloconnell on 27/02/16.
 */
@SpringBootApplication
//@ComponentScan
//@EnableAutoConfiguration
public class RawChipsApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RawChipsApplication.class, args);
        List result = new ArrayList();
//        List result = ctx.getBean(JdbcTemplate.class).query("select studentId,totalMark FROM marksheet",
//                new RowMapper() {
//                    @Override
//                    public Marksheet mapRow(ResultSet rs, int row) throws SQLException {
//                        return new Marksheet(rs.getString(1), Integer.parseInt(rs.getString(2)));
//                    }
//                });
        System.out.println("Number of Record:"+result.size());
    }
}
