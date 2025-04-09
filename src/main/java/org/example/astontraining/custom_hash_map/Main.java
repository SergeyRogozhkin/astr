package org.example.astontraining.custom_hash_map;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        // проверка метода put
        map.put("ОДИН", 1);
        map.put("ДВА", 2);
        map.put("ТРИ", 3);
        map.put("ЧЕТЫРЕ", 4);
        map.put("ПЯТЬ", 5);
        map.put("ШЕСТЬ", 6);
        map.put("СЕМЬ", 7);

        System.out.println("Проверка метода get");
        System.out.println("Значение по ключу ДВА: " + map.get("ДВА"));
        System.out.println("Значение по ключу ШЕСТЬ: " + map.get("ШЕСТЬ") + "\n");

        System.out.println("Проверка метода remove");
        map.remove("ДВА");
        map.remove("СЕМЬ");

        System.out.println("Проверка после удаления ДВА " + map.get("ДВА")); // null
        System.out.println("Проверка после удаления СЕМЬ " + map.get("СЕМЬ")+ "\n"); // null


        System.out.println("Вывод всей Мапы. Порядок вывода не гарантируется.");
        map.printMap();
    }
}
