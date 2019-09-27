package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTranspose {
    private static Transpose transpose;
    @BeforeClass
    public static void setUp(){
        transpose = new Transpose();
    }

    @AfterClass
    public static void tearDown(){
        transpose = null;
    }

    @Test
    public void Test(){
        assertEquals("check the code","a kciuq nworb xof spmuj revo eht yzal god",transpose.transpose("a quick brown fox jumps over the lazy dog"));
    }
}
