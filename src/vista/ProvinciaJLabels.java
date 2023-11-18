package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class ProvinciaJLabels {

	String nombre;
	String provincia;
	List <JLabel> etiquetas;
	
	public ProvinciaJLabels(String nombre,String provincia) {
		this.etiquetas = new ArrayList<JLabel>();
		this.nombre = nombre;
		this.provincia = provincia;
	}
	

	
	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public String getNombre() {
		return nombre;
	}
	public List<JLabel> getEetiquetas() {
		return etiquetas;
	}
	public List<JLabel> getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(List<JLabel> etiquetas) {
		this.etiquetas = etiquetas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEetiquetas(List<JLabel> eetiquetas) {
		this.etiquetas = eetiquetas;
	}
	
}
