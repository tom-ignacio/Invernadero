
interface espInterface {
	
	String group = "Espermatofita";
}

public class conSemilla extends Planta implements espInterface {

	
	@Override
	public String toString() {
		return "\nGrupo: " + group + super.toString();
	};

	
}
