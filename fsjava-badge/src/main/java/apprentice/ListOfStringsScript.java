package apprentice;

import java.util.LinkedList;
import java.util.List;

public class ListOfStringsScript {

  int count = 0;

  public static void main(String ... args) {
    ListOfStringsScript listOfStringsScript = new ListOfStringsScript();
    List<String> strings = new LinkedList<>();

    StringBuilder stringBuilder = new StringBuilder();
    for(int i=0; i<1000; i++) {
      stringBuilder.append('a');
    }
    String stringToAdd = stringBuilder.toString();

    while(true) {
      String string = Integer.toHexString(listOfStringsScript.count++);
      while (string.length() < 6) { // uniform-length hex string
        string += "0";
      }

      strings.add(string + stringToAdd);
      if(listOfStringsScript.count % 10 == 0) { // print out count every 10 strings
        System.out.print(listOfStringsScript.count + "; ");
      }
      if(listOfStringsScript.count % 100 == 0) {
        System.out.println();
      }
    }
  }

  // First run's results: 9,460 <= x < 9,470; Str length: 6 hex chars + 1,000 of char 'a'
  // Run with 20M of memory. Char memory: 2 bytes * 1,006 chars * 9,470 strings =
  //    19,053,640 bytes = (approx.) 18.172 MB. This is about 1.828 MB less than
  //    the 20M of memory allotted

  // Second run's results: 18,540 <= x < 18,550; Str length: 6 hex chars + 1,000 of char 'a'
  // Run with 40M of memory. Char memory: 2 bytes * 1,006 chars * 18,550 strings =
  //    37,302,480 bytes = (approx.) 35.594 MB. This is about 4.406 MB less than
  //    the 40M of memory allotted

}
