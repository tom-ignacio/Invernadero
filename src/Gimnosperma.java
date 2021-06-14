interface gimInterface {
	
	String clases = "Gimnosperma";
}

public class Gimnosperma extends conSemilla implements gimInterface{

	@Override
	public String toString() {
		return "\nClase: " + clases + super.toString();
	};
	
}