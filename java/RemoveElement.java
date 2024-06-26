class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}