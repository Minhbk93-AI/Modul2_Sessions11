package exercises5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteEvenNumbers {
    public static void main(String[] args) {
        List<Integer> number= new ArrayList<>(10);
        number.add(3);
        number.add(4);
        number.add(8);
        number.add(5);
        number.add(9);
        number.add(10);
        System.out.println(number);

        List<Integer> newNumber= new ArrayList<>(10);
        for (int i = 0; i <= number.size()-1 ; i++) {
            if (number.get(i)%2==1){
                newNumber.add(number.get(i));
            }
        }
        System.out.println(newNumber);

    }
}
