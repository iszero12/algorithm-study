public class Solution {
    public static int solution(int a, int b, boolean flag) {
        if (flag) {
            return a + b;  // flag가 true일 경우 a + b 반환
        } else {
            return a - b;  // flag가 false일 경우 a - b 반환
        }
    }

    public static void main(String[] args) {
        // 예시 테스트
        System.out.println(solution(-4, 7, true));  // 3
        System.out.println(solution(-4, 7, false)); // -11
    }
}
