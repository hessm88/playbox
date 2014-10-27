package fsjava.apprentice.badge.scripts;

import java.util.LinkedList;
import java.util.List;

public class ListOfStringsScript {

  double count = 0;

  public static void main(String ... args) {
    ListOfStringsScript listOfStringsScript = new ListOfStringsScript();
    List<String> strings = new LinkedList<String>();
    char stringChar = 'a';

    StringBuilder stringBuilder = new StringBuilder();
    for(int i=0; i<10000; i++) {
      stringBuilder.append(stringChar);
    }
    String stringToAdd = stringBuilder.toString();

    while(true) {
      strings.add(new String(stringToAdd));
      listOfStringsScript.count++;
      if(listOfStringsScript.count % 1000 == 0) {
        System.out.print(listOfStringsScript.count + " ");
      }
      if(listOfStringsScript.count % 10000 == 0) {
        System.out.println();
      }
    }
  }

  // Results: 5,137,000 < x < 5,137,999; Str length: 10,000 of char 'a'
  // Run with 128M of memory
}
