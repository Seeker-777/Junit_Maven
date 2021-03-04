package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTestExp {

	@ValueSource(strings = {"radar","acca","mom"})
	@ParameterizedTest
	public void junits1(String arg1) {
		
		assertTrue(StringFunctions.isPalindrome(arg1));
	}
	
	@EnumSource(Month.class)
	@ParameterizedTest
	public void junit2(Month month) {
		
		System.out.println(month.getValue());
		
		int monthNumber = month.getValue();
		assertTrue(monthNumber>=1 && monthNumber<=12);
	}
	
	@CsvSource(value = {"test:Test:TEST"}, delimiter = '=')
	@ParameterizedTest
	public void junit4(String Exp, String Act, String description) {
		
		
		
	}
	
}
