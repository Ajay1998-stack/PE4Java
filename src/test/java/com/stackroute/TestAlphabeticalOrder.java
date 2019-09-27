package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestAlphabeticalOrder {
    private static AlphabeticalSort alphabeticalSort;
    @BeforeClass
    public static void setUp(){
        alphabeticalSort=new AlphabeticalSort();
    }
    @AfterClass
    public static void tearDown(){
        alphabeticalSort= null;
    }

    @Test
    public void TestAlphabeticalOrder(){
        assertEquals("verify the code","code, error, has, some, your",alphabeticalSort.string("your code has some error"));
    }
}
