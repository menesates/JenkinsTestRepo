package com.menesates.jenkinstest;

import org.junit.Assert;
import org.junit.Test;

public class JenkinsTest {

    @Test
    public void testSucces(){
        Assert.assertEquals(2,2);
    }

    @Test
    public void testFail(){
        Assert.assertEquals(3,3);
    }
}