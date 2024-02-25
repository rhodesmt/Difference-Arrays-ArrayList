import java.util.ArrayList;

public class DifferenceArrayArrayList {
    public static void main(String[] args) {
        // Array demonstration
        int[] array = {1, 2, 3, 4, 5}; // Declaration and initialization of an array with elements
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Accessing array elements using index
        }
        System.out.println();

        // ArrayList demonstration
        ArrayList<Integer> arrayList = new ArrayList<>(); // Declaration of an ArrayList
        arrayList.add(1); // Adding elements to ArrayList
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " "); // Accessing ArrayList elements using get() method
        }
    }
}