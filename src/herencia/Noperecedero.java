package herencia;

	public class  Noperecedero extends Alimento {

		
		public Noperecedero() {
		}

		@Override
		public String toString() {
			return "Noperecedero [producto=" + producto + ", marca=" + marca + ", rangoPrecio=" + rangoPrecio
					+ ", tipo=" + tipo + "]";
		}

		public Noperecedero(String producto, String marca, String rangoPrecio, String noperecedero) {
			super(producto, marca, rangoPrecio,noperecedero );
			
		}
       @Override
		public void tipoAlimento() {
			System.out.println("es un alimento no perecedero");
		
			
		}
}
