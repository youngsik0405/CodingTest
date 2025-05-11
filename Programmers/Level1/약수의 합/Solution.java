
import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int j=1; j<=n; j++) {
            if (n%j == 0){
                answer += j;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.solution(num);

        System.out.println("결과 : " + result);

        sc.close();
    }
}