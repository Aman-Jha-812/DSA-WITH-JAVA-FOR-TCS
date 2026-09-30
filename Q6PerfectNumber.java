public class Q6PerfectNumber {

    public static boolean isperfect(int number){
        int sum =0;
        for(int i = 1 ; i<=number/2; i++){
            if(number%i==0){
                sum = sum +i;
            }
        }
        return number==sum;
    }
    public static void main(String[] args) {
        int number = 8;

        if (isperfect(number)) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }


// this is noramal 

        // int sum = 0;
    //     for(int i = 1 ; i<=number/2; i++){
    //         if(number%i==0){
    //             sum = sum +i;
    //         }
    //     }
    //     if(number == sum){
    //         System.out.println("perfect");
    //     }else{
    //         System.out.println("not a perfect number");
    //     }

    }

}
