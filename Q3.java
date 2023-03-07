import java.util.Scanner;
public class Q3 {
    static boolean  prime(int n){
        for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
        }
            return true;
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a");
        int a=sc.nextInt();
        System.out.println("Enter a number b");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
           if( prime(i))
               System.out.print(i+" ");

        }
    }
}