public class Q10SecondLargest {
    public static void main(String[] args) {
        int [] arr = {5, 5, 4, 3};
        int max = arr[0];
        int sec = Integer.MIN_VALUE;

        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                sec = max;
                max = arr[i];                
            }
            else if(arr[i]!= max && arr[i]>sec){
                sec=arr[i];
            }
        }
        System.out.println(sec);
    }
}
