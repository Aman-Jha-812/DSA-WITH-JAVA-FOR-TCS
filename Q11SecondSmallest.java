public class Q11SecondSmallest {
    public static void main(String[] args) {
        int []arr = {1,1, 1,1, 4, 3,2,11,45};
        int small = arr[0];
        int secsmall=Integer.MAX_VALUE;

        for(int i =1;i<arr.length;i++){
            if(arr[i]<small){
                secsmall=small;
                small=arr[i];
            }
            else if(arr[i]!=small&&arr[i]<secsmall){
                secsmall=arr[i];
            }
        }
        System.out.println(secsmall);
        System.out.println(small);
    }
}
