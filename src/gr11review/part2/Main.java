package gr11review.part2;
import java.io.*;
import gr11review.part2.Utility.*;

public class Main{
public static void main(String[] args) throws IOException{

  System.out.println(Utility.zipZap("zzzopzop"));

    String strLong = Utility.longestWord("src/gr11review/part2/filename.txt");

    System.out.println(strLong);
  }
}
