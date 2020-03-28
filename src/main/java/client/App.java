/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package client;

import client.usecase.CollectionUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    @Autowired
    private CollectionUseCase collectionUseCase;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> this.collectionUseCase.refreshFeedList();
    }

}
