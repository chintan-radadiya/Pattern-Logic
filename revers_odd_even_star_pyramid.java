public class revers_odd_even_star_pyramid {
    public static void main(String[] args){

        int n = 3;
         int nol = 1;
         int star = 5;
         int space = nol -1;

         while(nol <= n){

            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }

            for(int j =1; j <=star; j++){

                if(j % 2 == 0){
                    System.out.print(" ");
                }
                else if(j%2 != 0 ){
                    System.out.print("*");
                }
            }

            nol++;
            System.out.println();
            star-= 2;
            space++;
         }
    }
    
}
