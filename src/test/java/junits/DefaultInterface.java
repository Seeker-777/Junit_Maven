package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultInterface {
	
	@Test
	default void testPalindrome(){
		
		boolean flag = StringFunctions.isPalindrome("radar");
		
		assertTrue(flag);
		
		System.out.println("Inside Default interface");
		
		
	}

}
