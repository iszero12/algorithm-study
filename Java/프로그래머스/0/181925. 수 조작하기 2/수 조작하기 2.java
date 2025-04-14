import java.util.Scanner;

public class Solution {
    public static String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            
            if (diff == 1) {
                result.append("w");
            } else if (diff == -1) {
                result.append("s");
            } else if (diff == 10) {
                result.append("d");
            } else if (diff == -10) {
                result.append("a");
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // numLog 배열의 길이 입력 받기
        int n = scanner.nextInt();
        int[] numLog = new int[n];
        
        // numLog 배열의 원소 입력 받기
        for (int i = 0; i < n; i++) {
            numLog[i] = scanner.nextInt();
        }

        // solution 함수 실행 및 결과 출력
        System.out.println(solution(numLog));
        
        // 스캐너 닫기
        scanner.close();
    }
}
