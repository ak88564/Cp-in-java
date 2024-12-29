package AskedInInterview;
/*
Suppose you have a values and a weight array of same length. The problem is that the summation of
two weight must be less than or equal to the target value. The values value of the same index must be
greatest and if thats ok then print that greatest value.
 */
public class TuringQ1 {
    public static int getValue(int[] values, int[] weights, int target){
        int sum =0;
        int values_sum =0;
        int max =0;
        for(int i = 0; i < weights.length; i++){
            for (int j=0;j< weights.length;j++){
                if(i==j){
                    continue;
                }
                sum = weights[i] + weights[j];
                if(sum<=target){
                    values_sum = values[i] + values[j];
                    if(values_sum>max){
                        max = values_sum;
                    }

                }

            }
        }
        return max;

    }

    public static void main(String[] args) {
        int values[] = new int[]{100, 200, 300, 400, 50};
        int weights[] = new int[]{20, 30, 40, 10, 80};
        int target = 90;
        System.out.println(getValue(values, weights, target));
    }
}
/*
TC: O(n)^2
SC: O(1)
 */
