package Samples;



import Syntax.Lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст: ");
        String str =  bufferedReader.readLine();
        System.out.println("Вы ввели: "+str+ " ");
        bufferedReader.close();
    }



}
