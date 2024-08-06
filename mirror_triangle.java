public class mirror_triangle{
    public static void main(String[] args){

        int n =4;
        int nol = 1;
        int star = 1;
        int space = n - nol ; 

        while(nol <= n){

            for(int i = 1; i<= space; i++){
                System.out.print(" ");
            }

            for(int j =1; j<= star; j++){
                System.out.print("*");
            }

            space-- ;
            star++;
            nol ++ ; 
            System.out.println(); 
        }

    }
}