package org.example.LexiconAssignments;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] listOfWords = {"apple", "chicken", "hello", "orange", "black", "white", "car" };
        String[] theAlphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        //a b c d e f g h i j k l m n o p q r s t u v w x y z
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        String randomWord = listOfWords[random.nextInt(listOfWords.length)]; //carries a random word from the list of words
        System.out.println(randomWord);

        System.out.println(listOfWords[new Random().nextInt(listOfWords.length)]); //another way of accessing the string array and print out a
        // random word of it

        Scanner input = new Scanner(System.in);
       // System.out.println("Pick a letter or write the whole word if you know it!");

        char[] rightCharacter = new char[randomWord.length()]; //initialize a character array as big as the randomWord's indexes
        randomWord.getChars(0, randomWord.length(), rightCharacter, 0); //copy each characters to the new array
        System.out.println(rightCharacter[0]);

        //  for (int i =0; i < listOfWords.length; i++){

        StringBuilder guessedCharacter = new StringBuilder();
        int counter = 0;
        int maxGuesses = 3;
        while (counter <= maxGuesses ) {
           // char charInput = input.next().charAt(0); //picks the first character of the string
            if (counter == maxGuesses){
                System.out.println("You loose!");
                break;
            }
            System.out.println("Pick a letter or write the whole word if you know it!");

            String wordGuess = input.next();

            for(int i =0; i < rightCharacter.length; i++){
            if(wordGuess.charAt(0) == rightCharacter[i])
                System.out.println("Correct!");
            }
            if (wordGuess.equals(randomWord)){
            System.out.println("You win!");
            break;
        }

            System.out.println("You chose: " + wordGuess);
            guessedCharacter.append(wordGuess + ", ");
            System.out.println("This letter is not in the word. Choose another!");

            //guessedCharacter.equals(guessedCharacter.toString().toUpperCase(Locale.ROOT));
            System.out.println("Used letters: " + guessedCharacter.toString().toUpperCase(Locale.ROOT));
            counter++;
            System.out.println("Chances left: " + (maxGuesses - counter) + " times!");

            //charInput = input.next().charAt(0);

        }
        }









}
