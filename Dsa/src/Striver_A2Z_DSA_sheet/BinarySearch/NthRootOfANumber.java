package Striver_A2Z_DSA_sheet.BinarySearch;

/*
Nth Root of a Number using Binary Search
Iterative approach
 */

public class NthRootOfANumber {
    public static void main(String[] args) {
        System.out.println(nthRoot(4, 69));
    }
    private static int nthRoot(int n, int m){
        for(int i =1;i<=m;i++){
            if(funcCalc(i, n) == m){
                return i;
            }
        }
        return -1;
    }
    private static int funcCalc(int i, int n){
        int result = 1;
        for(int z=0;z<n;z++){
            result = result * i;
        }
        return result;
    }
}
