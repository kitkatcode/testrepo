package com.example.mic.myfirsttest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test(){
        /*This is my firt Test in JUnit*/
        int a = 5;
        int b = 12;
        TestExample testExample = new TestExample();
        int result = testExample.addNumber(a,b);

        assertEquals("Wynik testu:",17,result);
    }
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}