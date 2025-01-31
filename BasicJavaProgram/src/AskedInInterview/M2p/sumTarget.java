package AskedInInterview.M2p;

/*
Target should get match with any 2 values in the array. Choosing same value not allowed
 */

public class sumTarget {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 67, 100, 23, 30};
        sumTargetCalc(arr, 53);
    }
    public static void sumTargetCalc(int[] arr, int target){
        int flag = 0;
        for(int i =0;i<arr.length;i++){
//            sum = sum + arr[i];
            for(int j =0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println("Target matched");
                    flag = 1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
    }
}
