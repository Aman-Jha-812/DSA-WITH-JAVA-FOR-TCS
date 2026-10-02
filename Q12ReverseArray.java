

// public class Q12ReverseArray {

//     public static void main(String[] args) {

//         int[] arr = {5, 5, 4, 3};

//         int[] rev = new int[arr.length];

//         int j = 0;

//         for (int i = arr.length - 1; i >= 0; i--) {

//             rev[j] = arr[i];

//             j++;
//         }

//         // Print reversed array
//         for (int i = 0; i < rev.length; i++) {
//             System.out.print(rev[i] + " ");
//         }
//     }
// }


// two pointer

import java.util.Arrays;

public class Q12ReverseArray{
    public static void main(String[] args) {
        int arr[] = {3,5,8,1,6};

        int start =0;
        int end = arr.length - 1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));


    }
}