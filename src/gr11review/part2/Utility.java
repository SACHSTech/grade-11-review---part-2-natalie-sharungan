package gr11review.part2;
import java.io.*;
import java.util.*;

public class Utility {
  public static String zipZap(String str){
    //Variables

    int intLetterCount;
    int intLetter=0;
    String Zip ="";
    intLetterCount = str.length();
    
    //Calculations

    while(intLetter <= intLetterCount-3){
      //while intLetter is less or equal to the the length of str -3 run the loop
      if(intLetter == intLetterCount - 2){
        //if intLetter and and the lenght of the str -2 are the equal then return Zip with the str.substring(lenght of str -3, lenght of str) 
        return Zip + str.substring(intLetterCount-3,intLetterCount);
      }else if(str.charAt(intLetter) == 'z' && str.charAt
      (intLetter + 2) == 'p'){
        // if a letter is equal to z and two letters down is equal to z then return Zip + zp and add 3 to intLetter
        Zip = Zip + "zp";
        intLetter=intLetter + 3;
      }else{
        // if none of the above conditions are meant return Zip + str.substring(intLetter, intLetter +1) and add 1 to intLetter
        Zip = Zip + str.substring(intLetter,intLetter+1);
       intLetter = intLetter + 1;
      }
    } 
    return Zip;
  }
  public static String longestWord(String filenametxt)throws IOException{

    BufferedReader filename = new BufferedReader(new FileReader(filenametxt));
    //Getting ready to read file  

    //Variables
    String strWord;
    String strLong;
    int intWord;
    int intLong;

    strWord = filename.readLine();
    strLong = " ";

    while(strWord != null){
    //Run loop until end of file
      intWord = strWord.length();
      intLong = strLong.length();
      if(intWord >= intLong){
      //if intWord is equal or greater then intLong then strWord becomes strLong
        strLong = strWord;
      }
      strWord = filename.readLine();
    }
    filename.close();
    //Close file after we are done
    return strLong;
  }
  public static int[] tenRun(int[] nums){
    
    //Variables
    int intCount;
    int intMulti = 1;

    for(intCount = 0; intCount < nums.length; intCount++){
      //if intCount is less then length of array then run loop
      if(nums[intCount] % 10 == 0){
        intMulti = nums[intCount];
        //if nums[intCount] divided by 10 gives a remainder of 0 then it is a multiple of 10, change intMulti into a multiple of ten   
      }else if(nums[intCount] % 10 !=0 && intMulti !=1){
        nums[intCount] = intMulti;
        //if nums[intCount] divided by 10 doesn't equal 1 and intMulti doesn't equal 1, then change the number to a multiple of ten
      }else{
        nums[intCount] = nums[intCount];
        //if none of the above conditions are meant make nums[intCount] = nums[intCount]
      }
    }
  return nums;
  }

}
