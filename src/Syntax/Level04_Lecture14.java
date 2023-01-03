package Syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Man {
    int ipn;
    boolean equals (Man man){
        return this.ipn == man.ipn;
    }
}

public class Level04_Lecture14 {
    public static void main(String[] args) throws IOException {
        Level04_Lecture14 level04_lecture14 = new Level04_Lecture14();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /**
         * https://javarush.com/groups/posts/cikly-java
         * while (condition) {instruction}
         */
        while (true){
            System.out.print("Введите номер задачи (1-9, 0 - выход): ");
            switch (bufferedReader.readLine()){
                case "1":
                    level04_lecture14.Z1_compare();
                    break;
                case "0":
                    System.exit(0);
                    break;
                case "2":
                    level04_lecture14.Z2_compareStrings();
                    break;
                case "3":
                    level04_lecture14.Z3_test();
                    break;
                case "4":
                    level04_lecture14.Z4_binary();;
                    break;
            }
        }
    }
    void Z1_compare (){
        System.out.println("Сравение объктов man1 и man2 у когоых свойство ipn = 123");
        Man man1 = new Man();
        man1.ipn=1123;

        Man man2 = new Man();
        man2.ipn = man1.ipn;
        System.out.println("Объекты одинаковы, это "+man2.equals(man1));
    }

    void Z2_compareStrings(){
        String adr1 = "Австралія";
        String adr2 = "АВСТРАЛІЯ";
        System.out.println("сравним строки "+adr1+" и "+adr2+" = "+adr1.equalsIgnoreCase(adr2));
        /*
        adr2.intern() смотрит, есть ли строка с таким текстом в пуле строк.
        Если её нет — помещает строку с этим текстом в пул строк и возвращает текст.
         */
        System.out.println(adr2.intern());
        /*
        дополнительно
        Cтатья на Хабре про методы equals() и hashCode().
        https://habr.com/post/168195/

        Лекция JavaRush про equals() и hashCode().
        https://javarush.com/quests/lectures/questmultithreading.level01.lecture04
         */
    }
    void Z3_test(){
        byte b1= (byte) 127;
        short sh1=0;
        System.out.println("Прибавление числа к байтовой переменной:");
        for (sh1=0;sh1<=130;sh1++){
            System.out.println(b1+" + "+sh1+" = "+(byte)(b1+sh1));
        }

    }
    void Z4_binary(){
        // https://javarush.com/groups/posts/1925-pobitovihe-operacii
        int b1 = 1000;
        System.out.println(b1+" в двоичном виде "+Integer.toBinaryString(b1));
        // ~ меняет 1 на 0 в двоичном виде
        System.out.println(~b1+" в двоичном виде "+Integer.toBinaryString(~b1));
    }
}
