package arraylist;

import java.util.ArrayList;

public class Basics {

    public static void main(String args[]) {
        // Java Collection Framework
        // String | Boolean | Float

        // ClassName objName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9); //[1, 9, 2, 3, 4, 5]

        System.out.println(list);

        // Get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        // Delete
        list.remove(2);
        System.out.println(list);

        // Set element at Index
        list.set(2, 10);
        System.out.println(list);  //[1, 9, 10, 4, 5]

        // Contains
        System.out.println(list.contains(1)); // true
        System.out.println(list.contains(11)); // false 

        // ***********************************************************

        System.out.println(list.size()); //it is a method - used to iterate on arraylist

        // print the arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // Reverse print - o(n)
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
