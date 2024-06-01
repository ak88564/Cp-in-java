package Striver_A2Z_DSA_sheet;

/*
By taking a new array and transferring from last to first
 */

public class RotateByDPlaces2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotateByD2(arr, k);
    }

    private static void rotateByD2(int[] arr, int k) {
        int[] temp = new int[arr.length];
        int j=arr.length-k-1;
        for (int i = arr.length-1; i >=k; i--) {
            temp[j--] = arr[i];
        }
        int m=arr.length-k;
        for (int i = 0; i < k; i++) {
            temp[m++] = arr[i];
        }
        for (int z: temp) {
            System.out.println(z);
        }
    }
}
