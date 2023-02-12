package Level0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// https://javarush.com/groups/posts/1896-java-annotacii-chto-ehto-i-kak-ehtim-poljhzovatjhsja
@SpringBootApplication
@RestController
public class QuickStart2 {
    public static void main(String[] args) {
        SpringApplication.run(QuickStart.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}


