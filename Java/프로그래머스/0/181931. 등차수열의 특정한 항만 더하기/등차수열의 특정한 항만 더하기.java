import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 항 a 입력
        System.out.print("첫 번째 항 a 입력: ");
        int a = sc.nextInt();

        // 공차 d 입력
        System.out.print("공차 d 입력: ");
        int d = sc.nextInt();

        // included 배열의 길이 n 입력
        System.out.print("included 배열의 길이 입력: ");
        int n = sc.nextInt();

        // included 배열 입력
        boolean[] included = new boolean[n];
        System.out.println("included 배열을 true/false로 " + n + "개 입력하세요 (예: true false true ...):");
        for (int i = 0; i < n; i++) {
            included[i] = sc.nextBoolean();
        }

        // 결과 계산
        int result = solution(a, d, included);

        // 결과 출력
        System.out.println("결과: " + result);
    }

    public static int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                sum += a + d * i;
            }
        }
        return sum;
    }
}
