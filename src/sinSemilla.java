
interface pteInterface {
	
	String group = "Pteridofitas";
}

public class sinSemilla extends Planta implements pteInterface {

	@Override
	public String toString() {
		return "\nGrupo: " + group + super.toString();
	};

	
}
