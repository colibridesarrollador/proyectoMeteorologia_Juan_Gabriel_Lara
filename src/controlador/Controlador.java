package controlador;

import vista.Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.DiaPronostico;
import modelo.PeticionesJSON;

public class Controlador implements ActionListener {

	private final String NUBE_SOL = "/imagenes/nube_sol.png";
	private final String NUBE_TORMENTA = "/imagenes/nube_tormenta.png";
	private final String NUBE_NIEVE = "/imagenes/nube_nieve.png";
	private final String NUBE_AGUA = "/imagenes/nube_agua.png";
	private final String NUBE_AGUA_SOL = "/imagenes/nube_agua_sol.png";
	private final String NIEBLA = "/imagenes/niebla.png";
	private final String HUMO = "/imagenes/humo.png";
	private final String NUBE = "/imagenes/nube.png";
	private final String VIENTO = "/imagenes/viento.png";
	private final String SOL = "/imagenes/sol.png";
	private final String FRIO = "/imagenes/frio.png";
	private Map<String, String> CLIMA_IMAGENES;
	private String penultimaComunidad;
	private List<String> ciudades;
	private DefaultComboBoxModel<String> comunidades;
	private DefaultComboBoxModel<String> dias;
	private Vista vista;
	private PeticionesJSON respuesta;
	private LocalDate fechaActual;
	private String[] diasSemanaYNumero;
	private int diaSeleccionado;
	private List<String> comunidadesLista;
	private String comunidadActual;

	public Controlador(Vista vista) {

		this.vista = vista;
		CLIMA_IMAGENES = new HashMap<>();
		respuesta = new PeticionesJSON();
		ciudades = new ArrayList<String>();
		ciudades = cargarCiudades();
		comunidadesLista = comunidades();
		comunidades = new DefaultComboBoxModel<>(comunidadesLista.toArray(new String[0]));
		diasSemanaYNumero = new String[5];
		fechaActual = LocalDate.now();

		obtenerDias();
		this.dias = new DefaultComboBoxModel<>(diasSemanaYNumero);
		cargarHashMapImagene();
		cargarJCombobox();
		cargarActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getIrAlMapa()) {

			mostrarMapaEspaniaPrimeraVez();

		} else if (e.getSource() == vista.getComboBoxDia()) {

			if (vista.getPanelEspania().isVisible()) {
				refrescarPanel(vista.getPanelEspania());
				mostrarMapaEspaniaPrimeraVez();
				diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();
			} else {
				comunidadActual = (String) vista.getComboBoxComunidades().getSelectedItem();

				if (penultimaComunidad != null)
					refrescarTextosOriginalesJLabels(penultimaComunidad);

				diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();
				prepararMapa(comunidadActual);
			}

		} else if (e.getSource() == vista.getComboBoxComunidades()) {

			if (penultimaComunidad != null)
				refrescarTextosOriginalesJLabels(penultimaComunidad);

			comunidadActual = (String) vista.getComboBoxComunidades().getSelectedItem();
			if (comunidadActual.equals("A: España")) {

				mostrarPanelEspania();
				mostrarDatosEspania();

			} else {

				prepararMapa(comunidadActual);
			}
		}
	}

	private void prepararMapa(String comunidad) {

		if (comunidad != null) {
			penultimaComunidad = comunidadActual;

		}

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

	// MOSTRAR PANELES
	public void cargarDatosEnJLabel(int dia, String llamada) {

		switch (comunidadActual) {
		case "Galicia":
			if (!vista.getPanelGalicia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelGalicia());

			Vista.guardarTextosOriginales(vista.getGalicia());
			cargarDatosPorProvincia(dia, vista.getGalicia());
			break;

		case "País Vasco":
			if (!vista.getPanelPaisVasco().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelPaisVasco());
			Vista.guardarTextosOriginales(vista.getPaisVasco());
			cargarDatosPorProvincia(dia, vista.getPaisVasco());
			break;

		case "Castilla La Mancha":
			if (!vista.getPanelCLM().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCLM());
			Vista.guardarTextosOriginales(vista.getCastilla_LM());
			cargarDatosPorProvincia(dia, vista.getCastilla_LM());
			break;

		case "Castlla y León":
			if (!vista.getPanelCastillaLeon().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCastillaLeon());
			Vista.guardarTextosOriginales(vista.getCastillaLeon());
			cargarDatosPorProvincia(dia, vista.getCastillaLeon());
			break;

		case "Andalucía":
			if (!vista.getPanelAndalucia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelAndalucia());
			Vista.guardarTextosOriginales(vista.getAndaluci());
			cargarDatosPorProvincia(dia, vista.getAndaluci());
			break;

		case "Extremadura":
			if (!vista.getPanelExtremadura().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelExtremadura());
			Vista.guardarTextosOriginales(vista.getExtremadura());
			cargarDatosPorProvincia(dia, vista.getExtremadura());
			break;

		case "Aragón":
			if (!vista.getPanelAragon().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelAragon());
			Vista.guardarTextosOriginales(vista.getAragon());
			cargarDatosPorProvincia(dia, vista.getAragon());
			break;

		case "Asturias":
			if (!vista.getPanelAsturias().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelAsturias());
			Vista.guardarTextosOriginales(vista.getAsturias());
			cargarDatosPorProvincia(dia, vista.getAsturias());
			break;

		case "Cataluña":
			if (!vista.getPanelCatalunia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCatalunia());
			Vista.guardarTextosOriginales(vista.getCatalunia());
			cargarDatosPorProvincia(dia, vista.getCatalunia());
			break;
		case "Comunidad Valenciana":
			if (!vista.getPanelValencia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelValencia());
			Vista.guardarTextosOriginales(vista.getValencia());
			cargarDatosPorProvincia(dia, vista.getValencia());
			break;

		case "Islas Baleares":
			if (!vista.getPanelValencia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelIslasBaleares());
			Vista.guardarTextosOriginales(vista.getBaleares());
			cargarDatosPorProvincia(dia, vista.getBaleares());
			break;
		case "Islas Canarias":
			if (!vista.getPanelCanarias().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCanarias());
			Vista.guardarTextosOriginales(vista.getCanarias());
			cargarDatosPorProvincia(dia, vista.getCanarias());
			break;

		case "Región de Murcia":
			if (!vista.getPanelMurcia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelMurcia());
			Vista.guardarTextosOriginales(vista.getMurciaList());
			cargarDatosPorProvincia(dia, vista.getMurciaList());
			break;
		case "Navarra":
			if (!vista.getPanelMurcia().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelNavarra());
			Vista.guardarTextosOriginales(vista.getNavarra());
			cargarDatosPorProvincia(dia, vista.getNavarra());
			break;
		case "Madrid":
			if (!vista.getPanelMadrid().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelMadrid());
			Vista.guardarTextosOriginales(vista.getMadridList());
			cargarDatosPorProvincia(dia, vista.getMadridList());
			break;
		case "Cantabria":
			if (!vista.getPanelCantabria().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCantabria());
			Vista.guardarTextosOriginales(vista.getCantabria());
			cargarDatosPorProvincia(dia, vista.getCantabria());
			break;
		case "La Rioja":
			if (!vista.getPanelRioja().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelRioja());
			Vista.guardarTextosOriginales(vista.getRioja());
			cargarDatosPorProvincia(dia, vista.getRioja());
			break;
		case "Ceuta":
			if (!vista.getPanelRioja().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelCeuta());
			Vista.guardarTextosOriginales(vista.getCeuta());
			cargarDatosPorProvincia(dia, vista.getCeuta());
			break;
		case "Melilla":
			if (!vista.getPanelMelilla().isVisible())
				vista.mostrarPanel(vista.getContentPane(), vista.getPanelMelilla());
			Vista.guardarTextosOriginales(vista.getMelillaList());
			cargarDatosPorProvincia(dia, vista.getMelillaList());
			break;
		
		}
	}

	// METODO PARA MOSTRA MAPA
	public void peticionDatosEspania(int dia) {

		System.out.println(dia);
		DiaPronostico respuestaDia = null;
		String clima = null;

		try {
			for (String ciudad : ciudades) {
				respuestaDia = respuesta.hacerPeticion(ciudad, dia);
				for (JLabel label : vista.getLabels()) {
					if (ciudad.equals(label.getText())) {
						clima = respuestaDia.getEstadoClima();
						pintarIcono(label, clima);
					}
				}
			}

		} catch (Exception e) {
			System.err.println("Error al hacer la petición en el método peticionDatosEspania");
			e.printStackTrace();
		}
	}

	// CUATRO DÍAS SIGUIENTES Y EL DE HOY para el JCOMBOBoX
	public void obtenerDias() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE,dd/MM/yy");
		diasSemanaYNumero[0] = "Hoy";
		for (int i = 1; i < 5; i++) {
			LocalDate fechaSiguiente = fechaActual.plusDays(i);
			String diaSemanaYNumero = fechaSiguiente.format(formatter);
			diasSemanaYNumero[i] = diaSemanaYNumero;
		}
	}

	private void cargarDatosPorProvincia(int dia, List<JLabel> lista) {

		Border border = BorderFactory.createLineBorder(Color.gray);

		DiaPronostico diaPron = new DiaPronostico();
		for (JLabel label : lista) {
			if (label.getText().equals("min")) {
				label.setOpaque(true);
				label.setBorder(border);
				label.setText("MIN: " + diaPron.getTempMinima() + "º");
			} else if (label.getText().equals("max")) {
				label.setText("MAX: " + diaPron.getTempMaxima() + "º");
				label.setOpaque(true);
				label.setBorder(border);
			} else {
				diaPron = respuesta.hacerPeticion(label.getText(), dia);
				if (diaPron != null) {
					pintarIcono(label, diaPron.getEstadoClima());
				}
			}
		}
	}

	private void pintarIcono(JLabel label, String clima) {
		String imagePath = CLIMA_IMAGENES.get(clima.toLowerCase());
		ImageIcon icono = new ImageIcon(getClass().getResource(imagePath));

		if (icono.getImage() != null) {
			icono.setImage(icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
			label.setOpaque(false);
			label.setIcon(icono);
		} else {
			System.err.println("Error al cargar la imagen: ImageIcon es nulo.");
		}
	}

	public void refrescarTextosOriginalesJLabels(String comunidad) {

		switch (comunidad) {
		case "País Vasco":
			Vista.restaurarTextosOriginales(vista.getPaisVasco());
			break;
		case "Galicia":
			Vista.restaurarTextosOriginales(vista.getGalicia());
			break;
		case "Castilla La Mancha":
			Vista.restaurarTextosOriginales(vista.getCastilla_LM());
			break;
		case "Andalucía":
			Vista.restaurarTextosOriginales(vista.getAndaluci());
			break;
		case "Extremadura":
			Vista.restaurarTextosOriginales(vista.getExtremadura());
			break;
		case "Aragón":
			Vista.restaurarTextosOriginales(vista.getAragon());
			break;
		case "Asturias":
			Vista.restaurarTextosOriginales(vista.getAsturias());
			break;
		case "Cataluña":
			Vista.restaurarTextosOriginales(vista.getAsturias());
			break;
		case "Comunidad Valenciana":
			Vista.restaurarTextosOriginales(vista.getValencia());
			break;
		case "Islas Baleares":
			Vista.restaurarTextosOriginales(vista.getBaleares());
			break;
		case "Islas Canarias":
			Vista.restaurarTextosOriginales(vista.getCanarias());
			break;
		case "Región de Murcia":
			Vista.restaurarTextosOriginales(vista.getMurciaList());
			break;
		case "Navarra":
			Vista.restaurarTextosOriginales(vista.getNavarra());
			break;
		case "Madrid":
			Vista.restaurarTextosOriginales(vista.getNavarra());
			break;
		case "Cantabria":
			Vista.restaurarTextosOriginales(vista.getCantabria());
			break;
		case "La Rioja":
			Vista.restaurarTextosOriginales(vista.getRioja());
			break;
		case "Ceuta":
			Vista.restaurarTextosOriginales(vista.getCeuta());
			break;
		case "Melilla":
			Vista.restaurarTextosOriginales(vista.getMelillaList());
			break;
		case "Castlla y León":
			Vista.restaurarTextosOriginales(vista.getCastillaLeon());
			break;
		}
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
		ciudadesNombre.add("Ceuta");

		return ciudadesNombre;
	}

	private void cargarHashMapImagene() {

		CLIMA_IMAGENES.put("intervalos de sol", NUBE_SOL);
		CLIMA_IMAGENES.put("sin lluvia", NUBE_SOL);
		CLIMA_IMAGENES.put("despejado", NUBE_SOL);
		CLIMA_IMAGENES.put("periodos de sol", NUBE_SOL);
		CLIMA_IMAGENES.put("parcialmente nuboso", NUBE_SOL);
		CLIMA_IMAGENES.put("parcialmente despejado,", NUBE_SOL);
		CLIMA_IMAGENES.put("templado", NUBE_SOL);

		CLIMA_IMAGENES.put("tormentas", NUBE_TORMENTA);
		CLIMA_IMAGENES.put("chubascos tormentosos", NUBE_TORMENTA);
		CLIMA_IMAGENES.put("tormenta", NUBE_TORMENTA);
		CLIMA_IMAGENES.put("relámpagos", NUBE_TORMENTA);

		CLIMA_IMAGENES.put("chubascos de nieve", NUBE_NIEVE);
		CLIMA_IMAGENES.put("ráfagas de nieve", NUBE_NIEVE);
		CLIMA_IMAGENES.put("nieve", NUBE_NIEVE);
		CLIMA_IMAGENES.put("nevada fuerte", NUBE_NIEVE);
		CLIMA_IMAGENES.put("nevada", NUBE_NIEVE);
		CLIMA_IMAGENES.put("nevada débil", NUBE_NIEVE);

		CLIMA_IMAGENES.put("chubascos", NUBE_AGUA);
		CLIMA_IMAGENES.put("aguanieve", NUBE_AGUA);
		CLIMA_IMAGENES.put("chubascos fuertes", NUBE_AGUA);
		CLIMA_IMAGENES.put("chubascos de lluvia", NUBE_AGUA);
		CLIMA_IMAGENES.put("chubascos débiles", NUBE_AGUA);
		CLIMA_IMAGENES.put("lluvia engelante", NUBE_AGUA);
		CLIMA_IMAGENES.put("lluvia", NUBE_AGUA);
		CLIMA_IMAGENES.put("llovizna", NUBE_AGUA);
		CLIMA_IMAGENES.put("lluvia débil", NUBE_AGUA);
		CLIMA_IMAGENES.put("húmedo", NUBE_AGUA);

		CLIMA_IMAGENES.put("chubascos ocasionales", NUBE_AGUA_SOL);
		CLIMA_IMAGENES.put("chubascos dispersos", NUBE_AGUA_SOL);
		CLIMA_IMAGENES.put("chubascos aislados", NUBE_AGUA_SOL);

		CLIMA_IMAGENES.put("niebla", NIEBLA);
		CLIMA_IMAGENES.put("bruma", NIEBLA);

		CLIMA_IMAGENES.put("humo", HUMO);

		CLIMA_IMAGENES.put("cubierto", NUBE);
		CLIMA_IMAGENES.put("nuboso", NUBE);
		CLIMA_IMAGENES.put("muy nuboso", NUBE);

		CLIMA_IMAGENES.put("tempestad de arena", VIENTO);
		CLIMA_IMAGENES.put("tempestad de polvo", VIENTO);
		CLIMA_IMAGENES.put("arena,Polvo", VIENTO);
		CLIMA_IMAGENES.put("ventisca alta", VIENTO);
		CLIMA_IMAGENES.put("ventisca", VIENTO);
		CLIMA_IMAGENES.put("ventisca baja", VIENTO);
		CLIMA_IMAGENES.put("tormenta de nieve", VIENTO);
		CLIMA_IMAGENES.put("ventoso", VIENTO);
		CLIMA_IMAGENES.put("turbonada", VIENTO);
		CLIMA_IMAGENES.put("tormentoso", VIENTO);
		CLIMA_IMAGENES.put("Vendaval", VIENTO);

		CLIMA_IMAGENES.put("seco", SOL);
		CLIMA_IMAGENES.put("caluroso", SOL);
		CLIMA_IMAGENES.put("cálido", SOL);
		CLIMA_IMAGENES.put("despejado", SOL);
		CLIMA_IMAGENES.put("soleado", SOL);
		CLIMA_IMAGENES.put("buen tiempo", SOL);
		CLIMA_IMAGENES.put("claro", SOL);

		CLIMA_IMAGENES.put("helada", FRIO);
		CLIMA_IMAGENES.put("escarcha", FRIO);
		CLIMA_IMAGENES.put("frío", FRIO);
		CLIMA_IMAGENES.put("fresco", FRIO);
	}

	public List<String> comunidades() {

		List<String> comunidades = new ArrayList<String>();
		comunidades.add("A: España");
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

		Collections.sort(comunidades);

		return comunidades;
	}

}
