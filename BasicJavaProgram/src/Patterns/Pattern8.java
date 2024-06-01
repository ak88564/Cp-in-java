package Patterns;

/*

                *********
                 *******
                  *****
                   ***
                    *

 */

public class Pattern8 {
    public static void main(String[] args) {
        int starLimit = 4;
        for (int i=0;i<5;i++){

            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int temp = 2*starLimit+1;
            for (int j=0;j<temp;j++){
                System.out.print("*");
            }
            for (int z=1;z<=i;z++){
                System.out.print(" ");
            }
            starLimit--;
            System.out.println();
        }
    }
}
