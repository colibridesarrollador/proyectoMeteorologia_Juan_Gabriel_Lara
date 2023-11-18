package vista;

import java.util.ArrayList;
import java.util.List;

public class ContenedorProvinciasJLabels {

	List <ProvinciaJLabels> contenedor;
	
	public ContenedorProvinciasJLabels() {
		contenedor = new ArrayList<ProvinciaJLabels>();
	}

	public List<ProvinciaJLabels> getContenedor() {
		return contenedor;
	}

	public void setContenedor(List<ProvinciaJLabels> contenedor) {
		this.contenedor = contenedor;
	}

	
	
}
