import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }

        // Stack을 int[] 배열로 변환
        int[] answer = new int[stk.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = stk.get(j); // get은 Stack이 List를 상속받기 때문에 사용 가능
        }

        return answer;
    }
}
