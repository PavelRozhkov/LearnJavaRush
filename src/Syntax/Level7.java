package Syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// массивы https://javarush.com/quests/lectures/questsyntax.level07.lecture01
class Lev7Lec3 implements Lecture {
    String lanch = "Уже обед";
    String [] shooba = new String[10];
    Lev7Lec3(){
        shooba[0] = "1. Сварить свеклу, морковь (30 минут), картошку (60 минут) и яйца (10 минут).";
        shooba[1] = "2. Нарезать мелко лук. Лук + сахар, лимонн кислота, уксус поставить под прес";
        shooba[2] = "3. Отваренные овощи отчистить. Картошку и яйца пропустить через яйце резку. Свеклу и морковь натереть на терке.";
        shooba[3] = "4. Сельдь очистить от костей, нарезать мелкими кусочками.";
        shooba[4] = "5. Слой 1 - селедь.";
        shooba[5] = "6. Слой 2 - лук.";
        shooba[6] = "7. Слой 3 - картофель, майонез.";
        shooba[7] = "8. Слой 4 - яйца.";
        shooba[8] = "9. Слой 5 - морковь.";
        shooba[9] = "10. Слой 6 - свекла, майонез.";
    }
    void sort(){
        System.out.println("Сортировка массива shooba с объектами String.");
        Arrays.sort(shooba);
        for (String st: shooba) {
            System.out.println(st);
        }

    }
    void minmax(){
        System.out.println("Найдем минимальную и максимальную строку");
        int min=shooba[0].length(), max = shooba[0].length(), minindx=0, maxindx=0;
        for (int i=0;i<shooba.length;i++){
            //min = Math.min(min, shooba[i].length());
            if (min > shooba[i].length()) {shooba[i].length();minindx=i;min=shooba[i].length();}
            //max = Math.max(max, shooba[i].length())
            if (max < shooba[i].length()) {shooba[i].length();maxindx=i;max=shooba[i].length();}
        }
        System.out.println("Самая короткая строка "+minindx+" '" +shooba[minindx]+"' "+min+" символов");
        System.out.println("Самая длинная строка "+shooba[maxindx]+" "+max+" символов");
    }
    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = " ", exit = "3";
        // https://javarush.com/groups/posts/cikly-java
        // while (contition) {instruction}
        while (!str.equalsIgnoreCase(exit))  {
            System.out.println("Какое задание выполнить:" +" 1. Найти минимальную и максимальную строку.");
            System.out.println("2. Сортировка массива shooba с объектами String.");
            System.out.print("Сделайте свой выбор (0-2, "+exit+" - выход): ");
            try {str = bufferedReader.readLine();}
            catch (Exception e){System.out.println(e.getMessage());}
            switch (str){
                case "1":
                    minmax();
                    break;
                case "2":
                    sort();
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
class Shooba extends Lev7Lec3{}

class Lev7Lec5 implements Lecture{
    Lev7Lec5(){
        Shooba shooba = new Shooba();
        //https://www.softwaretestinghelp.com/java-arraylist-conversions/#Convert_list_To_ArrayList_In_Java
        list.addAll(Arrays.asList(shooba.shooba));

        collections_List.add("ArrayList");
        collections_List.add("Vector");
        collections_List.add("LinkedList");
        collections_List.add("Stack");
        collections_List.add("Set");
        collections_List.add("Map");
    }
    List<String> collections_List = new ArrayList<String>();
    ArrayList<String> list = new ArrayList<String>();
    @Override
    public void run() {
        //https://javarush.com/quests/lectures/questsyntax.level07.lecture05
        System.out.println("String[] to ArrayList");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(list.size()-i-1));
        }
        System.out.println("List contents: "+collections_List);
    }
}

class Lev7Lec6Task1 implements Lecture{
    List<String> spisok = new ArrayList<String>();
    Lev7Lec6Task1(){
        spisok.add("Строка 1.");
        spisok.add("Серый кот.");
        spisok.add("Констанция.");
        spisok.add("Ламборджини.");
        spisok.add("Луна.");
        spisok.add("Луна2");
    }

    public void run(){
        System.out.println("Cоздаем список строк, добавляем 5 разных строк и выводим размер списка на экран.");
        System.out.println("Затем выводим содержимое списка на экран.");
        System.out.println(spisok.size()+": "+ spisok.toString());
    }
}

class Lev7Lec6Task2 implements Lecture {
    ArrayList list;
    Lev7Lec6Task2(){
        Lev7Lec6Task1 lev7Lec6Task1 = new Lev7Lec6Task1();
        list = (ArrayList) lev7Lec6Task1.spisok;
    }
    public void run(){
        System.out.println("Найдем из списка самую длинную строку (или несколько, если она такая не одна), " +
                "выведем их на экран.");
        int max=0;
        int dlina=0;
        for (int i=0;i<list.size();i++){
            dlina = ((String)list.get(i)).length();
            if (max<dlina){max=dlina;}
        }
        for (int i=0;i<list.size();i++){
            dlina = ((String)list.get(i)).length();
            if (max==dlina){
                System.out.println(list.get(i));
            }
        }

    }
}

class Lev7Lec6Task3 implements Lecture{
    @Override
    public void run() {
        System.out.println("Находим самую короткую строку и выводим её на экран. " +
                "Если таких строк несколько — выводим их все, каждую с новой строки.");
        ListClass listClass = new ListClass();
        // https://javarush.com/groups/posts/1884-pattern-iterator
        // https://www.baeldung.com/java-iterate-list
        Iterator<String> iterator = listClass.list.iterator();
        int min = 1000; String str="";
        while (iterator.hasNext()){
            str=iterator.next();
            if (min>str.length()){min=str.length();}
        }
        //интератор на первую позицию
        iterator = listClass.list.iterator();
        while (iterator.hasNext()){
            str=iterator.next();
            if (min==str.length()){
                System.out.println(str);
            }
        }

    }
}

class Lev7Lec6Task4 implements Lecture {
    @Override
    public String info() {
        return "Добавление в начало списка 10 строк.";
    }

    @Override
    public void run() {
        this.getinfo();
        ListClass listClass = new ListClass();
        listClass.list.addAll(0, Arrays.asList(listClass.array));
        // for-each cycle
        for (Object str : listClass.list){
        System.out.println(" ["+(String)str+"] ");}
    }
}

class Lev7Lec10Task1 implements Lecture{
    @Override
    public String info() {
        return "Сортировка массива чисел классом Arrays";
    }

    @Override
    public void run() {
        this.getinfo();
        ListClass listClass = new ListClass();
        System.out.println("До "+Arrays.toString(listClass.numbers));
        Arrays.sort(listClass.numbers);
        System.out.println("После "+Arrays.toString(listClass.numbers));

    }
}

class Lev7Lec10Task2 implements Lecture{
    @Override
    public String info() {
        return "Обработка массивов чисел классом Arrays";
    }

    @Override
    public void run() {
        this.getinfo();
        ListClass listClass = new ListClass();
        System.out.println("Массив "+Arrays.toString(listClass.numbers));
        System.out.print("Новый массив nubm2 длиной 2 элемента ");
        int[] numb2 = new int[2];
        System.out.println(Arrays.toString(numb2));
        System.out.println("При копировании в numb2 передается ссылка на новый массив длинной listClass.numbers.length");
        numb2 = Arrays.copyOf(listClass.numbers, listClass.numbers.length);
        System.out.println("Скопировали числа в новый массив "+Arrays.toString(numb2));
        System.out.println("---");
        // Arrays.deepEquals() и Arrays.deepToString() для двумерных массивов
        System.out.print("Теперь сравниваем массивы. Результат ");
        System.out.println(Arrays.equals(listClass.numbers, numb2));
        System.out.println("---");
        System.out.print("Новый массив nubm3 длиной 3 элемента ");
        int[] numb3 = new int[3];
        System.out.println(Arrays.toString(numb3));
        System.out.println("Скопировали 4 числа в новый массив");
        numb3 = Arrays.copyOf(listClass.numbers, 4);
        System.out.println(Arrays.toString(numb3));
        System.out.println("---");
        System.out.println("Копируем 4 елемента начиная со второго. Массивы нумеруются с нуля.");
        int[] numb4 = new int [0];
        numb4 = Arrays.copyOfRange(listClass.numbers, 2, 6);
        System.out.println(Arrays.toString(numb4));

    }
}

class Cat extends Cat_task2{
    private String name;
    Cat(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + "\'" +
                "}";
    }
}

class Lev7Lec10Task3 implements Lecture{
    @Override
    public String info() {
        return "Примеры с ArrayList";
    }
    @Override
    public void run() {
        Cat[] cats_arr = new Cat[2];
        cats_arr[0] = new Cat("Мурзик");
        cats_arr[1] = new Cat("Томас");
        ListClass listClass = new ListClass();
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(cats_arr[0]);
        cats.add(cats_arr[1]);
        cats.add(new Cat("Бегемот"));
        System.out.print("Вывод индекса по ссылке на объект. Индекс: ");
        System.out.println(cats_arr[0].getname()+" "+cats.indexOf(cats_arr[0])); // мурзик
        System.out.print("Имя третьего кота (поиск по индексу 2): ");
        System.out.println(cats.get(2).getname());
        System.out.println("Два Array lista "+cats.toString()+ Cat.cats.toString());
        System.out.println("Содержит лист объект с индексом 0? "+cats.contains(cats_arr[0]));
        // вставка объектов
        // add(int index, Cat element) добавляет
        // set(int index, Cat element) затирает старое значение
        // clear() очистка листа
        // Arrays.asList(<массив>) преобразование массива лист
        // <лист>.toArray(new Cat[0]) предразование листа в массив, параметром передали пустой массив так увелиена производительность
        // <лист>.size() - размер листа
    }
}

class Lev7Lec10Task4 implements Lecture{
    @Override
    public String info() {
        return "Удаление элемента из списка ArrayList";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        System.out.println(listClass.list.toString());
        listClass.list.remove(1);
        System.out.print("Удалили елемент 2: ");
        System.out.println(listClass.list.toString());
        listClass.list.clear();
        Cat pushok = new Cat("Пушок");
        listClass.list.add(pushok);
        Cat kabanchik = new Cat("Кабанчик");
        listClass.list.add(kabanchik);
        Cat alisa = new Cat("Алиса");
        listClass.list.add(alisa);
        System.out.println(listClass.list.toString());
        System.out.print("Убираем кота Пушок по ссылке на объект ");
        listClass.list.remove(pushok);
        listClass.list.add(1, new Cat("Анфиса"));
        System.out.println(listClass.list.toString());

        System.out.println("Удаляем кота Анфиса через итератор:");
        Iterator<Cat> iterator = listClass.list.iterator();
        Cat cat;
        while (iterator.hasNext()) {
            cat = iterator.next();
            if (cat.getname().equals("Анфиса")){iterator.remove();}
            System.out.println(cat.toString());
        }
        System.out.println(listClass.list);

    }
}

class Lev7Lec12Task1 implements Lecture{
    @Override
    public String info() {
        return "Заполнить ArrayList числами, вывести чиста в обратном порядке";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        listClass.list.clear();
        for (Integer nom:listClass.numbers) {
            listClass.list.add(nom);
        }
        System.out.println(listClass.list.toString());
        for (int i=listClass.list.size()-1;i>=0;i--){
            System.out.print (listClass.list.get(i)+", ");
        }
        System.out.println();
        List<Integer> stooges = Arrays.asList(1, 2, 3);
        System.out.println("Integer to List: "+stooges);
    }
}

class Lev7Lec12Task2 implements Lecture{
    @Override
    public String info() {
        return "Перестановка первых трех строк в конец списка";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        System.out.println(listClass.list.toString());
        for (int i=0; i<=2; i++){
            listClass.list.add(listClass.list.get(i));
        }

        Iterator<String> iterator = listClass.list.iterator();
        int i=-1;
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
            i++;
            if (i==2) {break;};
        }
        System.out.println(listClass.list.toString());
        }
    }

class Lev7Lec12Task3 implements Lecture{
    @Override
    public String info() {
        return "Найти минимум и максимум в массиве.";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        int min = listClass.numbers[0], max=listClass.numbers[0];
        System.out.println( Arrays.toString(listClass.numbers) );
        for (int el:listClass.numbers) {
            if (min > el){min=el;}
            if (max<el){max=el;}
        }
        System.out.println("min="+min+" max="+max);
    }
}

class Lev7Lec12Task7 implements Lecture{
    @Override
    public String info() {
        return "Вывести лист в обратном порядке.";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        listClass.inOut = new InOut();
        listClass.inOut.print(listClass.arrayList);
        Collections.reverse(listClass.arrayList);
        listClass.inOut.print(listClass.arrayList);

    }
}

class Lev7Lec12Task6 implements Lecture{
    @Override
    public String info() {
        return "После введения пустой строки, все буквы в листе конвертируются в верхний регистр. " + "\r\n"+
                "Если в строке чётное число букв, строка удваивается, если нечётное – утраивается";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        Lev7Lec12Task5 lev7Lec12Task5 = new Lev7Lec12Task5();
        lev7Lec12Task5.enter_str(listClass.arrayList);
        Boolean flag=false;
        for (String str:listClass.arrayList) {
            if (str.equalsIgnoreCase("")){flag=true;}
        }
        String strforloop="";
        if (flag) {
            for (int i=0; i<listClass.arrayList.size();i++) {
                strforloop=listClass.arrayList.get(i).toUpperCase();
                listClass.arrayList.set(i, strforloop);
            }
        }
        int index=-1;
        for (String str:listClass.arrayList) {
            if (str.length() % 2 == 0){
                index = listClass.arrayList.indexOf(str);
                listClass.arrayList.set(index, str+" "+str);
            }else{
                index = listClass.arrayList.indexOf(str);
                listClass.arrayList.set(index, str+" "+str+" "+str);
            }

        }
        lev7Lec12Task5.print(listClass.arrayList);
    }
}

class InOut extends Lev7Lec12Task5{}

class Lev7Lec12Task5 implements Lecture{
    @Override
    public String info() {
        return "Добавление в лист строк пока не введено ключевое слово.";
    }

    void enter_str(ArrayList arrayList){
        System.out.println("Вводите, для завершения 'stop'");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str="start", exit = "stop";
        arrayList.clear();
        while (!str.equalsIgnoreCase(exit)){
            try {str = bufferedReader.readLine();}
            catch (Exception e){System.out.println(e.getMessage());}
            if (!str.equalsIgnoreCase(exit)) arrayList.add(str);
        }
    }
    void print(List list){
        System.out.println("Содержимое списка:");
        System.out.println(list.toString());
    }
    void print(Set set){
        System.out.println("Содержимое множества:");
        System.out.println(set.toString());
    }

    void print(Map map){
        System.out.println("Содержимое словаря:");
        System.out.println(map.toString());
    }

    void print_map_of_Objects(Map<String, Object> map){
        // это не реботает как надо
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        String str="";
        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            System.out.print(entry.getClass()+", ");
        }
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        print(listClass.arrayList);

        enter_str(listClass.arrayList);
        print(listClass.arrayList);
    }
}

class Lev7Lec12Task4 implements Lecture {
    @Override
    public String info() {
        return "Вывод списка на экан с задержкой.";
    }

    @Override
    public void run() {
        getinfo();
        try {
            go();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void go()throws InterruptedException{
        ListClass listClass = new ListClass();
        for (String el:listClass.spisok) {
            System.out.print(el+" ");
            Thread.sleep(1000);
        }
    }
}



public class Level7 {
    public static void main(String[] args) throws IOException{
        //Lecture lecture = new Lev7Lec5();
        //lecture.run();

        //System.out.println(Jobs.class.getName());
        //Lecture jobs = new Jobs(Lev7Lec6Task4.class);

        // массив объектов
        // https://javarush.com/groups/posts/1932-koe-chto-o-massivakh
        //ListClass listClass = new ListClass();
        //listClass.lectures[0].run();

        Lecture jobs = new Jobs(new Lev8Lec4());

        //Lecture jobs = new Jobs(new Lev7Lec6Task4(), new Lev7Lec6Task2(), new Lev7Lec6Task3());
        //jobs.run();



    }
}
