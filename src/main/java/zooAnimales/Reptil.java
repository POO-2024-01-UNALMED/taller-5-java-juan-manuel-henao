package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado= new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero,
            String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
}
	
	public Reptil() {
		
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
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
		}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		return new Reptil(nombre,edad,"humedal",genero,
            "verde",3);
		
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		return new Reptil(nombre,edad,"jungla",genero,
	            "blanco",1);
			
		
	}
	
	
}
