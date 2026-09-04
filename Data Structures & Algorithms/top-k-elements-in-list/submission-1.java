class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 개수가 많은 숫자를 k개 만큼 출력
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        // 내림차순 정렬 -> a,b 반대로
        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] results = new int[k];
        
        for (int i = 0; i < k; i++) {
            results[i] = list.get(i);
        }

        return results;
    }
}
