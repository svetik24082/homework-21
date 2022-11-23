import product.Product;
import product.Recipe;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1.1");
        HashMap<String, String> directory = new HashMap<>();
        directory.put(" Головин Андрей ", " +79896954120");
        directory.put(" Марков Иван ", " +79856804120");
        directory.put(" Жилин Дмитрий ", " +7989612345");
        directory.put(" Белова Арина ", " +79625954120");
        directory.put(" Багин Михаил ", " +79856954120");
        directory.put(" Короткова Лилия ", " +79896954132");
        directory.put(" Дуров Иван ", " +79896938720");
        directory.put(" Зорькин Николай ", " +79896956320");
        directory.put(" Кремлев Арсений ", " +79896654120");
        directory.put(" Коротков Илья ", " +7989612365");
        directory.put(" Сокова Мария ", " +79891235820");
        directory.put(" Трубицин Дмитрий ", " +79196954120");
        directory.put(" Крылова Юлия ", " +79812348976");
        directory.put(" Пушкарева Екатерина ", " +79896952369");
        directory.put(" Жданов Андрей ", " +7989645369");
        directory.put(" Воропаева Кира ", " +79802356945");
        directory.put(" Верещагин Олег ", " +79632954120");
        directory.put(" Гривин Антон ", " +79896902025");
        directory.put(" Белоусов Илья ", " +79891569252");
        directory.put(" Кросс Карина ", " +79891239120");
        System.out.println(directory);
        for (Map.Entry entry : directory.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        System.out.println(" Задание 1.3");
        Task3 task3 = new Task3();
        task3.addToMap("Ключ 1", 1);
        task3.addToMap(" замок", 2);
        task3.addToMap(" замок", 6);
        System.out.println(task3);


        System.out.println();
        System.out.println(" Задание 2.1");
        ListMap listMap = new ListMap();
        listMap.getOriginalMapEntries();
        listMap.getTransformedCollection();
        System.out.println(listMap.getOriginalMapEntries());
        System.out.println(listMap.getTransformedCollection());


        System.out.println(" Задача 2.2");
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(2, " пример 2 ");
        orderedMap.put(1, " пример 1 ");
        orderedMap.put(3, " пример 3 ");
        orderedMap.put(5, " пример 5 ");
        orderedMap.put(4, " пример 4 ");
        orderedMap.put(7, " пример 7 ");
        orderedMap.put(8, " пример 8 ");
        orderedMap.put(6, " пример 6 ");
        orderedMap.put(10, " пример 10 ");
        orderedMap.put(9, " пример 9 ");
        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}

