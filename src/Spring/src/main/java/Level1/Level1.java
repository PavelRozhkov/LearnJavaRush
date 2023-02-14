package Level1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * В Spring объекты, которые составляют основу вашего приложения и управляются IoC-контейнером
 * Spring, называются бинами
 */

class PetStoreService {}
public class Level1 {
    public static void main(String[] args) {
        //https://javarush.com/quests/lectures/questspring.level01.lecture03
        //выдает ошибку
        // создаем и конфигурируем бины
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
        // получаем сконфигурированный экземпляр
        PetStoreService service = context.getBean("petStore", PetStoreService.class);
// используем сконфигурированный экземпляр
        //List<String> userList = service.getUsernameList();

    }
}
