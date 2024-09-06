package week03hw;

import java.util.Scanner;

public class Calculator {



    public double calculate(int firstNumber, String operator, int secondNumber) {
        AbstractOperation operation = new AddOperation();
        AbstractOperation operation1 = new SubstractOperation();
        AbstractOperation operation2 = new MultiplyOperation();
        AbstractOperation operation3 = new DivideOperation();

        double answer = 0;
            switch (operator) {
                case "+": operation.operate(firstNumber, secondNumber) ;
                    break;
                case "-": operation1.operate(firstNumber, secondNumber) ;
                    break;
                case "*": operation2.operate(firstNumber, secondNumber) ;
                    break;
                case "/": operation3.operate(firstNumber, secondNumber) ;
                    break;
                    case "%": answer = firstNumber % secondNumber ;
                    break;
                default:
                    System.out.println("잘못된 입력. 연산자를 넣어주세요");
                    calculate(firstNumber, operator, secondNumber);
                    return answer;
            }

        return answer;
    }


}
