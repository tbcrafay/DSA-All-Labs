import java.util.ArrayList;
import java.util.List;

public class MergeArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        // Method 1: Using addAll()
        list1.addAll(list2);
        System.out.println("Merged list (Method 1): " + list1);

        // Method 2: Creating a new list
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println("Merged list (Method 2): " + mergedList);
    }
}