package com.example.karthick.sampleRest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    @Test
    public void testHello() {
        Hello hello = new Hello();
        assertEquals(hello.getHello(), "Hello World");
    }
}
