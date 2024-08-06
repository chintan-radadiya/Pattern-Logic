public class Hollow_pyramid {
    public static void main(String[] args) {

        int n = 4;
        int nol = 1;
        int space = n - 1;

        while (nol <= n) {

            for (int i = 0; i <= space; i++) {
                System.out.print("  ");
            }

            if (nol == 1) {
                System.out.print("* ");
            }

            else if (nol == 2 || nol == 3) {

                int index = 1;

                while (index != nol * 2) {
                    if (index == 1 || index == nol * 2 - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    index++;
                }
            } else {

                for (int i = 1; i <= n * 2 - 1; i++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
            space--;
            nol++;
        }

    }

}