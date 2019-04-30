package main;

public class Main {

	public static void main(String[] args) {
		Stock ibm = new IBM();
		Stock nike = new NIKE();
		Stock tesla = new TESLA();
		
		Inversor pepe = new Inversor("pepe");
		Inversor tato = new Inversor("tato");
		
		ibm.agregarInversor(pepe);
		ibm.agregarInversor(tato);
		nike.agregarInversor(tato);
		tesla.agregarInversor(pepe);
		
		//al cambiar el precio se le notifica a los que estan en esa cartera de inversion
		double precio = 100;
		ibm.setPrecio(precio);
		nike.setPrecio(precio);
		tesla.setPrecio(precio);
	}

}
