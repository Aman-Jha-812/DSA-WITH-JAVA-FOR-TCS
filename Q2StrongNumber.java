public class Q2StrongNumber {

    // public static boolean isStrong(int n){
         
    // }
    public static void main(String[] args) {
        int sum = 0;
        int number =145;
        int temp = number;
        while (temp!=0) {
         int digit = temp%10;

            int fact = 1;
        for(int i = 1 ;i<=digit;i++){
            
            fact = fact*i;
        }

        sum = sum+fact;

        temp = temp/10;

        }
        System.out.println(sum);
        
        if(sum == number){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a strong Number");
        }
    }
}
