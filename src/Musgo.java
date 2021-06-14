interface musInterface {
	
	String clases = "Musgo";
}

public class Musgo extends sinSemilla implements musInterface{

	@Override
	public String toString() {
		return "\nClase: " + clases + super.toString();
	};
	
}
