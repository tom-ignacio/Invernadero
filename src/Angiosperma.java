interface anInterface {
	
	String clases = "Angiosperma";
}

public class Angiosperma extends conSemilla implements anInterface{

	@Override
	public String toString() {
		return "\nClase: " + clases + super.toString();
	};
	
}