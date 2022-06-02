import java.util.Scanner;

class Wordle {
  public static void main(String[] args) {
    System.out.println("Hello worldle!");
    Scanner scn = new Scanner(System.in);
    String guess = scn.nextLine();
    verifier(guess);
  }

  public static int[] verifier(String guess) {
    int[] correctness = new int[3];
    return correctness;
  }
}