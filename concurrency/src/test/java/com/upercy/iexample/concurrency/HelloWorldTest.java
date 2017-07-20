package com.upercy.iexample.concurrency;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * HelloWorldTest
 *
 * @author: fengwang
 * @date: 2017/7/20 20:15
 * @version: 1.0
 * @since: JDK 1.7
 */
public class HelloWorldTest {
    /**
     * helloworld
     */
    private HelloWorld helloworld;

    @BeforeMethod
    public void setUp() throws Exception {
        helloworld = new HelloWorld();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testHello() throws Exception {
        helloworld.hello();
    }
}
