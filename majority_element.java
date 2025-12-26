class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;

        for (int n : nums) {
            if (count == 0) {
                majority = n;
            }
            if (n == majority) {
                count = count + 1;
            }
            else {
                count = count - 1;
            }
        }
        return majority;
    }
}
