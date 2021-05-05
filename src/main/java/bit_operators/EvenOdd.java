package bit_operators;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        if(evenOdd.isEven(4)) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }

    public boolean isEven(final int number) {
        if((number & 1) == 0)
            return true;
        else
            return false;
    }
}
