package AskedInInterview;
/*
Wap to print all the prime numbers from 1 to 200
 */

public class PrimeNumber1to200 {
    public static void main(String[] args) {
        int n = 200;
        for(int i=2;i<=n;i++){
            int m = i/2;
            int count = 0;
            for(int j=2;j<=m;j++){
                if(i%j==0){
                    count = 1;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
/*
TC: O(n*(n/2))
SC: O(1)
 */
