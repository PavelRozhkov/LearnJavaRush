package Samples;
import Samples.Reader;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

/*
Управляющие последовательности\
\t cимвол табуляции.
\b cимвол возврата в тексте на один шаг назад или удаление одного символа в строке (backspace).
\n cимвол перехода на новую строку.
\r cимвол возврата каретки. ()
\f прогон страницы.
\' cимвол одинарной кавычки.
\" cимвол двойной кавычки.
\\ cимвол обратной косой черты (\).
**/

public class SrtingClass {
    public static void test() throws IOException {
        String text = "one two three";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words)+ " - пример преобразования строки в массив (для args)");
        Reader.main("one two three".split(" "));
    }
    public static void main(String[] args) throws IOException {
        printmes("I like \"Java\"! yet");
        String s = "I like \"Java\"! all the same";
        System.out.println(s);
        printmes("\u00A9 2022 Pavel");
        test();
        

    }
    public static void printmes(String in){
        System.out.println(in);
    }


}
