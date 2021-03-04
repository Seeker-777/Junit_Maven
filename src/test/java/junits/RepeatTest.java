package junits;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatTest {
	
	@DisplayName("Repeated Test Example")
	@RepeatedTest(3)
	public void junit1() {
		
		System.out.println("Inside Junit");
	}
	
	@Disabled
	@Test
	public void junit2() {
		
		System.out.println("Inside Junit2");
	}

}
