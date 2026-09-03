class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 문자열의 모든 문자가 같으면 같은 그룹으로 묶음.
        // 문자의 숫서는 관계없고
        // 같은 게 없는 문자는 혼자
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] ch = new char[strs[i].length()];
            for (int j = 0; j < strs[i].length(); j++) {
                ch[j] = strs[i].charAt(j);
            }

            Arrays.sort(ch);
            String s = String.valueOf(ch);

            if (map.containsKey(s)) {
                map.get(s).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(s, list);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}
