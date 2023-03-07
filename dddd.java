import java.util.Scanner;
public class dddd {
    static boolean is_prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;}
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter the nth term");
     int n=sc.nextInt();int count=0;int num=2;
     while(count<n){
         if(is_prime(num)){
             count++;
         }
         num++;
     }
        System.out.println("The nth term is "+(num-1));
    }

}
