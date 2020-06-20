package de.aboueldahab.learning.testing;

public class Mitarbeiter {

	private String name;
	private String vorname;
	private double jahresgehalt;
	private double bonus;

	public Mitarbeiter() {
	}

	public Mitarbeiter(String vorname, String name) {
		this.vorname = vorname;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public double getJahresgehalt() {
		return jahresgehalt;
	}

	public void setJahresgehalt(double jahresgehalt) {
		this.jahresgehalt = jahresgehalt;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [name=" + name + ", vorname=" + vorname + ", jahresgehalt=" + jahresgehalt + "]";
	}

}
