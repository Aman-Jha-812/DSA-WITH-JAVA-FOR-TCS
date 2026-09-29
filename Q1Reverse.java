public class Q1Reverse {
   public static void main(String[] args){
        int a = 1234;
        int reverse =0 ;
        while(a!=0){
            int n = a%10; //get last digit
            reverse = reverse *10 +n;
            a=a/10;
            
        }
        System.out.println(reverse);
   } 
}
