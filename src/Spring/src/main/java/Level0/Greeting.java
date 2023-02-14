package Level0;
public record Greeting(long id, String content) {
    /**
     * Объект Greetingдолжен быть преобразован в JSON. Благодаря поддержке преобразователя
     * сообщений HTTP в Spring вам не нужно выполнять это преобразование вручную. Поскольку
     * Jackson 2 находится в пути к классам, Spring MappingJackson2HttpMessageConverter автоматически
     * выбирается для преобразования Greeting экземпляра в JSON.
     */
}


