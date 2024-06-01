package Patterns;

/*

                            *
                           ***
                          *****
                         *******
                        *********

 */
public class Pattern7 {
    public static void main(String[] args) {
        int starLimit = 0;
        for (int i=4;i>=0;i--){
            int j;
            for (j=0;j<=i;j++){
                System.out.print(" ");
            }
            int temp = 2 * starLimit + 1;
            for (int z=0;z<temp;z++){
                System.out.print("*");
            }
            for (j=0;j<=i;j++){
                System.out.print(" ");
            }
            starLimit++;
            System.out.println();
        }
    }
}
