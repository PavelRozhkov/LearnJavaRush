package Syntax;

import java.util.*;

class Lev8Lec3Task5 implements  Lecture{
    @Override
    public String info() {
        return "Заносим разные значения в Map<String, Object>, выводим их на эекран.";
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        listClass.map = new HashMap<String, Object>();
        listClass.map.put("массив1", listClass.array);
        listClass.map.put("массив2", listClass.array2);
        listClass.map.put("ArrayList", listClass.arrayList);
        listClass.map.put("массив чисел", listClass.numbers);

        listClass.inOut = new InOut();
        listClass.inOut.print(listClass.map);
        listClass.inOut.print_map_of_Objects(listClass.map);

    }
}

class Lev8Lec3Task4 implements  Lecture{
    @Override
    public String info() {
        return "Вывести список ключей и список значений, каждый с новой строки.";
    }

    @Override
    public void run() {
        getinfo();
        Lev8Lec3Task3 lev8Lec3Task3 = new Lev8Lec3Task3();
        ListClass listClass = new ListClass();
        listClass.map = new HashMap<String, Cat>();
        lev8Lec3Task3.addCatsToMap(listClass.map);

        Iterator<Map.Entry<String, Cat>> iterator = listClass.map.entrySet().iterator();
        System.out.print("Список ключей: ");
        while (iterator.hasNext()){
            Map.Entry<String, Cat> entry = iterator.next();
            System.out.print(entry.getKey()+" ");
        }
        System.out.println();
        System.out.print("Список значений: ");
        iterator = listClass.map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Cat> entry = iterator.next();

            System.out.print(entry.getValue()+" ");
        }

    }
}

class Lev8Lec3Task3 implements  Lecture{
    @Override
    public String info() {
        return "Создаем коллекию map и добавляем 6 котов.";
    }
    Cat cat;
    public void addCatsToMap(Map<String, Cat> map){
        cat = new Cat ("Алиса");
        map.put(cat.getname(), cat);
        cat = new Cat ("Кабанчик");
        map.put(cat.getname(), cat);
        cat = new Cat ("Анфиса");
        map.put(cat.getname(), cat);
        cat = new Cat ("Мильда");
        map.put(cat.getname(), cat);
        cat = new Cat ("Персик");
        map.put(cat.getname(), cat);
        cat = new Cat ("Абрикосик");
        map.put(cat.getname(), cat);
    }

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        listClass.map = new HashMap<String, Cat>();
        addCatsToMap(listClass.map);
        listClass.inOut = new InOut();
        listClass.inOut.print(listClass.map);
    }
}

class Lev8Lec3Task2_Map implements  Lecture{
    /*
    https://javarush.com/quests/lectures/questsyntax.level08.lecture07
    Map – это множество пар. То же множество, но не одиноких элементов, а пар: ключ-значение.
    Единственное ограничение: первый объект в паре, называемый ключом, должен быть уникальным.
    В Map не может содержаться две пары с одинаковыми ключами.

— Вот что мы можем делать с Map:
Операция	Метод
Получить множество всех пар	entrySet()
Получить множество всех ключей	keySet()
Получить множество всех значений	values()
Добавить пару	put(key, value)
Получить значение по ключу	get(key)
Проверить наличие «ключа»	containsKey(key)
Проверить наличие «значения»	containsValue(value)
Проверить что Map — пустой	isEmpty()
Очистить Map	clear()
Удалить элемент по ключу	remove(key)
     */
    @Override
    public String info() {
        return "Добавление значений в map, вывод их на экран.";
    }

    @Override
    public void run() {
        ListClass listClass = new ListClass();
        listClass.inOut = new InOut();
        listClass.inOut.print(listClass.map);
    }
    public void add_valueToMap(Map map){
        map.put("ягода", "арбуз сладкий1");
        map.put("ягода", "арбуз сладкий");// заноситься новое значение,. если ключь уже есть
        map.put("фрукт", "банан спелый");
        map.put("вишня", "вишня сочная");
        map.put("груша", "груша сладкая");
        map.put("дыня", "дыня желтая");
        map.put("ежевика", "ежевика крупная");
        map.put("растение", "женьшень полезный");
        map.put("земляника", "земляника лесная");
        map.put("цветок", "ирис цветок");
        map.put("овощь", "картофель молодой");
    };
}

class Lev8Lec3Task1_Set implements Lecture{
    /*
    https://javarush.com/quests/lectures/questsyntax.level08.lecture07
Set – это множество – куча ненумерованных объектов. Главная особенность Set – в нем только
уникальные объекты, т.е. они все разныe. Вот что с ним можно делать:
Операция	Метод
Добавлять элемент(ы)	add(), addAll()
Удалять элемент(ы)	remove(), removeAll()
Проверять, есть ли элемент(ы)	contains(), containsAll()
     */
    @Override
    public String info() {
        return "Добавление значений в set, вывод их на экран.";
        //арбуз, банан, вишня, груша, дыня, ежевика, женьшень, земляника, ирис, картофель.
    }
    public void add_valueToSet(Set set){
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
    };

    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        //listClass.set = new HashSet<String>();
        //add_HashSet(listClass.set);
        listClass.inOut = new InOut();
        listClass.inOut.print(listClass.set);

    }
}

class Lev8Lec4 implements Lecture{
    @Override
    public String info() {
        return "Знакомство с классом Date";
    }

    @Override
    public void run() {
        getinfo();
        Date date = new Date();
        System.out.println("Подождем немного...");
        try {Thread.sleep(1000);}
        catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("А вот и наша дата: "+date.toString()+" в милисекундах "+date.getTime());
        Date current_date = new Date();
        System.out.println("Текущее время позже "+date.toString()+" : " +current_date.after(date));
        System.out.println(current_date.getDate()+" "+current_date.getMonth()+" "+current_date.getYear());

        Lecture12 lecture12 = new Lecture12();
        lecture12.run();
    }
}

class Lev8lec9_Collections implements Lecture{
    @Override
    public String info() {
        return "Класс Collections";
        //https://javarush.com/groups/posts/1937-klass-collections
    }

    @Override
    public void run() {
        ListClass listClass = new ListClass();
        listClass.inOut = new InOut();
        System.out.print("arrayList before sort ");
        listClass.inOut.print(listClass.arrayList);
        System.out.print("max = ");
        System.out.println(Collections.max(listClass.arrayList));
        Collections.sort(listClass.arrayList);
        System.out.print("arrayList after sort ");
        listClass.inOut.print(listClass.arrayList);
        System.out.print("min = ");
        System.out.println(Collections.min(listClass.arrayList));
        Collections.reverse(listClass.arrayList);//Перевернуть список
        System.out.print("Перевернутый список ");
        listClass.inOut.print(listClass.arrayList);
        Collections.shuffle(listClass.arrayList);//Перемешать список
        System.out.print("Перемешанный список ");
        listClass.inOut.print(listClass.arrayList);

    }
}

class Lev8Lec6Task1 implements Lecture {
    @Override
    public String info() {
        return "Создаем LinkedList.";
    }
    void add_valueToLinkedList_String (List list){
        list.add("Инженер IT");
        list.add("Разработчик ПО");
        list.add("Специалист по информационной безопасности");
        list.add("Digital-маркетолог");
        list.add("Логист");
        list.add("Менеджер по продажам");
        list.add("Врач, фармацевт");
        list.add("HR-менеджер");
    }
    @Override
    public void run() {
        getinfo();
        ListClass listClass = new ListClass();
        listClass.list = new LinkedList<String>();
        add_valueToLinkedList_String(listClass.list);
        listClass.inOut = new InOut();
        listClass.inOut.print(listClass.list);
    }
}

public class Level8 {
    // полезные ссылки https://javarush.com/quests/lectures/questsyntax.level08.lecture09
    public static void main(String[] args) {
        Lecture jobs = new Jobs(new Lev8lec9_Collections());
    }
}
