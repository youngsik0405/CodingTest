import java.util.Scanner;

class Solution {
    public String solution(int num) {
        return (num%2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("정수를 입력하세요 :");
        int num = sc.nextInt();
    
        Solution sol = new Solution();
        String result = sol.solution(num);
    
        System.out.println("결과 :" + result);
        
        sc.close();
    }
}

