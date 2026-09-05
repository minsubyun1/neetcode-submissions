class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            // 현재 위치 (i)부터 다음 '#'의 위치 찾기
            int hashIdx = str.indexOf('#', i);

            // '#' 앞의 숫자가 문자열의 길이
            int length = Integer.parseInt(str.substring(i, hashIdx));

            // 문자열의 시작 위치와 끝 위치 계산
            int start = hashIdx + 1;
            int end = start + length;

            // 문자열 잘라내서 추가
            result.add(str.substring(start, end));

            i = end;
        }

        return result;
    }

}
