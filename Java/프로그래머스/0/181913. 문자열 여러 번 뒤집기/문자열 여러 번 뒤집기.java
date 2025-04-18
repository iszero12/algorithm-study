class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            // 부분 문자열 뒤집기
            StringBuilder reversed = new StringBuilder(sb.substring(start, end + 1)).reverse();
            sb.replace(start, end + 1, reversed.toString());
        }
        
        return sb.toString();
    }
}
