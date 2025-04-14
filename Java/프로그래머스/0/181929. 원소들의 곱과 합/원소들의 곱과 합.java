import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        System.out.print("리스트의 길이 입력 (2 이상 10 이하): ");
        int n = sc.nextInt();

        int[] num_list = new int[n];
        System.out.println("리스트의 원소를 입력하세요 (각 원소는 1 이상 9 이하):");
        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        // 결과 계산 및 출력
        int result = solution(num_list);
        System.out.println("결과: " + result);
    }

    public static int solution(int[] num_list) {
        int sum = 0;
        int product = 1;

        for (int num : num_list) {
            sum += num;
            product *= num;
        }

        return product < (sum * sum) ? 1 : 0;
    }
}
