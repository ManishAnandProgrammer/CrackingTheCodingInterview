package string;

public class PermutationOfString {

    public static void main(String[] args) {
        String stringToPermute = "ABC";
        int stringLength = stringToPermute.length();
        permute(stringToPermute, 0, stringLength - 1);
    }

    private static void permute(String stringToPermute, int startingIndex, int endIndex) {
        if (startingIndex == endIndex)
            System.out.println(stringToPermute);
        else {
            for (int i = startingIndex; i <= endIndex; i++) {
                stringToPermute = swap(stringToPermute, startingIndex, i);
                permute(stringToPermute, startingIndex + 1, endIndex);
                stringToPermute = swap(stringToPermute, startingIndex, i);
            }
        }
    }

    public static String swap(String stringToPermute, int position1, int position2) {
        char temp;
        char[] charArray = stringToPermute.toCharArray();
        temp = charArray[position1];
        charArray[position1] = charArray[position2];
        charArray[position2] = temp;
        return String.valueOf(charArray);
    }
}
