public class Half_diamond_2 {
    public static void main(String[] args) {

        int n = 5;
        int nol = 1;
        int star = 1;
        int space = n - nol;

        while(nol <= 2*n -1){

            // for space.
            for(int i = 1; i <= space; i++){
                 System.out.print("  ");
            }

            // For printing stars.
            for(int j =1; j<= star; j++){
                System.out.print("* ");
            }

            System.out.println();
            nol++;

            if(nol <= n){
                space--;
                star++;
            }else if(nol > n){
                star--;
                space++;
            }

        }
    }
}
