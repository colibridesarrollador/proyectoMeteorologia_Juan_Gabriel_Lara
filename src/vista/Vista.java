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
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel panelEspania;
	private JLabel lblNewLabelFondoMapaEspania;
	private Image image;
	private ImageIcon r;
	private List<JLabel> galicia;
	private List<JLabel> andaluci;
	private List<JLabel> castilla_LM;
	private List<JLabel> paisVasco;
	private List<JLabel> castillaLeon;
	private ContenedorProvinciasJLabels contenedorProvincias;
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
		
		castillaLeon = new ArrayList<>();
		paisVasco = new ArrayList<JLabel>();
		galicia = new ArrayList<JLabel>();
		labels = new ArrayList<JLabel>();
		castilla_LM = new ArrayList<JLabel>();
		andaluci = new ArrayList<JLabel>();
		
		
		//IMAGENES RUTAS
		ImageIcon andalucia = new ImageIcon(getClass().getResource("/imagenes/andalucia.png").getPath());
		ImageIcon castilla_leon = new ImageIcon(getClass().getResource("/imagenes/castilla_leon.png").getPath());
		ImageIcon inicio_img = new ImageIcon(getClass().getResource("/imagenes/fondo_inicio.jpg").getPath());	
		ImageIcon galicia_img = new ImageIcon(getClass().getResource("/imagenes/galicia.png").getPath());
		ImageIcon clm = new ImageIcon(getClass().getResource("/imagenes/castilla_la_mancha.png").getPath());
		ImageIcon espania_img = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		ImageIcon pais_vasco_img = new ImageIcon(getClass().getResource("/imagenes/pais_vasco.png").getPath());
		
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelAndalucia = new JPanel();
		panelAndalucia.setBounds(0, 0, 729, 568);
		contentPane.add(panelAndalucia);
		panelAndalucia.setLayout(null);
		panelAndalucia.setVisible(false);
		
		
		panelCastillaLeon = new JPanel();
		panelCastillaLeon.setBounds(0, 0, 729, 568);
		contentPane.add(panelCastillaLeon);
		panelCastillaLeon.setLayout(null);
		panelCastillaLeon.setVisible(false);
		
		
		panelCLM = new JPanel();
		panelCLM.setBounds(0, 0, 729, 568);
		contentPane.add(panelCLM);
		panelCLM.setLayout(null);
		panelCLM.setVisible(false);
		
		minGuadalajara = new JLabel("min");
		minGuadalajara.setFont(new Font("Tahoma", Font.BOLD, 14));
		minGuadalajara.setBounds(506, 117, 97, 13);
		panelCLM.add(minGuadalajara);
		
		JLabel maxGuadalajara = new JLabel("max");
		maxGuadalajara.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxGuadalajara.setBounds(506, 94, 97, 13);
		panelCLM.add(maxGuadalajara);
		
		panelPaisVasco = new JPanel();
		panelPaisVasco.setBounds(0, 0, 729, 568);
		contentPane.add(panelPaisVasco);
		panelPaisVasco.setLayout(null);
		panelPaisVasco.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("Bilbao");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(106, 61, 138, 26);
		panelPaisVasco.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("San Sebastian");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(475, 138, 165, 26);
		panelPaisVasco.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Vitoria");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(316, 350, 99, 26);
		panelPaisVasco.add(lblNewLabel_10);
		
		
		
		//PAIS VASCO
		vitoria = new JLabel("Vitoria-Gasteiz");
		vitoria.setBounds(199, 305, 75, 68);
		panelPaisVasco.add(vitoria);
		paisVasco.add(vitoria);
		
		maxVitoria = new JLabel("max");
		maxVitoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxVitoria.setBounds(83, 322, 84, 13);
		panelPaisVasco.add(maxVitoria);
		
		bilbao = new JLabel("Bilbao");
		bilbao.setBounds(138, 120, 75, 68);
		paisVasco.add(bilbao);
		panelPaisVasco.add(bilbao);
		
		minVitoria = new JLabel("min");
		minVitoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		minVitoria.setBounds(83, 350, 84, 13);
		panelPaisVasco.add(minVitoria);
		
		maxBilbao = new JLabel("max");
		maxBilbao.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxBilbao.setBounds(229, 120, 84, 13);
		panelPaisVasco.add(maxBilbao);
		
		minBilbao = new JLabel("min");
		minBilbao.setFont(new Font("Tahoma", Font.BOLD, 14));
		minBilbao.setBounds(229, 148, 99, 13);
		panelPaisVasco.add(minBilbao);
		
		sanSebastian = new JLabel("Donostia_San_Sebastian");
		sanSebastian.setBounds(491, 61, 75, 68);
		panelPaisVasco.add(sanSebastian);
		
		minSansebastian = new JLabel("min");
		minSansebastian.setFont(new Font("Tahoma", Font.BOLD, 14));
		minSansebastian.setBounds(605, 104, 99, 13);
		panelPaisVasco.add(minSansebastian);
		
		maxSansebastian = new JLabel("max");
		maxSansebastian.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxSansebastian.setBounds(605, 71, 99, 13);
		panelPaisVasco.add(maxSansebastian);
		
		JLabel lblNewLabelFonoPaisVasco = new JLabel("");
		lblNewLabelFonoPaisVasco.setBounds(0, 0, 729, 568);
		panelPaisVasco.add(lblNewLabelFonoPaisVasco);
		
		paisVasco.add(vitoria);
		paisVasco.add(minVitoria);
		paisVasco.add(maxVitoria);
		paisVasco.add(bilbao);
		paisVasco.add(minBilbao);
		paisVasco.add(maxBilbao);
		paisVasco.add(sanSebastian);
		paisVasco.add(minSansebastian);
		paisVasco.add(maxSansebastian);
		
		
		
		
			
		//GALICIA
		panelGalicia = new JPanel();
		panelGalicia.setBounds(0, 0, 729, 568);
		contentPane.add(panelGalicia);
		panelGalicia.setLayout(null);
		panelGalicia.setVisible(false);
		
		corunia = new JLabel("A_Coruja");
		corunia.setBounds(125, 158, 70, 56);
		panelGalicia.add(corunia);
		
		pontevedra = new JLabel("Pontevedra");
		pontevedra.setBounds(96, 407, 59, 56);
		panelGalicia.add(pontevedra);
		
		
		maxPontevedra = new JLabel("max");
		maxPontevedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxPontevedra.setBounds(182, 391, 113, 13);
		panelGalicia.add(maxPontevedra);
		
		minPontevedra = new JLabel("min");
		minPontevedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minPontevedra.setBounds(183, 427, 84, 13);
		panelGalicia.add(minPontevedra);
		
		ourense = new JLabel("Ourense");
		ourense.setBounds(406, 460, 59, 56);
		panelGalicia.add(ourense);
		
		maxOurense = new JLabel("max");
		maxOurense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxOurense.setBounds(491, 469, 77, 13);
		panelGalicia.add(maxOurense);
		
		minOurense = new JLabel("min");
		minOurense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minOurense.setBounds(491, 516, 90, 13);
		panelGalicia.add(minOurense);
		
		lugo = new JLabel("Lugo");
		lugo.setBounds(491, 158, 63, 56);
		panelGalicia.add(lugo);
		
		
		maxLugo = new JLabel("max");
		maxLugo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxLugo.setBounds(578, 136, 77, 13);
		panelGalicia.add(maxLugo);
		
		minLugo = new JLabel("min");
		minLugo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minLugo.setBounds(578, 178, 77, 13);
		panelGalicia.add(minLugo);
		
		maxCorunia = new JLabel("max");
		maxCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCorunia.setBounds(205, 156, 77, 13);
		panelGalicia.add(maxCorunia);
		
		minCorunia = new JLabel("min");
		minCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCorunia.setBounds(205, 190, 90, 13);
		panelGalicia.add(minCorunia);
		
		//GALICIA
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
		
		
		lblNewLabel_3 = new JLabel("A Coruña");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(133, 119, 84, 17);
		panelGalicia.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Lugo");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(513, 245, 59, 25);
		panelGalicia.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Ourense");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(397, 526, 84, 32);
		panelGalicia.add(lblNewLabel_5);
		
		lblPontevedra = new JLabel("Pontevedra");
		lblPontevedra.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPontevedra.setBounds(162, 343, 90, 25);
		panelGalicia.add(lblPontevedra);
		
		
		
		fondoGalicia = new JLabel("");
		fondoGalicia.setBounds(0, 0, 729, 568);
		panelGalicia.add(fondoGalicia);
		
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

		JLabel lblNewLabel_1 = new JLabel(inicio_img);
		lblNewLabel_1.setBounds(0, 10, 729, 679);
		panelInicio.add(lblNewLabel_1);
		
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
		
		guadalajara = new JLabel("Guadalajara");
		guadalajara.setBounds(412, 71, 55, 59);
		panelCLM.add(guadalajara);
		
		cuenca = new JLabel("Cuenca");
		cuenca.setBounds(496, 237, 55, 59);
		panelCLM.add(cuenca);
		
		maxCuenca = new JLabel("max");
		maxCuenca.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxCuenca.setBounds(581, 216, 90, 13);
		panelCLM.add(maxCuenca);
		
		minCuenca = new JLabel("min");
		minCuenca.setFont(new Font("Tahoma", Font.BOLD, 14));
		minCuenca.setBounds(581, 254, 90, 13);
		panelCLM.add(minCuenca);
		
		toledo = new JLabel("Toledo");
		toledo.setBounds(104, 195, 55, 59);
		panelCLM.add(toledo);
		
		maxToledo = new JLabel("max");
		maxToledo.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxToledo.setBounds(200, 216, 72, 13);
		panelCLM.add(maxToledo);
		
		minToledo = new JLabel("min");
		minToledo.setFont(new Font("Tahoma", Font.BOLD, 14));
		minToledo.setBounds(200, 237, 72, 13);
		panelCLM.add(minToledo);
		
		ciudadReal = new JLabel("Ciudad_Real");
		ciudadReal.setBounds(184, 410, 61, 52);
		panelCLM.add(ciudadReal);
		
		maxCiudadReal = new JLabel("max");
		maxCiudadReal.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxCiudadReal.setBounds(266, 399, 82, 21);
		panelCLM.add(maxCiudadReal);
		
		minCiudadReal = new JLabel("min");
		minCiudadReal.setFont(new Font("Tahoma", Font.BOLD, 14));
		minCiudadReal.setBounds(268, 430, 80, 13);
		panelCLM.add(minCiudadReal);
		
		albacete = new JLabel("Albacete");
		albacete.setBounds(506, 419, 55, 59);
		panelCLM.add(albacete);
		
		maxAlbacete = new JLabel("max");
		maxAlbacete.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxAlbacete.setBounds(581, 428, 74, 13);
		panelCLM.add(maxAlbacete);
		
		minAlbacete = new JLabel("min");
		minAlbacete.setFont(new Font("Tahoma", Font.BOLD, 14));
		minAlbacete.setBounds(583, 465, 88, 13);
		panelCLM.add(minAlbacete);
		
		
		
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
		
		JLabel fondoCLM = new JLabel("");
		fondoCLM.setBounds(0, 0, 729, 568);
		panelCLM.add(fondoCLM);

		
		leon = new JLabel("Leon");
		leon.setBounds(61, 60, 66, 62);
		panelCastillaLeon.add(leon);
		
		maxLeon = new JLabel("max");
		maxLeon.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxLeon.setBounds(152, 52, 79, 13);
		panelCastillaLeon.add(maxLeon);
		
		minLeon = new JLabel("min");
		minLeon.setFont(new Font("Tahoma", Font.BOLD, 14));
		minLeon.setBounds(152, 85, 79, 13);
		panelCastillaLeon.add(minLeon);
		
		zamora = new JLabel("Zamora");
		zamora.setBounds(116, 294, 66, 62);
		panelCastillaLeon.add(zamora);
		
		maxZamora = new JLabel("max");
		maxZamora.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxZamora.setBounds(92, 206, 69, 13);
		panelCastillaLeon.add(maxZamora);
		
		minZamora = new JLabel("min");
		minZamora.setFont(new Font("Tahoma", Font.BOLD, 14));
		minZamora.setBounds(92, 240, 90, 13);
		panelCastillaLeon.add(minZamora);
		
		salamanca = new JLabel("Salamanca");
		salamanca.setFont(new Font("Tahoma", Font.PLAIN, 10));
		salamanca.setBounds(10, 469, 79, 62);
		panelCastillaLeon.add(salamanca);
		
		maxSalamanca = new JLabel("max");
		maxSalamanca.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxSalamanca.setBounds(116, 452, 90, 13);
		panelCastillaLeon.add(maxSalamanca);
		
		minSalamanca = new JLabel("min");
		minSalamanca.setFont(new Font("Tahoma", Font.BOLD, 14));
		minSalamanca.setBounds(116, 475, 90, 13);
		panelCastillaLeon.add(minSalamanca);
		
		avila = new JLabel("Avila");
		avila.setBounds(287, 452, 66, 62);
		panelCastillaLeon.add(avila);
		
		minAvila = new JLabel("min");
		minAvila.setFont(new Font("Tahoma", Font.BOLD, 14));
		minAvila.setBounds(363, 518, 99, 13);
		panelCastillaLeon.add(minAvila);
		
		maxAvila = new JLabel("max");
		maxAvila.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxAvila.setBounds(363, 492, 99, 13);
		panelCastillaLeon.add(maxAvila);
		
		burgos = new JLabel("Burgos");
		burgos.setBounds(464, 119, 79, 62);
		panelCastillaLeon.add(burgos);
		
		maxburgos = new JLabel("max");
		maxburgos.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxburgos.setBounds(587, 119, 99, 13);
		panelCastillaLeon.add(maxburgos);
		
		minBurgos = new JLabel("min");
		minBurgos.setFont(new Font("Tahoma", Font.BOLD, 14));
		minBurgos.setBounds(587, 144, 99, 13);
		panelCastillaLeon.add(minBurgos);
		
		soria = new JLabel("Soria");
		soria.setBounds(535, 343, 66, 62);
		panelCastillaLeon.add(soria);
		
		maxSoria = new JLabel("max");
		maxSoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxSoria.setBounds(628, 356, 91, 13);
		panelCastillaLeon.add(maxSoria);
		
		minSoria = new JLabel("min");
		minSoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		minSoria.setBounds(628, 378, 66, 13);
		panelCastillaLeon.add(minSoria);
		
		fondoCastillaLeon = new JLabel("New label");
		fondoCastillaLeon.setBounds(0, 10, 729, 558);
		panelCastillaLeon.add(fondoCastillaLeon);
		
		
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
		
		sevilla = new JLabel("Sevilla");
		sevilla.setBounds(186, 244, 71, 60);
		panelAndalucia.add(sevilla);
		
		JLabel lblNewLabel_14 = new JLabel("Málaga");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(321, 346, 83, 23);
		panelAndalucia.add(lblNewLabel_14);

		
		huelva = new JLabel("Huelva");
		huelva.setBounds(43, 222, 71, 60);
		panelAndalucia.add(huelva);
		
		maxHuelva = new JLabel("max");
		maxHuelva.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxHuelva.setBounds(146, 174, 83, 13);
		panelAndalucia.add(maxHuelva);
		
		minHuelva = new JLabel("min");
		minHuelva.setFont(new Font("Tahoma", Font.BOLD, 14));
		minHuelva.setBounds(146, 197, 71, 13);
		panelAndalucia.add(minHuelva);
		
		cadiz = new JLabel("Cadiz");
		cadiz.setBounds(168, 429, 71, 60);
		panelAndalucia.add(cadiz);
		
		maxCadiz = new JLabel("max");
		maxCadiz.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxCadiz.setBounds(228, 372, 83, 13);
		panelAndalucia.add(maxCadiz);
		
		minCadiz = new JLabel("min");
		minCadiz.setFont(new Font("Tahoma", Font.BOLD, 14));
		minCadiz.setBounds(228, 406, 71, 13);
		panelAndalucia.add(minCadiz);
		
		cordoba = new JLabel("Cordoba");
		cordoba.setBounds(312, 138, 64, 60);
		panelAndalucia.add(cordoba);
		
		maxCordoba = new JLabel("max");
		maxCordoba.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxCordoba.setBounds(357, 69, 77, 13);
		panelAndalucia.add(maxCordoba);
		
		minCordoba = new JLabel("max");
		minCordoba.setFont(new Font("Tahoma", Font.BOLD, 14));
		minCordoba.setBounds(357, 92, 95, 13);
		panelAndalucia.add(minCordoba);
		
		granada = new JLabel("Granada");
		granada.setBounds(464, 325, 71, 60);
		panelAndalucia.add(granada);
		
		maxGranada = new JLabel("max");
		maxGranada.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxGranada.setBounds(525, 244, 67, 13);
		panelAndalucia.add(maxGranada);
		
		minGranda = new JLabel("min");
		minGranda.setFont(new Font("Tahoma", Font.BOLD, 14));
		minGranda.setBounds(525, 292, 67, 13);
		panelAndalucia.add(minGranda);

		
		jaen = new JLabel("Jaen");
		jaen.setBounds(448, 129, 64, 60);
		panelAndalucia.add(jaen);
		
		maxJaen = new JLabel("max");
		maxJaen.setFont(new Font("Tahoma", Font.BOLD, 14));
		maxJaen.setBounds(573, 83, 106, 13);
		panelAndalucia.add(maxJaen);
		
		minJaen = new JLabel("min");
		minJaen.setFont(new Font("Tahoma", Font.BOLD, 14));
		minJaen.setBounds(573, 115, 83, 13);
		panelAndalucia.add(minJaen);
		
		almeria = new JLabel("Almeria");
		almeria.setBounds(608, 297, 71, 60);
		panelAndalucia.add(almeria);
		
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
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Heulva");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(53, 196, 86, 15);
		panelAndalucia.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Cordoba");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(282, 83, 83, 13);
		panelAndalucia.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Granda");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(448, 264, 75, 23);
		panelAndalucia.add(lblNewLabel_7);
		
		JLabel lblNewLabel_11 = new JLabel("Almeria");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(629, 264, 64, 23);
		panelAndalucia.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Jaén");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(504, 106, 71, 13);
		panelAndalucia.add(lblNewLabel_12);

		
		JLabel lblNewLabel_13 = new JLabel("Cádiz");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(163, 395, 88, 13);
		panelAndalucia.add(lblNewLabel_13);
		
		JLabel malaga = new JLabel("Malaga");
		malaga.setBounds(331, 384, 64, 60);
		panelAndalucia.add(malaga);
		
		JLabel fondoAndalucia = new JLabel("New label");
		fondoAndalucia.setBounds(0, -13, 729, 581);
		panelAndalucia.add(fondoAndalucia);
		
		//IMAGENES ADAPTADAS
			
		
		image = andalucia.getImage().getScaledInstance(fondoAndalucia.getWidth(), fondoAndalucia.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoAndalucia.setIcon(r);
		
		image = castilla_leon.getImage().getScaledInstance(fondoCastillaLeon.getWidth(), fondoCastillaLeon.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCastillaLeon.setIcon(r);
		
		
		image = galicia_img.getImage().getScaledInstance(fondoGalicia.getWidth(), fondoGalicia.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoGalicia.setIcon(r);
		
		image = clm.getImage().getScaledInstance(fondoCLM.getWidth(), fondoCLM.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		fondoCLM.setIcon(r);
		
		image = pais_vasco_img.getImage().getScaledInstance(lblNewLabelFonoPaisVasco.getWidth(), lblNewLabelFonoPaisVasco.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		lblNewLabelFonoPaisVasco.setIcon(r);
		
		image = espania_img.getImage().getScaledInstance(lblNewLabelFondoMapaEspania.getWidth(), lblNewLabelFondoMapaEspania.getHeight(), Image.SCALE_SMOOTH);
		r = new ImageIcon(image);
		lblNewLabelFondoMapaEspania.setIcon(r);
		
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

	public JComboBox getComboBoxComunidades() {
		return comboBoxComunidades;
	}

	public JComboBox getComboBoxDia() {
		return comboBoxDia;
	}

	public JPanel getPanelGalicia() {
		return panelGalicia;
	}

	public JLabel getMaxCorunia() {
		return maxCorunia;
	}

	public JLabel getMinCorunia() {
		return minCorunia;
	}

	public JLabel getPontevedra() {
		return pontevedra;
	}

	public JLabel getMaxPontevedra() {
		return maxPontevedra;
	}

	public JLabel getMinPontevedra() {
		return minPontevedra;
	}

	public JLabel getOurense() {
		return ourense;
	}

	public JLabel getMaxOurense() {
		return maxOurense;
	}

	public JLabel getMinOurense() {
		return minOurense;
	}

	public JLabel getLugo() {
		return lugo;
	}

	public JLabel getMaxLugo() {
		return maxLugo;
	}

	public JLabel getMinLugo() {
		return minLugo;
	}

	public ContenedorProvinciasJLabels getContenedorLista() {
		return contenedorProvincias;
	}

	public JLabel getLblNewLabelProvinciaSeleccionada() {
		return lblNewLabelProvinciaSeleccionada;
	}


	public JPanel getPanelPaisVasco() {
		return panelPaisVasco;
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

	public void mostrarPanel(Container contenedor,JPanel panelVisibilizar) {
		Component[] components = contenedor.getComponents();

        for (Component component : components) {
            if (component instanceof JPanel) { 
               JPanel panel= (JPanel)component;
               if(!panel.equals(panelVisibilizar) && !panel.equals(getPanelControles())) {
            	   panel.setVisible(false);
               }else if(panel.equals(panelVisibilizar)) {
            	   panel.setVisible(true);
               }
            }
        }
	}
}
