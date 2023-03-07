import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=0;int b=1;int sum=0;
        System.out.println(a);

        if(n>=2){
            System.out.println(b);
        }
        for(int i=3;i<=n;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }

    }
}
