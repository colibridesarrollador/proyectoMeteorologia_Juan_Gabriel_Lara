package vista;

import controlador.Controlador;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Map<JLabel, String> textosOriginales = new HashMap<>();
	private JPanel contentPane;
	private JPanel panelEspania;
	private JLabel lblNewLabelFondoMapaEspania;
	private Image image;
	private ImageIcon r;
	public  List<JLabel> catalunia;
	private List<JLabel> asturias;
	private List<JLabel> aragon;
	private List<JLabel> galicia;
	private List<JLabel> extremadura;
	private List<JLabel> andaluci;
	private List<JLabel> castilla_LM;
	private List<JLabel> paisVasco;
	private List<JLabel> castillaLeon;
	private List<JLabel> labels;
	private JLabel lblNewLabelLasPalmas;
	private JLabel lblNewLabelSantaCruzTenerife;
	private JLabel lblNewLabelCadiz;
	private JLabel lblNewLabelGranada;
	private JLabel lblNewLabelAlmeria;
	private JLabel lblNewLabelJaen;
	private JLabel lblNewLabelCordoba;
	private JLabel lblNewLabelSevilla;
	private JLabel lblNewLabelHuelva;
	private JLabel lblNewLabelAlbacete;
	private JLabel lblNewLabelGuadalajara;
	private JLabel lblNewLabelMadrid;
	private JLabel lblNewLabelCuenca;
	private JLabel lblNewLabelCiudadReal;
	private JLabel lblNewLabelBadajoz;
	private JLabel lblNewLabelToledo;
	private JLabel lblNewLabelCaceres;
	private JLabel lblNewLabelTeruel;
	private JLabel lblNewLabelTarragona;
	private JLabel lblNewLabelLerida;
	private JLabel lblNewLabelBarcelona;
	private JLabel lblNewLabelGerona;
	private JLabel lblNewLabelZaragoza;
	private JLabel lblNewLabelSoria;
	private JLabel lblNewLabelSegovia;
	private JLabel lblNewLabelAvila;
	private JLabel lblNewLabelSalamanca;
	private JLabel lblNewLabelBurgos;
	private JLabel lblNewLabelValladolid;
	private JLabel lblNewLabelZamora;
	private JLabel lblNewLabelHuesca;
	private JLabel lblNewLabelLugo;
	private JLabel lblNewLabelLeon;
	private JLabel lblNewLabelLaCorunia;
	private JLabel lblNewLabelBaleares;
	private JLabel lblNewLabelOrense;
	private JLabel lblNewLabelValencia;
	private JLabel lblNewLabeGuipuzcua;
	private JLabel lblNewLabelViscaya;
	private JLabel lblNewLabelMurcia;
	private JLabel lblNewLabelPalencia;
	private JLabel lblNewLabelAlicante;
	private JLabel lblNewLabelLaRioja;
	private JLabel lblNewLabelOviedo;
	private JLabel lblNewLabelMalaga;
	private JLabel lblNewLabelCantabria;
	private JLabel lblNewLabelPntevedra;
	private JLabel lblNewLabelCastellonDeLaPlana;
	private JButton irAlMapa;
	private JPanel panelInicio;
	private JLabel lblNewLabelProvinciaSeleccionada;
	private JLabel labelMaxCorunia;;
	private JLabel corunia;
	private JLabel pontevedra;
	private JLabel maxPontevedra;
	private JLabel minPontevedra;
	private JLabel ourense;
	private JLabel maxOurense;
	private JLabel minOurense;
	private JLabel lugo;
	private JLabel maxLugo;
	private JLabel minLugo;
	private JLabel maxCorunia;
	private JLabel minCorunia;
	private JPanel panelGalicia;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblPontevedra;
	private JPanel panelControles;
	private JLabel lblNewLabel;
	private JComboBox comboBoxComunidades;
	private JComboBox comboBoxDia;
	private JLabel fondoGalicia;
	private JPanel panelPaisVasco;
	private JLabel vitoria;
	private JLabel maxVitoria;
	private JLabel minVitoria;
	private JLabel maxBilbao;
	private JLabel minBilbao;
	private JLabel sanSebastian;
	private JLabel maxSansebastian;
	private JLabel minSansebastian;
	private JLabel bilbao;
	private JLabel cuenca;
	private JLabel maxCuenca;
	private JLabel minCuenca;
	private JLabel toledo;
	private JLabel maxToledo;
	private JLabel minToledo;
	private JLabel ciudadReal;
	private JLabel maxCiudadReal;
	private JLabel minCiudadReal;
	private JLabel albacete;
	private JLabel maxAlbacete;
	private JLabel minAlbacete;
	private JLabel minGuadalajara;

	private JLabel guadalajara;

	private JPanel panelCLM;
	private JLabel fondoCastillaLeon;
	private JLabel leon;
	private JLabel maxLeon;
	private JLabel minLeon;
	private JLabel zamora;
	private JLabel maxZamora;
	private JLabel minZamora;
	private JLabel salamanca;
	private JLabel maxSalamanca;
	private JLabel minSalamanca;
	private JLabel avila;
	private JLabel minAvila;
	private JLabel maxAvila;
	private JLabel burgos;
	private JLabel maxburgos;
	private JLabel minBurgos;
	private JLabel soria;
	private JLabel maxSoria;
	private JLabel minSoria;

	private JPanel panelCastillaLeon;
	private JLabel huelva;
	private JLabel maxHuelva;
	private JLabel minHuelva;
	private JLabel cadiz;
	private JLabel maxCadiz;
	private JLabel minCadiz;
	private JLabel cordoba;
	private JLabel maxCordoba;
	private JLabel minCordoba;
	private JLabel granada;
	private JLabel maxGranada;
	private JLabel minGranda;
	private JLabel jaen;
	private JLabel maxJaen;
	private JLabel minJaen;
	private JLabel almeria;

	private JPanel panelAndalucia;
	private JLabel lblNewLabel_12;
	private JLabel sevilla;

	private JLabel maxGuadalajara;

	private JLabel fondoAndalucia;

	private JLabel fondoCLM;

	private JLabel fondoInicio;

	private JLabel lblNewLabelFonoPaisVasco;

	private JLabel fondoExtremadura;
	private JLabel plasencia;
	private JLabel lblNewLabel_25;
	private JLabel maxPlasencia;
	private JLabel minPlasencia;
	private JLabel caceres;
	private JLabel lblNewLabel_26;
	private JLabel maxCaceres;
	private JLabel minCaceres;
	private JLabel merida;
	private JLabel label;
	private JLabel lblNewLabel_27;
	private JLabel maxMerida;
	private JLabel minMerida;
	private JLabel lblNewLabel_28;
	private JLabel badajoz;
	private JLabel maxBadajoz;
	private JLabel minBadajoz;

	private JPanel panelExtremadura;

	private JLabel fondoAragon;
	private JLabel lblNewLabel_29;
	private JLabel maxZaragoza;
	private JLabel minAragon;
	private JLabel zaragoza;
	private JLabel lblNewLabel_30;
	private JLabel minTeruel;
	private JLabel huesca;
	private JLabel lblNewLabel_31;
	private JLabel maxHuesca;
	private JLabel maxTeruel;
	private JLabel minHuesca;
	private JLabel teruel;

	private JPanel panelAragon;
	private JLabel fondoAsturias;
	private JLabel oviedo;
	private JLabel lblNewLabel_32;
	private JLabel maxOviedo;
	private JLabel minOviedo;
	private JLabel gijon;
	private JLabel maxGijon;
	private JLabel minGijon;
	private JLabel aviles;
	private JLabel minAviles;
	private JLabel maxAviles;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JPanel panelAsturias;
	private JLabel fondoCatalunia;
	private JLabel maxBarcelona;
	private JLabel minBarcelona;
	private JLabel lblNewLabel_38;
	private JLabel girona;
	private JLabel maxGirona;
	private JLabel minGirona;
	private JPanel panelCatalunia;
	private JLabel barcelona;
	private JLabel tarragona;
	private JLabel lleida;
	private JLabel maxLleida;
	private JLabel minLleida;
	private JLabel maxTarragona;
	private JLabel minTarragona;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					Controlador controlador = new Controlador(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {

		catalunia = new ArrayList<>();
		asturias = new ArrayList<>();
		aragon = new ArrayList<>();
		extremadura = new ArrayList<>();
		castillaLeon = new ArrayList<>();
		paisVasco = new ArrayList<JLabel>();
		galicia = new ArrayList<JLabel>();
		labels = new ArrayList<JLabel>();
		castilla_LM = new ArrayList<JLabel>();
		andaluci = new ArrayList<JLabel>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelAndalucia = new JPanel();
		panelAndalucia.setBounds(0, 0, 729, 568);
		contentPane.add(panelAndalucia);
		panelAndalucia.setLayout(null);
		panelAndalucia.setVisible(false);

		sevilla = new JLabel("Sevilla");
		sevilla.setBounds(200, 200, 71, 60);
		panelAndalucia.add(sevilla);

		JLabel lblNewLabel_14 = new JLabel("Málaga");
		lblNewLabel_14.setForeground(new Color(255, 255, 255));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(293, 192, 83, 23);
		panelAndalucia.add(lblNewLabel_14);

		huelva = new JLabel("Huelva");
		huelva.setBounds(65, 197, 71, 60);
		panelAndalucia.add(huelva);

		maxHuelva = new JLabel("max");
		maxHuelva.setForeground(new Color(255, 255, 255));
		maxHuelva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxHuelva.setBounds(146, 174, 83, 13);
		panelAndalucia.add(maxHuelva);

		minHuelva = new JLabel("min");
		minHuelva.setForeground(new Color(255, 255, 255));
		minHuelva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minHuelva.setBounds(146, 197, 71, 13);
		panelAndalucia.add(minHuelva);

		cadiz = new JLabel("Cadiz");
		cadiz.setBounds(131, 314, 71, 60);
		panelAndalucia.add(cadiz);

		maxCadiz = new JLabel("max");
		maxCadiz.setForeground(new Color(255, 255, 255));
		maxCadiz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCadiz.setBounds(228, 314, 83, 13);
		panelAndalucia.add(maxCadiz);

		minCadiz = new JLabel("min");
		minCadiz.setForeground(new Color(255, 255, 255));
		minCadiz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCadiz.setBounds(228, 337, 71, 13);
		panelAndalucia.add(minCadiz);

		cordoba = new JLabel("Cordoba");
		cordoba.setBounds(293, 115, 64, 60);
		panelAndalucia.add(cordoba);

		maxCordoba = new JLabel("max");
		maxCordoba.setForeground(new Color(255, 255, 255));
		maxCordoba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCordoba.setBounds(357, 69, 77, 13);
		panelAndalucia.add(maxCordoba);

		minCordoba = new JLabel("min");
		minCordoba.setForeground(new Color(255, 255, 255));
		minCordoba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCordoba.setBounds(357, 92, 95, 13);
		panelAndalucia.add(minCordoba);

		granada = new JLabel("Granada");
		granada.setBounds(409, 244, 71, 60);
		panelAndalucia.add(granada);

		maxGranada = new JLabel("max");
		maxGranada.setForeground(new Color(255, 255, 255));
		maxGranada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxGranada.setBounds(476, 197, 67, 13);
		panelAndalucia.add(maxGranada);

		minGranda = new JLabel("min");
		minGranda.setForeground(new Color(255, 255, 255));
		minGranda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minGranda.setBounds(476, 222, 67, 13);
		panelAndalucia.add(minGranda);

		jaen = new JLabel("Jaen");
		jaen.setBounds(449, 127, 64, 60);
		panelAndalucia.add(jaen);

		maxJaen = new JLabel("max");
		maxJaen.setForeground(new Color(255, 255, 255));
		maxJaen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxJaen.setBounds(518, 92, 173, 13);
		panelAndalucia.add(maxJaen);

		minJaen = new JLabel("min");
		minJaen.setForeground(new Color(255, 255, 255));
		minJaen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minJaen.setBounds(523, 116, 83, 13);
		panelAndalucia.add(minJaen);

		almeria = new JLabel("Almeria");
		almeria.setBounds(553, 222, 71, 60);
		panelAndalucia.add(almeria);

		JLabel lblNewLabel_2 = new JLabel("Heulva");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(23, 160, 86, 15);
		panelAndalucia.add(lblNewLabel_2);

		JLabel lblNewLabel_6 = new JLabel("Cordoba");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(282, 83, 83, 13);
		panelAndalucia.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Granda");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(399, 211, 75, 23);
		panelAndalucia.add(lblNewLabel_7);

		JLabel lblNewLabel_11 = new JLabel("Almeria");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(576, 192, 64, 23);
		panelAndalucia.add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("Jaén");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(439, 104, 71, 13);
		panelAndalucia.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Cádiz");
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(146, 270, 88, 13);
		panelAndalucia.add(lblNewLabel_13);

		JLabel malaga = new JLabel("Malaga");
		malaga.setBounds(293, 247, 64, 60);
		panelAndalucia.add(malaga);

		fondoAndalucia = new JLabel("New label");
		fondoAndalucia.setBounds(0, -13, 729, 581);
		panelAndalucia.add(fondoAndalucia);

		panelCatalunia = new JPanel();
		panelCatalunia.setBounds(0, 0, 729, 568);
		contentPane.add(panelCatalunia);
		panelCatalunia.setLayout(null);

		JLabel lblNewLabel_35 = new JLabel("Lleida");
		lblNewLabel_35.setForeground(new Color(255, 255, 255));
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_35.setBounds(133, 143, 56, 13);
		panelCatalunia.add(lblNewLabel_35);

		lleida = new JLabel("Lleida");
		lleida.setBounds(132, 201, 83, 75);
		panelCatalunia.add(lleida);

		maxLleida = new JLabel("max");
		maxLleida.setForeground(new Color(255, 255, 255));
		maxLleida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxLleida.setBounds(199, 143, 83, 13);
		panelCatalunia.add(maxLleida);

		minLleida = new JLabel("min");
		minLleida.setForeground(new Color(255, 255, 255));
		minLleida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minLleida.setBounds(199, 158, 83, 13);
		panelCatalunia.add(minLleida);

		JLabel lblNewLabel_36 = new JLabel("Tarragona");
		lblNewLabel_36.setForeground(new Color(255, 255, 255));
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_36.setBounds(25, 317, 91, 24);
		panelCatalunia.add(lblNewLabel_36);

		tarragona = new JLabel("Tarragona");
		tarragona.setBounds(60, 376, 83, 75);
		panelCatalunia.add(tarragona);

		maxTarragona = new JLabel("max");
		maxTarragona.setForeground(new Color(255, 255, 255));
		maxTarragona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxTarragona.setBounds(108, 294, 83, 13);
		panelCatalunia.add(maxTarragona);

		minTarragona = new JLabel("min");
		minTarragona.setForeground(new Color(255, 255, 255));
		minTarragona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minTarragona.setBounds(108, 316, 91, 15);
		panelCatalunia.add(minTarragona);

		JLabel lblNewLabel_37 = new JLabel("Barcelona");
		lblNewLabel_37.setForeground(new Color(255, 255, 255));
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_37.setBounds(256, 228, 83, 17);
		panelCatalunia.add(lblNewLabel_37);

		barcelona = new JLabel("Barcelona");
		barcelona.setBounds(314, 288, 83, 75);
		panelCatalunia.add(barcelona);

		maxBarcelona = new JLabel("max");
		maxBarcelona.setForeground(new Color(255, 255, 255));
		maxBarcelona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxBarcelona.setBounds(334, 211, 80, 13);
		panelCatalunia.add(maxBarcelona);

		minBarcelona = new JLabel("min");
		minBarcelona.setForeground(new Color(255, 255, 255));
		minBarcelona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minBarcelona.setBounds(334, 240, 80, 13);
		panelCatalunia.add(minBarcelona);

		lblNewLabel_38 = new JLabel("Girona");
		lblNewLabel_38.setForeground(new Color(255, 255, 255));
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_38.setBounds(481, 158, 75, 13);
		panelCatalunia.add(lblNewLabel_38);

		girona = new JLabel("Girona");
		girona.setBounds(502, 211, 83, 75);
		panelCatalunia.add(girona);

		maxGirona = new JLabel("max");
		maxGirona.setForeground(new Color(255, 255, 255));
		maxGirona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxGirona.setBounds(562, 143, 91, 13);
		panelCatalunia.add(maxGirona);

		minGirona = new JLabel("min");
		minGirona.setForeground(new Color(255, 255, 255));
		minGirona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minGirona.setBounds(562, 158, 91, 13);
		panelCatalunia.add(minGirona);

		fondoCatalunia = new JLabel("New label");
		fondoCatalunia.setBounds(0, 0, 729, 568);
		panelCatalunia.add(fondoCatalunia);
		panelCatalunia.setVisible(false);

		panelAsturias = new JPanel();
		panelAsturias.setBounds(0, 0, 729, 568);
		panelAsturias.setLayout(null);
		contentPane.add(panelAsturias);
		panelAsturias.setVisible(false);

		oviedo = new JLabel("Oviedo");
		oviedo.setBounds(277, 96, 67, 65);
		panelAsturias.add(oviedo);

		lblNewLabel_32 = new JLabel("Oviedo");
		lblNewLabel_32.setForeground(new Color(255, 255, 255));
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_32.setBounds(279, 36, 77, 13);
		panelAsturias.add(lblNewLabel_32);

		maxOviedo = new JLabel("max");
		maxOviedo.setForeground(new Color(255, 255, 255));
		maxOviedo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxOviedo.setBounds(366, 36, 90, 13);
		panelAsturias.add(maxOviedo);

		minOviedo = new JLabel("min");
		minOviedo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minOviedo.setForeground(new Color(255, 255, 255));
		minOviedo.setBounds(366, 23, 90, 13);
		panelAsturias.add(minOviedo);

		gijon = new JLabel("Gijon");
		gijon.setBounds(429, 137, 67, 65);
		panelAsturias.add(gijon);

		maxGijon = new JLabel("max");
		maxGijon.setForeground(new Color(255, 255, 255));
		maxGijon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxGijon.setBounds(475, 76, 77, 13);
		panelAsturias.add(maxGijon);

		minGijon = new JLabel("min");
		minGijon.setForeground(new Color(255, 255, 255));
		minGijon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minGijon.setBounds(475, 96, 67, 13);
		panelAsturias.add(minGijon);

		aviles = new JLabel("Aviles");
		aviles.setBounds(144, 137, 67, 65);
		panelAsturias.add(aviles);

		minAviles = new JLabel("min");
		minAviles.setForeground(new Color(255, 255, 255));
		minAviles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minAviles.setBounds(185, 36, 60, 13);
		panelAsturias.add(minAviles);

		maxAviles = new JLabel("max");
		maxAviles.setForeground(new Color(255, 255, 255));
		maxAviles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxAviles.setBounds(185, 59, 60, 13);
		panelAsturias.add(maxAviles);

		lblNewLabel_33 = new JLabel("Gijón");
		lblNewLabel_33.setForeground(new Color(255, 255, 255));
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_33.setBounds(389, 96, 67, 13);
		panelAsturias.add(lblNewLabel_33);

		lblNewLabel_34 = new JLabel("Avilés");
		lblNewLabel_34.setForeground(new Color(255, 255, 255));
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_34.setBounds(110, 59, 65, 13);
		panelAsturias.add(lblNewLabel_34);

		fondoAsturias = new JLabel();
		fondoAsturias.setBounds(0, 0, 729, 568);
		panelAsturias.add(fondoAsturias);

		panelAragon = new JPanel();
		panelAragon.setBounds(0, 0, 729, 568);
		contentPane.add(panelAragon);
		panelAragon.setLayout(null);
		panelAragon.setVisible(false);

		lblNewLabel_29 = new JLabel("Zaragoza");
		lblNewLabel_29.setForeground(new Color(255, 255, 255));
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_29.setBounds(143, 227, 87, 13);
		panelAragon.add(lblNewLabel_29);

		maxZaragoza = new JLabel("max");
		maxZaragoza.setForeground(new Color(255, 255, 255));
		maxZaragoza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxZaragoza.setBounds(240, 227, 78, 13);
		panelAragon.add(maxZaragoza);

		minAragon = new JLabel("min");
		minAragon.setForeground(new Color(255, 255, 255));
		minAragon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minAragon.setBounds(240, 250, 96, 13);
		panelAragon.add(minAragon);

		zaragoza = new JLabel("Zaragoza");
		zaragoza.setBounds(187, 290, 68, 58);
		panelAragon.add(zaragoza);

		lblNewLabel_30 = new JLabel("Teruel");
		lblNewLabel_30.setForeground(new Color(255, 255, 255));
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_30.setBounds(282, 358, 68, 13);
		panelAragon.add(lblNewLabel_30);

		minTeruel = new JLabel("min");
		minTeruel.setForeground(new Color(255, 255, 255));
		minTeruel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minTeruel.setBounds(348, 358, 68, 13);
		panelAragon.add(minTeruel);

		huesca = new JLabel("Huesca");
		huesca.setBounds(337, 155, 68, 58);
		panelAragon.add(huesca);

		lblNewLabel_31 = new JLabel("Huesca");
		lblNewLabel_31.setForeground(new Color(255, 255, 255));
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_31.setBounds(321, 95, 72, 13);
		panelAragon.add(lblNewLabel_31);

		maxHuesca = new JLabel("max");
		maxHuesca.setForeground(new Color(255, 255, 255));
		maxHuesca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxHuesca.setBounds(404, 82, 78, 13);
		panelAragon.add(maxHuesca);

		maxTeruel = new JLabel("max");
		maxTeruel.setForeground(new Color(255, 255, 255));
		maxTeruel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxTeruel.setBounds(348, 335, 57, 13);
		panelAragon.add(maxTeruel);

		minHuesca = new JLabel("min");
		minHuesca.setForeground(new Color(255, 255, 255));
		minHuesca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minHuesca.setBounds(403, 105, 96, 13);
		panelAragon.add(minHuesca);

		teruel = new JLabel("Teruel");
		teruel.setBounds(261, 406, 57, 58);
		panelAragon.add(teruel);

		fondoAragon = new JLabel("New label");
		fondoAragon.setBounds(0, 0, 729, 568);
		panelAragon.add(fondoAragon);

		panelExtremadura = new JPanel();
		panelExtremadura.setBounds(0, 0, 729, 568);
		contentPane.add(panelExtremadura);
		panelExtremadura.setLayout(null);
		panelExtremadura.setVisible(false);

		plasencia = new JLabel("Plasencia");
		plasencia.setBounds(358, 102, 63, 55);
		panelExtremadura.add(plasencia);

		lblNewLabel_25 = new JLabel("Plasencia");
		lblNewLabel_25.setForeground(new Color(255, 255, 255));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_25.setBounds(299, 79, 87, 13);
		panelExtremadura.add(lblNewLabel_25);

		maxPlasencia = new JLabel("max");
		maxPlasencia.setForeground(new Color(255, 255, 255));
		maxPlasencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxPlasencia.setBounds(383, 66, 97, 13);
		panelExtremadura.add(maxPlasencia);

		minPlasencia = new JLabel("min");
		minPlasencia.setForeground(new Color(255, 255, 255));
		minPlasencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minPlasencia.setBounds(383, 79, 97, 22);
		panelExtremadura.add(minPlasencia);

		caceres = new JLabel("Caceres");
		caceres.setBounds(299, 224, 63, 55);
		panelExtremadura.add(caceres);

		lblNewLabel_26 = new JLabel("Cáceres");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_26.setBounds(233, 191, 79, 13);
		panelExtremadura.add(lblNewLabel_26);

		maxCaceres = new JLabel("max");
		maxCaceres.setForeground(new Color(255, 255, 255));
		maxCaceres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCaceres.setBounds(319, 167, 102, 13);
		panelExtremadura.add(maxCaceres);

		minCaceres = new JLabel("min");
		minCaceres.setForeground(new Color(255, 255, 255));
		minCaceres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCaceres.setBounds(319, 193, 87, 13);
		panelExtremadura.add(minCaceres);

		merida = new JLabel("Merida");
		merida.setBounds(437, 290, 63, 55);
		panelExtremadura.add(merida);

		lblNewLabel_27 = new JLabel("Mérida");
		lblNewLabel_27.setForeground(new Color(255, 255, 255));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_27.setBounds(399, 243, 82, 13);
		panelExtremadura.add(lblNewLabel_27);

		maxMerida = new JLabel("max");
		maxMerida.setForeground(new Color(255, 255, 255));
		maxMerida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxMerida.setBounds(459, 220, 70, 13);
		panelExtremadura.add(maxMerida);

		minMerida = new JLabel("min");
		minMerida.setForeground(new Color(255, 255, 255));
		minMerida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minMerida.setBounds(463, 243, 70, 13);
		panelExtremadura.add(minMerida);

		lblNewLabel_28 = new JLabel("Badajoz");
		lblNewLabel_28.setForeground(new Color(255, 255, 255));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_28.setBounds(218, 332, 94, 13);
		panelExtremadura.add(lblNewLabel_28);

		badajoz = new JLabel("Badajoz");
		badajoz.setBounds(249, 376, 63, 55);
		panelExtremadura.add(badajoz);

		maxBadajoz = new JLabel("max");
		maxBadajoz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxBadajoz.setForeground(new Color(255, 255, 255));
		maxBadajoz.setBounds(319, 321, 87, 13);
		panelExtremadura.add(maxBadajoz);

		minBadajoz = new JLabel("min");
		minBadajoz.setForeground(new Color(255, 255, 255));
		minBadajoz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minBadajoz.setBounds(324, 345, 97, 13);
		panelExtremadura.add(minBadajoz);

		fondoExtremadura = new JLabel("");
		fondoExtremadura.setBounds(0, 0, 729, 568);
		panelExtremadura.add(fondoExtremadura);

		label = new JLabel("New label");

		// GALICIA
		panelGalicia = new JPanel();
		panelGalicia.setBounds(0, 0, 729, 568);
		contentPane.add(panelGalicia);
		panelGalicia.setLayout(null);
		panelGalicia.setVisible(false);

		corunia = new JLabel("A_Coruja");
		corunia.setBounds(275, 146, 70, 56);
		panelGalicia.add(corunia);

		pontevedra = new JLabel("Pontevedra");
		pontevedra.setBounds(301, 232, 59, 56);
		panelGalicia.add(pontevedra);

		maxPontevedra = new JLabel("max");
		maxPontevedra.setForeground(new Color(255, 255, 255));
		maxPontevedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxPontevedra.setBounds(319, 193, 113, 13);
		panelGalicia.add(maxPontevedra);

		minPontevedra = new JLabel("min");
		minPontevedra.setForeground(new Color(255, 255, 255));
		minPontevedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minPontevedra.setBounds(319, 212, 84, 13);
		panelGalicia.add(minPontevedra);

		ourense = new JLabel("Ourense");
		ourense.setBounds(422, 232, 59, 56);
		panelGalicia.add(ourense);

		maxOurense = new JLabel("max");
		maxOurense.setForeground(new Color(255, 255, 255));
		maxOurense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxOurense.setBounds(483, 193, 77, 13);
		panelGalicia.add(maxOurense);

		minOurense = new JLabel("min");
		minOurense.setForeground(new Color(255, 255, 255));
		minOurense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minOurense.setBounds(483, 216, 90, 13);
		panelGalicia.add(minOurense);

		lugo = new JLabel("Lugo");
		lugo.setBounds(437, 127, 63, 56);
		panelGalicia.add(lugo);

		maxLugo = new JLabel("max");
		maxLugo.setForeground(new Color(255, 255, 255));
		maxLugo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxLugo.setBounds(438, 80, 77, 13);
		panelGalicia.add(maxLugo);

		minLugo = new JLabel("min");
		minLugo.setForeground(new Color(255, 255, 255));
		minLugo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minLugo.setBounds(438, 104, 77, 13);
		panelGalicia.add(minLugo);

		maxCorunia = new JLabel("max");
		maxCorunia.setForeground(new Color(255, 255, 255));
		maxCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCorunia.setBounds(289, 98, 77, 13);
		panelGalicia.add(maxCorunia);

		minCorunia = new JLabel("min");
		minCorunia.setForeground(new Color(255, 255, 255));
		minCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCorunia.setBounds(289, 121, 90, 13);
		panelGalicia.add(minCorunia);

		lblNewLabel_3 = new JLabel("A Coruña");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(211, 140, 84, 17);
		panelGalicia.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Lugo");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(393, 92, 59, 25);
		panelGalicia.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Ourense");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(408, 183, 84, 32);
		panelGalicia.add(lblNewLabel_5);

		lblPontevedra = new JLabel("Pontevedra");
		lblPontevedra.setForeground(new Color(255, 255, 255));
		lblPontevedra.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPontevedra.setBounds(232, 197, 90, 25);
		panelGalicia.add(lblPontevedra);

		fondoGalicia = new JLabel("");
		fondoGalicia.setBounds(0, 0, 729, 568);
		panelGalicia.add(fondoGalicia);

		panelCastillaLeon = new JPanel();
		panelCastillaLeon.setBounds(0, 0, 729, 568);
		contentPane.add(panelCastillaLeon);
		panelCastillaLeon.setLayout(null);
		panelCastillaLeon.setVisible(false);

		JLabel lblNewLabel_19 = new JLabel("Ávila");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setBounds(272, 408, 45, 13);
		panelCastillaLeon.add(lblNewLabel_19);

		JLabel lblNewLabel_18 = new JLabel("Burgos");
		lblNewLabel_18.setForeground(new Color(255, 255, 255));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_18.setBounds(381, 119, 79, 24);
		panelCastillaLeon.add(lblNewLabel_18);

		leon = new JLabel("Leon");
		leon.setBounds(116, 119, 66, 62);
		panelCastillaLeon.add(leon);

		maxLeon = new JLabel("max");
		maxLeon.setForeground(new Color(255, 255, 255));
		maxLeon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxLeon.setBounds(212, 60, 79, 13);
		panelCastillaLeon.add(maxLeon);

		minLeon = new JLabel("min");
		minLeon.setForeground(new Color(255, 255, 255));
		minLeon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minLeon.setBounds(212, 83, 79, 13);
		panelCastillaLeon.add(minLeon);

		zamora = new JLabel("Zamora");
		zamora.setBounds(162, 242, 66, 62);
		panelCastillaLeon.add(zamora);

		maxZamora = new JLabel("max");
		maxZamora.setForeground(new Color(255, 255, 255));
		maxZamora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxZamora.setBounds(212, 189, 69, 13);
		panelCastillaLeon.add(maxZamora);

		minZamora = new JLabel("min");
		minZamora.setForeground(new Color(255, 255, 255));
		minZamora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minZamora.setBounds(212, 212, 90, 13);
		panelCastillaLeon.add(minZamora);

		salamanca = new JLabel("Salamanca");
		salamanca.setFont(new Font("Tahoma", Font.PLAIN, 10));
		salamanca.setBounds(133, 404, 79, 62);
		panelCastillaLeon.add(salamanca);

		maxSalamanca = new JLabel("max");
		maxSalamanca.setForeground(new Color(255, 255, 255));
		maxSalamanca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxSalamanca.setBounds(236, 363, 90, 13);
		panelCastillaLeon.add(maxSalamanca);

		minSalamanca = new JLabel("min");
		minSalamanca.setForeground(new Color(255, 255, 255));
		minSalamanca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minSalamanca.setBounds(236, 385, 90, 13);
		panelCastillaLeon.add(minSalamanca);

		avila = new JLabel("Avila");
		avila.setBounds(260, 436, 66, 62);
		panelCastillaLeon.add(avila);

		minAvila = new JLabel("min");
		minAvila.setForeground(new Color(255, 255, 255));
		minAvila.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minAvila.setBounds(349, 427, 99, 13);
		panelCastillaLeon.add(minAvila);

		maxAvila = new JLabel("max");
		maxAvila.setForeground(new Color(255, 255, 255));
		maxAvila.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxAvila.setBounds(349, 404, 99, 13);
		panelCastillaLeon.add(maxAvila);

		burgos = new JLabel("Burgos");
		burgos.setBounds(369, 166, 79, 62);
		panelCastillaLeon.add(burgos);

		maxburgos = new JLabel("max");
		maxburgos.setForeground(new Color(255, 255, 255));
		maxburgos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxburgos.setBounds(470, 101, 99, 13);
		panelCastillaLeon.add(maxburgos);

		minBurgos = new JLabel("min");
		minBurgos.setForeground(new Color(255, 255, 255));
		minBurgos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minBurgos.setBounds(470, 129, 99, 13);
		panelCastillaLeon.add(minBurgos);

		soria = new JLabel("Soria");
		soria.setBounds(401, 303, 66, 62);
		panelCastillaLeon.add(soria);

		maxSoria = new JLabel("max");
		maxSoria.setForeground(new Color(255, 255, 255));
		maxSoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxSoria.setBounds(603, 265, 91, 13);
		panelCastillaLeon.add(maxSoria);

		minSoria = new JLabel("min");
		minSoria.setForeground(new Color(255, 255, 255));
		minSoria.setBackground(new Color(255, 255, 255));
		minSoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minSoria.setBounds(603, 294, 66, 13);
		panelCastillaLeon.add(minSoria);

		JLabel lblNewLabel_1 = new JLabel("León");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(106, 85, 54, 24);
		panelCastillaLeon.add(lblNewLabel_1);

		JLabel lblNewLabel_15 = new JLabel("Soria");
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(503, 277, 66, 13);
		panelCastillaLeon.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("Zamora");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setBounds(133, 205, 79, 13);
		panelCastillaLeon.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("Salamanca");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(122, 375, 106, 13);
		panelCastillaLeon.add(lblNewLabel_17);

		fondoCastillaLeon = new JLabel("New label");
		fondoCastillaLeon.setBounds(10, -21, 729, 593);
		panelCastillaLeon.add(fondoCastillaLeon);

		panelPaisVasco = new JPanel();
		panelPaisVasco.setBounds(0, 0, 729, 568);
		contentPane.add(panelPaisVasco);
		panelPaisVasco.setLayout(null);
		panelPaisVasco.setVisible(false);

		JLabel lblNewLabel_8 = new JLabel("Bilbao");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(188, 120, 67, 26);
		panelPaisVasco.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("San Sebastian");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(353, 188, 154, 26);
		panelPaisVasco.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Vitoria");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(261, 357, 99, 26);
		panelPaisVasco.add(lblNewLabel_10);

		// PAIS VASCO
		vitoria = new JLabel("Vitoria-Gasteiz");
		vitoria.setBounds(301, 270, 75, 68);
		panelPaisVasco.add(vitoria);
		paisVasco.add(vitoria);

		maxVitoria = new JLabel("max");
		maxVitoria.setForeground(new Color(255, 255, 255));
		maxVitoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxVitoria.setBounds(341, 357, 84, 13);
		panelPaisVasco.add(maxVitoria);

		bilbao = new JLabel("Bilbao");
		bilbao.setBounds(215, 170, 75, 68);
		paisVasco.add(bilbao);
		panelPaisVasco.add(bilbao);

		minVitoria = new JLabel("min");
		minVitoria.setForeground(new Color(255, 255, 255));
		minVitoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minVitoria.setBounds(341, 370, 84, 13);
		panelPaisVasco.add(minVitoria);

		maxBilbao = new JLabel("max");
		maxBilbao.setForeground(new Color(255, 255, 255));
		maxBilbao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxBilbao.setBounds(276, 105, 84, 13);
		panelPaisVasco.add(maxBilbao);

		minBilbao = new JLabel("min");
		minBilbao.setForeground(new Color(255, 255, 255));
		minBilbao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minBilbao.setBounds(277, 128, 99, 13);
		panelPaisVasco.add(minBilbao);

		sanSebastian = new JLabel("Donostia_San_Sebastian");
		sanSebastian.setBounds(413, 235, 75, 68);
		panelPaisVasco.add(sanSebastian);

		minSansebastian = new JLabel("min");
		minSansebastian.setForeground(new Color(255, 255, 255));
		minSansebastian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minSansebastian.setBounds(502, 213, 99, 13);
		panelPaisVasco.add(minSansebastian);

		maxSansebastian = new JLabel("max");
		maxSansebastian.setForeground(new Color(255, 255, 255));
		maxSansebastian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxSansebastian.setBounds(502, 196, 99, 13);
		panelPaisVasco.add(maxSansebastian);

		lblNewLabelFonoPaisVasco = new JLabel("");
		lblNewLabelFonoPaisVasco.setBounds(0, -10, 729, 568);
		panelPaisVasco.add(lblNewLabelFonoPaisVasco);

		panelCLM = new JPanel();
		panelCLM.setBounds(0, 0, 729, 568);
		contentPane.add(panelCLM);
		panelCLM.setLayout(null);
		panelCLM.setVisible(false);

		minGuadalajara = new JLabel("min");
		minGuadalajara.setForeground(new Color(255, 255, 255));
		minGuadalajara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minGuadalajara.setBounds(523, 133, 97, 13);
		panelCLM.add(minGuadalajara);

		maxGuadalajara = new JLabel("max");
		maxGuadalajara.setForeground(new Color(255, 255, 255));
		maxGuadalajara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxGuadalajara.setBounds(523, 110, 97, 13);
		panelCLM.add(maxGuadalajara);

		guadalajara = new JLabel("Guadalajara");
		guadalajara.setBounds(436, 58, 55, 59);
		panelCLM.add(guadalajara);

		cuenca = new JLabel("Cuenca");
		cuenca.setBounds(436, 262, 55, 59);
		panelCLM.add(cuenca);

		maxCuenca = new JLabel("max");
		maxCuenca.setForeground(new Color(255, 255, 255));
		maxCuenca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCuenca.setBounds(581, 216, 90, 13);
		panelCLM.add(maxCuenca);

		minCuenca = new JLabel("min");
		minCuenca.setForeground(new Color(255, 255, 255));
		minCuenca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCuenca.setBounds(581, 239, 90, 13);
		panelCLM.add(minCuenca);

		toledo = new JLabel("Toledo");
		toledo.setBounds(270, 262, 55, 59);
		panelCLM.add(toledo);

		maxToledo = new JLabel("max");
		maxToledo.setForeground(new Color(255, 255, 255));
		maxToledo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxToledo.setBounds(218, 216, 72, 13);
		panelCLM.add(maxToledo);

		minToledo = new JLabel("min");
		minToledo.setForeground(new Color(255, 255, 255));
		minToledo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minToledo.setBounds(218, 239, 72, 13);
		panelCLM.add(minToledo);

		ciudadReal = new JLabel("Ciudad_Real");
		ciudadReal.setBounds(264, 406, 61, 52);
		panelCLM.add(ciudadReal);

		maxCiudadReal = new JLabel("max");
		maxCiudadReal.setForeground(new Color(255, 255, 255));
		maxCiudadReal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCiudadReal.setBounds(323, 350, 82, 21);
		panelCLM.add(maxCiudadReal);

		minCiudadReal = new JLabel("min");
		minCiudadReal.setForeground(new Color(255, 255, 255));
		minCiudadReal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCiudadReal.setBounds(333, 381, 82, 13);
		panelCLM.add(minCiudadReal);

		albacete = new JLabel("Albacete");
		albacete.setBounds(565, 371, 55, 59);
		panelCLM.add(albacete);

		maxAlbacete = new JLabel("max");
		maxAlbacete.setForeground(new Color(255, 255, 255));
		maxAlbacete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxAlbacete.setBounds(529, 327, 74, 13);
		panelCLM.add(maxAlbacete);

		minAlbacete = new JLabel("min");
		minAlbacete.setForeground(new Color(255, 255, 255));
		minAlbacete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minAlbacete.setBounds(532, 342, 88, 13);
		panelCLM.add(minAlbacete);

		JLabel lblNewLabel_20 = new JLabel("Albacete");
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_20.setBounds(450, 342, 72, 13);
		panelCLM.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Cuenca");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		lblNewLabel_21.setBounds(506, 228, 82, 13);
		panelCLM.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("Guadalajara");
		lblNewLabel_22.setForeground(new Color(255, 255, 255));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_22.setBounds(421, 133, 97, 13);
		panelCLM.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("Toledo");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_23.setForeground(new Color(255, 255, 255));
		lblNewLabel_23.setBounds(140, 239, 72, 13);
		panelCLM.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("Ciudad Real");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_24.setForeground(new Color(255, 255, 255));
		lblNewLabel_24.setBounds(203, 369, 97, 13);
		panelCLM.add(lblNewLabel_24);

		fondoCLM = new JLabel("");
		fondoCLM.setBounds(0, 0, 729, 578);
		panelCLM.add(fondoCLM);

		panelEspania = new JPanel();
		panelEspania.setBounds(0, 0, 729, 568);
		contentPane.add(panelEspania);
		panelEspania.setLayout(null);
		panelEspania.setVisible(false);

		lblNewLabelCastellonDeLaPlana = new JLabel("Castellon_de_la_Plana_Castello_de_la_Plana");
		lblNewLabelCastellonDeLaPlana.setBounds(473, 240, 28, 25);

		labels.add(lblNewLabelCastellonDeLaPlana);
		panelEspania.add(lblNewLabelCastellonDeLaPlana);

		lblNewLabelAlicante = new JLabel("Alicante_Alacant");
		lblNewLabelAlicante.setBounds(451, 325, 28, 23);

		labels.add(lblNewLabelAlicante);
		panelEspania.add(lblNewLabelAlicante);

		lblNewLabelLasPalmas = new JLabel("Palma_de_Mallorca");
		lblNewLabelLasPalmas.setBounds(615, 450, 28, 23);

		labels.add(lblNewLabelLasPalmas);
		panelEspania.add(lblNewLabelLasPalmas);

		lblNewLabelSantaCruzTenerife = new JLabel("Santa_Cruz_de_Tenerife");
		lblNewLabelSantaCruzTenerife.setBounds(494, 455, 28, 23);

		labels.add(lblNewLabelSantaCruzTenerife);
		panelEspania.add(lblNewLabelSantaCruzTenerife);

		lblNewLabelCadiz = new JLabel("Cadiz");
		lblNewLabelCadiz.setBounds(231, 417, 28, 23);

		labels.add(lblNewLabelCadiz);
		panelEspania.add(lblNewLabelCadiz);

		lblNewLabelGranada = new JLabel("Granada");
		lblNewLabelGranada.setBounds(333, 389, 28, 23);

		labels.add(lblNewLabelGranada);
		panelEspania.add(lblNewLabelGranada);

		lblNewLabelAlmeria = new JLabel("Almeria");
		lblNewLabelAlmeria.setBounds(387, 389, 28, 23);

		labels.add(lblNewLabelAlmeria);
		panelEspania.add(lblNewLabelAlmeria);

		lblNewLabelJaen = new JLabel("Jaen");
		lblNewLabelJaen.setBounds(333, 348, 28, 23);

		labels.add(lblNewLabelJaen);
		panelEspania.add(lblNewLabelJaen);

		lblNewLabelCordoba = new JLabel("Cordoba");
		lblNewLabelCordoba.setBounds(280, 343, 30, 23);

		labels.add(lblNewLabelCordoba);
		panelEspania.add(lblNewLabelCordoba);

		lblNewLabelSevilla = new JLabel("Sevilla");
		lblNewLabelSevilla.setBounds(248, 384, 28, 23);

		labels.add(lblNewLabelSevilla);
		panelEspania.add(lblNewLabelSevilla);

		lblNewLabelHuelva = new JLabel("Huelva");
		lblNewLabelHuelva.setBounds(195, 373, 28, 23);

		labels.add(lblNewLabelHuelva);
		panelEspania.add(lblNewLabelHuelva);

		lblNewLabelAlbacete = new JLabel("Albacete");
		lblNewLabelAlbacete.setBounds(387, 310, 28, 23);

		labels.add(lblNewLabelAlbacete);
		panelEspania.add(lblNewLabelAlbacete);

		lblNewLabelGuadalajara = new JLabel("Guadalajara");
		lblNewLabelGuadalajara.setBounds(368, 206, 28, 25);

		labels.add(lblNewLabelGuadalajara);
		panelEspania.add(lblNewLabelGuadalajara);

		lblNewLabelMadrid = new JLabel("Madrid");
		lblNewLabelMadrid.setBounds(318, 215, 30, 23);

		labels.add(lblNewLabelMadrid);
		panelEspania.add(lblNewLabelMadrid);

		lblNewLabelCuenca = new JLabel("Cuenca");
		lblNewLabelCuenca.setBounds(385, 241, 28, 23);

		labels.add(lblNewLabelCuenca);
		panelEspania.add(lblNewLabelCuenca);

		lblNewLabelCiudadReal = new JLabel("Ciudad_Real");
		lblNewLabelCiudadReal.setBounds(318, 298, 28, 23);

		labels.add(lblNewLabelCiudadReal);
		panelEspania.add(lblNewLabelCiudadReal);

		lblNewLabelBadajoz = new JLabel("Badajoz");
		lblNewLabelBadajoz.setBounds(220, 315, 28, 23);

		labels.add(lblNewLabelBadajoz);
		panelEspania.add(lblNewLabelBadajoz);

		lblNewLabelToledo = new JLabel("Toledo");
		lblNewLabelToledo.setBounds(297, 248, 28, 23);

		labels.add(lblNewLabelToledo);
		panelEspania.add(lblNewLabelToledo);

		lblNewLabelCaceres = new JLabel("Caceres");
		lblNewLabelCaceres.setBounds(220, 262, 28, 23);

		labels.add(lblNewLabelCaceres);
		panelEspania.add(lblNewLabelCaceres);

		lblNewLabelTeruel = new JLabel("Teruel");
		lblNewLabelTeruel.setBounds(444, 207, 24, 23);

		labels.add(lblNewLabelTeruel);
		panelEspania.add(lblNewLabelTeruel);

		lblNewLabelTarragona = new JLabel("Tarragona");
		lblNewLabelTarragona.setBounds(511, 201, 28, 24);

		labels.add(lblNewLabelTarragona);
		panelEspania.add(lblNewLabelTarragona);

		lblNewLabelLerida = new JLabel("Lleida");
		lblNewLabelLerida.setBounds(511, 148, 28, 23);

		labels.add(lblNewLabelLerida);
		panelEspania.add(lblNewLabelLerida);

		lblNewLabelBarcelona = new JLabel("Barcelona");
		lblNewLabelBarcelona.setBounds(549, 163, 28, 24);

		labels.add(lblNewLabelBarcelona);
		panelEspania.add(lblNewLabelBarcelona);

		lblNewLabelGerona = new JLabel("Girona");
		lblNewLabelGerona.setBounds(593, 135, 28, 23);

		labels.add(lblNewLabelGerona);
		panelEspania.add(lblNewLabelGerona);

		lblNewLabelZaragoza = new JLabel("Zaragoza");
		lblNewLabelZaragoza.setBounds(419, 169, 28, 23);

		labels.add(lblNewLabelZaragoza);
		panelEspania.add(lblNewLabelZaragoza);

		lblNewLabelSoria = new JLabel("Soria");
		lblNewLabelSoria.setBounds(364, 173, 28, 23);

		labels.add(lblNewLabelSoria);
		panelEspania.add(lblNewLabelSoria);

		lblNewLabelSegovia = new JLabel("Segovia");
		lblNewLabelSegovia.setBounds(318, 182, 28, 23);

		labels.add(lblNewLabelSegovia);
		panelEspania.add(lblNewLabelSegovia);

		lblNewLabelAvila = new JLabel("Avila");
		lblNewLabelAvila.setBounds(282, 207, 28, 20);

		labels.add(lblNewLabelAvila);
		panelEspania.add(lblNewLabelAvila);

		lblNewLabelSalamanca = new JLabel("Salamanca");
		lblNewLabelSalamanca.setBounds(218, 202, 28, 23);

		labels.add(lblNewLabelSalamanca);
		panelEspania.add(lblNewLabelSalamanca);

		lblNewLabelBurgos = new JLabel("Burgos");
		lblNewLabelBurgos.setBounds(320, 133, 28, 25);

		labels.add(lblNewLabelBurgos);
		panelEspania.add(lblNewLabelBurgos);

		lblNewLabelValladolid = new JLabel("Valladolid");
		lblNewLabelValladolid.setBounds(282, 164, 28, 23);

		labels.add(lblNewLabelValladolid);
		panelEspania.add(lblNewLabelValladolid);

		lblNewLabelZamora = new JLabel("Zamora");
		lblNewLabelZamora.setBounds(231, 157, 28, 24);

		labels.add(lblNewLabelZamora);
		panelEspania.add(lblNewLabelZamora);

		lblNewLabelHuesca = new JLabel("Huesca");
		lblNewLabelHuesca.setBounds(477, 134, 24, 24);

		labels.add(lblNewLabelHuesca);
		panelEspania.add(lblNewLabelHuesca);

		lblNewLabelLugo = new JLabel("Lugo");
		lblNewLabelLugo.setBounds(178, 85, 28, 23);

		labels.add(lblNewLabelLugo);
		panelEspania.add(lblNewLabelLugo);

		lblNewLabelLeon = new JLabel("Leon");
		lblNewLabelLeon.setBounds(231, 110, 28, 23);

		labels.add(lblNewLabelLeon);
		panelEspania.add(lblNewLabelLeon);

		lblNewLabelLaCorunia = new JLabel("A_Coruja");
		lblNewLabelLaCorunia.setBounds(125, 73, 28, 23);

		labels.add(lblNewLabelLaCorunia);
		panelEspania.add(lblNewLabelLaCorunia);

		lblNewLabelBaleares = new JLabel("Las_Palmas_de_Gran_Canaria");
		lblNewLabelBaleares.setBounds(584, 267, 28, 23);

		labels.add(lblNewLabelBaleares);
		panelEspania.add(lblNewLabelBaleares);

		lblNewLabelOrense = new JLabel("Ourense");
		lblNewLabelOrense.setBounds(168, 135, 28, 23);

		labels.add(lblNewLabelOrense);
		panelEspania.add(lblNewLabelOrense);

		lblNewLabelValencia = new JLabel("Valencia");
		lblNewLabelValencia.setBounds(444, 280, 24, 23);

		labels.add(lblNewLabelValencia);
		panelEspania.add(lblNewLabelValencia);

		lblNewLabeGuipuzcua = new JLabel("Pamplona_Iruna");
		lblNewLabeGuipuzcua.setBounds(368, 84, 28, 24);

		labels.add(lblNewLabeGuipuzcua);
		panelEspania.add(lblNewLabeGuipuzcua);

		lblNewLabelViscaya = new JLabel("Vitoria-Gasteiz");
		lblNewLabelViscaya.setBounds(399, 109, 28, 24);

		labels.add(lblNewLabelViscaya);
		panelEspania.add(lblNewLabelViscaya);

		lblNewLabelMurcia = new JLabel("Murcia");
		lblNewLabelMurcia.setBounds(419, 348, 28, 23);

		labels.add(lblNewLabelMurcia);
		panelEspania.add(lblNewLabelMurcia);

		lblNewLabelPalencia = new JLabel("Palencia");
		lblNewLabelPalencia.setBounds(280, 126, 28, 23);

		labels.add(lblNewLabelPalencia);
		panelEspania.add(lblNewLabelPalencia);

		lblNewLabelPntevedra = new JLabel("Pontevedra");
		lblNewLabelPntevedra.setBounds(123, 130, 30, 23);

		labels.add(lblNewLabelPntevedra);
		panelEspania.add(lblNewLabelPntevedra);

		lblNewLabelCantabria = new JLabel("Santander");
		lblNewLabelCantabria.setBounds(320, 85, 28, 23);

		labels.add(lblNewLabelCantabria);
		panelEspania.add(lblNewLabelCantabria);

		lblNewLabelLaRioja = new JLabel("Logrono");
		lblNewLabelLaRioja.setBounds(368, 133, 28, 23);

		labels.add(lblNewLabelLaRioja);
		panelEspania.add(lblNewLabelLaRioja);

		lblNewLabelOviedo = new JLabel("Oviedo");
		lblNewLabelOviedo.setBounds(231, 73, 24, 22);

		labels.add(lblNewLabelOviedo);
		panelEspania.add(lblNewLabelOviedo);

		lblNewLabelMalaga = new JLabel("Malaga");
		lblNewLabelMalaga.setBounds(286, 417, 28, 23);

		labels.add(lblNewLabelMalaga);
		panelEspania.add(lblNewLabelMalaga);

		lblNewLabelFondoMapaEspania = new JLabel("");
		lblNewLabelFondoMapaEspania.setBackground(Color.WHITE);
		lblNewLabelFondoMapaEspania.setBounds(20, 10, 709, 515);
		panelEspania.add(lblNewLabelFondoMapaEspania);

		panelInicio = new JPanel();
		panelInicio.setLayout(null);
		panelInicio.setBounds(0, 0, 729, 688);
		contentPane.add(panelInicio);

		irAlMapa = new JButton("Iniciar");
		irAlMapa.setForeground(new Color(0, 0, 0));
		irAlMapa.setFont(new Font("Tahoma", Font.BOLD, 16));
		irAlMapa.setBounds(269, 328, 117, 48);
		panelInicio.add(irAlMapa);

		fondoInicio = new JLabel();
		fondoInicio.setBounds(0, 10, 729, 679);
		panelInicio.add(fondoInicio);

		panelControles = new JPanel();
		panelControles.setBounds(0, 610, 729, 78);
		contentPane.add(panelControles);
		panelControles.setLayout(null);
		panelControles.setVisible(false);

		lblNewLabel = new JLabel("Comunidades: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(406, 22, 119, 24);
		panelControles.add(lblNewLabel);

		comboBoxComunidades = new JComboBox();
		comboBoxComunidades.setBackground(new Color(255, 255, 255));
		comboBoxComunidades.setForeground(new Color(0, 0, 0));
		comboBoxComunidades.setBounds(522, 22, 197, 21);
		panelControles.add(comboBoxComunidades);

		comboBoxDia = new JComboBox();
		comboBoxDia.setBackground(new Color(255, 255, 255));
		comboBoxDia.setForeground(new Color(0, 0, 0));
		comboBoxDia.setBounds(258, 26, 98, 21);
		panelControles.add(comboBoxDia);

		// IMAGENES ADAPTADAS

		cargarImagenes();
		cargarLabels();

	}

	public List<JLabel> getAragon() {
		return aragon;
	}

	public JPanel getPanelAragon() {
		return panelAragon;
	}

	public List<JLabel> getAndaluci() {
		return andaluci;
	}

	public JPanel getPanelAndalucia() {
		return panelAndalucia;
	}

	public List<JLabel> getCastillaLeon() {
		return castillaLeon;
	}

	public JPanel getPanelCastillaLeon() {
		return panelCastillaLeon;
	}

	public List<JLabel> getCastilla_LM() {
		return castilla_LM;
	}

	public List<JLabel> getAsturias() {
		return asturias;
	}

	public JPanel getPanelAsturias() {
		return panelAsturias;
	}

	public JComboBox getComboBoxComunidades() {
		return comboBoxComunidades;
	}

	public JComboBox getComboBoxDia() {
		return comboBoxDia;
	}

	public JPanel getPanelGalicia() {
		return panelGalicia;
	}

	public JPanel getPanelPaisVasco() {
		return panelPaisVasco;
	}

	public List<JLabel> getCatalunia() {
		return catalunia;
	}

	public JPanel getPanelCatalunia() {
		return panelCatalunia;
	}

	public JLabel getCorunia() {
		return corunia;
	}

	public JButton getIrAlMapa() {
		return irAlMapa;
	}

	public JPanel getPanelInicio() {
		return panelInicio;
	}

	public List<JLabel> getLabels() {
		return labels;
	}

	public JLabel getLblNewLabelFondoMapas() {
		return lblNewLabelFondoMapaEspania;
	}

	public List<JLabel> getExtremadura() {
		return extremadura;
	}

	public JPanel getPanelExtremadura() {
		return panelExtremadura;
	}

	public JPanel getPanelCLM() {
		return panelCLM;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelControles() {
		return panelControles;
	}

	public JPanel getPanelEspania() {
		return panelEspania;
	}

	public List<JLabel> getGalicia() {
		return galicia;
	}

	public List<JLabel> getPaisVasco() {
		return paisVasco;
	}

	public void mostrarPanel(Container contenedor, JPanel panelVisibilizar) {
		Component[] components = contenedor.getComponents();

		for (Component component : components) {
			if (component instanceof JPanel) {
				JPanel panel = (JPanel) component;
				if (!panel.equals(panelVisibilizar) && !panel.equals(getPanelControles())) {
					panel.setVisible(false);
				} else if (panel.equals(panelVisibilizar)) {
					panel.setVisible(true);
				}
			}
		}
	}

	public void cargarLabels() {

		catalunia.add(barcelona);
		catalunia.add(minBarcelona);
		catalunia.add(maxBarcelona);
		catalunia.add(tarragona);
		catalunia.add(minTarragona);
		catalunia.add(maxTarragona);
		catalunia.add(lleida);
		catalunia.add(minLleida);
		catalunia.add(maxLleida);
		catalunia.add(girona);
		catalunia.add(minGirona);
		catalunia.add(maxGirona);

		asturias.add(gijon);
		asturias.add(minGijon);
		asturias.add(maxGijon);
		asturias.add(aviles);
		asturias.add(minAviles);
		asturias.add(maxAviles);
		asturias.add(oviedo);
		asturias.add(minOviedo);
		asturias.add(maxOviedo);

		aragon.add(huesca);
		aragon.add(minHuesca);
		aragon.add(maxHuesca);
		aragon.add(zaragoza);
		aragon.add(maxZaragoza);
		aragon.add(maxZaragoza);
		aragon.add(teruel);
		aragon.add(minTeruel);
		aragon.add(maxTeruel);

		extremadura.add(plasencia);
		extremadura.add(minPlasencia);
		extremadura.add(maxPlasencia);
		extremadura.add(caceres);
		extremadura.add(minCaceres);
		extremadura.add(maxCaceres);
		extremadura.add(merida);
		extremadura.add(minMerida);
		extremadura.add(maxMerida);
		extremadura.add(badajoz);
		extremadura.add(maxBadajoz);
		extremadura.add(maxBadajoz);

		castillaLeon.add(soria);
		castillaLeon.add(minSoria);
		castillaLeon.add(maxSoria);
		castillaLeon.add(leon);
		castillaLeon.add(minLeon);
		castillaLeon.add(maxLeon);
		castillaLeon.add(avila);
		castillaLeon.add(minAvila);
		castillaLeon.add(maxAvila);
		castillaLeon.add(burgos);
		castillaLeon.add(minBurgos);
		castillaLeon.add(maxburgos);
		castillaLeon.add(zamora);
		castillaLeon.add(minZamora);
		castillaLeon.add(maxZamora);
		castillaLeon.add(salamanca);

		castilla_LM.add(guadalajara);
		castilla_LM.add(minGuadalajara);
		castilla_LM.add(maxGuadalajara);
		castilla_LM.add(cuenca);
		castilla_LM.add(minCuenca);
		castilla_LM.add(maxCuenca);
		castilla_LM.add(ciudadReal);
		castilla_LM.add(minCiudadReal);
		castilla_LM.add(maxCiudadReal);
		castilla_LM.add(albacete);
		castilla_LM.add(minAlbacete);
		castilla_LM.add(maxAlbacete);
		castilla_LM.add(toledo);
		castilla_LM.add(minToledo);
		castilla_LM.add(maxToledo);

		paisVasco.add(vitoria);
		paisVasco.add(minVitoria);
		paisVasco.add(maxVitoria);
		paisVasco.add(bilbao);
		paisVasco.add(minBilbao);
		paisVasco.add(maxBilbao);
		paisVasco.add(sanSebastian);
		paisVasco.add(minSansebastian);
		paisVasco.add(maxSansebastian);

		andaluci.add(huelva);
		andaluci.add(minHuelva);
		andaluci.add(maxHuelva);
		andaluci.add(cadiz);
		andaluci.add(minCadiz);
		andaluci.add(maxCadiz);
		andaluci.add(cordoba);
		andaluci.add(minCordoba);
		andaluci.add(maxCordoba);
		andaluci.add(jaen);
		andaluci.add(minJaen);
		andaluci.add(maxJaen);
		andaluci.add(granada);
		andaluci.add(minGranda);
		andaluci.add(maxGranada);
		andaluci.add(cadiz);
		andaluci.add(minCadiz);
		andaluci.add(maxCadiz);
		andaluci.add(almeria);
		andaluci.add(sevilla);

		// GALICIA
		galicia.add(ourense);
		galicia.add(minOurense);
		galicia.add(maxOurense);
		galicia.add(corunia);
		galicia.add(minCorunia);
		galicia.add(maxCorunia);
		galicia.add(lugo);
		galicia.add(minLugo);
		galicia.add(maxLugo);
		galicia.add(pontevedra);
		galicia.add(minPontevedra);
		galicia.add(maxPontevedra);

	}

	public void cargarImagenes() {

		// IMAGENES RUTAS
		ImageIcon catalunia_img = new ImageIcon(getClass().getResource("/imagenes/catalunia.png").getPath());
		ImageIcon asturias_img = new ImageIcon(getClass().getResource("/imagenes/asturias.png").getPath());
		ImageIcon aragon_img = new ImageIcon(getClass().getResource("/imagenes/aragon.png").getPath());
		ImageIcon extremadura = new ImageIcon(getClass().getResource("/imagenes/extremadura.png").getPath());
		ImageIcon andalucia = new ImageIcon(getClass().getResource("/imagenes/andalucia.png").getPath());
		ImageIcon castilla_leon = new ImageIcon(getClass().getResource("/imagenes/castilla_leon.png").getPath());
		ImageIcon inicio_img = new ImageIcon(getClass().getResource("/imagenes/fondo_inicio.jpg").getPath());
		ImageIcon galicia_img = new ImageIcon(getClass().getResource("/imagenes/galicia.png").getPath());
		ImageIcon clm = new ImageIcon(getClass().getResource("/imagenes/castilla_la_mancha.png").getPath());
		ImageIcon espania_img = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		ImageIcon pais_vasco_img = new ImageIcon(getClass().getResource("/imagenes/pais_vasco.png").getPath());

		image = catalunia_img.getImage().getScaledInstance(fondoCatalunia.getWidth(), fondoCatalunia.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCatalunia.setIcon(r);

		image = asturias_img.getImage().getScaledInstance(fondoAsturias.getWidth(), fondoAsturias.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoAsturias.setIcon(r);

		image = aragon_img.getImage().getScaledInstance(fondoAragon.getWidth(), fondoAragon.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoAragon.setIcon(r);

		image = extremadura.getImage().getScaledInstance(fondoExtremadura.getWidth(), fondoExtremadura.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoExtremadura.setIcon(r);

		image = inicio_img.getImage().getScaledInstance(fondoInicio.getWidth(), fondoInicio.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoInicio.setIcon(r);

		image = andalucia.getImage().getScaledInstance(fondoAndalucia.getWidth(), fondoAndalucia.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoAndalucia.setIcon(r);

		image = castilla_leon.getImage().getScaledInstance(fondoCastillaLeon.getWidth(), fondoCastillaLeon.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCastillaLeon.setIcon(r);

		image = galicia_img.getImage().getScaledInstance(fondoGalicia.getWidth(), fondoGalicia.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoGalicia.setIcon(r);

		image = clm.getImage().getScaledInstance(fondoCLM.getWidth(), fondoCLM.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCLM.setIcon(r);

		image = pais_vasco_img.getImage().getScaledInstance(lblNewLabelFonoPaisVasco.getWidth(),
				lblNewLabelFonoPaisVasco.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		lblNewLabelFonoPaisVasco.setIcon(r);

		image = espania_img.getImage().getScaledInstance(lblNewLabelFondoMapaEspania.getWidth(),
				lblNewLabelFondoMapaEspania.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		lblNewLabelFondoMapaEspania.setIcon(r);
	}

	// RECARGA DE TEXTOS ORIGINALES
	public static void guardarTextosOriginales(List<JLabel> listaDeLabels) {
		for (JLabel label : listaDeLabels) {
			System.out.println("Guardando textos...");
			textosOriginales.put(label, label.getText());
		}
	}

	
	public static void restaurarTextosOriginales(List<JLabel> listaDeLabels) {
		for (JLabel label : listaDeLabels) {
			if (textosOriginales.containsKey(label)) {
				System.out.println("Restaurando textos....");
				label.setText(textosOriginales.get(label));
			}
		}
	}
}