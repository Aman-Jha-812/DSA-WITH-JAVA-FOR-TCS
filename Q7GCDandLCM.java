public class Q7GCDandLCM {
    public static void main(String[] args) {
        int a = 36;
        int b = 84;
        int gcd = 0;
        int lcm = 0;
        for(int i = 1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd = i;
                
            }
            
            
        }
        System.out.println(gcd);

        

        for(int i =Math.max(a,b); ; i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;  
            }
            
        }
        
        System.out.println(lcm);
        
    }
}

