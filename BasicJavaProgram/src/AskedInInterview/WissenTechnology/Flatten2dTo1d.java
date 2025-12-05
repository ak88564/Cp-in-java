package AskedInInterview.WissenTechnology;

/*
Convert 2d to 1d array
 */

public class Flatten2dTo1d {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}, {10}};
        int totSize = 0;
        for(int i=0;i< arr.length;i++){
            totSize+= arr[i].length;
        }
        System.out.println("Total size of the array: "+ totSize);
        int[] newArr = new int[totSize];
        int iterator = 0;
        for(int i =0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                newArr[iterator++] = arr[i][j];

            }
        }
        for (int m: newArr
             ) {
            System.out.print(m + " ");
        }
    }
}

/*
TC: O(n)^2
SC: O(n), where n=50
 */
