class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();  // 문자열을 효율적으로 합치기 위해 StringBuilder 사용
        
        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            String part = my_strings[i].substring(start, end + 1); // 부분 문자열 추출 (end 포함)
            answer.append(part); // 결과 문자열에 추가
        }
        
        return answer.toString(); // 최종 문자열 반환
    }
}
