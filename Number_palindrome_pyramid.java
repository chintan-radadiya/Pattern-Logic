public class Number_palindrome_pyramid {
    public static void main(String args[]) {

        int n = 4;
        int nol = 1;

        int space = n - 1;

        while (nol <= n) {

            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }
            space--;

            int num = nol;
            for (int i = 1; i < 2*nol; i++) {
                System.out.print(num + " ");

                if(i < nol){
                num--;
                }else{
                    num++;
                }
            }

            nol ++ ;
            System.out.println();
        }

    }

}
