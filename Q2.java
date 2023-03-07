import java.util.Scanner;
public class Q2 {
    static boolean is_prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int rev=0;int temp=a;
        for(int i=1;i<=a;i++){
            int d=a%10;
            rev=rev*10+d;
            a=a/10;
        }
        if(is_prime(a)&&is_prime(rev)){
            System.out.println(temp+" is a twisted prime ");
        }
        else{
            System.out.println(temp+" is not a twisted prime");
        }


    }
}
