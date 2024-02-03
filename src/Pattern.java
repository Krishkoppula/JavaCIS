public class Pattern {
    public static void main(String[] args) {
        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");
                //break;
                continue;
            }
            System.out.println();
        }
        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= 6; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int j = 1; j <= 6; j++) {
            for (int i = 6; i >= j; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
