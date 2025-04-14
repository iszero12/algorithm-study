import java.util.Scanner;

public class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        // 각 쿼리마다 배열을 처리
        for (int[] query : queries) {
            int i = query[0];  // i 값
            int j = query[1];  // j 값
            
            // arr[i]와 arr[j]를 교환
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return arr;  // 변형된 배열을 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 배열 arr의 길이를 입력받음
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // arr 배열의 원소들을 입력받음
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 쿼리의 개수를 입력받음
        int q = scanner.nextInt();
        int[][] queries = new int[q][2];
        
        // queries 배열에 쿼리들을 입력받음
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }
        
        // solution 함수 호출
        int[] result = solution(arr, queries);
        
        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
