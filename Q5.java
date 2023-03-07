import java.util.Scanner;
public class Q5 {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d=%d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 15; i++) {
            System.out.println("Multiplication table of "+i);
            table(i);
        }
    }
}
