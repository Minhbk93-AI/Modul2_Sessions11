package exercises7;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();

        list1.add(10);
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.add(20);
        System.out.println("\n");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.add(0, 30);
        System.out.println("\n");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.remove(0);
        System.out.println("\n");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.clear();
        System.out.println("\nSau khi xoa het");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}
