package com.sapient.week1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CheckEvenTest 
{
    private CheckEven app;

    @Before
    public void setup(){
        app = new CheckEven();
    }


    /**
     * Rigourous Test :-)
     */
    @Test
    public void checkEvenTest1()
    {
        boolean c = app.check(2);
        assertTrue( c == true );
    }

    @Test
    public void checkEvenTest2()
    {
        boolean c = app.check(7);
        assertTrue( c == false );
    }

    @Test
    public void checkEvenTest3()
    {
        boolean c = app.check(3);
        assertFalse( c == true );
    }
    
    @Test
    public void checkEvenTest4()
    {
        boolean c = app.check(6);
        assertFalse( c == false );
    }
}