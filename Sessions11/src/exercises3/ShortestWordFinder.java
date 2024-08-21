package exercises3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestWordFinder {
    public static void main(String[] args) {
        String sentence = "Java is a programing language";
        List<String> wordsList = Arrays.asList(sentence.split(" "));
        System.out.println(wordsList);

        List<String> newList= new ArrayList<>();
        int minLength= Integer.MAX_VALUE;
        for (String word: wordsList){
            int wordLength = word.length();
            if (wordLength < minLength){
                minLength=wordLength;
                newList.clear();
                newList.add(word);
            } else if (wordLength == minLength) {
                newList.add(word);

            }

        }
        System.out.println("Mảng chứa các Shortest word la: "+newList);

    }
}
