package Medium;

// Program to print the output in clockwise direction

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public static List<Integer> spiralPathMatrix(int matrix[][], int n, int m) {
        int r=0;
        int c=0;
        List<Integer> ans = new ArrayList();
        spiralPathHelper(matrix, r, c, n, m, ans);
        return ans;
    }

    public static void spiralPathHelper(int matrix[][], int r, int c, int rows, int cols, List<Integer> ans) {
        if(r>=rows||c>=cols){
            return;
        }
        //push first row
        for (int p=c;p<cols;p++) {
            ans.add(matrix[r][p]);
        }
        //push last column
        for (int p=r+1;p<rows;p++){
            ans.add(matrix[p][cols-1]);
        }
        //push last row, if last and first row are not same
        if ((rows-1)!=r){
            for(int p=cols-2;p>=c;p--){
                ans.add(matrix[rows-1][p]);
            }
        }
        //print first column, if last and first column are not same
        if ((cols-1)!=c){
            for (int p=rows-2;p>r;p--){
                ans.add(matrix[p][c]);
            }
        }

        //Make recursive call on smaller submatrix.
        spiralPathHelper(matrix, r+1, c+1, rows-1, cols-1, ans);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column and value");
        int n = sc.nextInt(); int m = sc.nextInt();
        int array1[][] = new int[n][m];
        System.out.println("Enter values");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(SpiralMatrix.spiralPathMatrix(array1, n, m));

    }
}
