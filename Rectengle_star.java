public class Rectengle_star {
    public static void main(String[] args){

        int star = 1;
        int nol = 4;

        while(star <= nol){
            for (int i=1; i<=nol; i++)
            {
                System.out.print("* ");
            }

            System.out.println();
              star++;
        }
    }
}
