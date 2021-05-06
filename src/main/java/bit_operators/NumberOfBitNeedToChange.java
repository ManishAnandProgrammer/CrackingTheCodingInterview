package bit_operators;

public class NumberOfBitNeedToChange {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        int intermediateValue = firstNumber ^ secondNumber;
        System.out.printf("intermediate value is %d %n", intermediateValue);

        int numberOfBitsToChange = 0;
        while(intermediateValue != 0) {
            intermediateValue = intermediateValue & (intermediateValue -1 );
            System.out.printf("New intermediate value is:: %d %n ", intermediateValue);
            numberOfBitsToChange++;
        }
        System.out.printf("Numbers of Bits To Change is:: %d", numberOfBitsToChange);
    }
}
