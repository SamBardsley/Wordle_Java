import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class List {
  
  public static String getword() throws FileNotFoundException{
    File myFile       = new File("GuessableWords.txt");
    Scanner scan      = new Scanner(myFile);
    ArrayList<String> wordlist = new ArrayList<String>();
    Random rand       = new Random();
    //String [] list    = words.split(" ");

    
    while(scan.hasNext()){
      wordlist.add(scan.next());
    }
    
    int chosennum     = rand.nextInt(wordlist.size() - 1);
    String chosenword = wordlist.get(chosennum);
    
    //String chosenword = list[chosennum];
    return chosenword;
  }

/*
static String words = "women death cabin words among ready truth false ashes sonic react wrath fifty reach chose chase slash faked snake sammy lyric zebra gavel break broke brave quest crack bulky cents night girly awake manly corps audio catch clout sword irony raise venom hired drawn oddly extra under greet dweeb fewer paris amaze glass cited bleak north south notes needs forum power wrong";
  */





  
}