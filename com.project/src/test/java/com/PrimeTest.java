package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PrimeTest {

	    @Test
	    public void check() {
	        Prime p = new Prime();
	        boolean a =p.checkprime(9);
	        assertEquals(false,a);
	    }

}
