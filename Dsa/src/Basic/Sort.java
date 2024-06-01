package Basic;

public class Sort{
    public static void main(String args[]){
        int arr1[] = {110, 20, 30, 40, 80, 90, 120, 50, 70, 10};
        int n = arr1.length;
        int temp;
        for (int i =0; i< n;i++){
            for (int j=i+1;j<n;j++){
                if (arr1[i] > arr1[j]){
                    temp = arr1[i];
                    arr1[i] =arr1[j];
                    arr1[j] = temp;
            }


            }
        }
        for (int i=0; i<n;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
