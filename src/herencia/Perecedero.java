package herencia;
	
	public class Perecedero extends Alimento {

		public Perecedero() {
			
		}

		
		public Perecedero(String producto, String marca, String rangoPrecio, String perecedero) {
			super(producto, marca, rangoPrecio, perecedero);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected void tipoAlimento() {
			
			System.out.println("es un alimento perecedero");
			//System.out.println("producto + ");
		}

		



	
}
