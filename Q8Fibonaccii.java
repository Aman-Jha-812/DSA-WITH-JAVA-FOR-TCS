public class Q8Fibonaccii {
    public static void main(String[] args) {
        int n =7;
        int a =0;
        int b = 1;
        int next = 0;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            next = a + b;
            a=b;
            b=next;
            
        }
    }
}
