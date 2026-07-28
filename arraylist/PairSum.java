package arraylist;

import java.util.ArrayList;

public class PairSum {
    //brute force
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    //     for(int i=0; i<list.size(); i++) {
    //         for(int j=i+1; j<list.size(); j++) {
    //             if(list.get(i)+list.get(j) == target) {
    //                 return true;
    //             }
    //         } 
    //     }
    //     return false;
    // }

    //pair sum 1 - 2 pointer - O(n)
    public static boolean pairSum1(ArrayList<Integer> list1, int target) {
        int lp = 0;
        int rp = list1.size()-1;
        while (lp != rp) {
            //case 1
            if(list1.get(lp) + list1.get(rp) == target) {
                return true;
            } 
            //case 2
            if(list1.get(lp) + list1.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    //pair sum 2 - 2 pointer O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target1) {
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {//breaking point
                bp=i;
                break;
            }
        }
        
        int lp = bp+1; //smallest
        int rp = bp; //largest

        while(lp != rp) {
            //case 1
            if(list.get(lp)+list.get(rp) == target1) {
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)<target1) {
                lp=(lp+1)%n;
            } else {
                //case 3
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        int target = 5;
        System.out.println(pairSum1(list1, target));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target1 = 16;
        System.out.println(pairSum2(list, target1));
    }
}
