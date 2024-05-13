package eu.epfc.java1888.catalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository){
        return args -> {
            log.info("preloading" + repository.save(new Product("one book", "roman")));
            log.info("preloading"+ repository.save(new Product("anthor book", "romance")));
        };
    }
}
