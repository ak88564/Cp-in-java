package List;

/*
Program to compare each value of a list
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class valueCheck {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        List<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            l1.add(nums[i]);
        }
        Collections.sort(l1);
        for(int i = 0; i < l1.size()-1; i++){
            if(l1.get(i) == l1.get(i+1)){
                System.out.println("found" + l1.get(i) + " " + l1.get(i+1));
            }
        }
    }
}
