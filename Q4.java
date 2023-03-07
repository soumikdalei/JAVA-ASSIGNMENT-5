import java.util.Scanner;
public class Q4 {
    static int factorial(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of m");
        int m=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            System.out.println("Factorial of "+i);
            System.out.println(factorial(i));
        }
    }
}
