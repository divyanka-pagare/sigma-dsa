package arraylist;

import java.util.*;

public class MultidimentionalAL {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList1 = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList1.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(11);
        mainList1.add(list1);

        System.out.println(mainList1);

        for(int i=0; i<mainList1.size(); i++) {
            ArrayList<Integer> currList = mainList1.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList1);


        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list3.add(i*1); //1 2 3 4 5 
            list4.add(i*2); //2 4 6 8 10
            list5.add(i*3); //3 6 9 12 15
        }

        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
