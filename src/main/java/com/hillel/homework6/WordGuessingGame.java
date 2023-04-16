package com.hillel.homework6;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        String wordToGuess = words[rand.nextInt(words.length)];

        String userGuess;

        String guessedWord = "";

        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord += "###";
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the word: " + guessedWord);

            userGuess = scanner.nextLine().toLowerCase();

            if (userGuess.equals(wordToGuess)) {
                System.out.println("Congratulations! You have guessed the word.");
                break;
            } else {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (i >= userGuess.length()) {
                        break;
                    }
                    if (wordToGuess.charAt(i) == userGuess.charAt(i)) {
                        guessedWord = guessedWord.substring(0, i) + wordToGuess.charAt(i) +
                                guessedWord.substring(i + 1);
                    }
                }
            }
        }
        scanner.close();
    }
}
