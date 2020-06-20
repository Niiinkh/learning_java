package de.aboueldahab.learning.testing;

import java.text.DecimalFormat;

/**
 * Wenn das Jahresgehalt größer als 50000.0 ist, dann bekommt man einen
 * zusätzlichen Bonus von 200.0 im Monat.
 * 
 * Jahresgehalt = 12000 -> Monatsgehalt 1000
 * 
 * Jahresgehalt = 60000 -> Monatsgehalt 5000 +200;
 * 
 * Brutto: 1000 -> 120 Steuer / 880 für dich (Netto)
 */
public class GehaltsRechner {

	private double jahresGehalt;
	private double Monatsgehalt;
	public static final double STEUER = 0.12;
	private double nettoMonatsgehalt;
	private double wertSteuer;
	private double steuerTeil;
	private Mitarbeiter mitarbeiter;

	public GehaltsRechner(Mitarbeiter mitarbeiter) {
		this.jahresGehalt = mitarbeiter.getJahresgehalt();
	}

	public double getJahresGehalt() {
		return jahresGehalt;
	}

	/**
	 * Diese Methode berechnet das Brutto-Monatsgehalt
	 */
	public double getMonatsgehaltBrutto() {
		this.Monatsgehalt = this.jahresGehalt / 12;
		if (this.jahresGehalt > 50000) {
			this.Monatsgehalt += 200;
		}
		// new DecimalFormat("#0.###").format(this.Monatsgehalt);
		return this.Monatsgehalt;
	}

	
	public double getMonatsgehaltNetto() {
		if (this.jahresGehalt < 50000) {
			wertSteuer = this.getMonatsgehaltBrutto() * STEUER;
			return this.nettoMonatsgehalt = this.Monatsgehalt - wertSteuer;
		} else {
			this.steuerTeil = this.getMonatsgehaltBrutto() - 200;
			wertSteuer = this.steuerTeil * STEUER;
			this.steuerTeil -= wertSteuer;
			return this.steuerTeil += 200;
		}

	}

	public double getSteuerMonatlich() {
		this.Monatsgehalt = this.jahresGehalt / 12;
		this.wertSteuer = this.Monatsgehalt * STEUER;
		return wertSteuer;
	}
}
