package dayfinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DayfinderTest {
	
	private Dayfinder dayfinder;

	@BeforeEach
	public void setup() {
		dayfinder = new Dayfinder();
	}

	@Test
	public void testDifferentDaysOfWeek() {
		assertEquals("MONTAG", dayfinder.findDay(11, 5, 2020));
		assertEquals("DIENSTAG", dayfinder.findDay(12, 5, 2020));
		assertEquals("MITTWOCH", dayfinder.findDay(13, 5, 2020));
		assertEquals("DONNERSTAG", dayfinder.findDay(14, 5, 2020));
		assertEquals("FREITAG", dayfinder.findDay(15, 5, 2020));
		assertEquals("SAMSTAG", dayfinder.findDay(16, 5, 2020));
		assertEquals("SONNTAG", dayfinder.findDay(17, 5, 2020));
	}
	
}
