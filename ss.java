public class ss {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=7;i=i+2){
            for(int k=1;k<=7-1*i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a+++" ");
            }
            System.out.println();
        }
        int b=16;for(int i=1;i<=7;i=i+2){
            for(int k=7-1*i;k<6;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=7;j++){
                System.out.print(b--+" ");
            }
            System.out.println();
        }
    }
}
