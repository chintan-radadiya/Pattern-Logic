public class triangle_star {

    public static void main(String[] args) {
        
        int n =4;
        int nol = 1;
        int star=1;

        while (nol<=n) {

            for(int i=1; i<=star;i++){
                System.out.print("* ");
            }
            
            System.out.println();
            star++;
            nol++;
        
        }

    }
}