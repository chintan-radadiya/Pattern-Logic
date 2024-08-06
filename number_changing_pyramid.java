public class number_changing_pyramid {
    
    public static void main(String[] args){

        int n =4;
        int nol = 1;
        int num =1;

        while(nol<=n){

            for(int i=1;i <= nol; i++ , num++){
                System.out.print(num + " ");
            }
            System.out.println();
            nol++;
        }
    }
}
