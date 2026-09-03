class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        // nums[i] + nums[j]가 target이 되는
        // i, j를 출력(i, j는 서로 달라야 함)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}
