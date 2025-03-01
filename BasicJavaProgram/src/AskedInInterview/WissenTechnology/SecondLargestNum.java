package AskedInInterview.WissenTechnology;

import java.util.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = new int[]{4,4,4};
        largestNumCalc(arr);
    }
    public static void largestNumCalc(int[] arr){
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int j=arr.length-1; j >= 0; j--){
            if(arr[j]<max){
                System.out.println("Second laregest number is: " +arr[j]);
                break;
            }
            if(j==0){
                System.out.println("No value found");
            }
        }
    }
}
