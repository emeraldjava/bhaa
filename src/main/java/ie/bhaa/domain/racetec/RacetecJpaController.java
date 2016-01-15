package ie.bhaa.domain.racetec;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

/**
 * Created by pauloconnell on 16/07/15.
 */
//@Configuration
//@EnableJpaRepositories(basePackages = "ie.bhaa.domain.racetec.repository")
//@EntityScan(basePackages = "ie.bhaa.domain.racetec.data")
public class RacetecJpaController {

    //
    @Bean
    @ConfigurationProperties(prefix = "datasource.sqlserver")
    public DataSource postgresDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "entityManagerFactory")
    //@Primary
    public LocalContainerEntityManagerFactoryBean emf1(EntityManagerFactoryBuilder builder){
        return builder
                .dataSource(postgresDataSource())
                .packages("ie.bhaa.domain.racetec")
                .persistenceUnit("racetec")
                .build();
    }
}
