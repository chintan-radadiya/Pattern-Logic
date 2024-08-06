public class number_pyramid {
    public static void main(String[] args){

        int n = 4;
        int nol=1;
        int space = n-1;
        
        while(nol <= n)
        {
            
            for(int i=1;i<=space; i++){
                System.out.print(" ");
            }
            space--;
            
            
            int index=1;
            for(int j =1; j<=(nol*2)-1;j++){
                
                if(index % 2 != 0){
                    System.out.print(nol);
                }else if(index % 2 == 0){
                    System.out.print(" ");
                }
                index++;
            }

            System.out.println();
            nol++;


        }

    }
}
