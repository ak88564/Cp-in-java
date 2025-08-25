import java.util.*;

public class SequenceCounting {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("car", "bike", "car", "aeroplane");

        for(int i=0;i< l1.size();i++){
            System.out.print(l1.get(i) + ": ");
            int count =0;
            for(int j=0;j<l1.size();j++){
                if(l1.get(i).equals(l1.get(j))){
                    count++;
                }
            }
            System.out.println(count);
        }


        Map<String, Integer> mp = new HashMap<>();
        for(int i=0;i<l1.size();i++){
            if (mp.containsKey(l1.get(i))){
                int getValue = mp.get(l1.get(i));
                getValue++;
                mp.put(l1.get(i), getValue);
            }
            else {
                mp.put(l1.get(i), 1);
            }
        }
        System.out.println(mp);

    }
}
