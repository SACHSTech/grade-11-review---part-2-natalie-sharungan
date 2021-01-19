package gr11review.part2;
import java.io.*;
import java.util.*;
import gr11review.part2.Utility.*;

public class Main{
public static void main(String[] args) throws IOException{

  System.out.println(Utility.zipZap("zzzopzop"));

    String strLong = Utility.longestWord("src/gr11review/part2/filename.txt");

    System.out.println(strLong);

    int[] intNums = {1, 10, 2, 20, 30, 40};
    intNums = Utility.tenRun(intNums);

    System.out.println(Arrays.toString(intNums));
  }
}
