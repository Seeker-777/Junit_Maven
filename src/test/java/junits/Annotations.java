package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Annotations {
	
	@BeforeAll
	public static void beforeall() {
	 
		System.out.println("Inside BeforeAll");
	}
	
	@BeforeEach
	public void beforejunit1() {
	 
		System.out.println("Inside BeforeJunit");
	}
	
	
	@Test
	public void junit1() {
		
		System.out.println("Inside Junit");
		}
	
	
	@AfterEach
	public void afterjunit1() {
		
		System.out.println("Inside AfterJunit");
	}
	
	@AfterAll
	public static void afterall() {
		
		System.out.println("Inside AfterAll");
	}

}
