package jug.istanbul.demo;

import jug.istanbul.demo.utility.Counter;
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


public class CounterTest {


    /**
     * Verilen bir c�mlede , program sonu �s� veya �r� ile biten harflerin say�s�n� saymal� ve sonucu geri d�nd�rmelidir.
     */

    @ParameterizedTest
    @MethodSource("generator")
    void test(String originalStr, Integer expectedStr) {
        assertThat(Counter.count(originalStr)).isEqualTo(expectedStr);
    }

    static Stream<Arguments> generator() {
        return Stream.of(of("dogs cats", 2), // T1
                of("dog cat", 0), // T2
                of("car bar", 2), // T3
                of("dogs, bar", 1), // T4
                of("1234", 0)// T5
        );
    }


}
