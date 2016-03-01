package com.andy.antjunit.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest extends junit.framework.TestCase{

	 public void testNothing() {
	    }
    
    public void testWillAlwaysFail() {
        assertEquals(true,false);
    }
}
