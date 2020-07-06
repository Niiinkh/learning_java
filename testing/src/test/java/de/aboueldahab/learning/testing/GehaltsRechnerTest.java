package de.aboueldahab.learning.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GehaltsRechnerTest {

	@Test
	public void testMonatsgehaltBrutto_OhneBonus() {
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(12000.0);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(1000.0, gehaltsRechner.getMonatsgehaltBrutto());
		assertEquals(12000.0, gehaltsRechner.getJahresGehalt());
	}
	
	@Test
	public void testMonatsgehaltBrutto_MitBonusGeringesGehalt() {
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(12000.0);
		mohamed.setBonus(1000);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(2000.0, gehaltsRechner.addBonus());
		assertEquals(12000.0, gehaltsRechner.getJahresGehalt());
	}
	
	@Test
	public void testMonatsgehaltBrutto_MitBonus200() {
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(60000.0);
		mohamed.setBonus(200);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(5200.0, gehaltsRechner.addBonus());
		assertEquals(60000.0, gehaltsRechner.getJahresGehalt());
	}
	@Test
	public void testMonatsgehaltBrutto_MitBonus500() {
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(60000.0);
		mohamed.setBonus(500);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(5500.0, gehaltsRechner.addBonus());
		assertEquals(60000.0, gehaltsRechner.getJahresGehalt());
	}
	
	@Test
	public void testMonatsgehaltNetto_OhneBonus() 
	{ 
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(12000.0);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(880, gehaltsRechner.getMonatsgehaltNetto());
	}
	
	@Test
	public void testMonatsgehaltNetto_MitBonus200()  {
		// Jahresgehalt 60000 -> Netto 4600
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(60000.0);
		mohamed.setBonus(200);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(4600, gehaltsRechner.getMonatsgehaltNetto());
	}
	
	@Test
	public void testMonatsgehaltNetto_MitBonus500()  {
		// Jahresgehalt 60000 -> Netto 4600
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(60000.0);
		mohamed.setBonus(500);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(4900, gehaltsRechner.getMonatsgehaltNetto());
	}
	
	@Test
	public void testSteuer()  {
		// Jahresgehalt 12000 -> Steuer 120
		// Jahresgehalt 60000 -> Steuer 600
		Mitarbeiter mohamed =new Mitarbeiter ("Mohamed","Abo_Eldahab");
		mohamed.setJahresgehalt(120000.0);
		GehaltsRechner gehaltsRechner = new GehaltsRechner(mohamed);
		assertEquals(1200, gehaltsRechner.getSteuerMonatlich());
	}
	
}
