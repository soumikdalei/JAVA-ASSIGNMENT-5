public class HW1 {
    public static void main(String[] args) {
        String k;
        for (int i = 1; i <= 5; i++) {
            k = " ";
            for (int j = 5; j > 0; j--) {
                if (j == i) {
                    k +="*";
                } else {
                    k += j;
                }

            }System.out.print(k);
            System.out.println();
        }
    }
}