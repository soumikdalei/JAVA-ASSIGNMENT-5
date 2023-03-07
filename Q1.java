import java.util.Scanner;
public class Q1 {
    static int amicable(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String []args ) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        if(amicable(a)==b&&a==amicable(b)){
            System.out.println(a+" and "+b+" are amicable numbers ");
        }
        else{
            System.out.println(a+" and "+b+" are not amicable numbers ");
        }
    }
}
