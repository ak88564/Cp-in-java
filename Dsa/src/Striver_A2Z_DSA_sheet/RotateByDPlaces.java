package Striver_A2Z_DSA_sheet;

/*
By taking a new array and transferring from kth index
 */

public class RotateByDPlaces {

    public static void rotateByD(int[] arr, int k){
        int[] temp = new int[arr.length];
        int j=0;
        for (int i=k; i<arr.length;i++){
            temp[j++]=arr[i];
//            j=j+1;
        }
        for (int i=0; i<k;i++){
            temp[j++]=arr[i];
//            j=j+1;
        }

        System.out.println("Value of temp array is: ");
        for (int i=0; i<arr.length; i++){
            System.out.println(temp[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotateByD(arr, k);
    }
}
