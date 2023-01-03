package Syntax;

public interface Lecture {
    // https://metanit.com/java/tutorial/3.7.php
    default void run(){
        System.out.println("Метод run не раелизован в наследнике "+this.getClass());
    };
}
