package week03hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산할 첫 번째 숫자와 연산자, 두 번째 숫자를 차례로 입력하세요");
        int firstNumber = sc.nextInt();
        String operator = sc.next();
        int secondNumber = sc.nextInt();

        new Calculator().calculate(firstNumber, operator, secondNumber);
    }
}