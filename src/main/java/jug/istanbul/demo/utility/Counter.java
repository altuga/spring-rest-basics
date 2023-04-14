package jug.istanbul.demo.utility;

public class Counter {
    public static int count(String value) {

        int count = 0;
        String[] words = value.split("\\s+");
        for (String word : words) {
            // List data = "select i"db veri cek
            if (word.endsWith("s") || word.endsWith("r")) {
                count++;
            }
        }

        return count;
    }
}
