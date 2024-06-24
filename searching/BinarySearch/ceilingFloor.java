package searching.BinarySearch;

public class ceilingFloor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 19;
        int ans = ceiling(arr, target);
        int ans2 = floor(arr, target);

        System.out.println("The  ceiling element is " + arr[ans]);

        System.out.println("The floor element is  " + arr[ans2]);

    }

    // create a function to find a ceiling number
    // ceiling :- smallest element in array greater than or equal to target element
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length -1]){
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end + 1;
    }

    // create a function to find floor
    // floor :- smaller or equal number to the target element
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[arr.length-1]){
            return -1 ;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start - 1;
    }
}
