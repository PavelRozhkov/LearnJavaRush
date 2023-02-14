package Level0;

import java.util.Objects;

public final class Greeting {
    private final long id;
    private final String content;

    Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long id() {
        return id;
    }

    public String content() {
        return content;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Greeting that = (Greeting) obj;
        return this.id == that.id &&
                Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    @Override
    public String toString() {
        return "Greeting[" +
                "id=" + id + ", " +
                "content=" + content + ']';
    }

    /**
     * Объект Greetingдолжен быть преобразован в JSON. Благодаря поддержке преобразователя
     * сообщений HTTP в Spring вам не нужно выполнять это преобразование вручную. Поскольку
     * Jackson 2 находится в пути к классам, Spring MappingJackson2HttpMessageConverter автоматически
     * выбирается для преобразования Greeting экземпляра в JSON.
     */
}


