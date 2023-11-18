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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelEspania;
	private JLabel lblNewLabelFondoMapaEspania;

	private ContenedorProvinciasJLabels contenedorProvincias;
	private ProvinciaJLabels provincia;
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
	private JLabel lblNewLabelBilbao;
	private JLabel lblNewLabelVitoria;
	private JLabel lblNewLabelProvinciaSeleccionada;
	private JLabel lblNewLabelMinVitoria;
	private JLabel lblNewLabelMaxVictoria;
	private JLabel lblNewLabelMinBilbao;
	private JLabel lblNewLabelMaxBilbao;
	private List<JLabel> componentes;
	private JLabel lblNewLabelMinCorunia;
	private JLabel lblNewLabelMaxOurense;
	private JLabel lblMinOurense;
	private JLabel lblNewLabelMaxLugo;
	private JLabel lblNewLabelMinLugo;
	private JLabel lblNewLabelOurense;
	private JLabel lblNewLabelGalicia_img;
	private JLabel lblNewLabelLugoLBL;
	private JLabel lblNewLabel_2;
	private JLabel labelMaxCorunia;
	private JLabel lblNewLabelCorunia;
	private JLabel lblNewLabelMinPontevedra;
	private JLabel lblNewLabelMaxPontevedra;
	private JLabel lblNewLabelPontevedra;
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
		
		
		this.componentes = new ArrayList<JLabel>();
		this.contenedorProvincias = new ContenedorProvinciasJLabels();
		this.labels = new ArrayList<JLabel>();
		ImageIcon inicio_img = new ImageIcon(getClass().getResource("/imagenes/fondo_inicio.jpg").getPath());
		
			
		ImageIcon galicia_img = new ImageIcon(getClass().getResource("/imagenes/galicia.png").getPath());
		ImageIcon espania_img = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		ImageIcon pais_vasco_img = new ImageIcon(getClass().getResource("/imagenes/alava.png").getPath());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
	
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
		
		maxPontevedra = new JLabel("New label");
		maxPontevedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxPontevedra.setBounds(182, 391, 113, 13);
		panelGalicia.add(maxPontevedra);
		
		minPontevedra = new JLabel("New label");
		minPontevedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minPontevedra.setBounds(183, 427, 84, 13);
		panelGalicia.add(minPontevedra);
		
		ourense = new JLabel("Ourense");
		ourense.setBounds(406, 460, 59, 56);
		panelGalicia.add(ourense);
		
		maxOurense = new JLabel("New label");
		maxOurense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxOurense.setBounds(491, 469, 77, 13);
		panelGalicia.add(maxOurense);
		
		minOurense = new JLabel("New label");
		minOurense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minOurense.setBounds(491, 516, 90, 13);
		panelGalicia.add(minOurense);
		
		lugo = new JLabel("Lugo");
		lugo.setBounds(491, 158, 63, 56);
		panelGalicia.add(lugo);
		
		maxLugo = new JLabel("New label");
		maxLugo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxLugo.setBounds(578, 136, 77, 13);
		panelGalicia.add(maxLugo);
		
		minLugo = new JLabel("New label");
		minLugo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minLugo.setBounds(578, 178, 77, 13);
		panelGalicia.add(minLugo);
		
		maxCorunia = new JLabel("New label");
		maxCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		maxCorunia.setBounds(205, 156, 77, 13);
		panelGalicia.add(maxCorunia);
		
		minCorunia = new JLabel("New label");
		minCorunia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minCorunia.setBounds(205, 190, 90, 13);
		panelGalicia.add(minCorunia);
		
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
		
		fondoGalicia = new JLabel(galicia_img);
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

		lblNewLabelFondoMapaEspania = new JLabel(espania_img);
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
		
		JLabel lblNewLabel_6 = new JLabel("Fecha: ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(188, 24, 59, 21);
		panelControles.add(lblNewLabel_6);

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

	

	public JPanel getPanelControles() {
		return panelControles;
	}

	public JPanel getPanelEspania() {
		return panelEspania;
	}
}
