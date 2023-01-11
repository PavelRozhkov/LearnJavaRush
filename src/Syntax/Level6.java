package Syntax;

import java.util.ArrayList;

class Lev6Lec3_6 extends Lecture6 {
    //статические переменные увеличиваются в конструкторе на 1, метод finalize
    static int createdInstance, destroyedInstance;
    Lev6Lec3_6(){
        System.out.println("Сработал конструктор "+this.getClass());
        // увеличиваем на 1
        // https://javarush.com/groups/posts/operatory-java-logicheskie-arifmeticheskie-pobitovye#Какие-бывают-операторы-в-Java
        createdInstance += 1;
    }
    protected void finalize() throws Throwable{
        System.out.println("Деструктор активирован"+this.getClass());
        myFile = null;
        // колличество удаленных экземпляров
        destroyedInstance += 1;
    }
    public void run(){
        System.out.println("Метод finalize() вызывается Java-машиной у объекта перед тем, как объект будет уничтожен.");
    }
}

class Lev6Lec6 implements Lecture{
    public void run() {
        //работа со статичной перменной объекта
        Lev6Lec3_6.createdInstance = 0;
        Lev6Lec3_6.destroyedInstance = 0;
        for (int i=0;i<1;i++){
            Lecture lecture = new Lev6Lec3_6();
            lecture.run();
        }
        System.out.println("Создано "+ Lev6Lec3_6.createdInstance + " Удалено "+ Lev6Lec3_6.destroyedInstance);
    }
}

class Lev6Lec11 implements Lecture{
    class Cat extends Lev6Lec3_6{
        Cat(){
            // createdInstance увеличивается в конструкторе Lev6Lec3_6
            if (createdInstance%10==0) {System.out.println("Создано еще десять котов");}
        }

        @Override
        public void run() {
            super.run();
            System.out.println("Cat say meaoo!");
        }
    }
    public void run() {
        // так создают и запускают методы вложенных классов
        // из main-a не получилось создать внутренний класс Cat
        // https://javarush.com/groups/posts/2181-vlozhennihe-vnutrennie-klassih
        for (int i=0;i<20;i++){
            Lev6Lec11.Cat cat = this.new Cat();
            //cat.run();
        }
    }
}

class Cat_task2 extends Lev6Lec3_6{
    // создали ArrayList
    // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    static ArrayList<Cat_task2> cats = new ArrayList<Cat_task2>();
    Cat_task2(){
        cats.add(this);
    }
    @Override
    public void run() {
        //переопределенный метод run, ничего не делает
        //super.run();
    }
}

class Lev6Lec11Task2 implements Lecture {
    public void run() {
        for (int i=0;i<20;i++){
            Cat_task2 cat_task2 = new Cat_task2();
            System.out.print("Колличество "+getClass()+" - "+Cat_task2.createdInstance+". ");
            //метод run ничего не делает
            cat_task2.run();
        }
        System.out.println(Cat_task2.cats.toString());
    }
}

public class Level6 {

    public static void main(String[] args) {
        Lecture lecture = new Lev6Lec11Task2();
        lecture.run();
    }
}
