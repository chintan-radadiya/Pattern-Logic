public class odd_even_star_pyramid {
    public static void main(String[] args){

        int n = 10;
        int star = 1;
        int nol = 1;
        int space = n-1;

        while(nol <= n){

            // Printing spaces.
            for(int i =1; i<=space; i++){
                System.out.print(" ");
            }
            space--;

            // Printing stars.
            for(int j= 1; j<= star; j++){
                if(j % 2 != 0){
                    System.out.print("*");
                }else if(j % 2 == 0){
                    System.out.print(" ");
                }
            }

            System.out.println();
            star+=2;
            nol++;

        }

    }
    
}
