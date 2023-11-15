package controlador;

import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.PeticionesJSON;
import modelo.Pronostico;

public class Controlador implements ActionListener {

	private ImageIcon fondoEspania;
	private Map<String, String> ciudadesNombres;
	private DefaultComboBoxModel<String> ciudades;
	private DefaultComboBoxModel<String> dias;
	private Vista vista;
	private Pronostico pronostico;
	private PeticionesJSON respuesta;
	private LocalDate fechaActual;
	private String[] diasSemanaYNumero;

	public Controlador(Vista vista) {

		this.vista = vista;
		this.fondoEspania = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		this.pronostico = new Pronostico();
		this.respuesta = new PeticionesJSON();
		this.ciudadesNombres = new HashMap<>();
		this.ciudadesNombres = nombresCiudad();
		this.ciudades = new DefaultComboBoxModel<>(ciudadesNombres.keySet().toArray(new String[0]));
		diasSemanaYNumero = new String[5];
		this.fechaActual = LocalDate.now();
		obtenerDias();
		this.dias = new DefaultComboBoxModel<>(diasSemanaYNumero);
		// System.out.println(modelo.getElementAt(0));
		vista.getComboBoxCiudades().setModel(ciudades);
		vista.getComboBoxDia().setModel(dias);
		vista.getLblNewLabelFondoMapas().setIcon(fondoEspania);

		// cargarCiudadesMapaPrincipal();
		// vista.cargarLabelsCiudades();

		// vista.getLblNewLabelFondoMapas().setIcon(fondoEspania);
		vista.getComboBoxCiudades().addActionListener(this);
		vista.getComboBoxDia().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getComboBoxCiudades()) {

			String ciudad = (String) vista.getComboBoxCiudades().getSelectedItem();

			if (ciudad.equals("")) {

				//System.out.println("Entra");
				mapaEspania();
				/*
				 * try { pronostico =
				 * respuesta.procesarInformacionClimatologica(ciudadesNombres.get(ciudad)); }
				 * catch (Exception f) { f.printStackTrace(); }
				 */

			}
		}

	}

	// METODO PARA MOSTRA MAPA
	public void mapaEspania() {

		Map<String, String> nombreYClima = new HashMap<>();

		Pronostico p = null;
		for (Map.Entry<String, String> var : nombresCiudad().entrySet()) {

			
			try {
				if(!var.getValue().equals("")) {
					p = respuesta.procesarInformacionClimatologica(var.getValue());
					System.out.println(var.getValue());
					nombreYClima.put(var.getValue(),p.getDias().get(0).getEstadoClima());
				}
			} catch (Exception e) {
				System.err.println("Error al hacer peticion en el método mapaEspania");
				e.printStackTrace();
			}

		}
	}

	// METODO PARA MOSTRAR CIUDADES
	public void ciudades() {

	}

	// CUATRO DÍAS SIGUIENTES Y EL DE HOY
	public void obtenerDias() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE,dd/MM/yy");
		diasSemanaYNumero[0] = "Hoy";
		for (int i = 1; i < 5; i++) {
			LocalDate fechaSiguiente = fechaActual.plusDays(i);
			String diaSemanaYNumero = fechaSiguiente.format(formatter);
			diasSemanaYNumero[i] = diaSemanaYNumero;
		}
	}

	public Map<String, String> nombresCiudad() {

		Map<String, String> ciudadesNombre = new HashMap<>();

		
		
		ciudadesNombre.put("A Coruña", "A_Coruja");
		ciudadesNombre.put("Albacete", "Albacete");
		ciudadesNombre.put("Alicante Alacant", "Alicante_Alacant");
		ciudadesNombre.put("Almería", "Almeria");
		ciudadesNombre.put("Badajoz", "Badajoz");
		ciudadesNombre.put("Barcelona", "Barcelona");
		ciudadesNombre.put("Bilbao", "Bilbao");
		ciudadesNombre.put("Burgos", "Burgos");
		ciudadesNombre.put("Cáceres", "Caceres");
		ciudadesNombre.put("", "");
		ciudadesNombre.put("Cádiz", "Cadiz");
		ciudadesNombre.put("Ciudad Real", "Ciudad_Real");
		ciudadesNombre.put("Córdoba", "Cordoba");
		ciudadesNombre.put("Cuenca", "Cuenca");
		ciudadesNombre.put("Guadalajara", "Guadalajara");
		ciudadesNombre.put("Huelva", "Huelva");
		ciudadesNombre.put("Huesca", "Huesca");
		ciudadesNombre.put("Jaén", "Jaen");
		ciudadesNombre.put("Las Palmas de Gran Canaria", "Las_Palmas_de_Gran_Canaria");
		ciudadesNombre.put("León", "Leon");
		ciudadesNombre.put("Lleida", "Lleida");
		ciudadesNombre.put("Logroño", "Logrono");
		ciudadesNombre.put("Lugo", "Lugo");
		ciudadesNombre.put("Madrid", "Madrid");
		ciudadesNombre.put("Málaga", "Malaga");
		ciudadesNombre.put("Murcia", "Murcia");
		ciudadesNombre.put("Ourense", "Ourense");
		ciudadesNombre.put("Oviedo", "Oviedo");
		ciudadesNombre.put("Palencia", "Palencia");
		ciudadesNombre.put("Palma de Mallorca", "Palma_de_Mallorca");
		ciudadesNombre.put("Pamplona Iruña", "Pamplona_Iruna");
		ciudadesNombre.put("Salamanca", "Salamanca");
		ciudadesNombre.put("Santa Cruz de Tenerife", "Santa_Cruz_de_Tenerife");
		ciudadesNombre.put("Santander", "Santander");
		ciudadesNombre.put("Segovia", "Segovia");
		ciudadesNombre.put("Sevilla", "Sevilla");
		ciudadesNombre.put("Soria", "Soria");
		ciudadesNombre.put("Tarragona", "Tarragona");
		ciudadesNombre.put("Teruel", "Teruel");
		ciudadesNombre.put("Toledo", "Toledo");
		ciudadesNombre.put("Valencia", "Valencia");
		ciudadesNombre.put("Valladolid", "Valladolid");
		ciudadesNombre.put("Zamora", "Zamora");
		ciudadesNombre.put("Zaragoza", "Zaragoza");
		ciudadesNombre.put("Cádiz", "Cadiz");

		return ciudadesNombre;
	}

	/*
	 * public void cargarCiudadesMapaPrincipal() {
	 * 
	 * List<JLabel> labels = vista.getLabels();
	 * 
	 * String[] ciudades = { "Las Palmas", "Santa Cruz de Tenerife", "Cádiz",
	 * "Granada", "Almeria", "Jaen", "Cordoba", "Sevilla", "Huelva", "Albacete",
	 * "Guadalajara", "Madrid", "Cuenca", "Ciudad Real", "Badajoz", "Toledol",
	 * "Caceres", "Teruel", "Tarragona", "Lerida", "Barcelona", "Gerona",
	 * "Zaragoza", "Soria", "Segovia", "Avila", "Salamanca", "Burgos", "Valladolid",
	 * "Zamora", "Huesca", "Lugo", "León", "Coruña", "Baleares", "Orense",
	 * "Valencia", "Guipuzcua", "Vizcaya", "Murcia", "Navarra", "Palencia", "Alava",
	 * "Pontevedra", "Cantabria", "La Rioja", "Asturias", "Malaga" };
	 * 
	 * int[] coordenadasX = { 615, 494, 231, 318, 368, 333, 265, 231, 178, 386, 357,
	 * 302, 368, 302, 203, 280, 206, 417, 494, 494, 529, 559, 402, 347, 295, 263,
	 * 218, 317, 263, 218, 458, 160, 218, 105, 573, 160, 430, 373, 333, 401, 387,
	 * 265, 105, 573, 160, 430, 373, 401, 387, 265 };
	 * 
	 * int[] coordenadasY = { 460, 455, 427, 394, 394, 348, 348, 384, 373, 315, 207,
	 * 227, 257, 315, 315, 257, 267, 212, 192, 158, 169, 135, 169, 192, 217, 202,
	 * 128, 169, 169, 135, 90, 115, 80, 267, 135, 291, 85, 80, 361, 108, 126, 108,
	 * 135, 80, 23, 13, 13, 13, 13, 13 };
	 * 
	 * System.out.println(coordenadasX.length);
	 * System.out.println(coordenadasY.length); System.out.println(ciudades.length);
	 * 
	 * JLabel label; for (int i = 0; i < ciudades.length; i++) { label = new
	 * JLabel(ciudades[i]); label.setText(ciudades[i]);
	 * label.setBounds(coordenadasX[i], coordenadasY[i], 150, 20);
	 * labels.add(label);
	 * 
	 * } vista.setLabels(labels); }
	 */
}
