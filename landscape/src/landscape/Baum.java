package landscape;

public class Baum {
	private String typ;
	
	private class Blatt{
		boolean schrafiert;
		String farbe;
		Blatt(String farbe, boolean schrafiert){
			this.schrafiert = schrafiert;
			this.farbe = farbe;
		}
	}
	
	private Blatt[] blaetter = new Blatt[134];
}
