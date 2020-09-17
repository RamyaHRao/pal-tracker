package io.pivotal.pal.tracker;
        import com.mysql.cj.jdbc.MysqlDataSource;
        import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Bean;
        import javax.sql.DataSource;
        import javax.xml.crypto.Data;

@SpringBootApplication
public class PalTrackerApplication{

    public static void main(String[] args){
        SpringApplication.run(PalTrackerApplication.class,args);
    }

    @Bean
    public TimeEntryRepository timeEntryRepository(DataSource dataSource){


        JdbcTimeEntryRepository jdbcTimeEntryRepository = new JdbcTimeEntryRepository(dataSource);

        return jdbcTimeEntryRepository;
    }

     /*public TimeEntryRepository timeEntryRepository(){

        return  new InMemoryTimeEntryRepository();
    }*/
}

