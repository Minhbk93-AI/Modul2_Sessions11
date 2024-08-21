package exercises4;

import java.util.Arrays;
import java.util.List;

public class SortIntegers {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(4,6,8,5,9);
        bubbleSort(number);
    }
    public static void bubbleSort(List<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(i)>list.get(j)){
                    int temp= list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);

                }

            }
            
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
