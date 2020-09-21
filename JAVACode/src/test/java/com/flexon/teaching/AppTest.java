package com.flexon.teaching;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
    
    @Test
    public void testSumPositive() {
    	int results;
    	
    	System.out.println("Sum Test case 1");
    	results = App.sum(0, 0);
    	
    	assertEquals(0, results);
    	
    }
    
    @Test
    public void testcase2() {
    	int results;
    	
    	System.out.println("Sum Test case 2");
    	results = App.sum(1, 2);
    	
    	assertEquals(3, results);
    }
}
