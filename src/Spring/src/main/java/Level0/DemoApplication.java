package Level0;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// http://localhost:8080/                   Hello World!
// http://localhost:8080/hello?name=Amy     Hello Amy!
/**
 * https://spring.io/quickstart
 * Это весь код, необходимый для создания простого веб-сервиса «Hello World» в Spring Boot.
 * Добавленный нами метод hello() предназначен для приема параметра String с именем name и
 * последующего объединения этого параметра со словом "Hello"в коде. Это означает, что если
 * вы укажете свое имя "Amy"в запросе, ответ будет «Привет, Эми».
 *
 * Аннотация @RestController сообщает Spring, что этот код описывает конечную точку, которая
 * должна быть доступна через Интернет. Аннотация @GetMapping(“/hello”) сообщает Spring-y использовать наш
 * hello() метод для ответа на запросы, которые отправляются по адресу http://localhost:8080/hello.
 * Наконец, @RequestParamSpring сообщает Spring-y ожидать значение имени в запросе, но если его
 * там нет, он будет использовать слово "World" по умолчанию.
 */
@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}


