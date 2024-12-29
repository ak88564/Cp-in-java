package AskedInInterview;

/*
Asked in Indus net technologies interview. Print only unique list value(Space optimized approached)
 */

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInList2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(11);
        l1.add(33);
        l1.add(11);
        l1.add(34);
        l1.add(56);
        l1.add(34);
        removeValues(l1);
    }

    public static void removeValues(List<Integer> l1){
        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l1.size();j++){
                if(i==j){
                    continue;
                }
                else if(l1.get(i)==l1.get(j)){
                    l1.remove(j);
                }
            }
        }
        System.out.println(l1.toString());
    }
}
/*
TC: O(n^2)
SC: O(1)
 */
