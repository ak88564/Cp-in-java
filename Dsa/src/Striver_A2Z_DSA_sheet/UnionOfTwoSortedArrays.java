package Striver_A2Z_DSA_sheet;

import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        Union(arr1, arr2);
    }

    private static void Union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr1) {
            set.add(j);
        }
        for (int j : arr2) {
            set.add(j);
        }

        for (int read: set
             ) {
            System.out.print(read + " ");

        }
    }
}
