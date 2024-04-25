class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                nums[left + 1] = nums[right];
                left++;
            }
            right++;
        }
        return left + 1;
    }
}