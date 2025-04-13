public class Solution {
    public static int solution(int n) {
        int sum = 0;

        // 홀수인 경우
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        } 
        // 짝수인 경우
        else {
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // n을 입력받음
        int n = scanner.nextInt();

        // 결과 출력
        System.out.println(solution(n));

        scanner.close();
    }
}
