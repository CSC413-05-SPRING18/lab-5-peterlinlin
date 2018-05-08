package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

  static HashMap<String, Integer> wordCount = new HashMap();
  static String[] splitArray;
  public static void main(String[] args) {

    String objKey = null;



    try {
      File f = new File("src/lab5/Test.java");
      BufferedReader b = new BufferedReader(new FileReader(f));
      String readLine = "";
      while ((readLine = b.readLine()) != null) {
        System.out.println(readLine);
        if(!readLine.isEmpty()) {
          readLine = readLine.trim();
          splitArray = readLine.split(" ");

          for (int i = 0; i < splitArray.length; i++) {
            putValue(splitArray[i]);
          }
        }
      }


    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(wordCount);

  }

  public static void putValue(String objKey){

    if(wordCount.get(objKey) == null){
      wordCount.put(objKey, 1);
    }
    else if(wordCount.get(objKey) != null){
      int value = wordCount.get(objKey);
      wordCount.put(objKey, value+1);
    }
  }
}

