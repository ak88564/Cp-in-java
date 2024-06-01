package CodingNinjas;

public class FlipBits {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long count = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        if(count == n){
            return count;
        }
        else if(count==0){
            return (long) n;
        }
        else if(count == 1){
            return (long) n;
        }
        else{
            int startIndex = 0;
            int endIndex = 0;
            for(int i=0;i<n-1;i++){
                if(arr[i]!=0){
                    continue;
                }
                else{
                    startIndex = i;
                }
                for(int j=i+1;j<n;j++){
                    if(arr[j]==0){
                        endIndex = j;
                    }
                }
                break;
            }
            long value = flip(arr, startIndex, endIndex);
            return value;

        }
    }
    public static long flip(int[] arr, int startIndex, int endIndex){
        long countOne = 0;
        int[] arr2 = new int[arr.length];
        arr2 = arr;
        for(int i=startIndex;i<=endIndex;i++){
            if(arr2[i]==0){
                arr2[i]=1;
            }
            else{
                arr2[i]=0;
            }
        }
        for(int j=0;j<arr2.length;j++){
            if(arr2[j]==1){
                countOne++;
            }
        }
        return countOne;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println(FlipBits.maxSubarraySum(arr, arr.length));
    }
}
