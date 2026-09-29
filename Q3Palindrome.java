import java.util.Scanner;
public class Q3Palindrome {


    //Normal 
//    public static void main(String[] args) {
//     int original = 1221;
//     int temp = original;
//     int reverse = 0;
//     while(temp!=0){
//         int n = temp%10;
//         reverse = reverse *10  +n;
//         temp = temp/10;
//     }


//         if(original==reverse){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not palindrome");
//         }

//    } 

//Through funciton
public static boolean isPalindrome(int original){
    int temp = original;
    int reverse = 0;
    while(temp!=0){
        int n = temp % 10;
        reverse = reverse * 10 +n;
        temp = temp/10;
    }
    return original == reverse;
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scn.nextInt();
    
    if(isPalindrome(n)){
        System.out.println("Palindrome");
    }else System.out.println("not palindrome");
    scn.close();
}

}
