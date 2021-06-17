import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Tomás Villasmil\n");
		ArrayList <Planta> plantas = new ArrayList<>();

		Planta p1 = new Planta();
		p1.setName("Cocos nucifera");
		p1.setQuantity(5);

		Planta p2 = new conSemilla();
		p2.setName("Manzano común");
		p2.setOrder("Rosales");
		p2.setFamily("Rosaceae");
		p2.setGenus("Malus");
		p2.setQuantity(34);

		Planta p3 = new Musgo();
		p3.setName("Bryopsida");
		p3.setQuantity(10);

		Planta p4 = new Angiosperma();
		p4.setName("Girasol");
		p4.setOrder("Asterales");
		p4.setFamily("Asteraceae");
		p4.setGenus("Helianthus");
		p4.setQuantity(28);

		plantas.add(p1);
		plantas.add(p2);
		plantas.add(p3);
		plantas.add(p4);
		System.out.println("El invernadero actualmente contiene a las siguientes plantas... \n\n" + plantas);

	}

}
