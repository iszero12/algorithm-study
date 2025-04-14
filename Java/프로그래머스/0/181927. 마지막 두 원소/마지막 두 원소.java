import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 예시 리스트 입력
        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};

        // 결과 계산 및 출력
        System.out.println("결과 1: " + solution(num_list1));
        System.out.println("결과 2: " + solution(num_list2));
    }

    public static List<Integer> solution(int[] num_list) {
        // num_list의 길이
        int n = num_list.length;
        
        // 리스트를 ArrayList로 반환할 준비
        List<Integer> result = new ArrayList<>();
        
        // num_list의 모든 요소를 result 리스트에 추가
        for (int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }
        
        // 마지막 원소와 그 전 원소 비교
        int lastElement = num_list[n - 1];
        int secondLastElement = num_list[n - 2];
        
        if (lastElement > secondLastElement) {
            // 마지막 원소가 그 전 원소보다 크면, 그 차이를 추가
            result.add(lastElement - secondLastElement);
        } else {
            // 마지막 원소가 그 전 원소보다 크지 않으면, 두 배한 값을 추가
            result.add(lastElement * 2);
        }
        
        return result;
    }
}
