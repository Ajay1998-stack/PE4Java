package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultipleOCcur {
    private static MultipleOccurances multipleOccurances;

    @BeforeClass
    public static void setUp(){
        multipleOccurances = new MultipleOccurances();
    }

    @AfterClass
    public static void tearDown(){
        multipleOccurances = null;
    }

    @Test
    public void TestMultipleOCcur(){
        assertEquals("check errors","Found at: 4 - 6",multipleOccurances.multipleOccurances("She sells","se"));
    }
}
