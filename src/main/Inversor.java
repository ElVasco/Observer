package main;

public class Inversor {

	private String name;
	
	public Inversor(String name) {
		super();
		this.name = name;
	}



	public void notificar(Stock stock) {
		System.out.println("el inversor: " + name + "\n A sido notificado del cambio en el stock: " + stock.getClass().getSimpleName());
	}
}
