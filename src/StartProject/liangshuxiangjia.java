package StartProject;

class liangshuxiangjia {

    public static void main(String[] args) {

        int[] nums = {2,8,3,6};
        int target = 9;
        int[] TwoSum = twoSum(nums,target);
        System.out.println("["+TwoSum[0]+","+TwoSum[1]+"]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int a,b = 0;
        int x,y = 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            a = nums[i];
            x = i;
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }
                b = nums[j];
                if(a + b == target){
                    y = j;
                    result[0]= x;
                    result[1]= y;
                    break;
                }
            }
            if(a + b == target){
                break;
            }
        }

        return result;
    }

}