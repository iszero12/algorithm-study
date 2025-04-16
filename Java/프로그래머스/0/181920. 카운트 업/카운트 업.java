import java.util.*;

public class Solution {
    public static List<Integer> solution(int start_num, int end_num) {
        List<Integer> result = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start_num = scanner.nextInt();
        int end_num = scanner.nextInt();

        List<Integer> answer = solution(start_num, end_num);
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
