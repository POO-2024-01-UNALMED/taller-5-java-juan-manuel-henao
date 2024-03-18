package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
            String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
}
	
	public Reptil() {
		super();
		this.colorEscamas = "";
		this.largoCola = 0;
		Reptil.listado.add(this);
		}
	
	public void setColorEscamas(String escamas) {
		this.colorEscamas=escamas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largo) {
		this.largoCola=largo;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public int cantidadReptiles() {
		return Reptil.listado.size();
		}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		new Reptil(nombre,edad,"humedal",genero,zona,
            "verde",3);
		iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		new Reptil(nombre,edad,"jungla",genero,zona,
	            "blanco",1);
			serpientes++;
		
	}
	
	
}
