package jug.istanbul.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CounterTest {

    /*

    Verilen bir c�mlede , program sonu �s� veya �r� ile
    biten harflerin say�s�n� saymal� ve sonucu geri d�nd�rmelidir.

    count(dogs cats) _ 2
    count(dog cat) _ 0


     */

    @Test
    public void testCounter() {
        Counter counter =  Counter();
        int count =  counter.count("dogs cats");
        Assert.assertEquals(2, count);
    }

}
