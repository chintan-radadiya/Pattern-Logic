
public class Diamond2 {
    public static void main(String args[]){
        int n = 4;
        int nol = 1;
        int afterBrEve = 1;
        int space = n-1;
        while(nol <= n && nol > 0){
            for(int i =1; i <= space; i++){
                System.out.print("  ");
            }
            
            for(int j =1; j<= (2*nol)-1; j++){
                if(j % 2 != 0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            afterBrEve++;
        
            if(afterBrEve <= n){
                space--;
                nol++;
            }
            else{
                space++;
                nol--;
            }
        }
    }
}
