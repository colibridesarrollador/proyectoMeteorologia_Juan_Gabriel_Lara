package controlador;

import vista.Vista;

import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
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

	// private ImageIcon fondoEspania;
	private Map<String, String> ciudadesNombres;
	private DefaultComboBoxModel<String> ciudades;
	private DefaultComboBoxModel<String> dias;
	private Vista vista;
	private Pronostico pronostico;
	private PeticionesJSON respuesta;
	private LocalDate fechaActual;
	private String[] diasSemanaYNumero;
	private int diaSeleccionado;
	private List<String> ciudadesPeticiones;
	private List<String> provincias;

	public Controlador(Vista vista) {

		this.vista = vista;

		this.pronostico = new Pronostico();
		this.respuesta = new PeticionesJSON();
		this.ciudadesNombres = new HashMap<>();
		this.ciudadesNombres = nombresCiudad();
		this.ciudadesPeticiones = new ArrayList<>();
		this.provincias = new ArrayList<String>();
		this.ciudades = new DefaultComboBoxModel<>(ciudadesNombres.keySet().toArray(new String[0]));
		diasSemanaYNumero = new String[5];
		this.fechaActual = LocalDate.now();

		obtenerDias();
		cargarCiudades();
		
		//cargarProvincias();

		this.dias = new DefaultComboBoxModel<>(diasSemanaYNumero);
		vista.getComboBoxCiudades().setModel(ciudades);
		vista.getComboBoxDia().setModel(dias);
		vista.getIrAlMapa().addActionListener(this);
		vista.getComboBoxCiudades().addActionListener(this);
		vista.getComboBoxDia().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getIrAlMapa()) {
			vista.getPanelInicio().setVisible(false);
			vista.getPanelEspania().setVisible(true);

			diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();

			mapaEspania(0);
			
			mapaEspania(diaSeleccionado);

		} else if (e.getSource() == vista.getComboBoxDia()) {

			diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();

			System.out.println(diaSeleccionado);

			mapaEspania(diaSeleccionado);

			// vista.mostrarMapaEspania();

			vista.refrescarEpania();

		}/* else if (e.getSource() == vista.getComboBoxCiudades()) {

			vista.getPanelEspania().setVisible(false);
			vista.getPanelProvincias().setVisible(true);

			diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();

			String provincia = (String) vista.getComboBoxCiudades().getSelectedItem();

			String valor = devolverValor(provincia);
			
			pintarIconos(diaSeleccionado, valor);

			vista.getLblNewLabelProvinciaSeleccionada().setText(pronostico.getNombreCiudad());

			

		}*/

		/*
		 * try { pronostico =
		 * respuesta.procesarInformacionClimatologica(ciudadesNombres.get(ciudad)); }
		 * catch (Exception f) { f.printStackTrace(); }
		 */

	}

	private void introducirTemperaturas() {

		
		
	}
/*
	public void pintarIconos(int dia, String llamada) {

		try {
			pronostico = respuesta.procesarInformacionClimatologica(ciudadesNombres.get(llamada));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		String minimas = pronostico.getDias().get(dia).getTempMinima();
		String maximas = pronostico.getDias().get(dia).getTempMaxima();
		String clima = pronostico.getDias().get(dia).getEstadoClima();
		
		
		int posicion  = vista.getContenedor().getListas().indexOf(llamada);
		int longitud = vista.getContenedor().getListas().get(posicion).getEetiquetas().size();
		
		for (int i = 0; i < diasSemanaYNumero.length; i++) {
			if(vista.getContenedor().getListas().get(posicion).getEetiquetas().get(i).getText().equalsIgnoreCase(llamada)) {
				comprobarClima(vista.getContenedor().getListas().get(posicion).getEetiquetas().get(i),clima);
			}else if(vista.getContenedor().getListas().get(posicion).getEetiquetas().get(i).getText().equalsIgnoreCase("min")) {
				vista.getContenedor().getListas().get(posicion).getEetiquetas().get(i).setText(minimas);
			}else if(vista.getContenedor().getListas().get(posicion).getEetiquetas().get(i).getText().equalsIgnoreCase("max")) {
					vista.getContenedor().getListas().get(posicion).getEetiquetas().get(i).setText(minimas);
			}
		}
		vista.mostrarProvincia(vista.getContenedor().getListas().get(posicion).getEetiquetas());
	}
*/
	// METODO PARA MOSTRA MAPA
	public void mapaEspania(int dia) {

		String nombreCiudad = null;
		for (Map.Entry<String, String> var : nombresCiudad().entrySet()) {

			try {
				if (!var.getValue().equals("")) {
					pronostico = respuesta.procesarInformacionClimatologica(var.getValue());

					for (int i = 0; i < vista.getLabels().size(); i++) {
						nombreCiudad = vista.getLabels().get(i).getText();
						if (var.getValue().equalsIgnoreCase(nombreCiudad)) {
							String clima = pronostico.getDias().get(dia).getEstadoClima();

							comprobarClima(vista.getLabels().get(i), clima);
						}
					}

				}
			} catch (Exception e) {
				System.err.println("Error al hacer peticion en el método mapaEspania");
				e.printStackTrace();
			}

		}

	}

	// CUATRO DÍAS SIGUIENTES Y EL DE HOY para
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
		ciudadesNombre.put("España", "");
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
		ciudadesNombre.put("Pontevedra", "Pontevedra");
		ciudadesNombre.put("Vitoria Gasteiz", "Vitoria-Gasteiz");
		ciudadesNombre.put("Avila", "Avila");
		ciudadesNombre.put("Girona", "Girona");
		ciudadesNombre.put("Castellón de la Plana", "Castellon_de_la_Plana_Castello_de_la_Plana");
		ciudadesNombre.put("Granada", "Granada");
		ciudadesNombre.put("Alava", "Vitoria-Gasteiz");

		return ciudadesNombre;
	}

	private void comprobarClima(JLabel label, String clima) {

		ImageIcon icono = null;

		// Obtén la hora actual del sistema
		LocalTime horaActual = LocalTime.now();

		// Define las horas de inicio y fin (8 AM y 8 PM)
		LocalTime salidaSol = LocalTime.of(8, 0);
		LocalTime puestaSol = LocalTime.of(20, 0);
		// SOLES CON NUVES
		// SOLES CON NUVES
		if (clima.equalsIgnoreCase("intervalos de sol") || clima.equalsIgnoreCase("sin lluvia")
				|| clima.equalsIgnoreCase("despejado") || clima.equalsIgnoreCase("periodos de sol")
				|| clima.equalsIgnoreCase("parcialmente nuboso") || clima.equalsIgnoreCase("parcialmente despejado,")
				|| clima.equalsIgnoreCase("templado")) {

			if (horaActual.isAfter(salidaSol) && horaActual.isBefore(puestaSol)) {

				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource("/imagenes/nube_sol.png").getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);
				// NOCTURNO
			} else {

				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource("/imagenes/luna_nube.png").getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);

			}
			// TORMENTAS (NUBE RAYOS)
		} else if (clima.equalsIgnoreCase("tormentas") || clima.equalsIgnoreCase("chubascos tormentosos")
				|| clima.equalsIgnoreCase("tormenta") || clima.equalsIgnoreCase("relámpagos")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/nube_tormenta.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// NIEVE (NUBES NIEVE)
		} else if (clima.equalsIgnoreCase("chubascos de nieve") || clima.equalsIgnoreCase("ráfagas de nieve")
				|| clima.equalsIgnoreCase("nieve") || clima.equalsIgnoreCase("nevada fuerte")
				|| clima.equalsIgnoreCase("nevada") || clima.equalsIgnoreCase("nevada débil")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/nube_nieve.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// LLUVIA (NUBE AGUA)
		} else if (clima.equalsIgnoreCase("chubascos") || clima.equalsIgnoreCase("aguanieve")
				|| clima.equalsIgnoreCase("chubascos fuertes") || clima.equalsIgnoreCase("chubascos de lluvia")
				|| clima.equalsIgnoreCase("chubascos débiles") || clima.equalsIgnoreCase("lluvia engelante")
				|| clima.equalsIgnoreCase("lluvia") || clima.equalsIgnoreCase("llovizna")
				|| clima.equalsIgnoreCase("lluvia débil") || clima.equalsIgnoreCase("húmedo")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/nube_agua.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// LLUVIA NUBE SOL
		} else if (clima.equalsIgnoreCase("chubascos ocasionales") || clima.equalsIgnoreCase("chubascos dispersos")
				|| clima.equalsIgnoreCase("chubascos aislados")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/nube_agua_sol.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// NIEBLA
		} else if (clima.equalsIgnoreCase("niebla") || clima.equalsIgnoreCase("bruma")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/niebla.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// HUMO
		} else if (clima.equalsIgnoreCase("humo")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/humo.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// NUBE
		} else if (clima.equalsIgnoreCase("cubierto") || clima.equalsIgnoreCase("nuboso")
				|| clima.equalsIgnoreCase("muy nuboso")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/nube.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// VIENTO
		} else if (clima.equalsIgnoreCase("tempestad de arena") || clima.equalsIgnoreCase("tempestad de polvo")
				|| clima.equalsIgnoreCase("arena,Polvo") || clima.equals("ventisca alta")
				|| clima.equalsIgnoreCase("ventisca") || clima.contentEquals("ventisca baja")
				|| clima.equalsIgnoreCase("tormenta de nieve") || clima.equalsIgnoreCase("ventoso")
				|| clima.equalsIgnoreCase("turbonada") || clima.equalsIgnoreCase("tormentoso")
				|| clima.equals("Vendaval")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/viento.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// SOL
		} else if (clima.equalsIgnoreCase("seco") || clima.equalsIgnoreCase("caluroso")
				|| clima.equalsIgnoreCase("cálido") || clima.equalsIgnoreCase("despejado")
				|| clima.equalsIgnoreCase("soleado") || clima.equalsIgnoreCase("buen tiempo")
				|| clima.equalsIgnoreCase("claro")) {

			if (horaActual.isAfter(salidaSol) && horaActual.isBefore(puestaSol)) {

				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource("/imagenes/sol.png").getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);
			} else {
				;
				System.out.println("Procesando...");
				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource("/imagenes/luna.png").getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);
			}
			// HELADAS
		} else if (clima.equalsIgnoreCase("helada") || clima.equalsIgnoreCase("escarcha")
				|| clima.equalsIgnoreCase("frío") || clima.equalsIgnoreCase("fresco")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource("/imagenes/frio.png").getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
		}
	}

	public void cargarCiudades() {

		ciudadesPeticiones.add("Donostia_San_Sebastian");
		ciudadesPeticiones.add("Pamplona_Iruna");
		ciudadesPeticiones.add("Vitoria-Gasteiz");
		ciudadesPeticiones.add("Bilbao");

	}

	private void cargarProvincias() {
		provincias.add("avila");

	}
	public String devolverValor(String clave) {
		return ciudadesNombres.get(clave);
	}
}
