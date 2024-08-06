public class left_tilted_square {
        public static void main(String[] args){
            
            int star =4;
            int nol = 1;

            while(nol <= star){
                int space = nol - 1;

                for(int i =0; i<= space; i++){
                    System.out.print(" ");
                }

                for(int i = 1; i<= star; i++){
                    System.out.print("*");
                }

                System.out.println();
                nol++;
            }
        }
    }

