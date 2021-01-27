package gr11review.part2;
import java.io.*;
import java.util.*;

/**
*Java file that contains all the methods 
*@author: S. Umaipalan
*/
public class Utility {

  /**
  * @param str
  * @return Zip
  * @author: S. Umaipalan
  */

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

  /**
  * @param filenametxt
  * @return strLong
  * @author: S. Umaipalan
  */
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
  
  /**
  * @param nums
  * @return nums
  * @author: S. Umaipalan
  */
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

  /**
  * @param inner
  * @param outter
  * @return true/false
  * @author: S. Umaipalan
  */
  public static boolean linearIn(int[] outer, int[] inner){
  
    //Variables 
    int intNum = 0;
    int intCount = 0;
    int intCount2 = 0;

    if(inner.length == 0){
      //return true if all numbers are only in outer array 
    }
    while(intCount < outer.length){
      intCount++;
      //if intCount is less then the length of outer array, run loop

      if(outer[intCount] == inner[intCount2]){
        intNum++;
        intCount2++;
        //if outer array is equal to inner array add a count intNum and intCount1
    
      }else if(outer[intCount] > inner[intCount2]){
        return false;
        //else if, outter array is has more numbers then inner array, return false
      }else if(intNum == inner.length){
        return true;
        //else if, they have the same number as the length of inner array, then return true 
      }
    }
    return false;
  }

  /**
  * @param i
  * @param j
  * @author: S. Umaipalan
  */
  public static void pascalTri(int i, int j) throws IOException{
    
    PrintWriter InputPascal = new PrintWriter(new FileWriter("src/grllreview/part2/pascalOut.txt"));
    //Lets me output onto pascalOut.txt

    //Variables
    int intCountA = 0;
    int intCountB = 0;
    int intPascal[][] = new int[i][j];

    while(intCountA < i){
      intPascal[intCountA][0] = 1;
      intCountA ++;
      //Makes the first row equal to 1
    }

    while(intCountB < j){
      intPascal[0][intCountB] = 1;
      intCountB++;
      //makes the first column equal to 1
    }
    for(intCountA = 1; intCountA < i; intCountA++){
      for(intCountB = 1; intCountB < j; intCountB++){
        intPascal[intCountA][intCountB] = intPascal[intCountA -  1][intCountB] + intPascal[intCountA][intCountB - 1];
        //Using the values from the previous columns and rows to get the new values 
      }
    }
    
    for(intCountA = 0; intCountA < i; intCountA++ ){
      for(intCountB = 0; intCountB < j; intCountB++){
        InputPascal.print(intPascal[intCountA][intCountB] + ", ");
        if(intCountB == j - 1){
          InputPascal.println(" ");
        //Prints values into pascalOut.txt
        }
      }
    }
  InputPascal.close();
  //closes text file 
  }

  // @author Natalie Yung
  public static int sumNumbers(String str)throws IOException{ 
    //initialize variables
    int intStringLength = 0;
    int intCount;
    char charCharacter;
    int intTotal = 0;
    String strString = "";
    intStringLength = str.length();

    //loop checks every character to see if it is a digit or not then adds onto 
    for(intCount=0; intCount<intStringLength; intCount++){
      charCharacter = str.charAt(intCount);

      if(Character.isDigit(charCharacter)){
        strString = strString+charCharacter;

      }else if(!strString.equals("")){
        intTotal = intTotal + Integer.parseInt(strString);
        strString = "";
      }
    }
    if(!strString.equals("")){
      intTotal = intTotal+ Integer.parseInt(strString);
    }
    return intTotal;
  }
  } 