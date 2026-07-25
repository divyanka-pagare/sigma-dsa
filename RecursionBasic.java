public class RecursionBasic {

    public static void printDec(int n) {
        if (n == 1) { 
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n+" ");
            return; 
        }
        printInc(n-1);
        System.out.print(n+" ");
    }


    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;  
        return sn;
    }

    public static int fib(int n) {   // time complexity = O(2^n)
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }


    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i) {  // first look forward then compare with self
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }


    //tilingProblem
    public static int tilingProblem(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //kaam
        // //vertical choice
        // int fnm1 = tilingProblem(n-1);

        // //horizontal choice
        // int fnm2 = tilingProblem(n-2);

        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    //remove duplicates
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        //base case
        if (n == 1 || n == 2) {
            return n;
        }

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void printBinString(int n, int lastPlace, String str) {
        //base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        
        //kaam
        printBinString(n-1, 0, str + "0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str + "1");
        }
    }


    public static void main(String args[]) {

        printBinString(3, 0,"");




        // System.out.println(friendsPairing(5));

        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(tilingProblem(3));


        // int n = 11;

        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fib(n));

        // int arr[] = {1, 2, 3, 4, 5};  //true
        // int arr[] = {1, 2, 11, 8, 6, 11, 5};   //false
        // int arr[] ={11};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOcc(arr, 11, 0));
        // System.out.println(lastOccurence(arr, 11, 0));
        // System.out.println(power(2, 5));
    }
}

 