
// Time Complexity : O(n)
// Space Complexity : O(1)
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums==null) 
            return 0;
        int slow=1;
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
                count=1;
            if(count<=2)
            {
                nums[slow]=nums[i];
                slow++;
            }
        }
        
        return slow;
    }
}