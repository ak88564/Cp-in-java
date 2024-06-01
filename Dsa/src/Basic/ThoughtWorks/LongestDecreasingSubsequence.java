package Basic.ThoughtWorks;
/*
First remove the 0 from the array then find the longest decreasing subsequence
 */

public class LongestDecreasingSubsequence {
    static void subsequenceCalculator(int[] arr){
        int[] newArr = new int[arr.length];
        int count = 1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                newArr[i] = arr[i];
            }
            if(i>0){
                if(newArr[i]<newArr[i-1]){
                    count++;
                }
            }

        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,0,3,2,9};
        LongestDecreasingSubsequence.subsequenceCalculator(arr);

    }
}
