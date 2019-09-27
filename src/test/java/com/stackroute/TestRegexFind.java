package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRegexFind {
    private static RegexFind regexFind;

    @BeforeClass
    public static void setUp(){
        regexFind = new RegexFind();
    }

    @AfterClass
    public static void  tearDown(){
        regexFind = null;
    }

    @Test
    public void TestRegexFind(){
        assertEquals("Is Harry here ? true",regexFind.regexMethod("This is Harry."));
    }
}
