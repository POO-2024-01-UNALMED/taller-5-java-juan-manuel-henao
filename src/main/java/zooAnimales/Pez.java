package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
			String colorEscamas, int cantidadAletas) {
     super(nombre, edad, habitat, genero, zona);
     this.colorEscamas = colorEscamas;
     this.cantidadAletas = cantidadAletas;
     Pez.listado.add(this);
 }
	public Pez() {
     super();
     this.colorEscamas = "";
     this.cantidadAletas = 0;
     Pez.listado.add(this);
     }
	
	public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }

    
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    public int getCantidadAletas() {
        return cantidadAletas;
    }
    
    public int cantidadPeces() {
    	return Pez.listado.size();
    }
    
    public String movimiento() {
    	return "nadar";
    }
    
    public void crearSalmon(String nombre, int edad, String genero, ArrayList<Zona> zona) {
    	new Pez(nombre,edad,"oceano",genero,zona,
			"rojo",6);
    	salmones ++;
    }
    
    public void crearBacalao(String nombre, int edad, String genero, ArrayList<Zona> zona) {
    	new Pez(nombre,edad,"oceano",genero,zona,
			"gris",6);
    	bacalaos ++;
    }
}
