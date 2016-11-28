package com.EJR.StudentLedReview;

File fontFile = new File("fonts/STARWARS.ttf");;
FileInputStream in = new FileInputStream(f);
Font dFont = Font.createFont(Font.TRUETYPE_FONT, in);
Font StarWars = dFont.deriveFont(15f);

public class NewPadawan {
	
	private String ID;
	private String name;
	private String planet;
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getPlanet() {
		return planet;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}

}
