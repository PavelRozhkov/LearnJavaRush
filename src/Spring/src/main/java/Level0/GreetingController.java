package Level0;
/**
 * https://spring.io/guides/gs/rest-service/
 * Создание веб-службы RESTful
 * http://localhost:8080/greeting
 * http://localhost:8080/greeting?name=User
 *
 * В подходе Spring к созданию веб-служб RESTful HTTP-запросы обрабатываются контроллером.
 * Эти компоненты идентифицируются аннотацией @RestController, и GreetingController
 * обрабатывает GET запросы /greeting, возвращая новый экземпляр класса Greeting
 */

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Аннотация @GetMapping гарантирует, что HTTP-запросы GET /greeting сопоставляются с
 * greeting() методом.
 *
 * Существуют сопутствующие аннотации для других методов HTTP (например, @PostMappingдля POST).
 * Существует также @RequestMappingаннотация, от которой все они происходят, и которая может служить
 * синонимом (например, @RequestMapping(method=GET)).
 *
 * Аннотация @RequestParam привязывает значение параметра строки запроса name к name параметру метода greeting(),
 * по умолчанию name = defaultValue.
 *
 * Реализация тела метода Greeting создает и возвратит новый Greeting объект с атрибутами id
 * и content.
 * Этот код использует аннотацию @RestController, которая помечает класс как контроллер,
 * где каждый метод возвращает объект домена вместо представления. Это сокращение для включения
 * обоих аннотаций @Controller и @ResponseBody.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}