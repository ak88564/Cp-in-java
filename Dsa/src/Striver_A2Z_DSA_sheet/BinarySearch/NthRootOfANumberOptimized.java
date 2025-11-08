package Striver_A2Z_DSA_sheet.BinarySearch;

public class NthRootOfANumberOptimized {
    public static void main(String[] args) {
        System.out.println(nthRoot(3, 64));

    }
    private static int nthRoot(int n, int m){
        int low =1;
        int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            if(funcCalc(mid, n) == m){
                return mid;
            }
            else if(funcCalc(mid, n)>m){
                high = mid-1;
            }
            else if(funcCalc(mid, n)<m){
                low = mid+1;
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

// TC: O(m)
// SC: O(1)
