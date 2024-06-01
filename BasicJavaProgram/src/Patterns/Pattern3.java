package Patterns;

/*
1
12
123
1234
12345
 */

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++){
            int value = 1;
            while (value<=i){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
