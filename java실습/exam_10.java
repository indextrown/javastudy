//입력값을 받아서 실행(중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!)

import java.util.Scanner;
public class exam_10 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        printResult(num);
    }

    public static void printResult(int n) {
        String result = (n % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("정수 %d은 %s입니다.\n", n, result);
    }
}

//