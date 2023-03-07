public class HW2 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i=i+2) {
            for(int k=1;k<=7-1*i;k++){
            System.out.print(" ");}
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}