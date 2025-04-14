public class Solution {
    public static String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);

            if (ch == '1') {
                mode = 1 - mode; // mode 전환 (0 <-> 1)
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    ret.append(ch);
                } else if (mode == 1 && idx % 2 == 1) {
                    ret.append(ch);
                }
            }
        }

        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }

    // 테스트용 main 메소드
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String code = scanner.nextLine();
        System.out.println(solution(code));
        scanner.close();
    }
}
