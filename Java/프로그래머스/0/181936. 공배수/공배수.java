import java.util.Scanner;

public class Solution {
    public static int solution(int number, int n, int m) {
        // number가 n과 m의 배수인지 확인
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // number, n, m을 입력받음
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 결과 출력
        System.out.println(solution(number, n, m));

        scanner.close();
    }
}
