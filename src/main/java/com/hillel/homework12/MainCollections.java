package com.hillel.homework12;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "orange", "apple", "grape", "banana");
        String target = "apple";
        System.out.println("The occurrence of \"" + target + "\" is: " + countOccurrence(words, target));

        System.out.println();

        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("List: " + list);

        System.out.println();

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1, 5, 3);
        System.out.println("Original list: " + numbers);
        System.out.println("Unique list: " + findUnique(numbers));

        System.out.println();

        List<String> animals = List.of("bird", "fox", "cat", "bird", "dog", "cat", "bird");
        calcOccurrenceV1(animals);

        System.out.println();

        List<WordOccurrence> occurrences = findOccurrence(animals);
        System.out.println(occurrences);


    }


    public static int countOccurrence(List<String> words, String str) {
        int count = 0;
        for (String word :
                words) {
            if (word.equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }


    public static void calcOccurrenceV1(List<String> words) {
        Map<String, Integer> map1 = new HashMap<>();

        for (String word :
                words) {
            int counter = map1.getOrDefault(word, 0);
            map1.put(word, counter + 1);
        }

//        System.out.println(map1);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static List<WordOccurrence> findOccurrence(List<String> words) {
        Map<String, Integer> occurrenceMap = new HashMap<>();

        for (String word :
                words) {
            int counter = occurrenceMap.getOrDefault(word, 0);
            occurrenceMap.put(word, counter + 1);
        }
        List<WordOccurrence> occurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry :
                occurrenceMap.entrySet()) {
            String word = entry.getKey();
            int occurrence = entry.getValue();
            WordOccurrence wordOccurrence = new WordOccurrence(word, occurrence);
            occurrences.add(wordOccurrence);
        }
        return occurrences;
    }

    public static class WordOccurrence {
        private String name;
        private int occurrence;

        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        public String getName() {
            return name;
        }

        public int getOccurrence() {
            return occurrence;
        }

        @Override
        public String toString() {

            return "{name: \"" + name + "\", occurrence: " + occurrence + "}";

        }

    }


}
