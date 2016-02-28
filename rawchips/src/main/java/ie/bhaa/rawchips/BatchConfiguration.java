package ie.bhaa.rawchips;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by pauloconnell on 27/02/16.
 */
@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public ItemReader<RawChip> reader() {
        FlatFileItemReader<RawChip> reader = new FlatFileItemReader<RawChip>();
        reader.setResource(new ClassPathResource("bhaa.rawchips.alsaa.2016.csv"));
        reader.setLineMapper(new DefaultLineMapper<RawChip>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] {"id","timingPoint","chipCode","raceNo",
                        "chipTime","createDate","canUse","controller","name","event",
                        "manualTime","readerNo","antNo","strength","passingNo","hits"});
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<RawChip>() {{
                setTargetType(RawChip.class);
            }});
        }});
        return reader;
    }

    @Bean
    public ItemWriter writer() {

        FlatFileItemWriter writer = new FlatFileItemWriter();
        writer.setResource(new ClassPathResource("out.bhaa.rawchips.alsaa.2016.csv"));
        writer.setLineAggregator(new LineAggregator() {
            @Override
            public String aggregate(Object o) {
                return o.toString();
            }
        });
//        writer.setResource(new Resource("file:target/test-outputs/output.txt"));

        //File
        //JdbcBatchItemWriter<RawChip> writer = new JdbcBatchItemWriter<RawChip>();
        //writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Marksheet>());
        //writer.setSql("INSERT INTO marksheet (studentId,totalMark) VALUES (:stdId,:totalSubMark)");
        //writer.setDataSource(dataSource);
        return writer;
    }

//    @Bean
//    public ItemProcessor<RawChip, Marksheet> processor() {
//        return new RawChipItemProcessor();
//    }

    @Bean
    public RawChipProcessor processor() {
        return new RawChipProcessor();
    }

    @Bean
    public Job createMarkSheet(JobBuilderFactory jobs, Step step) {
        return jobs.get("createMarkSheet")
                .flow(step)
                .end()
                .build();
    }

    @Bean
    public Step step() { //StepBuilderFactory stepBuilderFactory, ItemReader<RawChip> reader,
                     //ItemWriter<Object> writer, ItemProcessor<RawChip, Object> processor) {
        return stepBuilderFactory.get("step")
                .<RawChip, Object> chunk(5)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//    @Bean
//    public DataSource getDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/concretepage");
//        dataSource.setUsername("root");
//        dataSource.setPassword("");
//        return dataSource;
//    }
}
