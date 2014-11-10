package apprentice;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class ListOfStringsScript {

  int count = 0;

  public static void main(String ... args) {
    ListOfStringsScript listOfStringsScript = new ListOfStringsScript();
    List<String> strings = new LinkedList<>();
    char stringChar = 'a';

    StringBuilder stringBuilder = new StringBuilder();
    for(int i=0; i<1000; i++) {
      stringBuilder.append(stringChar);
    }
    String stringToAdd = stringBuilder.toString();

    while(true) {
      String string = Integer.toHexString(listOfStringsScript.count++);
      System.out.println(string);
      while (string.length() < 6) {
        string += "0";
      }

      strings.add(string + stringToAdd);
      if(listOfStringsScript.count % 10 == 0) {
        System.out.print(listOfStringsScript.count + "; ");
      }
      if(listOfStringsScript.count % 100 == 0) {
        System.out.println();
      }
    }
  }

  // First results: 9,460 <= x < 9,470; Str length: 6 hex chars + 1,000 of char 'a'
  // Run with 20M of memory. Char memory: 2 bytes * 1,006 chars * 9,470 strings =
  //    19,053,640 bytes = (approx.) 18.172 MB. This is about 1.828 MB less than
  //    the 20M of memory allotted

  // Second results: 18,540 <= x < 18,550; Str length: 6 hex chars + 1,000 of char 'a'
  // Run with 40M of memory. Char memory: 2 bytes * 1,006 chars * 18,540 strings =
  //    37,302,480 bytes = (approx.) 35.574 MB. This is about 4.426 MB less than
  //    the 40M of memory allotted

}
