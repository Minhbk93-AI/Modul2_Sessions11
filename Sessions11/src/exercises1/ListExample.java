package exercises1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Arrays ban đầu: "+list);

        //Tìm và in phần tử có giá trị lớn nhất
        int maxElement = Collections.max(list);
        System.out.println("Phần tử có giá trị lớn nhất: "+maxElement);

        //Đảo ngược vị trí cac phần tử trong danh sách
        Collections.reverse(list);
        System.out.println("Danh sách sau khi đảo ngược: "+list);

        // Sao chép các phần tử của danh sách 2 sang danh sách 1
        List<Integer> list2= new ArrayList<>();
        list2.add(200);
        list2.add(300);

        list.addAll(list2);
        System.out.println("Danh sách sau khi sao chép từ list2: "+list);
    }
}
