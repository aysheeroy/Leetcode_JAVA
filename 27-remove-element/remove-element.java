class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
        return 0;
        int k=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<k;i++)
        {
             if(nums[i]==val)
             {
                nums[i]=nums[i]^nums[k];
                nums[k]=nums[i]^nums[k];
                nums[i]=nums[i]^nums[k];
                k--;
             }
        }
        k=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==val)
            k++;
        }
        return nums.length-k;
    }
}