class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int[] count = new int[51];   // Numbers are from 1 to 50

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int ans = 0;

        // XOR only numbers that appear exactly twice
        for (int i = 1; i <= 50; i++) {
            if (count[i] == 2) {
                ans = ans ^ i;
            }
        }

        return ans;
    }
}