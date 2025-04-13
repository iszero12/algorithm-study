import java.util.Scanner;

public class Solution {
    public static int solution(int num, int n) {
        // num이 n의 배수이면 1, 아니면 0을 반환
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // num과 n을 입력받음
        int num = scanner.nextInt();
        int n = scanner.nextInt();

        // 결과 출력
        System.out.println(solution(num, n));

        scanner.close();
    }
}
