public class Q12ReverseArray {
    public static void main(String[] args) {
        int [] arr = {5, 5, 4, 3};
        // int[] rev = new int[arr.length];
        // int j =0;
        for(int i = arr.length-1;i>=0;i--){
        //    rev[j]=arr[i];
        //    j++;
        System.out.print(arr[i]+ " ");
        }
        // for(int i =0;i<rev.length;i++){
        //     System.out.println(rev[i]+" ");
        // }
    }
}


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