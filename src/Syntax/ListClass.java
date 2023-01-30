package Syntax;

import java.util.*;

public class ListClass extends Lev7Lec6Task1 {

    List list;
    LinkedList linkedList;
    Map map;
    Set set;
    ArrayList<String> arrayList = new ArrayList<String>();
    String[] array, array2;
    int[] numbers = {7, 12, 8, 4, 33, 79, 1, 16, 2, 46};
    Lecture[] lectures = new Lecture[10];
    InOut inOut;

    public ListClass() {
        Lev8Lec6Task1 lev8Lec6Task1 = new Lev8Lec6Task1();
        linkedList = new LinkedList<String>();
        lev8Lec6Task1.add_valueToLinkedList_String(this.linkedList);

        Lev8Lec3Task1_Set lev8Lec3Task1 = new Lev8Lec3Task1_Set();
        this.set = new HashSet<String>();
        lev8Lec3Task1.add_valueToSet(this.set);

        this.map = new HashMap<String, String>();
        Lev8Lec3Task2_Map lev8Lec3Task2 = new Lev8Lec3Task2_Map();
        lev8Lec3Task2.add_valueToMap(this.map);

        list = spisok;
        arrayList.addAll(spisok);
        Shooba somelec = new Shooba();
        array = somelec.shooba;
        array2 = new String[10];
        array2[0] = "Лена Елисеева, 12 марта";
        array2[1] = "Коля Романов, 18 мая";
        array2[2] = "Вика Игнатова, 12 июля";
        array2[3] = "Денис Козлов, 7 сентября";
        array2[4] = "Максим Масленников, 9 ноября";
        array2[5] = "Роман Баранов, 14 августа";
        array2[6] = "Валерия Пяткина, 1 апреля";
        array2[7] = "Олеся Остапенко, 3 января";
        array2[8] = "Костя Гурко, 19 октября";
        array2[9] = "Сережа Наумов, 3 мая";

        lectures[0] = new Lev7Lec6Task4();
    }
}
