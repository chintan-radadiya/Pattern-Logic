public class Pyramid {
    public static void main(String[] args) {

        int n =4;
        int nol =1;
        int star=1;
        int space = n-1;

        while(nol <= n){

            for(int i=1; i<=space; i++){
                System.out.print("  ");
            }

            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            System.out.println();
            space--;
            star+=2;
            nol++;
        }



    }
}
