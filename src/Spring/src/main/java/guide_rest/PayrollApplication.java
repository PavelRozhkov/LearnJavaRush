package guide_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * https://spring.io/guides/tutorials/rest/
 * Создание сервисов REST с помощью Spring
 * https://github.com/spring-guides/tut-rest --> D:\dev\2023.2\tut-rest\pom.xml
 * Работает: в поме нужна версия spring-boot-starter-parent 2.3.0.RELEASE и версия байткода 1.8
 */
@SpringBootApplication
public class PayrollApplication {
    public static void main(String... args) {
        SpringApplication.run(PayrollApplication.class, args);
    }
}