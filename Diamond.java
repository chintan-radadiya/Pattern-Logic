public class Diamond {
    public static void main(String[] args) {

        int n = 4;
        int star = 1;
        int space = n - 1;
        int nol = 1;

        while (nol <= 2 * n - 1) {

            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }

            for (int i = 1; i <= star; i++) {
                System.out.print("* ");
            }

            System.out.println();
            nol++;

            if (nol <= 4) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

        }
    }

}
