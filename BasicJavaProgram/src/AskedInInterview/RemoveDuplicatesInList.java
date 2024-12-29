package AskedInInterview;

import java.util.*;

/*
Asked in Indus net technologies interview. Print only unique list values
 */

class RemoveDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(11);
        l1.add(33);
        l1.add(11);
        l1.add(34);
        l1.add(56);
        l1.add(34);
        removeDuplicates(l1);
    }
    public static void removeDuplicates(List<Integer> l1){
        List<Integer> result = new ArrayList<>();
        result.add(l1.get(0));
        for(int i=0;i<l1.size();i++){
            for(int j=0;j<result.size();j++){
                if(l1.get(i)==result.get(j)){
                    break;
                }
                if(j==result.size()-1){
                    result.add(l1.get(i));
                }

            }
        }
        System.out.println(result.toString());
    }
}
// TC: O(n^2)
// SC: O(n)
