
public class Planta {

	private String name;
	private String order;
	private String family;
	private String genus;
	private int quantity;


	public Planta() {
	}
	
	public Planta(String name, String order, String family, String genus, int quantity) {
		this.name = name;
		this.order = order;
		this.family = family;
		this.genus = genus;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}	

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + this.getName() + "\nOrden: " + this.getOrder() + "\nFamilia: " + this.getFamily() + "\nGénero: " + this.getGenus() + "\nCantidad: " + this.getQuantity() + "\n";
	};
	
}
