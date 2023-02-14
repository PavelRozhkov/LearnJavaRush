package Level0;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelowWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelowWorld.class, args);
    }
    @GetMapping("/helloworld")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/error")
    public String error() {
        return "Такой страницы нет!";
    }
}
