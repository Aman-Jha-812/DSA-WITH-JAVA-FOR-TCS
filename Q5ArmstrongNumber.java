public class Q5ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int temp = n;
        int count = 0;
        int sum = 0;

        //count digit
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp =n;

        //sum of digit
        while(temp!=0){
            int digit = temp%10;
            sum = sum + (int) Math.pow(digit,count);
            temp = temp/10;
        }
        
        //check
        if(sum == original){
            System.out.println("Armstrong Number");
        }else System.out.println("Not Armstrong number");
    }
}
