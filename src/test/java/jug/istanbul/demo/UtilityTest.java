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

    @Test
    public void test2() {
        int count = Counter.getResult("dog cat");
        // Counter counter = new Counter("dogs cats");
        Assert.assertEquals(0, count);

    }

    @Test
    public void test3() {
        int count = Counter.getResult("dog catr");
        // Counter counter = new Counter("dogs cats");
        Assert.assertEquals(0, count);

    }
}
