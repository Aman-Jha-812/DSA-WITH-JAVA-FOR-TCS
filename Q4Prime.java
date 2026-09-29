public class Q4Prime {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int  i = 2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }                
        }
        return true;
    }
    
    public static void main (String[]args){
        int n = 17;
         if (isPrime(n)) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
