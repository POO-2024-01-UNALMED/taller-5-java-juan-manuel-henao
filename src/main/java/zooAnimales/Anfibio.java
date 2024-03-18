package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
    }

    public Anfibio() {
        super();
        this.colorPiel = "";
        this.venenoso = false;
        Anfibio.listado.add(this);
    }
    
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public String getColorPiel() {
        return colorPiel;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    
    public int cantidadAnfibios() {
    	return Anfibio.listado.size(); 
    }
    
    public String movimiento() {
    	return "saltar";
    }
    
    
    public void crearRana(String nombre, int edad, String genero, ArrayList<Zona> zona) {
    	new Anfibio(nombre,edad,"selva",genero,zona, 
    			"rojo",true);
    	ranas++;
    	
    }
    
    public void crearSalamandra(String nombre, int edad, String genero, ArrayList<Zona> zona) {
    	new Anfibio(nombre,edad,"selva",genero,zona, 
    			"negro y amarillo",false);
    	salamandras++;
    	
    }
    
    
    
    
	
    
}
