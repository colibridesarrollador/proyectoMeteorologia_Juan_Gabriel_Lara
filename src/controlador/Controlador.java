package controlador;

import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.util.HashMap;

import modelo.DiaPronostico;
import modelo.PeticionesJSON;
import modelo.Pronostico;


public class Controlador implements ActionListener {

	private ImageIcon fondoEspania;
	private Map<String, String> ciudadesNombres;
	private DefaultComboBoxModel<String> modelo;
	private Vista vista;
	private Pronostico pronostico;
	private PeticionesJSON respuesta;

	public Controlador(Vista vista) {

		this.vista = vista;
		this.fondoEspania = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		this.pronostico = new Pronostico();
		this.respuesta = new PeticionesJSON();
		this.ciudadesNombres = new HashMap<>();
		this.ciudadesNombres = nombresCiudad();
		this.modelo = new DefaultComboBoxModel<>(ciudadesNombres.keySet().toArray(new String[0]));
		System.out.println(modelo.getElementAt(0));
		vista.getComboBoxCiudades().setModel(modelo);

		//vista.getLblNewLabelFondoMapas().setIcon(fondoEspania);
		vista.getComboBoxCiudades().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==vista.getComboBoxCiudades()) {
			String ciudad = (String) vista.getComboBoxCiudades().getSelectedItem();
		
			if(!ciudad.equals("")) {
			
			//System.out.println(ciudad);
			
			try {
				pronostico = respuesta.procesarInformacionClimatologica(ciudadesNombres.get(ciudad));
			} catch (Exception f) {
				f.printStackTrace();
			}
			
			vista.getLblNewLabelCiudad().setText(pronostico.getNombreCiudad());
			vista.getLblNewLabelEstadocClimatico().setText(pronostico.getDias().get(0).getEstadoClima());
			vista.getLblNewLabelTmpMax().setText(pronostico.getDias().get(0).getTempMaxima()+"º");
			vista.getLblNewLabelTmpMinima().setText(pronostico.getDias().get(0).getTempMinima()+"º");
			
			}
		}
		
	}

	
	public  Map<String, String> nombresCiudad() {

		Map<String, String> ciudadesNombre = new HashMap<>();
		ciudadesNombre.put("A Coruña", "A_Coruja");
		ciudadesNombre.put("Albacete", "Albacete");
		ciudadesNombre.put("Alcalá de Henares", "Alcala_de_Henares");
		ciudadesNombre.put("Alicante Alacant", "Alicante_Alacant");
		ciudadesNombre.put("Almería", "Almeria");
		ciudadesNombre.put("Andújar", "Andujar");
		ciudadesNombre.put("Aranda de Duero", "Aranda_de_Duero");
		ciudadesNombre.put("Aranjuez", "Aranjuez");
		ciudadesNombre.put("Arrecife", "Arrecife");
		ciudadesNombre.put("Ávila", "Avila");
		ciudadesNombre.put("Avilés", "Aviles");
		ciudadesNombre.put("Ayamonte", "Ayamonte");
		ciudadesNombre.put("Badajoz", "Badajoz");
		ciudadesNombre.put("Barcelona", "Barcelona");
		ciudadesNombre.put("Benavente", "Benavente");
		ciudadesNombre.put("Benidorm", "Benidorm");
		ciudadesNombre.put("Bilbao", "Bilbao");
		ciudadesNombre.put("Burgos", "Burgos");
		ciudadesNombre.put("Cáceres", "Caceres");
		ciudadesNombre.put("Cádiz", "Cadiz");
		ciudadesNombre.put("Calatayud", "Calatayud");
		ciudadesNombre.put("Capdepera", "Capdepera");
		ciudadesNombre.put("Caravaca de La Cruz", "Caravaca_de_La_Cruz");
		ciudadesNombre.put("Cartagena", "Cartagena");
		ciudadesNombre.put("Castellón de la Plana Castelló de la Plana", "Castellon_de_la_Plana_Castello_de_la_Plana");
		ciudadesNombre.put("Cazorla", "Cazorla");
		ciudadesNombre.put("Ceuta", "Ceuta");
		ciudadesNombre.put("Ciudad Real", "Ciudad_Real");
		ciudadesNombre.put("Ciudad Rodrigo", "Ciudad_Rodrigo");
		ciudadesNombre.put("Ciutadella de Menorca", "Ciutadella_de_Menorca");
		ciudadesNombre.put("Córdoba", "Cordoba");
		ciudadesNombre.put("Cuenca", "Cuenca");
		ciudadesNombre.put("Donostia San Sebastián", "Donostia_San_Sebastian");
		ciudadesNombre.put("Écija", "Ecija");
		ciudadesNombre.put("Eivissa", "Eivissa");
		ciudadesNombre.put("Elche Elx", "Elche_Elx");
		ciudadesNombre.put("Estepona", "Estepona");
		ciudadesNombre.put("Figueres", "Figueres");
		ciudadesNombre.put("Gijón", "Gijon");
		ciudadesNombre.put("Girona", "Girona");
		ciudadesNombre.put("Granada", "Granada");
		ciudadesNombre.put("Guadalajara", "Guadalajara");
		ciudadesNombre.put("Haro", "Haro");
		ciudadesNombre.put("Huelva", "Huelva");
		ciudadesNombre.put("Huesca", "Huesca");
		ciudadesNombre.put("Jaca", "Jaca");
		ciudadesNombre.put("Jaén", "Jaen");
		ciudadesNombre.put("Jávea Xàbia", "Javea_Xabia");
		ciudadesNombre.put("Jérez de la Frontera", "Jerez_de_la_Frontera");
		ciudadesNombre.put("La Seu d'Urgell", "La_Seu_d_Urgell");
		ciudadesNombre.put("Las Palmas de Gran Canaria", "Las_Palmas_de_Gran_Canaria");
		ciudadesNombre.put("León", "Leon");
		ciudadesNombre.put("Llanes", "Llanes");
		ciudadesNombre.put("Lleida", "Lleida");
		ciudadesNombre.put("Lloret de Mar", "Lloret_de_Mar");
		ciudadesNombre.put("Logroño", "Logrono");
		ciudadesNombre.put("Lugo", "Lugo");
		ciudadesNombre.put("Madrid", "Madrid");
		ciudadesNombre.put("Málaga", "Malaga");
		ciudadesNombre.put("Manresa", "Manresa");
		ciudadesNombre.put("Maó Mahón", "Mao_Mahon");
		ciudadesNombre.put("Marbella", "Marbella");
		ciudadesNombre.put("Melilla", "Melilla");
		ciudadesNombre.put("Mérida", "Merida");
		ciudadesNombre.put("Motril", "Motril");
		ciudadesNombre.put("Murcia", "Murcia");
		ciudadesNombre.put("Ourense", "Ourense");
		ciudadesNombre.put("Oviedo", "Oviedo");
		ciudadesNombre.put("Palencia", "Palencia");
		ciudadesNombre.put("Palma de Mallorca", "Palma_de_Mallorca");
		ciudadesNombre.put("Pamplona Iruña", "Pamplona_Iruna");
		ciudadesNombre.put("Plasencia", "Plasencia");
		ciudadesNombre.put("", "");
		ciudadesNombre.put("Ponferrada", "Ponferrada");
		ciudadesNombre.put("Pontevedra", "Pontevedra");
		ciudadesNombre.put("Puerto de la Cruz", "Puerto_de_la_Cruz");
		ciudadesNombre.put("Puerto del Rosario", "Puerto_del_Rosario");
		ciudadesNombre.put("Reinosa", "Reinosa");
		ciudadesNombre.put("Reus", "Reus");
		ciudadesNombre.put("Roquetas de Mar", "Roquetas_de_Mar");
		ciudadesNombre.put("Salamanca", "Salamanca");
		ciudadesNombre.put("Salou", "Salou");
		ciudadesNombre.put("San Sebastián de la Gomera", "San_Sebastian_de_la_Gomera");
		ciudadesNombre.put("Santa Cruz de La Palma", "Santa_Cruz_de_La_Palma");
		ciudadesNombre.put("Santa Cruz de Tenerife", "Santa_Cruz_de_Tenerife");
		ciudadesNombre.put("Santander", "Santander");
		ciudadesNombre.put("Santiago de Compostela", "Santiago_de_Compostela");
		ciudadesNombre.put("Segovia", "Segovia");
		ciudadesNombre.put("Sevilla", "Sevilla");
		ciudadesNombre.put("Sigüenza", "Sigüenza");
		ciudadesNombre.put("Sitges", "Sitges");
		ciudadesNombre.put("Soria", "Soria");
		ciudadesNombre.put("Talavera de la Reina", "Talavera_de_la_Reina");
		ciudadesNombre.put("Tarancón", "Tarancón");
		ciudadesNombre.put("Tarifa", "Tarifa");
		ciudadesNombre.put("Tarragona", "Tarragona");
		ciudadesNombre.put("Teruel", "Teruel");
		ciudadesNombre.put("Toledo", "Toledo");
		ciudadesNombre.put("Torremolinos", "Torremolinos");
		ciudadesNombre.put("Trujillo", "Trujillo");
		ciudadesNombre.put("Tudela", "Tudela");
		ciudadesNombre.put("Valdepeñas", "Valdepeñas");
		ciudadesNombre.put("Valencia", "Valencia");
		ciudadesNombre.put("Valladolid", "Valladolid");
		ciudadesNombre.put("Valverde", "Valverde");
		ciudadesNombre.put("Vigo", "Vigo");
		ciudadesNombre.put("Vinarós", "Vinaros");
		ciudadesNombre.put("Vitoria Gasteiz", "Vitoria_Gasteiz");
		ciudadesNombre.put("Xàtiva", "Xativa");
		ciudadesNombre.put("Zamora", "Zamora");
		ciudadesNombre.put("Zaragoza", "Zaragoza");

		return ciudadesNombre;
	}
}
