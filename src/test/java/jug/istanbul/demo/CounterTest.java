package jug.istanbul.demo;

import jug.istanbul.demo.utility.Counter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CounterTest {


    /**
     * Verilen bir c�mlede , program sonu �s� veya �r� ile biten harflerin say�s�n� saymal� ve sonucu geri d�nd�rmelidir.
     */

    @Test
    public void test() {
        // Counter counter = new Counter();
        int count= Counter.count("dogs cats");
        Assert.assertEquals(2, count);

    }
}
