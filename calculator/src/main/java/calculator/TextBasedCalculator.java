package calculator;

/**
 * This is a simple Text Based Calculator.
 */
public class TextBasedCalculator {

	/**
	 * Converts an expression of basic mathematical operations into a resulting
	 * Integer Value.
	 * 
	 * @param input The String, that contains the expression to be calculated
	 * @return The Integer value of the expression
	 */
	public int calculate(String input) {
		char firstCharacter = input.charAt(0);
		if (firstCharacter != '+' && firstCharacter != '-') {
			input = "+" + input;
		}
		
		String[] numbers = input.substring(1, input.length()).split("[+-]");
		String[] operations = input.split("[0-9]+");

		int result = 0;

		for (int i = 0; i < numbers.length; i++) {
			result += Integer.parseInt(operations[i] + numbers[i]);
		}

		return result;
	}

}
