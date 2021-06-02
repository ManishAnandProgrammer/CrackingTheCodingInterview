package string;

import java.util.*;

public class PermutationOfString {

    public static void main(String[] args) {
        String stringToPermute = "ABC";
        int stringLength = stringToPermute.length();
        permute(stringToPermute, 0, stringLength - 1);
        permuteIterative(stringToPermute);
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

    public static void permuteIterative(String stringToPermute) {
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add(stringToPermute);
        Set<String> resultSet = new TreeSet<>();
        resultSet.add(stringToPermute);
        while(!taskQueue.isEmpty()) {
            String queueFrontTask  = taskQueue.poll();
            for(int i = 0; i < queueFrontTask.length(); i++) {
                String swapped = swap(queueFrontTask, 0, i);
                if(!resultSet.contains(swapped)) {
                    resultSet.add(swapped);
                    taskQueue.offer(swapped);
                }
            }
        }

        System.out.println(resultSet);
    }

}
