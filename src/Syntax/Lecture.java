package Syntax;

public interface Lecture {
    // https://metanit.com/java/tutorial/3.7.php
    default void run(){
        System.out.println("Метод run не раелизован в наследнике "+this.getClass());
    };
    default String info(){
        return "Метод info не реализован в наследнике "+this.getClass();
    }
    default void getinfo (){
        System.out.println(this.info());
    }
}
