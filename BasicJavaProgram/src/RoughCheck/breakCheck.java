package RoughCheck;

import java.util.*;


public class breakCheck {
    public static void main(String[] args) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(11);
                l1.add(33);
                l1.add(11);
                l1.add(34);
                removeDuplicates(l1);
            }
    public static void removeDuplicates(List<Integer> l1){
        List<Integer> result = new ArrayList<>();
        result.add(l1.get(0));
        for(int i=0;i<l1.size();i++){
        // int count =0;
            for(int j=0;j<result.size();j++){
                if(i==j){
                    continue;
                }
                System.out.println(l1.get(i) + " " + result.get(j));
                if(Objects.equals(l1.get(i), l1.get(j))){
                    break;
                }
            }
            System.out.println("After second for loop");
        }
        System.out.println(result.toString());

    }
}
