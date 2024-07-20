package ru.twozeros.todo.views;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import ru.twozeros.todo.service.configuration.ServiceConfiguration;


@Import(value = {
        ServiceConfiguration.class,
})
@ComponentScan({"ru.twozeros.todo.views.**"})
@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

}
