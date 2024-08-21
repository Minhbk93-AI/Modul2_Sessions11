package exercises2;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static void main(String[] args) {
    String sentence = "Rikkei Academy để nông dân biết code";

    List<String> stringList = new ArrayList<>();
    String[] words = sentence.split(" ");
  for( String word:words) {
      stringList.add(word);
     }
        System.out.println("Các từ có độ dài lớn hơn 3 ký tự: ");
  for (String word:stringList){
      if (word.length()>3){
          System.out.println(word);
      }
     }
    }
}
