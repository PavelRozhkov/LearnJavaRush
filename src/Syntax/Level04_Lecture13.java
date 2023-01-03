package Syntax;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level04_Lecture13 {
    /**
     *  выводит на экран все чётные числа от 1 до 100
     */
    void z1() {
        for (int i = 1; i<=100; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("-");
            }
        }

    }

    /**
     * Выводит прямоуголник из воьмерок на экран, m - высота, n - ширина
     */
   void z2(){
       int m = 8;
       int n = 20;
       // https://www.javatpoint.com/java-string-to-char
       char case8 = " ".charAt(0);
       for (int y = 1;y<=m; y++){
           for (int x = 1; x<=n; x++){
               // https://javarush.com/groups/posts/logicheskie-operacii-v-java
               if ((x==1)|(x==n)|(y==1)|(y==m)) {case8="8".charAt(0);}
               else {case8=" ".charAt(0);}
               System.out.print(case8);

               if (x==n){
                   System.out.println("");
               }

           }
       }
   }

    /**
     * Выводит в консоль треугольник из восьмерок
     */
   void z3(){
       int m = 15;
       int n = 20;
       char case8 = " ".charAt(0);
       for (int y=1;y<=m;y++){
           for (int x = 1;x<=n;x++){
               // if-else if https://javarush.com/help/67705
               if ((n/2-y/2==x)|(n/2+y/2==x)){case8="8".charAt(0);}
               else if ((y==m)&(x>=n/2-y/2)&(x<=n/2+y/2)){case8="8".charAt(0);}
               else {case8=" ".charAt(0);}
               System.out.print(case8);
               if (x==n) {
                   System.out.println("");
               }
           }
       }
   }


    public static void main(String[] args) throws IOException {
        Level04_Lecture13 level04_lecture13 = new Level04_Lecture13();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // while https://javarush.com/groups/posts/cikly-java
        /**
         * do{instruction} while (contition);
         */
        do {
            System.out.print("Введите номер задачи (1-3, 0 - выход): ");
            // https://javarush.com/groups/posts/operator-switch-v-java
            switch (bufferedReader.readLine()){
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    level04_lecture13.z1();
                    break;
                case "2":
                    level04_lecture13.z2();
                    break;
                case "3":
                    level04_lecture13.z3();
                    break;
                case "5":
                    System.out.println("двадцать пять");
                    break;
                default:
                    break;

            }
        } while (true);
    }
}
