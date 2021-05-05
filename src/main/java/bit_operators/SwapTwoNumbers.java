package bit_operators;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 15;

        System.out.println("Numbers Before Swapping");
        System.out.printf("firstNumber = %d and secondNumber = %d %n", firstNumber, secondNumber);

        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;
        System.out.println("Numbers After Swapping");
        System.out.printf("firstNumber = %d and secondNumber = %d ", firstNumber, secondNumber);
    }
}
