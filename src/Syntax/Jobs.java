package Syntax;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Jobs implements Lecture{
    // о модификаторе final
    // https://javarush.com/groups/posts/591-vot-tak-final
    private final Lecture job1;
    private final Lecture job2;
    private final Lecture job3;
    // Массив всех выполненых заданий для запуска
    // Lecture [] lectures = new Lecture[10];

    Jobs(Lecture task1, Lecture task2, Lecture task3){
        this.job1 = task1;
        this.job2 = task2;
        this.job3 = task3;
    }
    Jobs(Class aClass){
        this.job1 = null;
        this.job2 = null;
        this.job3 = null;
        System.out.println(aClass.getName());
    }
    public Jobs(Lecture lecture){
        this.job1 = null;
        this.job2 = null;
        this.job3 = null;
        lecture.run();
    }
    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = " ", exit = "0";
        // https://javarush.com/groups/posts/cikly-java
        // while (contition) {instruction}
        while (!str.equalsIgnoreCase(exit))  {
            System.out.println("Какое задание выполнить:" +" 1. " + job1.getClass()+" 2. " + job2.getClass()+" 3. " + job3.getClass());
            System.out.print("Сделайте свой выбор (1-3, "+exit+" - выход): ");
            try {str = bufferedReader.readLine();}
            catch (Exception e){System.out.println(e.getMessage());}
            switch (str){
                case "1":
                    System.out.println("");
                    job1.run();
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("");
                    job2.run();
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    job3.run();
                    System.out.println("");
                    break;
                case "0":
                    System.out.println("О нет");
                    break;
                default:
                    break;
            }
        }
    }
}


