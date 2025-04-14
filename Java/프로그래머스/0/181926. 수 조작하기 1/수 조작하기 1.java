import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 정수 n과 문자열 control 입력 받기
        System.out.print("n을 입력하세요: ");
        int n = sc.nextInt();  // n을 정수로 입력 받음

        System.out.print("control 문자열을 입력하세요: ");
        String control = sc.next();  // control을 문자열로 입력 받음

        // solution 함수 호출 후 결과 출력
        System.out.println(solution(n, control));
        
        // 스캐너 닫기
        sc.close();
    }

    public static int solution(int n, String control) {
        // control 문자열을 순차적으로 처리
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w': 
                    n += 1;  // "w"일 때 n을 1 증가
                    break;
                case 's': 
                    n -= 1;  // "s"일 때 n을 1 감소
                    break;
                case 'd': 
                    n += 10; // "d"일 때 n을 10 증가
                    break;
                case 'a': 
                    n -= 10; // "a"일 때 n을 10 감소
                    break;
            }
        }
        return n; // 최종값 반환
    }
}
