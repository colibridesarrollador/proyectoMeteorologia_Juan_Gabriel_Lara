package controlador;

import vista.Vista;

import java.awt.Component;
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
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.PeticionesJSON;
import modelo.Pronostico;

public class Controlador implements ActionListener {

	private static final String NUBE_SOL = "/imagenes/nube_sol.png";
	private static final String LUNA_NUBE = "/imagenes/luna_nube.png";
	private static final String NUBE_TORMENTA = "/imagenes/nube_tormenta.png";
	private static final String NUBE_NIEVE = "/imagenes/nube_nieve.png";
	private static final String NUBE_AGUA = "/imagenes/nube_agua.png";
	private static final String NUBE_AGUA_SOL = "/imagenes/nube_agua_sol.png";
	private static final String NIEBLA = "/imagenes/niebla.png";
	private static final String HUMO = "/imagenes/humo.png";
	private static final String NUBE = "/imagenes/nube.png";
	private static final String VIENTO = "/imagenes/viento.png";
	private static final String SOL = "/imagenes/sol.png";
	private static final String LUNA = "/imagenes/luna.png";
	private static final String FRIO = "/imagenes/frio.png";
	// private ImageIcon fondoEspania;
	private String penultimaComunidad;
	private List<String> textosJLabels;
	private List<String> ciudades;
	private DefaultComboBoxModel<String> comunidades;
	private DefaultComboBoxModel<String> dias;
	private Vista vista;
	private Pronostico pronostico;
	private PeticionesJSON respuesta;
	private LocalDate fechaActual;
	private String[] diasSemanaYNumero;
	private int diaSeleccionado;
	private List<String> ciudadesPeticiones;
	private List<String> comunidadesLista;
	private String comunidad;

	public Controlador(Vista vista) {

		this.vista = vista;
		textosJLabels = new ArrayList<String>();
		pronostico = new Pronostico();
		respuesta = new PeticionesJSON();
		ciudades = new ArrayList<String>();
		ciudades = cargarCiudades();
		ciudadesPeticiones = new ArrayList<>();
		comunidadesLista = comunidades();
		comunidades = new DefaultComboBoxModel<>(comunidadesLista.toArray(new String[0]));
		diasSemanaYNumero = new String[5];
		fechaActual = LocalDate.now();

		obtenerDias();
		this.dias = new DefaultComboBoxModel<>(diasSemanaYNumero);

		cargarJCombobox();
		cargarActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getIrAlMapa()) {

			mostrarMapaEspaniaPrimeraVez();

		} else if (e.getSource() == vista.getComboBoxDia()) {

			if (vista.getPanelEspania().isVisible()) {
				peticionDatosEspania(vista.getComboBoxDia().getSelectedIndex());
				refrescarPanel(vista.getPanelEspania());
			} else {
				comunidad = (String) vista.getComboBoxComunidades().getSelectedItem();
				recuperarTexoJLabes(comunidad);
				diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();
				cargarDatosEnJLabel(diaSeleccionado, comunidad);
			}

		} else if (e.getSource() == vista.getComboBoxComunidades()) {

			
			

			comunidad = (String) vista.getComboBoxComunidades().getSelectedItem();

			// diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();

			if (comunidad.equals("PAIS: España")) {

				mostrarPanelEspania();
				mostrarDatosEspania();

			} else {	
				prepararMapa(comunidad);
			}
		}
	}

	private void prepararMapa(String comunidad) {

		if (comunidad != null)
			penultimaComunidad = comunidad;
		if (penultimaComunidad != null)
			recuperarTexoJLabes(penultimaComunidad);	
		
		if (vista.getPanelEspania().isVisible())
			vista.getPanelEspania().setVisible(false);

		cargarDatosEnJLabel(diaSeleccionado, comunidad);
	}
	
	public void refrescarPanel(JPanel panel) {
		panel.validate();
		panel.repaint();
	}

	private void mostrarPanelEspania() {
		vista.mostrarPanel(vista.getContentPane(), vista.getPanelEspania());
	}

	private void mostrarDatosEspania() {
		peticionDatosEspania(diaSeleccionado);
	}

	private void mostrarMapaEspaniaPrimeraVez() {
		vista.mostrarPanel(vista.getContentPane(), vista.getPanelEspania());
		vista.getPanelControles().setVisible(true);
		diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();
		peticionDatosEspania(diaSeleccionado);
	}

	/*
	 * private void introducirTemperaturas() {
	 * 
	 * }
	 */

	// MOSTRAR PANELES
	public void cargarDatosEnJLabel(int dia, String llamada) {
		if (comunidad.equals("Galicia")) {

			if (!vista.getPanelGalicia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelGalicia());
			cargarDatosPorProvincia(dia, vista.getGalicia());

		} else if (comunidad.equals("País Vasco")) {

			if (!vista.getPanelPaisVasco().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelPaisVasco());
			cargarDatosPorProvincia(dia, vista.getPaisVasco());

		} else if (comunidad.equals("Castilla La Mancha")) {

			if (!vista.getPanelCLM().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCLM());
			cargarDatosPorProvincia(dia, vista.getCastilla_LM());

		} else if (comunidad.equals("Castlla y León")) {

			if (!vista.getPanelCastillaLeon().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCastillaLeon());
			cargarDatosPorProvincia(dia, vista.getCastillaLeon());

		} else if (comunidad.equals("Andalucía")) {

			if (!vista.getPanelAndalucia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelAndalucia());
			cargarDatosPorProvincia(dia, vista.getAndaluci());

		}

	}

	public void recuperarTexoJLabes(String anteriorComunidad) {

		if (textosJLabels != null || !textosJLabels.isEmpty()) {
			if (anteriorComunidad.equals("País Vasco") && !vista.getPaisVasco().get(0).getText().equals("Vitoria-Gasteiz"))
				restaurarTextos(vista.getPaisVasco());
			else if (anteriorComunidad.equals("Galicia") && !vista.getGalicia().get(0).getText().equals("Ourense"))
				restaurarTextos(vista.getGalicia());
			else if (anteriorComunidad.equals("Castilla La Mancha") && !vista.getCastilla_LM().get(0).getText().equals("Guadalajara"))
				restaurarTextos(vista.getCastilla_LM());
			else if (anteriorComunidad.equals("Andalucía") && !vista.getAndaluci().get(0).getText().equals("Huelva"))
				restaurarTextos(vista.getAndaluci());

		}
	}

	// METODO PARA MOSTRA MAPA
	public void peticionDatosEspania(int dia) {
		String nombreEtiqueta = null;

		try {
			for (String ciudad : ciudades) {
				pronostico = respuesta.hacerPeticion(ciudad);

				for (JLabel label : vista.getLabels()) {
					nombreEtiqueta = label.getText();

					if (ciudad.equalsIgnoreCase(nombreEtiqueta)) {
						String clima = pronostico.getDias().get(dia).getEstadoClima();
						ponerImagenClima(label, clima);
					}
				}
			}
		} catch (Exception e) {
			// Manejar la excepción de manera adecuada según tus requisitos
			System.err.println("Error al hacer la petición en el método peticionDatosEspania");
			e.printStackTrace();
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

	private void restaurarTextos(List<JLabel> lista) {

		if (!textosJLabels.isEmpty()) {
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(0).getText().equals(textosJLabels.get(0))) {
				lista.get(i).setText(textosJLabels.get(i));
				}
			}
			textosJLabels.clear();
		}
	}

	public List<String> comunidades() {

		List<String> comunidades = new ArrayList<String>();
		comunidades.add("PAIS: España");
		comunidades.add("Asturias");
		comunidades.add("Cantabria");
		comunidades.add("Castlla y León");
		comunidades.add("País Vasco");
		comunidades.add("Navarra");
		comunidades.add("La Rioja");
		comunidades.add("Aragón");
		comunidades.add("Cataluña");
		comunidades.add("Comunidad Valenciana");
		comunidades.add("Castilla La Mancha");
		comunidades.add("Región de Murcia");
		comunidades.add("Andalucía");
		comunidades.add("Extremadura");
		comunidades.add("Madrid");
		comunidades.add("Islas Baleares");
		comunidades.add("Islas Canarias");
		comunidades.add("Ceuta");
		comunidades.add("Melilla");
		comunidades.add("Galicia");
		return comunidades;
	}

	private void ponerImagenClima(JLabel label, String clima) {

		ImageIcon icono = null;

		LocalTime horaActual = LocalTime.now();

		// Define las horas de inicio y fin (8 AM y 8 PM)
		LocalTime salidaSol = LocalTime.of(8, 0);
		LocalTime puestaSol = LocalTime.of(20, 0);

		// SOLES CON NUVES
		
		// System.out.println("ENTRA");
		if (clima.equalsIgnoreCase("intervalos de sol") || clima.equalsIgnoreCase("sin lluvia")
				|| clima.equalsIgnoreCase("despejado") || clima.equalsIgnoreCase("periodos de sol")
				|| clima.equalsIgnoreCase("parcialmente nuboso") || clima.equalsIgnoreCase("parcialmente despejado,")
				|| clima.equalsIgnoreCase("templado")) {

			if (horaActual.isAfter(salidaSol) && horaActual.isBefore(puestaSol)) {

				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource(NUBE_SOL).getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);
				// NOCTURNO
			} else {

				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource(LUNA_NUBE).getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);

			}
			// TORMENTAS (NUBE RAYOS)
		} else if (clima.equalsIgnoreCase("tormentas") || clima.equalsIgnoreCase("chubascos tormentosos")
				|| clima.equalsIgnoreCase("tormenta") || clima.equalsIgnoreCase("relámpagos")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(NUBE_TORMENTA).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// NIEVE (NUBES NIEVE)
		} else if (clima.equalsIgnoreCase("chubascos de nieve") || clima.equalsIgnoreCase("ráfagas de nieve")
				|| clima.equalsIgnoreCase("nieve") || clima.equalsIgnoreCase("nevada fuerte")
				|| clima.equalsIgnoreCase("nevada") || clima.equalsIgnoreCase("nevada débil")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(NUBE_NIEVE).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// LLUVIA (NUBE AGUA)
		} else if (clima.equalsIgnoreCase("chubascos") || clima.equalsIgnoreCase("aguanieve")
				|| clima.equalsIgnoreCase("chubascos fuertes") || clima.equalsIgnoreCase("chubascos de lluvia")
				|| clima.equalsIgnoreCase("chubascos débiles") || clima.equalsIgnoreCase("lluvia engelante")
				|| clima.equalsIgnoreCase("lluvia") || clima.equalsIgnoreCase("llovizna")
				|| clima.equalsIgnoreCase("lluvia débil") || clima.equalsIgnoreCase("húmedo")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(NUBE_AGUA).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// LLUVIA NUBE SOL
		} else if (clima.equalsIgnoreCase("chubascos ocasionales") || clima.equalsIgnoreCase("chubascos dispersos")
				|| clima.equalsIgnoreCase("chubascos aislados")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(NUBE_AGUA_SOL).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// NIEBLA
		} else if (clima.equalsIgnoreCase("niebla") || clima.equalsIgnoreCase("bruma")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(NIEBLA).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// HUMO
		} else if (clima.equalsIgnoreCase("humo")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(HUMO).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// NUBE
		} else if (clima.equalsIgnoreCase("cubierto") || clima.equalsIgnoreCase("nuboso")
				|| clima.equalsIgnoreCase("muy nuboso")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(NUBE).getPath());
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
			icono = new ImageIcon(getClass().getResource(VIENTO).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
			// SOL
		} else if (clima.equalsIgnoreCase("seco") || clima.equalsIgnoreCase("caluroso")
				|| clima.equalsIgnoreCase("cálido") || clima.equalsIgnoreCase("despejado")
				|| clima.equalsIgnoreCase("soleado") || clima.equalsIgnoreCase("buen tiempo")
				|| clima.equalsIgnoreCase("claro")) {

			if (horaActual.isAfter(salidaSol) && horaActual.isBefore(puestaSol)) {

				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource(SOL).getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);
			} else {
				;
				label.setOpaque(false);
				icono = new ImageIcon(getClass().getResource(LUNA).getPath());
				icono.setImage(
						icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
				label.setIcon(icono);
			}
			// HELADAS
		} else if (clima.equalsIgnoreCase("helada") || clima.equalsIgnoreCase("escarcha")
				|| clima.equalsIgnoreCase("frío") || clima.equalsIgnoreCase("fresco")) {

			label.setOpaque(false);
			icono = new ImageIcon(getClass().getResource(FRIO).getPath());
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setIcon(icono);
		}
	}

	private void cargarDatosPorProvincia(int dia, List<JLabel> lista) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) != null) {
				if (lista.get(i).getText().equals("min")) {
					textosJLabels.add(lista.get(i).getText());
					lista.get(i).setText("MIN: " + pronostico.getDias().get(dia).getTempMinima() + "º");
				} else if (lista.get(i).getText().equals("max")) {
					textosJLabels.add(lista.get(i).getText());
					lista.get(i).setText("MAX: " + pronostico.getDias().get(dia).getTempMaxima() + "º");
				} else {
					pronostico = respuesta.hacerPeticion(lista.get(i).getText());
					if (pronostico != null) {
						ponerImagenClima(lista.get(i), pronostico.getDias().get(dia).getEstadoClima());
						textosJLabels.add(lista.get(i).getText());
					}
				}
			}
		}
	}

	public List<String> cargarCiudades() {

		List<String> ciudadesNombre = new ArrayList<String>();

		ciudadesNombre.add("A_Coruja");
		ciudadesNombre.add("Albacete");
		ciudadesNombre.add("Alicante_Alacant");
		ciudadesNombre.add("Vitoria-Gasteiz");
		ciudadesNombre.add("Almeria");
		ciudadesNombre.add("Badajoz");
		ciudadesNombre.add("Barcelona");
		ciudadesNombre.add("Bilbao");
		ciudadesNombre.add("Burgos");
		ciudadesNombre.add("Caceres");
		ciudadesNombre.add("Cadiz");
		ciudadesNombre.add("Ciudad_Real");
		ciudadesNombre.add("Cordoba");
		ciudadesNombre.add("Cuenca");
		ciudadesNombre.add("Guadalajara");
		ciudadesNombre.add("Huelva");
		ciudadesNombre.add("Huesca");
		ciudadesNombre.add("Jaen");
		ciudadesNombre.add("Las_Palmas_de_Gran_Canaria");
		ciudadesNombre.add("Leon");
		ciudadesNombre.add("Lleida");
		ciudadesNombre.add("Logrono");
		ciudadesNombre.add("Lugo");
		ciudadesNombre.add("Madrid");
		ciudadesNombre.add("Malaga");
		ciudadesNombre.add("Murcia");
		ciudadesNombre.add("Ourense");
		ciudadesNombre.add("Oviedo");
		ciudadesNombre.add("Palencia");
		ciudadesNombre.add("Palma_de_Mallorca");
		ciudadesNombre.add("Pamplona_Iruna");
		ciudadesNombre.add("Salamanca");
		ciudadesNombre.add("Santa_Cruz_de_Tenerife");
		ciudadesNombre.add("Santander");
		ciudadesNombre.add("Segovia");
		ciudadesNombre.add("Sevilla");
		ciudadesNombre.add("Soria");
		ciudadesNombre.add("Tarragona");
		ciudadesNombre.add("Teruel");
		ciudadesNombre.add("Toledo");
		ciudadesNombre.add("Valencia");
		ciudadesNombre.add("Valladolid");
		ciudadesNombre.add("Zamora");
		ciudadesNombre.add("Zaragoza");
		ciudadesNombre.add("Cadiz");
		ciudadesNombre.add("Pontevedra");
		ciudadesNombre.add("Vitoria-Gasteiz");
		ciudadesNombre.add("Avila");
		ciudadesNombre.add("Girona");
		ciudadesNombre.add("Castellon_de_la_Plana_Castello_de_la_Plana");
		ciudadesNombre.add("Granada");

		return ciudadesNombre;
	}

	private void cargarJCombobox() {
		vista.getComboBoxComunidades().setModel(comunidades);
		vista.getComboBoxDia().setModel(dias);

	}

	private void cargarActionListener() {
		vista.getIrAlMapa().addActionListener(this);
		vista.getComboBoxComunidades().addActionListener(this);
		vista.getComboBoxDia().addActionListener(this);

	}
}
