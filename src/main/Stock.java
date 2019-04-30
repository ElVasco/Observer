package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock {

	private double precio;
	List<Inversor> inversores = new ArrayList<Inversor>();
	
	public Stock(double precio) {
		super();
		this.setPrecio(precio);
	}
	
	public void agregarInversor(Inversor inversor) {
		inversores.add(inversor);
	}
	
	public void eliminarInversor(Inversor inversor) {
		
	}
	
	
	public void notificarInversores() {
		for (Inversor inversor : inversores) {
			inversor.notificar(this);
		}
	}

	public void setPrecio(double precio) {
		if(precio != this.precio) {
			this.precio = precio;
			notificarInversores();
		}
	}
}
