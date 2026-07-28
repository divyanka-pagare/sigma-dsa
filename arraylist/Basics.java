package arraylist;

import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;


public class Basics {
    public static void main(String args[]) {
        // Java Collection Framework
        // String | Boolean | Float

        // ClassName objName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

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

        // Maximum
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2); // O(1)
        list1.add(5);
        list1.add(9);
        list1.add(6);
        list1.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = " + max);


        // swap 2 numbers
        System.out.println("------swap 2 no -----------");
        int idx1 = 1, idx2 = 3;
        System.out.println(list1);
        swap(list1, idx1, idx2); 
        System.out.println(list1);

        //sort
        System.out.println("---------------sorting---------------");
        //ascending
        Collections.sort(list1);
        System.out.println(list1);
        //descending
        Collections.sort(list1, Collections.reverseOrder()); 
        System.out.println(list1);

        //Comparator - define fnx logic 
        //Collections - class & Collection - Interface



    }
 
    public static void swap(ArrayList<Integer> list1, int idx1, int idx2) {
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
    }
}
