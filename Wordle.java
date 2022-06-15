 import java.util.Arrays;
import java.util.Scanner;

import java.io.*;

class Wordle {
  public static final Scanner input = new Scanner(System.in);
  public static final String[] message = {"Genius.", "Magnificent.", "Impressive.", "Splendid.", "Great.", "Phew."};
  public static final int answerLength = 5;
  
  public static void main(String[] args) throws FileNotFoundException {
    List words     = new List();
    String Answer = words.getword();
    System.out.println(Answer);

    int tries = 0;
    for(int i = 0; i < 5; i++) {
      int[] score = correctness(Answer); 
      System.out.println(Arrays.toString(score));
      tries++;
      if (verifier(score)) break;
    }
    endMessage(tries);
  }

  // for loop runs through string 'b' and compares it to indexes of string 'a'
  public static int[] correctness(String answer) {
    System.out.print("Guess a word ");

    String a = wordChecker();
    int[] wordle = new int[a.length()];
    
    for(int i = 0; i < a.length(); i++) { 
      if(a.charAt(i) == answer.charAt(i)) {
        wordle[i] = 2;
      } else {
        for(int j = 0; j < answer.length(); j++) {
          if(a.charAt(i) == answer.charAt(j)) {
            wordle[i] = 1;
          }
        }
      }   
    }  
    return wordle;  
  }

  public static String wordChecker() {
    boolean correctLength=false;
    String guess = "";
    while (!correctLength) {
      String currentGuess = input.next();
      if (currentGuess.length()==answerLength) {
        correctLength=true;
        guess=currentGuess;
      } else {
        System.out.println("Your word must be " + answerLength + " letters long");
      }
    }
    return guess;
  }

  public static boolean verifier(int[] wordle) {
    for (int i=0; i<5; i++) {
      System.out.println(wordle[i]);
      if (wordle[i]<=1) {
        return false;
      }
    }
    return true;
  }

  public static void endMessage(int tries) {
    if(tries == 1) {
      System.out.println(message[0] + " You guessed the Wordle in 1 try.");
    } else {
      System.out.println(message[tries] + " You guessed the Wordle in " + tries + " tries.");
    }
  }
}