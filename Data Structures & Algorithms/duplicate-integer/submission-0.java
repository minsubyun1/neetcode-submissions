class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 연속된 게 있으면 true
        // 없으면 false

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(nums[i])) {
                return true;
            }
            maps.put(nums[i], 0);
        }

        return false;
    }
}