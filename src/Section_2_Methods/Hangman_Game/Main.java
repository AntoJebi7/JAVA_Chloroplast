package Section_2_Methods.Hangman_Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String word = "pizza";
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<Character>();
        int wrongGuesses = 0;
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        //System.out.println(wordState);
        System.out.println("Play JAVA Hangman Game !");
        //System.out.println(getHangmanArt(6));
        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("word :");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("Guess a letter :");
            char guess = sc.next().toLowerCase().charAt(0);
            //System.out.println(guess);

            if(word.indexOf(guess)>=0){
                System.out.println("Correct Guess !");

                for (int i = 0; i < word.length(); i++) {
                    if(word.charAt(i)==guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println(" you win ");
                    System.out.println("the word was "+ word);
                    break;
                }

            }else{
                wrongGuesses++;

            }
        }
        if(wrongGuesses>=6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("game over");
            System.out.println("the word was "+ word);
        }
    }

    static String getHangmanArt(int wrongGuesses) {

        return switch(wrongGuesses){
            case 0-> """
                     
                     
                     
                     """;
            case 1-> """
                      o
                     
                     
                     """;
            case 2-> """
                      o
                      |
                     
                     """;
            case 3-> """
                      o
                     /|
                     
                     """;
            case 4-> """
                      o
                     /|\\
                     
                     """;
            case 5-> """
                      o
                     /|\\
                     /
                     """;
            case 6-> """
                      o
                     /|\\
                     / \\
                     """;
            default -> "";

        };
    }
}
