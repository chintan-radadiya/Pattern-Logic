public class zero_one_triangle{
    public static void main(String[] args){

        int n = 4;
        int nol = 1;

        while(nol <= n){

            for(int i = 1; i <= nol; i++){
                if((nol + i) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
            nol ++ ;

        }

    }
}