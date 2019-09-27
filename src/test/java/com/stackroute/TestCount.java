package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCount {
    private static count count;
    @BeforeClass
    public static void setup(){
        count = new count();
    }

    @AfterClass
    public static void tearDown(){
        count = null;
    }

    @Test
    public void testCountWords(){
        assertEquals("verify count class again",3,count.CountWords("java is a java non java", 'j'));
        assertTrue(4== count.CountWords("ha ha ha ha ",'h'));
        assertNotEquals("your code has error",3,count.CountWords("ha ha ha ha ",'h'));
        assertNotNull("not null atleast ",count.CountWords("ha ha ha ha ",'h'));

    }
}