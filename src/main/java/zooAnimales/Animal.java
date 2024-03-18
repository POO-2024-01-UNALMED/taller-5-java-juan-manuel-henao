package zooAnimales;
import java.util.ArrayList;
import gestion.*;
 public class Animal {
	private static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;

	public Animal(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona=zona;
        totalAnimales++;
    }
	public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.habitat = "";
        this.genero = "";
        this.zona=new ArrayList<Zona>();
        totalAnimales++;
    }

	public static int getTotalAnimales() {
        return totalAnimales;
    }
	public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
    }
    
    public String movimiento() {
    	return "desplazarse";
    }
    
    public void totalPorTipo(Mamifero mamifero, Ave ave, Reptil reptil, Pez pez, Anfibio anfibio) {
    	return String.format("Mamíferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d", mamifero.cantidadMamiferos(), ave.cantidadAves(), reptil.cantidadReptiles(), pez.cantidadPeces(), anfibio.cantidadAnfibios());
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mi nombre es ").append(nombre)
               .append(", tengo una edad de ").append(edad)
               .append(", habito en ").append(habitat)
               .append(" y mi genero es ").append(genero);

        if (!zona.isEmpty()) {
            builder.append(", la zona en la que me ubico es ")
                   .append(zona.get(0).getNombre())
                   .append(", en el ")
                   .append(zona.get(0).getZoo().getNombre());
        }

        return builder.toString();
    }
}
	

 
