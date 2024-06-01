package Simple;

class SumOfNums {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int newarray[] = new int[2];
        int i = 0;
        while(i<nums.length-1){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i]+nums[j];
                System.out.println(sum);
                if (sum!=target){
                    break;
                }
                else{
                    newarray[0] = i;
                    newarray[1] = j;
                    break;
                }
            }
            if(sum == target){
                break;
            }
            i=i+1;
        }
        return newarray;

    }

    public static void main(String[] args) {

        int nums[] = {2, 4, 7, 8};
        int target = 6;
        SumOfNums obj = new SumOfNums();
        int storage[] = obj.twoSum(nums, target);
        for (int i: storage){
            System.out.println(i);
        }

    }
}