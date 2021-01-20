package gr11review.part2;
import java.io.*;
import java.util.*;
import gr11review.part2.Utility.*;

public class Main{
  public static void main(String[] args) throws IOException{

    System.out.println(Utility.zipZap("zzzuzoz"));

    String strLong = Utility.longestWord("src/gr11review/part2/filename.txt");

    System.out.println(strLong);

    int[] intNums = {1, 10, 2, 20, 30, 40};
    intNums = Utility.tenRun(intNums);
    System.out.println(Arrays.toString(intNums));

    int[] inner = {1, 2, 4, 6};
    int[] outer = {2, 4};
    System.out.println(Utility.linearIn(outer, inner));

    Utility.pascalTri(4, 5);
  }
}
