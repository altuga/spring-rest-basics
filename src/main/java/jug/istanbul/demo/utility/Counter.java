package jug.istanbul.demo.utility;

public class Counter {

    public static int getResult(String value) {
        String[] words = value.split("\\s+");
        int counter = 0 ;
        for (String word : words) {
            if (word.endsWith("s") || word.endsWith("r")) {
                counter++;
            }
        }

        return counter;
    }


}
