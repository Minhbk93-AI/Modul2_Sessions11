package exercises6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DelDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(4,5,5,3,3,8,9,8,10,10,12);
        List<Integer> newList= new ArrayList<>();

        for (Integer number : numbers) {
            if (!newList.contains(number)){
                newList.add(number);
            }
        }
        System.out.println("List mới: "+newList);

    }
}
