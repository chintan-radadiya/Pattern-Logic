public class Reverse_pyramid {
    public static void main(String[] args){
         
        int n=4;
        int nol= 1;
        int star = 2*n - 1;
        
        while(nol <= n){
            
            int space = nol-1; 

            for(int i=1; i<=space; i++){
                System.out.print("  ");
            }

            for(int i=1; i<=star; i++){
                System.out.print("* ");
            }

            System.out.println();
            star-=2;
            nol++;
        }
    }
    
}
