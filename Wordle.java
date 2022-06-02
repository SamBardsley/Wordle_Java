import java.util.Arrays;
import java.util.Scanner;

class Wordle {
  public static final Scanner input = new Scanner(System.in);
  public static final String answer = "crane";
  
  public static void main(String[] args) {

    for(int i = 0; i < 5; i++) {
      int[] score = correctness(); 
      System.out.println(Arrays.toString(score));
      if (verifier(score)) break;
    }
    System.out.println("You're done.");
  }

  // for loop runs through string 'b' and compares it to indexes of string 'a'
  public static int[] correctness() {
    System.out.println("Word guess? ");
    
    String a = input.next();  
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

  public static boolean verifier(int[] wordle) {
    for (int i=0; i<4; i++) {
      if (wordle[i]==0||wordle[i]==1) {
        return false;
      }
    }
    return true;
  }
}