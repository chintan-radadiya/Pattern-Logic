public class SquareOfNumber {
    public static void main(String[] args) {
        
        int n=4;
        int nol=1;

        int printable=1;

        while(nol<=n){

            for(int i=1; i<=n; i++){
                System.out.print(printable + " ");
            }
            System.out.println();
            nol++;
        }
    }
    
}
