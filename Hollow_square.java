public class Hollow_square {

    public static void main(String[] args){

        int star = 4;
        int nol = 1;
        int space = star-2;

        while(nol <= star){

            if(nol == 1 || nol == 4){

                for(int i=1; i<=star; i++){
                    System.out.print("* ");
                }
            }else{

                System.out.print("* ");

                for(int i=1; i<=space; i++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
            nol++;
        }
    }
}
