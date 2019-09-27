package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestReplace {
    private static Replace replace;
    @BeforeClass
    public static void setUp(){
        replace= new Replace();
    }
    @AfterClass
    public static void tearDown(){
        replace = null;
    }

    @Test
    public void testReplace(){
        assertEquals("verify the code again","faity fry",replace.replace("daily dry"));

    }
}
