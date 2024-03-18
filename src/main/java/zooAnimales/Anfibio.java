package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado= new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
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
    
    public static int cantidadAnfibios() {
    	return Anfibio.listado.size(); 
    }
    
    public String movimiento() {
    	return "saltar";
    }
    
    
    public static Anfibio crearRana(String nombre, int edad, String genero) {
    	Anfibio.ranas++;
    	return new Anfibio(nombre,edad,"selva",genero,
    			"rojo",true);
    	
    	
    }
    
    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
    	Anfibio.salamandras++;
    	return new Anfibio(nombre,edad,"selva",genero,
    			"negro y amarillo",false);
    	
    	
    }
    
    
    
    
	
    
}
