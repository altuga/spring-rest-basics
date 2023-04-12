package jug.istanbul.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

import jug.istanbul.demo.utility.Counter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class UtilityTest {

    @Test
    public void test() {
        int count = Counter.getResult("dogs cats");
        // Counter counter = new Counter("dogs cats");
        //Assert.assertEquals(2, count);

    }

    @Test
    public void test2() {
        int count = Counter.getResult("dog cat");
        // Counter counter = new Counter("dogs cats");
        //Assert.assertEquals(0, count);

    }

    @Test
    public void test3() {
        int count = Counter.getResult("dog catr");
        // Counter counter = new Counter("dogs cats");
        //Assert.assertEquals(1, count);

    }


    @ParameterizedTest
    @MethodSource("generator")
    void test(String originalStr, Integer expected) {

        Assert.assertEquals(Counter.getResult(originalStr), expected.intValue());
    }

    static Stream<Arguments> generator() {
        return Stream.of(
                of("dogs cats", 2),
                of("dog cat", 0),
                of("dog catr", 1),
                of("1234", 0 )
        );
    }

}
