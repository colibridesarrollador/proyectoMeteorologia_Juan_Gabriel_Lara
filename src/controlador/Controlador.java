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
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.PeticionesJSON;
import modelo.Pronostico;

public class Controlador implements ActionListener {

	// private ImageIcon fondoEspania;
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

		this.pronostico = new Pronostico();
		this.respuesta = new PeticionesJSON();
		this.ciudades = new ArrayList<String>();
		this.ciudades = cargarCiudades();
		this.ciudadesPeticiones = new ArrayList<>();
		this.comunidadesLista = comunidades();
		this.comunidades = new DefaultComboBoxModel<>(comunidadesLista.toArray(new String[0]));
		diasSemanaYNumero = new String[5];
		this.fechaActual = LocalDate.now();

		obtenerDias();
		// cargarCiudades();

		// cargarProvincias();

		this.dias = new DefaultComboBoxModel<>(diasSemanaYNumero);

		cargarJCombobox();
		cargarActionListener();
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

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getIrAlMapa()) {

			mostrarMapaEspaniaPrimeraVez();
			
		} else if (e.getSource() == vista.getComboBoxDia()) {
		
			if(vista.getPanelEspania().isVisible()) {
				peticionDatosEspania(vista.getComboBoxDia().getSelectedIndex());
				refrescarPanel(vista.getPanelEspania());
			}else {
				diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();				
				cargarDatosEnJLabel(diaSeleccionado, comunidad);
			}
			 
			 
			 
		} else if (e.getSource() == vista.getComboBoxComunidades()) {

			comunidad = (String) vista.getComboBoxComunidades().getSelectedItem();
			

			//diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();
			
			if (comunidad.equalsIgnoreCase("PAIS: España")) {

				mostrarPanelEspania();
				mostrarDatosEspania();

			} else {
				
				if(vista.getPanelEspania().isVisible())
					vista.getPanelEspania().setVisible(false);
				
				cargarDatosEnJLabel(diaSeleccionado, comunidad);
				
			}

		}
	}

	public void refrescarPanel(JPanel panel) {
		panel.validate();
		panel.repaint();
	}

	private void mostrarPanelEspania() {
		vista.getPanelEspania().setVisible(true);

	}
	private void mostrarDatosEspania() {
		peticionDatosEspania(diaSeleccionado);
	}
	
	private void mostrarMapaEspaniaPrimeraVez() {
		vista.getPanelControles().setVisible(true);
		vista.getPanelInicio().setVisible(false);
		vista.getPanelControles().setVisible(true);
		vista.getPanelEspania().setVisible(true);
		diaSeleccionado = vista.getComboBoxDia().getSelectedIndex();
		peticionDatosEspania(diaSeleccionado);
	}

	/*
	 * private void introducirTemperaturas() {
	 * 
	 * }
	 */
	public void cargarDatosEnJLabel(int dia, String llamada) {
			if(comunidad.equals("Galicia")) {
		
					if(!vista.getPanelGalicia().isVisible())
						vista.getPanelGalicia().setVisible(true);
						mostrarGalicia(dia);
			
			}else if(comunidad.equals("País Vasco")) {
					
					if(!vista.getPanelGalicia().isVisible())
						vista.getPanelGalicia().setVisible(true);
						mostrarGalicia(dia);
			}
		
	}

	

	// METODO PARA MOSTRA MAPA
	public void peticionDatosEspania(int dia) {

		String nombreEtiqueta = null;
		try {
			for (String string : ciudades) {
				pronostico = respuesta.hacerPeticion(string);
				for (int i = 0; i < vista.getLabels().size(); i++) {
					nombreEtiqueta = vista.getLabels().get(i).getText();
					if (string.equalsIgnoreCase(nombreEtiqueta)) {
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

	public List<String> comunidades() {

		List<String> comunidades = new ArrayList<String>();
		comunidades.add("Galicia");
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
		comunidades.add("PAIS: España");
		return comunidades;
	}

	private void comprobarClima(JLabel label, String clima) {

		ImageIcon icono = null;
		// System.out.println("ENTRA");

		// Obtén la hora actual del sistema
		LocalTime horaActual = LocalTime.now();

		// Define las horas de inicio y fin (8 AM y 8 PM)
		LocalTime salidaSol = LocalTime.of(8, 0);
		LocalTime puestaSol = LocalTime.of(20, 0);
		// SOLES CON NUVES
		// SOLES CON NUVES
		System.out.println("Procesando...");
		// System.out.println("ENTRA");
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
	private void mostrarGalicia(int dia) {

		pronostico = respuesta.hacerPeticion(vista.getOurense().getText());
		
		String maxima = pronostico.getDias().get(dia).getTempMaxima();
		String minima = pronostico.getDias().get(dia).getTempMinima();
		String clima = pronostico.getDias().get(dia).getEstadoClima();	
		
		vista.getMinOurense().setText("MIN: "+minima+"º");
		vista.getMaxOurense().setText("MAX: "+maxima+"º");
		comprobarClima(vista.getOurense(),clima);
		pronostico = respuesta.hacerPeticion(vista.getLugo().getText());
		
		 maxima = pronostico.getDias().get(dia).getTempMaxima();
		 minima = pronostico.getDias().get(dia).getTempMinima();
		 clima = pronostico.getDias().get(dia).getEstadoClima();	
		
		vista.getMinLugo().setText("MIN: "+minima+"º");
		vista.getMaxLugo().setText("MAX: "+maxima+"º");
		comprobarClima(vista.getLugo(),clima);
		
		
		pronostico = respuesta.hacerPeticion(vista.getPontevedra().getText());
		
		maxima = pronostico.getDias().get(dia).getTempMaxima();
		minima = pronostico.getDias().get(dia).getTempMinima();
		clima = pronostico.getDias().get(dia).getEstadoClima();	
		
		vista.getMinPontevedra().setText("MIN: "+minima+"º");
		vista.getMaxPontevedra().setText("MAX: "+maxima+"º");
		comprobarClima(vista.getPontevedra(),clima);
		pronostico = respuesta.hacerPeticion(vista.getCorunia().getText());
		
		maxima = pronostico.getDias().get(dia).getTempMaxima();
		minima = pronostico.getDias().get(dia).getTempMinima();
		clima = pronostico.getDias().get(dia).getEstadoClima();	
		
		vista.getMinCorunia().setText("MIN: "+minima+"º");
		vista.getMaxCorunia().setText("MAX: "+maxima+"º");
		comprobarClima(vista.getCorunia(),clima);// TODO Auto-generated method stub

	}
}
