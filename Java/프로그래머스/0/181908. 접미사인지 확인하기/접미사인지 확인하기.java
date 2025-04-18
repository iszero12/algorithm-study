class Solution {
    public int solution(String my_string, String is_suffix) {
        // my_string의 끝이 is_suffix와 같으면 1, 아니면 0을 반환
        if (my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
