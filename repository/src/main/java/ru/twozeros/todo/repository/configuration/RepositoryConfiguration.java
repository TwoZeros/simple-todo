package ru.twozeros.todo.repository.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"ru.twozeros.todo.repository"})
public class RepositoryConfiguration {
}
