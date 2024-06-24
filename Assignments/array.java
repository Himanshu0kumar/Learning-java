//  The addition of matrix by taking user value 
/** 
package Assignments;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row , col;
        System.out.println("Enter size of Row  ");
        row = sc.nextInt();
        System.out.println("Enter the size of column ");
        col = sc.nextInt();
        int arr1[][] = new int[row][col] ;
        int arr2[][] = new int[row][col] ;
        int sum[][] = new int[row][col] ;
        System.out.println("Enter the first matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("Enter the second Arrays :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }
        System.out.println("The second matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        // adding the both matrix 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of Array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
 */

 /**************************************** Question 2*****************************/
 /* 
 // in an array how many elements are smaller than other elements 
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).


 */
 package Assignments;
 import java.util.Scanner;
 public class array{
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int arr2[] = new int[num];
        System.out.println("Enter the elements of the Array");
        for (int i = 0 ; i < num; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println("The given Array is :");
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        } 
        // logic for 
        System.out.println(" \n How many times elements is smaller than  other Elements ");
        for(int i =  0 ; i < arr.length ; i++){
        int count = 0;
            for(int j = 0 ; j < arr.length ; j++){
                if (arr[i] > arr[j] && i!=j){
                    count++;
                    
                } 
            }
            arr2[i] =count;
        }
        for(int i = 0 ; i < arr2.length ; i++){
            System.out.print(arr2[i]+"\t");
        }
        sc.close();
     }
 }