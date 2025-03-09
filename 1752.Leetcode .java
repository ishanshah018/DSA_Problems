class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // Count drops in sorted order
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }
        
        // Check if the last element > first element (for rotation check)
        if (nums[n - 1] > nums[0]) {
            count++;
        }
        
        // Array is sorted and rotated if count is <= 1
        return count <= 1;
    }
}
