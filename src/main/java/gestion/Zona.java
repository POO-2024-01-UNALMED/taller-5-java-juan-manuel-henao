package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	
public Zona(String nombre, Zoologico zoo) {
	        this.nombre = nombre;
	        this.zoo = zoo;
	       
	    }
	    
	    
public Zona() {
	        this.nombre = "";
	        this.zoo = null;
	        
	    }



	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}

	public void setAnimales(ArrayList<Animal> animales) {
	    this.animales = animales;
	}

	public ArrayList<Animal> getAnimales() {
	    return animales;
	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
