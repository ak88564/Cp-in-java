package Patterns;

/*

                    ****

                    *  *

                    *  *

                    ****

 */
public class Pattern21 {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++){
            if (i%2==0){
                for (int space =0;space<4;space++){
                    System.out.print(" ");
                }
            } else if (i==1 || i==7) {
                System.out.print("****");
            }
            else {
                System.out.print("*  *");
            }
            System.out.println();
        }
    }
}
