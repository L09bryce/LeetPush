class Solution {
    public int[] searchRange(int[] nums, int target) {
        int b = -1;
        int e = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(b == -1){
                    b = i;
                }

                e = i;
            }
        }
        return new int[]{b, e};
    }
}