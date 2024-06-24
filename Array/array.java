//  package Array;
// import java.util.ArrayList;
// import java.util.Arrays;
// import  java.util.Scanner;
// public class array {
    // public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // Ex- store 5 roll numbers 
       // int[] rnos = new int[5];   
       /*
       Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        sc.close();
        System.out.println(Arrays.toString(str));
        str[1] = "Himanshu";
        System.out.println(Arrays.toString(str));
        */
        /*
        int[] nums = {3,4,56,87,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void change (int[] arr){
        arr[0] = 40;
        */
        /*************************** other problem **************************/
        /*
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        sc.close();
        // output
        for(int row= 0; row<arr.length;row++){
            for(int col = 0 ; col<arr.length; col++){
                System.out.print(" "+arr[row][col]);
            }
            System.out.println("");
        }
        */

        /************************* ArrayList *******************************/
        
        // Scanner sc = new Scanner (System.in);
        // syntax 
        // ArrayList<Integer> list = new ArrayList<>(10);
        /*
        System.out.println("The ArrayList is :");
        list.add(45);
        list.add(85);
        list.add(425);
        list.add(411);
        list.add(90);
        list.add(37);
        list.add(12);
        list.add(64);
        list.add(89);
        list.add(623);
        list.add(601);
        list.add(400);
        list.add(63);
        list.add(23);
        list.add(62);
        System.out.println(list);
        System.out.println(list.contains(12)); // it will show if 12 is present in the ArrayList
      // it will update the value of elemel
      list.set(0, 534343);
        System.out.println(list);
        // it will be remove element by its index
        list.remove(3);
        System.out.println(list);

            */

            /*
        // take input by user
        System.out.println("Enter the ArrayList");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // get item at any index 
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        sc.close();
          */

      /**************************** Multi dialmensional ArrayList *******************/
      /*
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    //   initialisation
    for (int i = 0; i < 3; i++) {
        list.add(new ArrayList<>());
    }
    // add element 
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            list.get(i).add(sc.nextInt());
        }
    }
    System.out.println(list);
    sc.close();
    */

    /********************* Question ****************************/
    // swap two number of any Array 
    /*
    int[] arr = {3,6,33,54,89,20};
    swap(arr,0,4);
    System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }
    */
//     }
//  }
