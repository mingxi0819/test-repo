package com.cb.unittest;

import org.junit.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by user on 16/3/22.
 */
public class MyUnitTest {

    TestObject test;

    @Before
    public void setup(){
        test = new TestObject();
    }

//    @Test
    public void testMyUnit(){
//        MyUnitTest unit = new MyUnitTest();

        String test1 = "abc";

        Assert.assertEquals(test1,"abc");
        Assert.assertNull(null);
        Assert.assertNotNull(null);
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }

    @Test
    public void testEquals(){
        String s = "123";
        Assert.assertTrue(test.equalOrNot(s));
    }



    @After
    public void tearDown(){
    }


}
