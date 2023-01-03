package Syntax;

import Samples.SrtingClass;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.time.LocalDateTime;

class MyFile extends File {
    public MyFile(String pathname) {
        super(pathname);
        this.initialize(this.getName());
    }

    public String getFilename() {
        return filename;
    }
    private String filename = null;
    public void initialize (String name){
        this.filename = name;
    }
}

class Lecture6 implements Lecture{
    public Lecture6(){
        this.myFile = new MyFile("D:\\dev\\2023.01\\1.txt");
    }
    MyFile myFile;
    public void run(){
        System.out.println("myFile.getFilename() "+myFile.getFilename());
        System.out.println("myFile.canExecute() "+myFile.canExecute());
        System.out.println("myFile.canRead() "+myFile.canRead());
        System.out.println("myFile.exists() "+myFile.exists());
        System.out.println("myFile.setReadOnly() "+myFile.setReadOnly());
        // System.out.println("myFile.getUsableSpace() "+myFile.getUsableSpace()/1024/1024/1024+" Гб");
    }
}
class Friend {
    // инициализация через метод initialize
    String name, age, gender, adress;
    void initialize(String name, String age, String gender){
        this.name = name; this.age=age;this.gender = gender;
    }
    void initialize (String name, String age){
        this.name = name; this.age = age;
    }
    void initialize (String name){
        this.name=name;
    }
    String info(){
        String txt = "";
        if (name != null) {txt=txt+name;}
        if (age != null) {txt=txt+" "+age;}
        if (gender != null) {txt=txt+" "+gender;}
        // https://metanit.com/java/tutorial/2.17.php
        return txt;
    }
}

class Lecture7 implements Lecture{
    public Lecture7() {}

    void z1(){
        // Создать класс Friend.
        // И придумать ему три инициаилизатора — имя возраст и пол,
        // только имя и возраст и только имя.
        Friend friend1 = new Friend();
        friend1.initialize("Иван", "28", "man");
        System.out.println(friend1.info());

        Friend friend2 = new Friend();
        friend2.initialize("Саня", "25");
        System.out.println(friend2.info());

        Friend friend3 = new Friend();
        friend3.initialize("Санек");
        System.out.println(friend3.info());

    }
    public void run(){
        this.z1();
    }
}

class Lecture8 implements Lecture{
    public Lecture8() {
        System.out.println("Конструкторы для создания и инициализации объектов");
        System.out.println("Отработал конструктор в классе Lecture8");
    }

    public void run1(){

    };
}

class Friend2 extends Friend {
    //Инициализация через конструкторы
    public Friend2(String name, String age, String gender){
        this.name = name; this.age=age;this.gender = gender;
    }
    public Friend2 (String name, String age){
        this.name = name; this.age = age;
    }
    public Friend2 (String name){
        this.name=name;
    }
    void show(){
        System.out.print(this.info()+". ");
        //Тернарный оператор if-else
        //https://javarush.com/groups/posts/ternarnyj-operator
        // (condition) ? block1 : block2
        System.out.println((this.age==null) ? "А возраст то не не задали!":"Добро пожаловать, "+this.name+"!");
    }
}

class Lecture9 implements Lecture{
    public void run(){
        Friend2 friend1 = new Friend2("Паша", "30", "man");
        friend1.show();

        Friend2 friend2 = new Friend2("Вася");
        friend2.show();

    }
}

class Lecture12 implements Lecture{
    public void run(){
        //LocalDateTime localDateTime = new LocalDateTime(LocalDateTime.now().toLocalDate(), LocalDateTime.now().toLocalTime());
        //System.out.println(LocalDateTime.now().getYear());

        System.out.println("Текущая дата: "+LocalDateTime.now().getYear()+" "+LocalDateTime.now().getMonth().getValue()+" "+LocalDateTime.now().getDayOfMonth());
    }
}

public class Level5 {
    public static void main(String[] args) {
        // приведение к типу
        // Object object = new Lecture7();
        // ((Lecture)object).run();

        // создаем экземпляр интерфейса
        // теперь в программе можем создавать объекты Lecture
        // как экземпляры обоих классов: Lecture7 и Lecture6
         Lecture object = new Lecture12();
         object.run();
    }



}
