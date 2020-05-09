package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextBasedCalculatorTest {
	
	
	private TextBasedCalculator calculator;

	@BeforeEach
	public void setUp() {
		calculator = new TextBasedCalculator();
	}

	@Test
	public void testReturnOfNumbers() {
		assertEquals(0, calculator.calculate("0"));
		assertEquals(12, calculator.calculate("12"));
		assertEquals(-51, calculator.calculate("-51"));
	}
	
	@Test
	public void testAddition_withTwoNumbers() {
		assertEquals(12, calculator.calculate("5+7"));
		assertEquals(7, calculator.calculate("0+7"));
	}

	@Test
	public void testAddition_withThreeNumbers() {
		assertEquals(12, calculator.calculate("5+7+0"));
		assertEquals(19, calculator.calculate("11+7+1"));
		assertEquals(0, calculator.calculate("0+0+0"));
	}
	
	@Test
	public void testSubtraction_withTwoNumbers() {
		assertEquals(5, calculator.calculate("7-2"));
		assertEquals(-7, calculator.calculate("0-7"));
	}
	
	@Test
	public void testSubtractionAndAdditionAndSubtraction() {
		assertEquals(1, calculator.calculate("1-7+12-5"));
		assertEquals(-1, calculator.calculate("-1-7+12-5"));
	}

	@Test
	public void testSubtraction_withNegativeFirstDigit() {
		assertEquals(-7, calculator.calculate("-7-0"));
	}
	
	
	@Test
	public void testErrorInputHandling() {
		String noLetters = "abcd";
		assertThrows(IllegalArgumentException.class, () -> calculator.calculate(noLetters));
		String noDots = "7+6.1";
		assertThrows(IllegalArgumentException.class, () -> calculator.calculate(noDots));
	}
	
}
