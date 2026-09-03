class Solution {
    public boolean isAnagram(String s, String t) {
        // 동일한 char의 개수가 같으면 anagram 판정
        // 아니면 false

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0) + 1);
            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        return s_map.equals(t_map);
    }
}
