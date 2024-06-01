package Patterns;

/*
12345
1234
123
12
1

 */

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<5;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);

            }
            System.out.println();
            n--;
        }
    }
}

