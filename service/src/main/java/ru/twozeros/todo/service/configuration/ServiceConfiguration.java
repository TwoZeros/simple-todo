package ru.twozeros.todo.service.configuration;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.twozeros.todo.repository.configuration.RepositoryConfiguration;

@Configuration
@ComponentScan(basePackages={"ru.twozeros.todo.service"})
@Import(value = {
        RepositoryConfiguration.class
})
@EntityScan("ru.twozeros.todo.repository.entity")
@EnableJpaRepositories("ru.twozeros.todo.repository.repositories")
public class ServiceConfiguration {
}
