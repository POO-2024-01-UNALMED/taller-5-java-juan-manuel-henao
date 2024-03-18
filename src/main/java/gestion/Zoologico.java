package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;

public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    
public Zoologico() {
        this.nombre = "";
        this.ubicacion = "";
    }



public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getNombre() {
	return this.nombre;
}

public void setUbicacion(String ubicacion) {
	this.ubicacion=ubicacion;
}
public String getUbicacion() {
	return this.ubicacion;
}

public void setZonas(ArrayList<Zona> zonas) {
    this.zonas = zonas;
}

public ArrayList<Zona> getZonas() {
    return zonas;
}

public void agregarZonas(Zona zona) {
	zonas.add(zona);
	
	}
public int cantidadTotalAnimales() {
	int cantidad=0;
	for (Zona zona:this.zonas) {
		cantidad=cantidad+zona.cantidadAnimales();
	}
	return cantidad;
}

}
