package Level0;

import Syntax.Jobs;
import Syntax.Lecture;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * https://javarush.com/quests/lectures/questspring.level01.lecture01
 * Пакеты org.springframework.beans и org.springframework.context являются основой для
 * IoC-контейнера Spring Framework. Интерфейс BeanFactory предоставляет расширенный механизм
 * конфигурации, способный управлять объектами любого типа. ApplicationContext является
 * подынтерфейсом BeanFactory. В нем добавляются:
 *
 * Более простая интеграция с функциями АОП в Spring
 *
 * Обработка ресурсов сообщений (для использования в интернационализации)
 *
 * Публикация событий
 *
 * Контексты, специфичные для уровня приложений, такие как WebApplicationContext для
 * использования в веб-приложениях.
 *
 * Вкратце, BeanFactory обеспечивает основу конфигурации и базовый функционал, а
 * ApplicationContext добавляет более специфичную корпоративную функциональность.
 * ApplicationContext является полным расширенным набором BeanFactory и используется
 * исключительно в этой главе при описании IoC-контейнера Spring. Для получения дополнительной
 * информации об использовании BeanFactory вместо ApplicationContext, смотрите раздел,
 * посвященный BeanFactory API.
 *
 * В Spring объекты, которые составляют основу вашего приложения и
 * управляются IoC-контейнером Spring, называются бинами (beans).
 * Бин (bean) - это объект, который создается, компонуется и
 * управляется IoC-контейнером Spring. В ином случае бин - это
 * просто один из многих объектов в вашем приложении.
 * Бины и зависимости между ними отражены в конфигурационных
 * метаданных, используемых контейнером.
 */

/**
 * мелко написоно, не интересно
 * https://javarush.com/quests/lectures/questspring.level01.lecture00
 * J2EE:
 * Servlet API (JSR 340) https://jcp.org/en/jsr/detail?id=340
 * WebSocket API (JSR 356) https://www.jcp.org/en/jsr/detail?id=356
 * Утилиты параллелизма (JSR 236) https://www.jcp.org/en/jsr/detail?id=236
 * JSON Binding API (JSR 367) https://jcp.org/en/jsr/detail?id=367
 * Bean Validation (JSR 303) https://jcp.org/en/jsr/detail?id=303
 * JPA (JSR 338) https://jcp.org/en/jsr/detail?id=338
 * JMS (JSR 914) https://jcp.org/en/jsr/detail?id=914
 * а также конфигурации JTA/JCA для координации транзакций, если это необходимо.
 *
 * Spring Framework также поддерживает спецификации внедрения зависимостей (JSR 330 - https://www.jcp.org/en/jsr/detail?id=330)
 * и общих аннотаций (JSR 250 - https://jcp.org/en/jsr/detail?id=250),
 * которые разработчики приложений могут использовать вместо специфичных для Spring механизмов,
 * предоставляемых Spring Framework.
 *          Пока это убра с маина
 *          SpringApplication.run(Level1.class, args);
 *         // создаем и конфигурируем бины
 *         ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
 *         // получаем сконфигурированный экземпляр
 *         PetStoreService service = context.getBean("petStore", PetStoreService.class);
 *         // используем сконфигурированный экземпляр
 *         List<String> userList = service.getUsernameList();
 */


/**
 * Вы можете использовать start.spring.io (https://start.spring.io/) для создания базового проекта
 * или следовать
 * одному из руководств по "Началу работы" (https://spring.io/guides), например
 * "Начало создания веб-службы RESTful" (https://spring.io/guides/gs/rest-service/).
 * Помимо того, что эти руководства легче усваиваются, они очень ориентированы на конкретные задачи,
 * и большинство из них основаны на Spring Boot. Они также охватывают другие проекты из портфолио
 * Spring, с которыми вы, возможно, захотите ознакомиться при решении конкретной проблемы.
 * Проект Spring Boot (https://projects.spring.io/spring-boot/ - https://github.com/spring-guides/gs-rest-service)
 * предлагает быстрый (и жестко заданный) способ создания готового к работе приложения на основе Spring.
 */

/**
 * Установка %JAVA_HOME%
 * https://java-lessons.ru/first-steps/java-home
 */

/**
 * https://spring.io/guides/gs/rest-service/
 * Чтобы начать с нуля, перейдите к разделу «Начиная с Spring Initializr» https://spring.io/guides/gs/rest-service/#scratch
 */

class QuickStart implements Lecture {
    @Override
    public String info() {
        return "Cоздания простого веб-сервиса «Hello World» в Spring Boot";
    }
    @Override
    public void run() {
        getinfo();
        DemoApplication.main(("run app").split(" "));
    }
}

@SpringBootApplication
public class Level1 {
    //https://javarush.com/quests/QUEST_SPRING_PUBLIC
    public static void main(String[] args) {
        Jobs jobs = new Jobs(new QuickStart());
    }
}
