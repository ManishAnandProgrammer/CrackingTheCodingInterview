package bit_operators;

public class NonRepeatingElementInArrayUsingXor {
    /**
     * @param arr the array of n elements in which all
     *            elements are repeated twice except one
     *            element
     * */
    public int getOnlyNonRepeatingElement(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
