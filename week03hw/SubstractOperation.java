package week03hw;
    public class SubstractOperation extends AbstractOperation  {
        @Override
        public void operate(int firstNumber, int secondNumber) {
            double answer = firstNumber - secondNumber;
            System.out.println("결과값 : " + answer);
        }
    }


