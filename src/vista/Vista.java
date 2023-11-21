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
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Map<JLabel, String> textosOriginales = new HashMap<>();
	private JPanel contentPane;
	private JPanel panelEspania;
	private JLabel lblNewLabelFondoMapaEspania;
	private Image image;
	private ImageIcon r;
	private List<JLabel> rioja;
	private List<JLabel> melillaList;
	private List<JLabel> ceuta;
	private List<JLabel> cantabria;
	private List<JLabel> madridList;
	private List<JLabel> navarra;
	private List<JLabel> murciaList;
	private List<JLabel> canarias;
	private List<JLabel> baleares;
	public List<JLabel> valencia;
	public List<JLabel> catalunia;
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
	private JLabel minZaragoza;
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
	private JPanel panelValencia;
	private JLabel fondoValencia;
	private JLabel minAlicante;
	private JLabel alicante;
	private JLabel maxAlicante;
	private JLabel maxValencia;
	private JLabel minValencia;
	private JLabel minCastellon;
	private JLabel maxCastellon;
	private JLabel castellon;
	private JLabel valen;
	private JPanel panelIslasBaleares;
	private JLabel mayorca;
	private JLabel lblNewLabel_39;
	private JLabel maxMayorca;
	private JLabel minMayorca;
	private JLabel fondoBaleares;
	private JPanel panelCanarias;
	private JLabel minTenerife;
	private JLabel fondoCanarias;
	private JLabel granCanarias;
	private JLabel santaCruz;
	private JLabel maxCanarias;
	private JLabel minCanarias;
	private JLabel maxTenerife;
	private JPanel panelMurcia;
	private JLabel murcia;
	private JLabel maxMurcia;
	private JLabel minMurcia;
	private JLabel fondoMurcia;
	private JLabel lblNewLabel_41;
	private JPanel panelNavarra;
	private JLabel pamplonaIrunia;
	private JLabel maxPamplona;
	private JLabel minPamplona;
	private JLabel lblNewLabel_42;
	private JLabel fondoNavarra;
	private JPanel panelMadrid;
	private JLabel madrid;
	private JLabel maxMadrid;
	private JLabel minMadrid;
	private JLabel lblNewLabel_44;
	private JLabel fondoMadrid;
	private JPanel panelMelilla;
	private JLabel lblNewLabel_45;
	private JLabel melilla;
	private JLabel maxMelilla;
	private JPanel panelCantabria;
	private JLabel santander;
	private JLabel maxSantander;
	private JLabel minSantander;
	private JLabel lblNewLabel_46;
	private JLabel fondoCantabria;
	private JPanel panelRioja;
	private JLabel logronio;
	private JLabel maxLogronio;
	private JLabel minLogronio;
	private JLabel fondoLogronio;
	private JPanel panelCeuta;
	private JLabel lblNewLabel_48;
	private JLabel minCeuta;
	private JLabel maxCeuta;
	private JLabel ceutalabel;
	private JLabel fondoCeuta;
	private JLabel melillaLabel;
	private JLabel maxMelillalabel;
	private JLabel minMelillaLabel;
	private JLabel lblNewLabel_52;
	private JLabel fondoMelilla;
	private JLabel malaga;
	private JLabel lblNewLabelCeuta;

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

		melillaList = new ArrayList<JLabel>();
		ceuta = new ArrayList<>();
		rioja = new ArrayList<>();
		cantabria = new ArrayList<>();
		madridList = new ArrayList<JLabel>();
		navarra = new ArrayList<>();
		murciaList = new ArrayList<>();
		canarias = new ArrayList<>();
		baleares = new ArrayList<>();
		valencia = new ArrayList<JLabel>();
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

		panelEspania = new JPanel();
		panelEspania.setBounds(0, 0, 729, 568);
		contentPane.add(panelEspania);
		panelEspania.setLayout(null);
		panelEspania.setVisible(false);

		lblNewLabelCeuta = new JLabel("Ceuta");
		lblNewLabelCeuta.setBounds(242, 480, 28, 25);
		labels.add(lblNewLabelCeuta);
		panelEspania.add(lblNewLabelCeuta);

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
		lblNewLabelCadiz.setBounds(231, 417, 28, 25);

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
		lblNewLabel_9.setBounds(356, 128, 154, 26);
		panelPaisVasco.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Vitoria");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(231, 296, 99, 26);
		panelPaisVasco.add(lblNewLabel_10);

		// PAIS VASCO
		vitoria = new JLabel("Vitoria-Gasteiz");
		vitoria.setBounds(284, 369, 75, 68);
		panelPaisVasco.add(vitoria);
		paisVasco.add(vitoria);

		maxVitoria = new JLabel("max");
		maxVitoria.setHorizontalAlignment(SwingConstants.CENTER);
		maxVitoria.setForeground(new Color(255, 0, 0));
		maxVitoria.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxVitoria.setBounds(317, 284, 67, 20);
		panelPaisVasco.add(maxVitoria);

		bilbao = new JLabel("Bilbao");
		bilbao.setBounds(215, 170, 75, 68);
		paisVasco.add(bilbao);
		panelPaisVasco.add(bilbao);

		minVitoria = new JLabel("min");
		minVitoria.setHorizontalAlignment(SwingConstants.CENTER);
		minVitoria.setForeground(new Color(0, 128, 255));
		minVitoria.setFont(new Font("Tahoma", Font.BOLD, 10));
		minVitoria.setBounds(317, 312, 67, 20);
		panelPaisVasco.add(minVitoria);

		maxBilbao = new JLabel("max");
		maxBilbao.setHorizontalAlignment(SwingConstants.CENTER);
		maxBilbao.setForeground(new Color(255, 0, 0));
		maxBilbao.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxBilbao.setBounds(249, 105, 67, 20);
		panelPaisVasco.add(maxBilbao);

		minBilbao = new JLabel("min");
		minBilbao.setHorizontalAlignment(SwingConstants.CENTER);
		minBilbao.setForeground(new Color(0, 128, 255));
		minBilbao.setFont(new Font("Tahoma", Font.BOLD, 10));
		minBilbao.setBounds(249, 126, 67, 20);
		panelPaisVasco.add(minBilbao);

		sanSebastian = new JLabel("Donostia_San_Sebastian");
		sanSebastian.setBounds(396, 217, 75, 68);
		panelPaisVasco.add(sanSebastian);

		minSansebastian = new JLabel("min");
		minSansebastian.setHorizontalAlignment(SwingConstants.CENTER);
		minSansebastian.setForeground(new Color(0, 128, 255));
		minSansebastian.setFont(new Font("Tahoma", Font.BOLD, 10));
		minSansebastian.setBounds(502, 126, 67, 20);
		panelPaisVasco.add(minSansebastian);

		maxSansebastian = new JLabel("max");
		maxSansebastian.setHorizontalAlignment(SwingConstants.CENTER);
		maxSansebastian.setForeground(new Color(255, 0, 0));
		maxSansebastian.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxSansebastian.setBounds(502, 105, 67, 20);
		panelPaisVasco.add(maxSansebastian);

		lblNewLabelFonoPaisVasco = new JLabel("");
		lblNewLabelFonoPaisVasco.setBounds(0, 0, 729, 568);
		panelPaisVasco.add(lblNewLabelFonoPaisVasco);

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
		maxLeon.setHorizontalAlignment(SwingConstants.CENTER);
		maxLeon.setForeground(new Color(255, 0, 0));
		maxLeon.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxLeon.setBounds(212, 49, 66, 24);
		panelCastillaLeon.add(maxLeon);

		minLeon = new JLabel("min");
		minLeon.setHorizontalAlignment(SwingConstants.CENTER);
		minLeon.setForeground(new Color(0, 128, 255));
		minLeon.setFont(new Font("Tahoma", Font.BOLD, 10));
		minLeon.setBounds(212, 83, 66, 24);
		panelCastillaLeon.add(minLeon);

		zamora = new JLabel("Zamora");
		zamora.setBounds(162, 242, 66, 62);
		panelCastillaLeon.add(zamora);

		maxZamora = new JLabel("max");
		maxZamora.setHorizontalAlignment(SwingConstants.CENTER);
		maxZamora.setForeground(new Color(255, 0, 0));
		maxZamora.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxZamora.setBounds(212, 178, 66, 24);
		panelCastillaLeon.add(maxZamora);

		minZamora = new JLabel("min");
		minZamora.setHorizontalAlignment(SwingConstants.CENTER);
		minZamora.setForeground(new Color(0, 128, 255));
		minZamora.setFont(new Font("Tahoma", Font.BOLD, 10));
		minZamora.setBounds(212, 212, 66, 24);
		panelCastillaLeon.add(minZamora);

		salamanca = new JLabel("Salamanca");
		salamanca.setFont(new Font("Tahoma", Font.PLAIN, 10));
		salamanca.setBounds(133, 404, 79, 62);
		panelCastillaLeon.add(salamanca);

		maxSalamanca = new JLabel("max");
		maxSalamanca.setHorizontalAlignment(SwingConstants.CENTER);
		maxSalamanca.setForeground(new Color(255, 0, 0));
		maxSalamanca.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxSalamanca.setBounds(236, 344, 66, 24);
		panelCastillaLeon.add(maxSalamanca);

		minSalamanca = new JLabel("min");
		minSalamanca.setHorizontalAlignment(SwingConstants.CENTER);
		minSalamanca.setForeground(new Color(0, 128, 255));
		minSalamanca.setFont(new Font("Tahoma", Font.BOLD, 10));
		minSalamanca.setBounds(236, 374, 66, 24);
		panelCastillaLeon.add(minSalamanca);

		avila = new JLabel("Avila");
		avila.setBounds(260, 436, 66, 62);
		panelCastillaLeon.add(avila);

		minAvila = new JLabel("min");
		minAvila.setHorizontalAlignment(SwingConstants.CENTER);
		minAvila.setForeground(new Color(0, 128, 255));
		minAvila.setFont(new Font("Tahoma", Font.BOLD, 10));
		minAvila.setBounds(349, 427, 66, 24);
		panelCastillaLeon.add(minAvila);

		maxAvila = new JLabel("max");
		maxAvila.setHorizontalAlignment(SwingConstants.CENTER);
		maxAvila.setForeground(new Color(255, 0, 0));
		maxAvila.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxAvila.setBounds(349, 393, 66, 24);
		panelCastillaLeon.add(maxAvila);

		burgos = new JLabel("Burgos");
		burgos.setBounds(369, 166, 79, 62);
		panelCastillaLeon.add(burgos);

		maxburgos = new JLabel("max");
		maxburgos.setHorizontalAlignment(SwingConstants.CENTER);
		maxburgos.setForeground(new Color(255, 0, 0));
		maxburgos.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxburgos.setBounds(470, 90, 66, 24);
		panelCastillaLeon.add(maxburgos);

		minBurgos = new JLabel("min");
		minBurgos.setHorizontalAlignment(SwingConstants.CENTER);
		minBurgos.setForeground(new Color(0, 128, 255));
		minBurgos.setFont(new Font("Tahoma", Font.BOLD, 10));
		minBurgos.setBounds(470, 129, 66, 24);
		panelCastillaLeon.add(minBurgos);

		soria = new JLabel("Soria");
		soria.setBounds(401, 303, 66, 62);
		panelCastillaLeon.add(soria);

		maxSoria = new JLabel("max");
		maxSoria.setHorizontalAlignment(SwingConstants.CENTER);
		maxSoria.setForeground(new Color(255, 0, 0));
		maxSoria.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxSoria.setBounds(603, 254, 66, 24);
		panelCastillaLeon.add(maxSoria);

		minSoria = new JLabel("min");
		minSoria.setHorizontalAlignment(SwingConstants.CENTER);
		minSoria.setForeground(new Color(0, 128, 255));
		minSoria.setBackground(new Color(255, 255, 255));
		minSoria.setFont(new Font("Tahoma", Font.BOLD, 10));
		minSoria.setBounds(603, 294, 66, 24);
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

		// GALICIA
		panelGalicia = new JPanel();
		panelGalicia.setBounds(0, 0, 729, 568);
		contentPane.add(panelGalicia);
		panelGalicia.setLayout(null);
		panelGalicia.setVisible(false);

		corunia = new JLabel("A_Coruja");
		corunia.setBounds(266, 127, 70, 56);
		panelGalicia.add(corunia);

		pontevedra = new JLabel("Pontevedra");
		pontevedra.setBounds(301, 232, 59, 56);
		panelGalicia.add(pontevedra);

		maxPontevedra = new JLabel("max");
		maxPontevedra.setHorizontalAlignment(SwingConstants.CENTER);
		maxPontevedra.setForeground(new Color(255, 0, 0));
		maxPontevedra.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxPontevedra.setBounds(78, 209, 70, 19);
		panelGalicia.add(maxPontevedra);

		minPontevedra = new JLabel("min");
		minPontevedra.setHorizontalAlignment(SwingConstants.CENTER);
		minPontevedra.setForeground(new Color(0, 128, 255));
		minPontevedra.setFont(new Font("Tahoma", Font.BOLD, 10));
		minPontevedra.setBounds(78, 238, 70, 19);
		panelGalicia.add(minPontevedra);

		ourense = new JLabel("Ourense");
		ourense.setBounds(422, 232, 59, 56);
		panelGalicia.add(ourense);

		maxOurense = new JLabel("max");
		maxOurense.setBackground(new Color(255, 255, 255));
		maxOurense.setHorizontalAlignment(SwingConstants.CENTER);
		maxOurense.setForeground(new Color(255, 0, 0));
		maxOurense.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxOurense.setBounds(483, 157, 70, 23);
		panelGalicia.add(maxOurense);

		minOurense = new JLabel("min");
		minOurense.setHorizontalAlignment(SwingConstants.CENTER);
		minOurense.setForeground(new Color(0, 128, 255));
		minOurense.setFont(new Font("Tahoma", Font.BOLD, 10));
		minOurense.setBounds(483, 190, 70, 23);
		panelGalicia.add(minOurense);

		lugo = new JLabel("Lugo");
		lugo.setBounds(400, 77, 63, 56);
		panelGalicia.add(lugo);

		maxLugo = new JLabel("max");
		maxLugo.setHorizontalAlignment(SwingConstants.CENTER);
		maxLugo.setForeground(new Color(255, 0, 0));
		maxLugo.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxLugo.setBounds(437, 26, 70, 19);
		panelGalicia.add(maxLugo);

		minLugo = new JLabel("min");
		minLugo.setHorizontalAlignment(SwingConstants.CENTER);
		minLugo.setForeground(new Color(0, 128, 255));
		minLugo.setFont(new Font("Tahoma", Font.BOLD, 10));
		minLugo.setBounds(437, 45, 70, 19);
		panelGalicia.add(minLugo);

		maxCorunia = new JLabel("max");
		maxCorunia.setHorizontalAlignment(SwingConstants.CENTER);
		maxCorunia.setForeground(new Color(255, 0, 0));
		maxCorunia.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCorunia.setBounds(102, 77, 70, 19);
		panelGalicia.add(maxCorunia);

		minCorunia = new JLabel("min");
		minCorunia.setHorizontalAlignment(SwingConstants.CENTER);
		minCorunia.setForeground(new Color(0, 128, 255));
		minCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCorunia.setBounds(102, 101, 70, 19);
		panelGalicia.add(minCorunia);

		lblNewLabel_3 = new JLabel("A Coruña");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(196, 102, 84, 17);
		panelGalicia.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Lugo");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(390, 42, 59, 25);
		panelGalicia.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Ourense");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(390, 183, 84, 32);
		panelGalicia.add(lblNewLabel_5);

		lblPontevedra = new JLabel("Pontevedra");
		lblPontevedra.setForeground(new Color(255, 255, 255));
		lblPontevedra.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPontevedra.setBounds(161, 212, 90, 25);
		panelGalicia.add(lblPontevedra);

		fondoGalicia = new JLabel("");
		fondoGalicia.setBounds(0, 0, 729, 568);
		panelGalicia.add(fondoGalicia);

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
		maxPlasencia.setHorizontalAlignment(SwingConstants.CENTER);
		maxPlasencia.setForeground(new Color(255, 0, 0));
		maxPlasencia.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxPlasencia.setBounds(383, 41, 70, 22);
		panelExtremadura.add(maxPlasencia);

		minPlasencia = new JLabel("min");
		minPlasencia.setHorizontalAlignment(SwingConstants.CENTER);
		minPlasencia.setForeground(new Color(0, 128, 255));
		minPlasencia.setFont(new Font("Tahoma", Font.BOLD, 10));
		minPlasencia.setBounds(383, 79, 70, 22);
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
		maxCaceres.setHorizontalAlignment(SwingConstants.CENTER);
		maxCaceres.setForeground(new Color(255, 0, 0));
		maxCaceres.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCaceres.setBounds(319, 158, 70, 22);
		panelExtremadura.add(maxCaceres);

		minCaceres = new JLabel("min");
		minCaceres.setHorizontalAlignment(SwingConstants.CENTER);
		minCaceres.setForeground(new Color(0, 128, 255));
		minCaceres.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCaceres.setBounds(319, 193, 70, 21);
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
		maxMerida.setHorizontalAlignment(SwingConstants.CENTER);
		maxMerida.setForeground(new Color(255, 0, 0));
		maxMerida.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxMerida.setBounds(459, 211, 70, 22);
		panelExtremadura.add(maxMerida);

		minMerida = new JLabel("min");
		minMerida.setHorizontalAlignment(SwingConstants.CENTER);
		minMerida.setForeground(new Color(0, 128, 255));
		minMerida.setFont(new Font("Tahoma", Font.BOLD, 10));
		minMerida.setBounds(463, 243, 70, 22);
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
		maxBadajoz.setBackground(new Color(255, 255, 255));
		maxBadajoz.setHorizontalAlignment(SwingConstants.CENTER);
		maxBadajoz.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxBadajoz.setForeground(new Color(255, 0, 0));
		maxBadajoz.setBounds(319, 312, 70, 22);
		panelExtremadura.add(maxBadajoz);

		minBadajoz = new JLabel("min");
		minBadajoz.setHorizontalAlignment(SwingConstants.CENTER);
		minBadajoz.setBackground(new Color(255, 255, 255));
		minBadajoz.setForeground(new Color(0, 128, 255));
		minBadajoz.setFont(new Font("Tahoma", Font.BOLD, 10));
		minBadajoz.setBounds(324, 345, 70, 22);
		panelExtremadura.add(minBadajoz);

		fondoExtremadura = new JLabel("");
		fondoExtremadura.setBounds(0, 0, 729, 568);
		panelExtremadura.add(fondoExtremadura);

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
		maxZaragoza.setHorizontalAlignment(SwingConstants.CENTER);
		maxZaragoza.setForeground(new Color(255, 0, 0));
		maxZaragoza.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxZaragoza.setBounds(240, 217, 68, 23);
		panelAragon.add(maxZaragoza);

		minZaragoza = new JLabel("min");
		minZaragoza.setHorizontalAlignment(SwingConstants.CENTER);
		minZaragoza.setForeground(new Color(0, 128, 255));
		minZaragoza.setFont(new Font("Tahoma", Font.BOLD, 10));
		minZaragoza.setBounds(240, 250, 68, 23);
		panelAragon.add(minZaragoza);

		zaragoza = new JLabel("Zaragoza");
		zaragoza.setBounds(187, 290, 68, 58);
		panelAragon.add(zaragoza);

		lblNewLabel_30 = new JLabel("Teruel");
		lblNewLabel_30.setForeground(new Color(255, 255, 255));
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_30.setBounds(282, 358, 68, 13);
		panelAragon.add(lblNewLabel_30);

		minTeruel = new JLabel("min");
		minTeruel.setHorizontalAlignment(SwingConstants.CENTER);
		minTeruel.setForeground(new Color(0, 128, 255));
		minTeruel.setFont(new Font("Tahoma", Font.BOLD, 10));
		minTeruel.setBounds(348, 358, 68, 23);
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
		maxHuesca.setHorizontalAlignment(SwingConstants.CENTER);
		maxHuesca.setForeground(new Color(255, 0, 0));
		maxHuesca.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxHuesca.setBounds(404, 72, 68, 23);
		panelAragon.add(maxHuesca);

		maxTeruel = new JLabel("max");
		maxTeruel.setHorizontalAlignment(SwingConstants.CENTER);
		maxTeruel.setForeground(new Color(255, 0, 0));
		maxTeruel.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxTeruel.setBounds(348, 325, 68, 23);
		panelAragon.add(maxTeruel);

		minHuesca = new JLabel("min");
		minHuesca.setHorizontalAlignment(SwingConstants.CENTER);
		minHuesca.setForeground(new Color(0, 128, 255));
		minHuesca.setFont(new Font("Tahoma", Font.BOLD, 10));
		minHuesca.setBounds(403, 105, 68, 23);
		panelAragon.add(minHuesca);

		teruel = new JLabel("Teruel");
		teruel.setBounds(261, 406, 57, 58);
		panelAragon.add(teruel);

		fondoAragon = new JLabel("New label");
		fondoAragon.setBounds(0, 0, 729, 568);
		panelAragon.add(fondoAragon);

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
		maxOviedo.setHorizontalAlignment(SwingConstants.CENTER);
		maxOviedo.setForeground(new Color(255, 0, 0));
		maxOviedo.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxOviedo.setBounds(366, 10, 67, 18);
		panelAsturias.add(maxOviedo);

		minOviedo = new JLabel("min");
		minOviedo.setHorizontalAlignment(SwingConstants.CENTER);
		minOviedo.setFont(new Font("Tahoma", Font.BOLD, 10));
		minOviedo.setForeground(new Color(0, 128, 255));
		minOviedo.setBounds(366, 33, 67, 18);
		panelAsturias.add(minOviedo);

		gijon = new JLabel("Gijon");
		gijon.setBounds(429, 137, 67, 65);
		panelAsturias.add(gijon);

		maxGijon = new JLabel("max");
		maxGijon.setHorizontalAlignment(SwingConstants.CENTER);
		maxGijon.setForeground(new Color(255, 0, 0));
		maxGijon.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxGijon.setBounds(475, 71, 67, 18);
		panelAsturias.add(maxGijon);

		minGijon = new JLabel("min");
		minGijon.setHorizontalAlignment(SwingConstants.CENTER);
		minGijon.setForeground(new Color(0, 128, 255));
		minGijon.setFont(new Font("Tahoma", Font.BOLD, 10));
		minGijon.setBounds(475, 96, 67, 18);
		panelAsturias.add(minGijon);

		aviles = new JLabel("Aviles");
		aviles.setBounds(144, 137, 67, 65);
		panelAsturias.add(aviles);

		minAviles = new JLabel("min");
		minAviles.setHorizontalAlignment(SwingConstants.CENTER);
		minAviles.setBackground(new Color(255, 255, 255));
		minAviles.setForeground(new Color(0, 128, 255));
		minAviles.setFont(new Font("Tahoma", Font.BOLD, 10));
		minAviles.setBounds(171, 61, 67, 18);
		panelAsturias.add(minAviles);

		maxAviles = new JLabel("max");
		maxAviles.setHorizontalAlignment(SwingConstants.CENTER);
		maxAviles.setForeground(new Color(255, 0, 0));
		maxAviles.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxAviles.setBounds(171, 35, 67, 18);
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
		maxLleida.setHorizontalAlignment(SwingConstants.CENTER);
		maxLleida.setForeground(new Color(255, 0, 0));
		maxLleida.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxLleida.setBounds(199, 132, 75, 24);
		panelCatalunia.add(maxLleida);

		minLleida = new JLabel("min");
		minLleida.setHorizontalAlignment(SwingConstants.CENTER);
		minLleida.setForeground(new Color(0, 128, 255));
		minLleida.setFont(new Font("Tahoma", Font.BOLD, 10));
		minLleida.setBounds(199, 158, 75, 24);
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
		maxTarragona.setHorizontalAlignment(SwingConstants.CENTER);
		maxTarragona.setForeground(new Color(255, 0, 0));
		maxTarragona.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxTarragona.setBounds(108, 283, 75, 24);
		panelCatalunia.add(maxTarragona);

		minTarragona = new JLabel("min");
		minTarragona.setHorizontalAlignment(SwingConstants.CENTER);
		minTarragona.setForeground(new Color(0, 128, 255));
		minTarragona.setFont(new Font("Tahoma", Font.BOLD, 10));
		minTarragona.setBounds(108, 316, 75, 25);
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
		maxBarcelona.setHorizontalAlignment(SwingConstants.CENTER);
		maxBarcelona.setForeground(new Color(255, 0, 0));
		maxBarcelona.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxBarcelona.setBounds(360, 195, 75, 23);
		panelCatalunia.add(maxBarcelona);

		minBarcelona = new JLabel("min");
		minBarcelona.setHorizontalAlignment(SwingConstants.CENTER);
		minBarcelona.setForeground(new Color(0, 128, 255));
		minBarcelona.setFont(new Font("Tahoma", Font.BOLD, 10));
		minBarcelona.setBounds(360, 228, 75, 24);
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
		maxGirona.setHorizontalAlignment(SwingConstants.CENTER);
		maxGirona.setForeground(new Color(255, 0, 0));
		maxGirona.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxGirona.setBounds(562, 132, 75, 24);
		panelCatalunia.add(maxGirona);

		minGirona = new JLabel("min");
		minGirona.setHorizontalAlignment(SwingConstants.CENTER);
		minGirona.setForeground(new Color(0, 128, 255));
		minGirona.setFont(new Font("Tahoma", Font.BOLD, 10));
		minGirona.setBounds(562, 158, 75, 24);
		panelCatalunia.add(minGirona);

		fondoCatalunia = new JLabel("New label");
		fondoCatalunia.setBounds(0, 0, 729, 568);
		panelCatalunia.add(fondoCatalunia);
		panelCatalunia.setVisible(false);

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
		maxHuelva.setHorizontalAlignment(SwingConstants.CENTER);
		maxHuelva.setForeground(new Color(255, 0, 0));
		maxHuelva.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxHuelva.setBounds(131, 132, 71, 23);
		panelAndalucia.add(maxHuelva);

		minHuelva = new JLabel("min");
		minHuelva.setHorizontalAlignment(SwingConstants.CENTER);
		minHuelva.setForeground(new Color(0, 128, 255));
		minHuelva.setFont(new Font("Tahoma", Font.BOLD, 10));
		minHuelva.setBounds(131, 165, 71, 23);
		panelAndalucia.add(minHuelva);

		cadiz = new JLabel("Cadiz");
		cadiz.setBounds(131, 314, 71, 60);
		panelAndalucia.add(cadiz);

		maxCadiz = new JLabel("max");
		maxCadiz.setHorizontalAlignment(SwingConstants.CENTER);
		maxCadiz.setForeground(new Color(255, 0, 0));
		maxCadiz.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCadiz.setBounds(228, 304, 71, 23);
		panelAndalucia.add(maxCadiz);

		minCadiz = new JLabel("min");
		minCadiz.setHorizontalAlignment(SwingConstants.CENTER);
		minCadiz.setForeground(new Color(0, 128, 255));
		minCadiz.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCadiz.setBounds(228, 337, 71, 23);
		panelAndalucia.add(minCadiz);

		cordoba = new JLabel("Cordoba");
		cordoba.setBounds(293, 128, 64, 60);
		panelAndalucia.add(cordoba);

		maxCordoba = new JLabel("max");
		maxCordoba.setHorizontalAlignment(SwingConstants.CENTER);
		maxCordoba.setForeground(new Color(255, 0, 0));
		maxCordoba.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCordoba.setBounds(357, 59, 71, 23);
		panelAndalucia.add(maxCordoba);

		minCordoba = new JLabel("min");
		minCordoba.setHorizontalAlignment(SwingConstants.CENTER);
		minCordoba.setForeground(new Color(0, 128, 255));
		minCordoba.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCordoba.setBounds(357, 92, 71, 23);
		panelAndalucia.add(minCordoba);

		granada = new JLabel("Granada");
		granada.setBounds(399, 267, 71, 60);
		panelAndalucia.add(granada);

		maxGranada = new JLabel("max");
		maxGranada.setHorizontalAlignment(SwingConstants.CENTER);
		maxGranada.setForeground(new Color(255, 0, 0));
		maxGranada.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxGranada.setBounds(476, 187, 71, 23);
		panelAndalucia.add(maxGranada);

		minGranda = new JLabel("min");
		minGranda.setHorizontalAlignment(SwingConstants.CENTER);
		minGranda.setForeground(new Color(0, 128, 255));
		minGranda.setFont(new Font("Tahoma", Font.BOLD, 10));
		minGranda.setBounds(476, 222, 71, 23);
		panelAndalucia.add(minGranda);

		jaen = new JLabel("Jaen");
		jaen.setBounds(449, 127, 64, 60);
		panelAndalucia.add(jaen);

		maxJaen = new JLabel("max");
		maxJaen.setHorizontalAlignment(SwingConstants.CENTER);
		maxJaen.setForeground(new Color(255, 0, 0));
		maxJaen.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxJaen.setBounds(518, 82, 71, 23);
		panelAndalucia.add(maxJaen);

		minJaen = new JLabel("min");
		minJaen.setHorizontalAlignment(SwingConstants.CENTER);
		minJaen.setForeground(new Color(0, 128, 255));
		minJaen.setFont(new Font("Tahoma", Font.BOLD, 10));
		minJaen.setBounds(523, 116, 71, 23);
		panelAndalucia.add(minJaen);

		almeria = new JLabel("Almeria");
		almeria.setBounds(569, 244, 71, 60);
		panelAndalucia.add(almeria);

		JLabel lblNewLabel_2 = new JLabel("Heulva");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(23, 160, 86, 15);
		panelAndalucia.add(lblNewLabel_2);

		JLabel lblNewLabel_6 = new JLabel("Cordoba");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(258, 92, 83, 13);
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

		malaga = new JLabel("Malaga");
		malaga.setBounds(293, 247, 64, 60);
		panelAndalucia.add(malaga);

		fondoAndalucia = new JLabel("New label");
		fondoAndalucia.setBounds(0, -13, 729, 581);
		panelAndalucia.add(fondoAndalucia);

		panelValencia = new JPanel();
		panelValencia.setBounds(0, 0, 729, 568);
		contentPane.add(panelValencia);
		panelValencia.setLayout(null);
		panelValencia.setVisible(false);
		castellon = new JLabel("Castellon_de_la_Plana_Castello_de_la_Plana");
		castellon.setBounds(402, 87, 63, 63);
		panelValencia.add(castellon);

		JLabel lblNewLabel_40 = new JLabel("Castellón");
		lblNewLabel_40.setForeground(new Color(255, 255, 255));
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_40.setBounds(351, 160, 92, 32);
		panelValencia.add(lblNewLabel_40);

		maxCastellon = new JLabel("max");
		maxCastellon.setHorizontalAlignment(SwingConstants.CENTER);
		maxCastellon.setForeground(new Color(255, 0, 0));
		maxCastellon.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCastellon.setBounds(465, 149, 68, 24);
		panelValencia.add(maxCastellon);

		minCastellon = new JLabel("min");
		minCastellon.setHorizontalAlignment(SwingConstants.CENTER);
		minCastellon.setForeground(new Color(0, 128, 255));
		minCastellon.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCastellon.setBounds(465, 179, 68, 24);
		panelValencia.add(minCastellon);

		JLabel lblNewLabel_43 = new JLabel("Valencia");
		lblNewLabel_43.setForeground(new Color(255, 255, 255));
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_43.setBounds(377, 274, 68, 17);
		panelValencia.add(lblNewLabel_43);

		valen = new JLabel("Valencia");
		valen.setBounds(304, 238, 63, 63);
		panelValencia.add(valen);

		minValencia = new JLabel("min");
		minValencia.setHorizontalAlignment(SwingConstants.CENTER);
		minValencia.setForeground(new Color(0, 128, 255));
		minValencia.setFont(new Font("Tahoma", Font.BOLD, 10));
		minValencia.setBounds(465, 284, 63, 24);
		panelValencia.add(minValencia);

		maxValencia = new JLabel("max");
		maxValencia.setHorizontalAlignment(SwingConstants.CENTER);
		maxValencia.setForeground(new Color(255, 0, 0));
		maxValencia.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxValencia.setBounds(453, 252, 63, 24);
		panelValencia.add(maxValencia);

		maxAlicante = new JLabel("max");
		maxAlicante.setHorizontalAlignment(SwingConstants.CENTER);
		maxAlicante.setForeground(new Color(0, 128, 255));
		maxAlicante.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxAlicante.setBounds(485, 431, 63, 24);
		panelValencia.add(maxAlicante);

		alicante = new JLabel("Alicante_Alacant");
		alicante.setBounds(326, 375, 63, 63);
		panelValencia.add(alicante);

		minAlicante = new JLabel("min");
		minAlicante.setHorizontalAlignment(SwingConstants.CENTER);
		minAlicante.setForeground(new Color(255, 0, 0));
		minAlicante.setFont(new Font("Tahoma", Font.BOLD, 10));
		minAlicante.setBounds(485, 397, 63, 24);
		panelValencia.add(minAlicante);

		JLabel lblNewLabel_50 = new JLabel("Alicante");
		lblNewLabel_50.setForeground(new Color(255, 255, 255));
		lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_50.setBounds(412, 431, 92, 17);
		panelValencia.add(lblNewLabel_50);

		fondoValencia = new JLabel("New label");
		fondoValencia.setBounds(0, 0, 729, 568);
		panelValencia.add(fondoValencia);

		panelIslasBaleares = new JPanel();
		panelIslasBaleares.setBounds(0, 0, 729, 568);
		contentPane.add(panelIslasBaleares);
		panelIslasBaleares.setLayout(null);
		panelIslasBaleares.setVisible(false);

		mayorca = new JLabel("Mallorca");
		mayorca.setBounds(332, 205, 110, 105);
		panelIslasBaleares.add(mayorca);

		lblNewLabel_39 = new JLabel("Islas Baleares");
		lblNewLabel_39.setForeground(new Color(255, 255, 255));
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_39.setBounds(201, 168, 136, 27);
		panelIslasBaleares.add(lblNewLabel_39);

		maxMayorca = new JLabel("max");
		maxMayorca.setHorizontalAlignment(SwingConstants.CENTER);
		maxMayorca.setForeground(new Color(255, 0, 0));
		maxMayorca.setBackground(new Color(255, 255, 255));
		maxMayorca.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxMayorca.setBounds(361, 111, 70, 27);
		panelIslasBaleares.add(maxMayorca);

		minMayorca = new JLabel("max");
		minMayorca.setBackground(new Color(255, 255, 255));
		minMayorca.setHorizontalAlignment(SwingConstants.CENTER);
		minMayorca.setForeground(new Color(0, 128, 255));
		minMayorca.setFont(new Font("Tahoma", Font.BOLD, 10));
		minMayorca.setBounds(361, 145, 70, 23);
		panelIslasBaleares.add(minMayorca);

		fondoBaleares = new JLabel("New label");
		fondoBaleares.setBounds(0, 0, 729, 568);
		panelIslasBaleares.add(fondoBaleares);

		panelCanarias = new JPanel();
		panelCanarias.setBounds(0, 0, 729, 568);
		contentPane.add(panelCanarias);
		panelCanarias.setLayout(null);
		panelCanarias.setVisible(false);
		santaCruz = new JLabel("SantaCruzdeTenerife");
		santaCruz.setBounds(219, 154, 104, 84);
		panelCanarias.add(santaCruz);

		granCanarias = new JLabel("Las_Palmas_de_Gran_Canaria");
		granCanarias.setBounds(357, 203, 104, 105);
		panelCanarias.add(granCanarias);

		maxCanarias = new JLabel("max");
		maxCanarias.setHorizontalAlignment(SwingConstants.CENTER);
		maxCanarias.setForeground(new Color(255, 0, 0));
		maxCanarias.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCanarias.setBounds(490, 183, 73, 23);
		panelCanarias.add(maxCanarias);

		minCanarias = new JLabel("min");
		minCanarias.setHorizontalAlignment(SwingConstants.CENTER);
		minCanarias.setForeground(new Color(0, 128, 255));
		minCanarias.setFont(new Font("Dialog", Font.BOLD, 10));
		minCanarias.setBounds(490, 215, 73, 23);
		panelCanarias.add(minCanarias);

		maxTenerife = new JLabel("max");
		maxTenerife.setHorizontalAlignment(SwingConstants.CENTER);
		maxTenerife.setForeground(new Color(255, 0, 0));
		maxTenerife.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxTenerife.setBounds(320, 121, 73, 23);
		panelCanarias.add(maxTenerife);

		minTenerife = new JLabel("min");
		minTenerife.setHorizontalAlignment(SwingConstants.CENTER);
		minTenerife.setForeground(new Color(0, 128, 255));
		minTenerife.setFont(new Font("Tahoma", Font.BOLD, 10));
		minTenerife.setBounds(320, 155, 73, 23);
		panelCanarias.add(minTenerife);

		fondoCanarias = new JLabel("New label");
		fondoCanarias.setBounds(0, -13, 729, 568);
		panelCanarias.add(fondoCanarias);

		panelMurcia = new JPanel();
		panelMurcia.setBounds(0, 0, 729, 568);
		contentPane.add(panelMurcia);
		panelMurcia.setLayout(null);
		panelMurcia.setVisible(false);

		lblNewLabel_41 = new JLabel("Murcia");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_41.setForeground(new Color(255, 255, 255));
		lblNewLabel_41.setBounds(318, 223, 94, 36);
		panelMurcia.add(lblNewLabel_41);

		murcia = new JLabel("Murcia");
		murcia.setBounds(342, 279, 101, 101);
		panelMurcia.add(murcia);

		minMurcia = new JLabel("min");
		minMurcia.setHorizontalAlignment(SwingConstants.CENTER);
		minMurcia.setForeground(new Color(0, 128, 255));
		minMurcia.setFont(new Font("Tahoma", Font.BOLD, 10));
		minMurcia.setBounds(388, 213, 70, 23);
		panelMurcia.add(minMurcia);

		maxMurcia = new JLabel("max");
		maxMurcia.setHorizontalAlignment(SwingConstants.CENTER);
		maxMurcia.setForeground(new Color(255, 0, 0));
		maxMurcia.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxMurcia.setBounds(388, 177, 70, 23);
		panelMurcia.add(maxMurcia);

		fondoMurcia = new JLabel("New label");
		fondoMurcia.setBounds(0, 0, 729, 558);
		panelMurcia.add(fondoMurcia);

		panelNavarra = new JPanel();
		panelNavarra.setBounds(0, 0, 729, 568);
		contentPane.add(panelNavarra);
		panelNavarra.setLayout(null);
		panelNavarra.setVisible(false);

		pamplonaIrunia = new JLabel("Pamplona_Iruna");
		pamplonaIrunia.setBounds(262, 177, 105, 106);
		panelNavarra.add(pamplonaIrunia);

		maxPamplona = new JLabel("max");
		maxPamplona.setHorizontalAlignment(SwingConstants.CENTER);
		maxPamplona.setForeground(new Color(255, 0, 0));
		maxPamplona.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxPamplona.setBounds(398, 77, 70, 26);
		panelNavarra.add(maxPamplona);

		minPamplona = new JLabel("min");
		minPamplona.setHorizontalAlignment(SwingConstants.CENTER);
		minPamplona.setForeground(new Color(0, 128, 255));
		minPamplona.setFont(new Font("Tahoma", Font.BOLD, 10));
		minPamplona.setBounds(398, 109, 70, 26);
		panelNavarra.add(minPamplona);

		lblNewLabel_42 = new JLabel("Navarra");
		lblNewLabel_42.setForeground(new Color(255, 255, 255));
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_42.setBounds(267, 119, 86, 26);
		panelNavarra.add(lblNewLabel_42);

		fondoNavarra = new JLabel("New label");
		fondoNavarra.setBounds(0, 0, 729, 568);
		panelNavarra.add(fondoNavarra);

		panelMadrid = new JPanel();
		panelMadrid.setBounds(0, 0, 729, 558);
		contentPane.add(panelMadrid);
		panelMadrid.setLayout(null);
		panelMadrid.setVisible(false);

		madrid = new JLabel("Madrid");
		madrid.setBounds(345, 232, 84, 82);
		panelMadrid.add(madrid);

		maxMadrid = new JLabel("max");
		maxMadrid.setHorizontalAlignment(SwingConstants.CENTER);
		maxMadrid.setForeground(new Color(255, 0, 0));
		maxMadrid.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxMadrid.setBounds(441, 151, 72, 26);
		panelMadrid.add(maxMadrid);

		minMadrid = new JLabel("min");
		minMadrid.setHorizontalAlignment(SwingConstants.CENTER);
		minMadrid.setForeground(new Color(0, 128, 255));
		minMadrid.setFont(new Font("Tahoma", Font.BOLD, 10));
		minMadrid.setBounds(441, 185, 72, 26);
		panelMadrid.add(minMadrid);

		lblNewLabel_44 = new JLabel("Madrid");
		lblNewLabel_44.setForeground(new Color(255, 255, 255));
		lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_44.setBounds(357, 190, 72, 17);
		panelMadrid.add(lblNewLabel_44);

		fondoMadrid = new JLabel("New label");
		fondoMadrid.setBounds(0, 0, 729, 570);
		panelMadrid.add(fondoMadrid);

		panelCantabria = new JPanel();
		panelCantabria.setBounds(0, 0, 729, 570);
		contentPane.add(panelCantabria);
		panelCantabria.setLayout(null);
		panelCantabria.setVisible(false);

		santander = new JLabel("Santander");
		santander.setBounds(263, 132, 108, 98);
		panelCantabria.add(santander);

		maxSantander = new JLabel("max");
		maxSantander.setHorizontalAlignment(SwingConstants.CENTER);
		maxSantander.setForeground(new Color(255, 0, 0));
		maxSantander.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxSantander.setBounds(368, 41, 72, 21);
		panelCantabria.add(maxSantander);

		minSantander = new JLabel("min");
		minSantander.setHorizontalAlignment(SwingConstants.CENTER);
		minSantander.setForeground(new Color(0, 128, 255));
		minSantander.setFont(new Font("Tahoma", Font.BOLD, 10));
		minSantander.setBounds(368, 72, 72, 21);
		panelCantabria.add(minSantander);

		lblNewLabel_46 = new JLabel("Cantabria");
		lblNewLabel_46.setForeground(new Color(255, 255, 255));
		lblNewLabel_46.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_46.setBounds(287, 52, 84, 30);
		panelCantabria.add(lblNewLabel_46);

		fondoCantabria = new JLabel("New label");
		fondoCantabria.setBounds(0, 0, 729, 570);
		panelCantabria.add(fondoCantabria);

		panelRioja = new JPanel();
		panelRioja.setBounds(0, 0, 729, 570);
		contentPane.add(panelRioja);
		panelRioja.setLayout(null);
		panelRioja.setVisible(false);

		JLabel lblNewLabel_47 = new JLabel("La Rioja");
		lblNewLabel_47.setForeground(new Color(255, 255, 255));
		lblNewLabel_47.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_47.setBounds(240, 181, 81, 30);
		panelRioja.add(lblNewLabel_47);

		logronio = new JLabel("Logronio");
		logronio.setBounds(317, 201, 75, 68);
		panelRioja.add(logronio);

		maxLogronio = new JLabel("max");
		maxLogronio.setHorizontalAlignment(SwingConstants.CENTER);
		maxLogronio.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxLogronio.setForeground(new Color(255, 0, 0));
		maxLogronio.setBounds(322, 132, 90, 21);
		panelRioja.add(maxLogronio);

		minLogronio = new JLabel("min");
		minLogronio.setHorizontalAlignment(SwingConstants.CENTER);
		minLogronio.setForeground(new Color(0, 128, 255));
		minLogronio.setFont(new Font("Tahoma", Font.BOLD, 10));
		minLogronio.setBounds(322, 163, 90, 21);
		panelRioja.add(minLogronio);

		fondoLogronio = new JLabel("New label");
		fondoLogronio.setBounds(0, 0, 729, 570);
		panelRioja.add(fondoLogronio);

		panelCeuta = new JPanel();
		panelCeuta.setBounds(0, 0, 729, 570);
		contentPane.add(panelCeuta);
		panelCeuta.setLayout(null);
		panelCeuta.setVisible(false);

		lblNewLabel_48 = new JLabel("Ceuta");
		lblNewLabel_48.setForeground(new Color(0, 0, 0));
		lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_48.setBounds(426, 82, 68, 25);
		panelCeuta.add(lblNewLabel_48);

		minCeuta = new JLabel("min");
		minCeuta.setHorizontalAlignment(SwingConstants.CENTER);
		minCeuta.setForeground(new Color(0, 128, 255));
		minCeuta.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCeuta.setBounds(503, 86, 90, 22);
		panelCeuta.add(minCeuta);

		maxCeuta = new JLabel("max");
		maxCeuta.setHorizontalAlignment(SwingConstants.CENTER);
		maxCeuta.setForeground(new Color(255, 0, 0));
		maxCeuta.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCeuta.setBounds(503, 54, 90, 22);
		panelCeuta.add(maxCeuta);

		ceutalabel = new JLabel("Ceuta");
		ceutalabel.setBounds(332, 203, 137, 120);
		panelCeuta.add(ceutalabel);

		fondoCeuta = new JLabel("");
		fondoCeuta.setBounds(0, 0, 729, 570);
		panelCeuta.add(fondoCeuta);

		panelMelilla = new JPanel();
		panelMelilla.setBounds(0, 0, 729, 570);
		contentPane.add(panelMelilla);
		panelMelilla.setLayout(null);
		panelMelilla.setVisible(false);

		melillaLabel = new JLabel("Melilla");
		melillaLabel.setBounds(250, 171, 138, 122);
		panelMelilla.add(melillaLabel);

		maxMelillalabel = new JLabel("max");
		maxMelillalabel.setForeground(new Color(255, 0, 0));
		maxMelillalabel.setHorizontalAlignment(SwingConstants.CENTER);
		maxMelillalabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxMelillalabel.setBounds(377, 83, 72, 20);
		panelMelilla.add(maxMelillalabel);

		minMelillaLabel = new JLabel("min");
		minMelillaLabel.setForeground(new Color(0, 128, 255));
		minMelillaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minMelillaLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		minMelillaLabel.setBounds(377, 118, 72, 20);
		panelMelilla.add(minMelillaLabel);

		lblNewLabel_52 = new JLabel("Melilla");
		lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_52.setBounds(270, 99, 86, 25);
		panelMelilla.add(lblNewLabel_52);

		fondoMelilla = new JLabel("New label");
		fondoMelilla.setBounds(0, 0, 729, 570);
		panelMelilla.add(fondoMelilla);

		panelCLM = new JPanel();
		panelCLM.setBounds(0, 0, 729, 568);
		contentPane.add(panelCLM);
		panelCLM.setLayout(null);
		panelCLM.setVisible(false);

		JLabel lblNewLabel_24 = new JLabel("Ciudad Real");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setBounds(180, 369, 105, 27);
		panelCLM.add(lblNewLabel_24);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_24.setForeground(new Color(255, 255, 255));

		JLabel lblNewLabel_22 = new JLabel("Guadalajara");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setBounds(356, 110, 154, 27);
		panelCLM.add(lblNewLabel_22);
		lblNewLabel_22.setForeground(new Color(255, 255, 255));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 14));

		minGuadalajara = new JLabel("min");
		minGuadalajara.setHorizontalAlignment(SwingConstants.CENTER);
		minGuadalajara.setForeground(new Color(0, 0, 255));
		minGuadalajara.setFont(new Font("Tahoma", Font.BOLD, 10));
		minGuadalajara.setBounds(523, 133, 72, 20);
		panelCLM.add(minGuadalajara);

		maxGuadalajara = new JLabel("max");
		maxGuadalajara.setHorizontalAlignment(SwingConstants.CENTER);
		maxGuadalajara.setForeground(new Color(255, 0, 0));
		maxGuadalajara.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxGuadalajara.setBounds(523, 96, 72, 20);
		panelCLM.add(maxGuadalajara);

		guadalajara = new JLabel("Guadalajara");
		guadalajara.setBounds(436, 43, 55, 59);
		panelCLM.add(guadalajara);

		cuenca = new JLabel("Cuenca");
		cuenca.setBounds(436, 262, 55, 59);
		panelCLM.add(cuenca);

		maxCuenca = new JLabel("max");
		maxCuenca.setHorizontalAlignment(SwingConstants.CENTER);
		maxCuenca.setForeground(new Color(255, 0, 0));
		maxCuenca.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCuenca.setBounds(581, 202, 72, 20);
		panelCLM.add(maxCuenca);

		minCuenca = new JLabel("min");
		minCuenca.setHorizontalAlignment(SwingConstants.CENTER);
		minCuenca.setForeground(new Color(0, 0, 255));
		minCuenca.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCuenca.setBounds(581, 239, 72, 20);
		panelCLM.add(minCuenca);

		toledo = new JLabel("Toledo");
		toledo.setBounds(270, 262, 55, 59);
		panelCLM.add(toledo);

		maxToledo = new JLabel("max");
		maxToledo.setHorizontalAlignment(SwingConstants.CENTER);
		maxToledo.setForeground(new Color(255, 0, 0));
		maxToledo.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxToledo.setBounds(218, 202, 72, 20);
		panelCLM.add(maxToledo);

		minToledo = new JLabel("min");
		minToledo.setHorizontalAlignment(SwingConstants.CENTER);
		minToledo.setForeground(new Color(0, 0, 255));
		minToledo.setFont(new Font("Tahoma", Font.BOLD, 10));
		minToledo.setBounds(218, 239, 72, 20);
		panelCLM.add(minToledo);

		ciudadReal = new JLabel("Ciudad_Real");
		ciudadReal.setBounds(264, 406, 61, 52);
		panelCLM.add(ciudadReal);

		maxCiudadReal = new JLabel("max");
		maxCiudadReal.setHorizontalAlignment(SwingConstants.CENTER);
		maxCiudadReal.setForeground(new Color(255, 0, 0));
		maxCiudadReal.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxCiudadReal.setBounds(295, 338, 72, 20);
		panelCLM.add(maxCiudadReal);

		minCiudadReal = new JLabel("min");
		minCiudadReal.setHorizontalAlignment(SwingConstants.CENTER);
		minCiudadReal.setForeground(new Color(0, 0, 255));
		minCiudadReal.setFont(new Font("Tahoma", Font.BOLD, 10));
		minCiudadReal.setBounds(295, 365, 72, 20);
		panelCLM.add(minCiudadReal);

		albacete = new JLabel("Albacete");
		albacete.setBounds(564, 403, 55, 59);
		panelCLM.add(albacete);

		maxAlbacete = new JLabel("max");
		maxAlbacete.setHorizontalAlignment(SwingConstants.CENTER);
		maxAlbacete.setForeground(new Color(255, 0, 0));
		maxAlbacete.setFont(new Font("Tahoma", Font.BOLD, 10));
		maxAlbacete.setBounds(523, 320, 72, 20);
		panelCLM.add(maxAlbacete);

		minAlbacete = new JLabel("min");
		minAlbacete.setHorizontalAlignment(SwingConstants.CENTER);
		minAlbacete.setForeground(new Color(0, 0, 255));
		minAlbacete.setFont(new Font("Tahoma", Font.BOLD, 10));
		minAlbacete.setBounds(523, 351, 72, 20);
		panelCLM.add(minAlbacete);

		JLabel lblNewLabel_20 = new JLabel("Albacete");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_20.setBounds(415, 331, 90, 29);
		panelCLM.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Cuenca");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		lblNewLabel_21.setBounds(476, 225, 97, 27);
		panelCLM.add(lblNewLabel_21);

		JLabel lblNewLabel_23 = new JLabel("Toledo");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_23.setForeground(new Color(255, 255, 255));
		lblNewLabel_23.setBounds(128, 239, 66, 27);
		panelCLM.add(lblNewLabel_23);

		fondoCLM = new JLabel("");
		fondoCLM.setBounds(0, 10, 729, 578);
		panelCLM.add(fondoCLM);

		label = new JLabel("New label");

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

	public List<JLabel> getCantabria() {
		return cantabria;
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

	public JPanel getPanelCantabria() {
		return panelCantabria;
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

	public JPanel getPanelMelilla() {
		return panelMelilla;
	}

	public JLabel getMelillaLabel() {
		return melillaLabel;
	}

	public JComboBox getComboBoxDia() {
		return comboBoxDia;
	}

	public List<JLabel> getMadridList() {
		return madridList;
	}

	public JPanel getPanelMadrid() {
		return panelMadrid;
	}

	public JPanel getPanelGalicia() {
		return panelGalicia;
	}

	public List<JLabel> getRioja() {
		return rioja;
	}

	public JPanel getPanelRioja() {
		return panelRioja;
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

	public List<JLabel> getCeuta() {
		return ceuta;
	}

	public JPanel getPanelCeuta() {
		return panelCeuta;
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

	public List<JLabel> getCanarias() {
		return canarias;
	}

	public JPanel getPanelCanarias() {
		return panelCanarias;
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

	public List<JLabel> getValencia() {
		return valencia;
	}

	public JPanel getPanelValencia() {
		return panelValencia;
	}

	public List<JLabel> getBaleares() {
		return baleares;
	}

	public JPanel getPanelIslasBaleares() {
		return panelIslasBaleares;
	}

	public List<JLabel> getMurciaList() {
		return murciaList;
	}

	public JPanel getPanelMurcia() {
		return panelMurcia;
	}

	public List<JLabel> getNavarra() {
		return navarra;
	}

	public JPanel getPanelNavarra() {
		return panelNavarra;
	}

	public List<JLabel> getMelillaList() {
		return melillaList;
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

		melillaList.add(melillaLabel);
		melillaList.add(minMelillaLabel);
		melillaList.add(maxMelillalabel);

		ceuta.add(ceutalabel);
		ceuta.add(maxCeuta);
		ceuta.add(minCeuta);

		rioja.add(logronio);
		rioja.add(minLogronio);
		rioja.add(maxLogronio);

		cantabria.add(santander);
		cantabria.add(maxSantander);
		cantabria.add(minSantander);

		madridList.add(madrid);
		madridList.add(minMadrid);
		madridList.add(maxMadrid);

		navarra.add(pamplonaIrunia);
		navarra.add(minPamplona);
		navarra.add(maxPamplona);

		murciaList.add(murcia);
		murciaList.add(minMurcia);
		murciaList.add(maxMurcia);

		canarias.add(granCanarias);
		canarias.add(minCanarias);
		canarias.add(maxCanarias);
		canarias.add(santaCruz);
		canarias.add(maxTenerife);
		canarias.add(minTenerife);

		baleares.add(mayorca);
		baleares.add(maxMayorca);
		baleares.add(minMayorca);

		valencia.add(alicante);
		valencia.add(minAlicante);
		valencia.add(maxAlicante);
		valencia.add(castellon);
		valencia.add(minCastellon);
		valencia.add(maxCastellon);
		valencia.add(valen);
		valencia.add(maxValencia);
		valencia.add(minValencia);

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
		aragon.add(minZaragoza);
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
		extremadura.add(minBadajoz);
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
		andaluci.add(malaga);

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

	//CARGA LAS IMAGENES DE FONDO DE CADA MAPA
	public void cargarImagenes() {

		// IMAGENES RUTAS
		ImageIcon cantabria_img = new ImageIcon(getClass().getResource("/imagenes/cantabria.png").getPath());
		ImageIcon melilla_img = new ImageIcon(getClass().getResource("/imagenes/melilla.png").getPath());
		ImageIcon ceuta_img = new ImageIcon(getClass().getResource("/imagenes/ceuta.png").getPath());
		ImageIcon rioja_img = new ImageIcon(getClass().getResource("/imagenes/la_rioja.png").getPath());
		ImageIcon madrid_img = new ImageIcon(getClass().getResource("/imagenes/madrid.png").getPath());
		ImageIcon navarra_img = new ImageIcon(getClass().getResource("/imagenes/pamplona.png").getPath());
		ImageIcon murcia_img = new ImageIcon(getClass().getResource("/imagenes/murcia.png").getPath());
		ImageIcon canarias_img = new ImageIcon(getClass().getResource("/imagenes/tenerife.png").getPath());
		ImageIcon baleares_img = new ImageIcon(getClass().getResource("/imagenes/islas_baleares.png").getPath());
		ImageIcon catalunia_img = new ImageIcon(getClass().getResource("/imagenes/catalunia.png").getPath());
		ImageIcon valencia_img = new ImageIcon(getClass().getResource("/imagenes/valencia.png").getPath());
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

		image = melilla_img.getImage().getScaledInstance(fondoMelilla.getWidth(), fondoMelilla.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoMelilla.setIcon(r);

		image = ceuta_img.getImage().getScaledInstance(fondoCeuta.getWidth(), fondoCeuta.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCeuta.setIcon(r);

		image = rioja_img.getImage().getScaledInstance(fondoLogronio.getWidth(), fondoLogronio.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoLogronio.setIcon(r);

		image = cantabria_img.getImage().getScaledInstance(fondoCantabria.getWidth(), fondoCantabria.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCantabria.setIcon(r);

		image = madrid_img.getImage().getScaledInstance(fondoMadrid.getWidth(), fondoMadrid.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoMadrid.setIcon(r);

		image = navarra_img.getImage().getScaledInstance(fondoNavarra.getWidth(), fondoNavarra.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoNavarra.setIcon(r);

		image = murcia_img.getImage().getScaledInstance(fondoMurcia.getWidth(), fondoMurcia.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoMurcia.setIcon(r);

		image = canarias_img.getImage().getScaledInstance(fondoCanarias.getWidth(), fondoCanarias.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCanarias.setIcon(r);

		image = baleares_img.getImage().getScaledInstance(fondoBaleares.getWidth(), fondoBaleares.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoBaleares.setIcon(r);

		image = valencia_img.getImage().getScaledInstance(fondoValencia.getWidth(), fondoValencia.getHeight(),
				Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoValencia.setIcon(r);

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

	// GUARDA TEXTOS ORIGINALES DE LOS LABELS
	public static void guardarTextosOriginales(List<JLabel> listaDeLabels) {
		for (JLabel label : listaDeLabels) {
			textosOriginales.put(label, label.getText());
		}
	}
	//RESTAURA TEXTOS ORIGINALES DE LOS LABELS
	public static void restaurarTextosOriginales(List<JLabel> listaDeLabels) {
		for (JLabel label : listaDeLabels) {
			if (textosOriginales.containsKey(label)) {
				label.setText(textosOriginales.get(label));
			}
		}
	}
}