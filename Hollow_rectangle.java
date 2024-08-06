public class Hollow_rectangle {
    public static void main(String[] args) {

        int star = 6;
        int nol = 1;
        int space = star - 2;

        while (nol <= star -2) {

            if (nol == 1 || nol == star - 2) {

                for (int i = 1; i <= star; i++) {
                    System.out.print("* ");
                }

            } else {

                System.out.print("* ");

                for (int i = 1; i <= space; i++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            nol++;
            System.out.println();
        }

    }
}
