interface helInterface {
	
	String clases = "Helecho";
}

public class Helecho extends sinSemilla implements helInterface{

	@Override
	public String toString() {
		return "\nClase: " + clases + super.toString();
	};
	
}
