package jug.istanbul.demo.utility;

public class Counter {
    public static int count(String value) {

        int count = 0;
        String[] words = value.split("\\s+");
        for (String word : words) {
            if (isaBoolean(word)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isaBoolean(String word) {
        return word.endsWith("s") || word.endsWith("r");
    }
}
