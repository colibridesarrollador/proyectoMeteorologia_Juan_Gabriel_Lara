package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class EtiquetasProvincias {

	String nombre;
	List <JLabel> etiquetas;
	
	public EtiquetasProvincias(String nombre) {
		this.etiquetas = new ArrayList<JLabel>();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public List<JLabel> getEetiquetas() {
		return etiquetas;
	}
	public void setEetiquetas(List<JLabel> eetiquetas) {
		this.etiquetas = eetiquetas;
	}
	
}
