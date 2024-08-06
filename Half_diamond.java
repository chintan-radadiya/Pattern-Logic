public class Half_diamond {
    public static void main(String[] args){

        int n=4;
        int nol = 1;

        int star = 1;

        while(nol <= 2*n -1){

            for(int i=1; i<=star; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            nol++;

            if(nol<=4){
                star++;
            }else{
                star--;
            }
        }
    }
}
