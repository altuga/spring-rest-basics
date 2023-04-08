package jug.istanbul.demo;



import jug.istanbul.demo.utility.Counter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class UtilityTest {

    @Test
    public void test() {
        int count = Counter.getResult("dogs cats");
        // Counter counter = new Counter("dogs cats");
        Assert.assertEquals(2, count);



    }
}
