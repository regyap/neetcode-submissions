class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        int maxL, maxR = 0;
        int L=0 ,R = 0;
        int tempL = 0;
        
        for (int i=0;i<nums.length;i++){
            if (currSum<0){
                currSum = 0;
                tempL = i;
            }
            currSum+=nums[i];
            if (currSum>maxSum){
                maxSum = currSum;
                L = tempL;
                R = i;
            }
        }
        return maxSum;

    }
}
