class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] ans = new int[nums.length];
        int size = 0;

        for(int num : nums){
            int left = 0;
            int right = size;

            while(left < right){
                int mid = left + (right - left) /2;

                if(ans[mid] < num){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }

            ans[left] = num;
                 
                if(left == size){
                    size++;
                }
        }
        return size;
    }
}