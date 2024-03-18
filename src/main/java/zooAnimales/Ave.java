package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero,
            String colorPlumas) {
     super(nombre, edad, habitat, genero);
     this.colorPlumas = colorPlumas;
     Ave.listado.add(this);
 }
	public Ave() {
     super();
     this.colorPlumas = "";
     Ave.listado.add(this);
 }
	
	public void setColorPlumas(String color) {
		colorPlumas=color;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public int cantidadAves() {
		return Ave.listado.size();
	}
	
	public String movimiento() {
		return "volar";
		
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		new Ave(nombre, edad,"montanas",genero,
            "cafe glorioso");
		halcones++;
		
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		new Ave(nombre,edad,"montanas",genero,
            "blanco y amarillo");
		aguilas++;
	}
	
	
}
