package manire.janel.easyfinances.expensescategory;

import java.io.Serializable;

public class Categories implements Serializable {
	private int id;
	private String nombre;
	
	public Categories(int id, String nombre)
	{
		this.setId(id);
		this.setNombre(nombre);
	}
	
	@Override
	public String toString()
	{
		return getNombre();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	
}
