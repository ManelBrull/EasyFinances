package manire.janel.easyfinances.category;

import java.io.Serializable;

import manire.janel.easyfinances.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Category implements Serializable {
	
	private int id;
	private String nombre;
	private int img;
	
	public Category(int id, String nombre)
	{
		this.setId(id);
		this.setNombre(nombre);
	}
	
	public Category(int id, String nombre, int img)
	{
		this.setId(id);
		this.setNombre(nombre);
		this.setImg(img);
		
	}
	public View getSpinnerView(Activity activity) {
		LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View vi = inflater.inflate(R.layout.spinner_categories, null);
		//each camp 
		TextView catText = (TextView) vi.findViewById(R.id.catSpinnerText);
		catText.setText(this.toString());
		
		ImageView imgView = (ImageView) vi.findViewById(R.id.catSpinnerImg);
		imgView.setImageResource(this.img);
		
		return vi;
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

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}
		
	
}
