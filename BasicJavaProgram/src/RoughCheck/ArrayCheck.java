package RoughCheck;

public class ArrayCheck {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2, 3,4,5};
        int j=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr[j-1] = arr[i];
            j=j-1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
