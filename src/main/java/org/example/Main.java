package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        removeEvenNumber(numbers);
        System.out.println(numbers);

    }

    //  Удалить все четные элементы из списка
    static void removeEvenNumber(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        Integer first = iterator.next();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }


    }

    static void removeIntegers(List<String> strings) {
        // Удалить строки, которые являются целыми числами
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            try {
                int x = Integer.parseInt("string");
                iterator.remove();
            } catch (NumberFormatException e) {

            }

        }

    }
}