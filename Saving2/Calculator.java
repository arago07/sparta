package Saving2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public void calculate (int firstNumber, int secondNumber, String operator) {
        if (firstNumber >= 0 && secondNumber >= 0) {
            double answer = 0;
            switch (operator) {
                case "+":
                    answer = firstNumber + secondNumber;
                    break;
                case "-":
                    answer = firstNumber - secondNumber;
                    break;
                case "*":
                    answer = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        answer = (double) firstNumber / secondNumber;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        calculate(firstNumber, secondNumber, operator);
                    }
                    break;
                case "%":
                    if (secondNumber != 0) {
                        answer = firstNumber % secondNumber;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        calculate(firstNumber, secondNumber, operator);
                    }
                    break;
                default:
                    System.out.println("잘못된 입력. 연산자를 넣어주세요");
                    calculate(firstNumber, secondNumber, operator);

            }
            System.out.println("결과값 : " + answer);
        } else {
            System.out.println("양의 정수를 입력해주세요.");
            calculate(firstNumber, secondNumber, operator);
        }
    }
    }
