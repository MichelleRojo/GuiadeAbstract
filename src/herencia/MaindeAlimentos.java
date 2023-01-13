package herencia;

public class MaindeAlimentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perecedero perecedero1 = new Perecedero("arroz", "gallo"," bajo","perecedero");
	perecedero1.tipoAlimento();	
		

		Noperecedero noperecedero2 = new Noperecedero("carne", "coto","alto","noperecedero");
	    System.out.println(noperecedero2);
	    noperecedero2.tipoAlimento();
		
	}

}

