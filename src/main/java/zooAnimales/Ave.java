package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado= new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero,
            String colorPlumas) {
     super(nombre, edad, habitat, genero);
     this.colorPlumas = colorPlumas;
     Ave.listado.add(this);
 }
	public Ave() {
     
     Ave.listado.add(this);
 }
	
	public void setColorPlumas(String color) {
		colorPlumas=color;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public static int cantidadAves() {
		return Ave.listado.size();
	}
	
	public String movimiento() {
		return "volar";
		
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre, edad,"montanas",genero,
            "cafe glorioso");
		
		
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		return new Ave(nombre,edad,"montanas",genero,
            "blanco y amarillo");
		
	}
	
	
}
