package vista;

import controlador.Controlador;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

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
	// private List <JLabel> labels ;
	private JPanel panelEspania;
	private JComboBox comboBoxCiudades;
	private JLabel lblNewLabelFondoMapas;

	private ContenedorProvinciasEtiquetas contenedorLista;
	private List<JLabel> bilbao;
	private EtiquetasProvincias objetoLista;
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
	private JComboBox comboBoxDia;
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
	private JLabel lblNewLabelDonostia;
	private JLabel lblNewLabelVitoria;
	private JLabel lblNewLabelProvinciaSeleccionada;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabelMinVitoria;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabelMaxVictoria;
	private JLabel lblNewLabelMinDonosti;
	private JLabel lblNewLabelMaxDonosti;
	private JLabel lblNewLabelMinBilbao;
	private JLabel lblNewLabelMaxBilbao;
	private JPanel panelProvincias;

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
		this.contenedorLista = new ContenedorProvinciasEtiquetas();
		objetoLista  = new EtiquetasProvincias("Bilbao");
		this.labels = new ArrayList<JLabel>();
		this.bilbao = new ArrayList<JLabel>();
		ImageIcon fondo1 = new ImageIcon(getClass().getResource("/imagenes/fondo_inicio.jpg").getPath());

		ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		ImageIcon alava = new ImageIcon(getClass().getResource("/imagenes/alava.png").getPath());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelInicio = new JPanel();
		panelInicio.setLayout(null);
		panelInicio.setBounds(0, 0, 729, 685);
		contentPane.add(panelInicio);

		irAlMapa = new JButton("Iniciar");
		irAlMapa.setForeground(new Color(0, 0, 0));
		irAlMapa.setFont(new Font("Tahoma", Font.BOLD, 16));
		irAlMapa.setBounds(269, 328, 117, 48);
		panelInicio.add(irAlMapa);

		JLabel lblNewLabel_1 = new JLabel(fondo1);
		lblNewLabel_1.setBounds(0, 10, 729, 675);
		panelInicio.add(lblNewLabel_1);
		//panelInicio.setVisible(false);
		
		panelEspania = new JPanel();
		panelEspania.setBounds(0, 0, 729, 685);
		contentPane.add(panelEspania);
		panelEspania.setLayout(null);
		panelEspania.setVisible(false);

		lblNewLabelCastellonDeLaPlana = new JLabel("Castellon_de_la_Plana_Castello_de_la_Plana");
		lblNewLabelCastellonDeLaPlana.setBounds(473, 240, 28, 25);

		labels.add(lblNewLabelCastellonDeLaPlana);
		panelEspania.add(lblNewLabelCastellonDeLaPlana);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		panelEspania.add(scrollPane);

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

		JLabel lblNewLabel = new JLabel("Ciudad: ");
		lblNewLabel.setBounds(494, 546, 66, 15);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelEspania.add(lblNewLabel);

		comboBoxCiudades = new JComboBox();
		comboBoxCiudades.setBackground(new Color(255, 255, 255));
		comboBoxCiudades.setBounds(559, 540, 143, 21);
		panelEspania.add(comboBoxCiudades);

		lblNewLabelFondoMapas = new JLabel(fondo);
		lblNewLabelFondoMapas.setBackground(Color.WHITE);
		lblNewLabelFondoMapas.setBounds(20, 10, 709, 515);
		panelEspania.add(lblNewLabelFondoMapas);

		comboBoxDia = new JComboBox();
		comboBoxDia.setBounds(386, 540, 77, 21);
		panelEspania.add(comboBoxDia);

		JLabel lblNewLabel_4 = new JLabel("Día:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(347, 546, 44, 15);
		panelEspania.add(lblNewLabel_4);

		panelProvincias = new JPanel();
		panelProvincias.setBounds(0, 0, 729, 685);
		contentPane.add(panelProvincias);
		panelProvincias.setLayout(null);

		lblNewLabelMaxVictoria = new JLabel("max");
		lblNewLabelMaxVictoria.setBounds(285, 343, 45, 13);
		//bilbao.add(lblNewLabelMaxVictoria);
		//panelProvincias.add(lblNewLabelMaxVictoria);

		lblNewLabelMinDonosti = new JLabel("New label");
		lblNewLabelMinDonosti.setBounds(498, 235, 45, 13);
		//bilbao.add(lblNewLabelMinDonosti);
		// panelProvincias.add(lblNewLabelMinDonosti);

		lblNewLabelMaxDonosti = new JLabel("New label");
		lblNewLabelMaxDonosti.setBounds(498, 198, 45, 13);
		//bilbao.add(lblNewLabelMinDonosti);
		// panelProvincias.add(lblNewLabelMaxDonosti);

		lblNewLabelMinBilbao = new JLabel("min");
		lblNewLabelMinBilbao.setBounds(307, 165, 45, 13);
		bilbao.add(lblNewLabelMinBilbao);
		//panelProvincias.add(lblNewLabelMinBilbao);

		lblNewLabelMaxBilbao = new JLabel("max");
		lblNewLabelMaxBilbao.setBounds(303, 134, 45, 13);
		bilbao.add(lblNewLabelMaxBilbao);
		//panelProvincias.add(lblNewLabelMaxBilbao);

		lblNewLabelMinVitoria = new JLabel("min");
		lblNewLabelMinVitoria.setBounds(285, 377, 45, 19);
		//bilbao.add(lblNewLabelMinVitoria);
		//panelProvincias.add(lblNewLabelMinVitoria);

		lblNewLabelDonostia = new JLabel("Donostia_San_Sebastian");
		lblNewLabelDonostia.setBounds(422, 211, 60, 60);
		//bilbao.add(lblNewLabelDonostia);
		// panelProvincias.add(lblNewLabelDonostia);

		lblNewLabelVitoria = new JLabel("Vitoria-Gasteiz");
		lblNewLabelVitoria.setBounds(203, 336, 60, 60);
		//bilbao.add(lblNewLabelVitoria);
		// panelProvincias.add(lblNewLabelVitoria);

		lblNewLabelBilbao = new JLabel("Bilbao");
		lblNewLabelBilbao.setBounds(237, 141, 60, 60);
		bilbao.add(lblNewLabelBilbao);
		// panelProvincias.add(lblNewLabelBilbao);

		lblNewLabel_5 = new JLabel(alava);
		lblNewLabel_5.setBounds(10, 81, 693, 482);
		panelProvincias.add(lblNewLabel_5);

		lblNewLabelProvinciaSeleccionada = new JLabel("Provincia Seleccionada");
		lblNewLabelProvinciaSeleccionada.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelProvinciaSeleccionada.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabelProvinciaSeleccionada.setBounds(203, 24, 228, 47);
		panelProvincias.add(lblNewLabelProvinciaSeleccionada);

		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(285, 354, 45, 13);
		panelProvincias.add(lblNewLabel_2);
		panelProvincias.setVisible(false);
	
	
		
		contenedorLista.getListas().add(objetoLista);
	}

	
	
	public ContenedorProvinciasEtiquetas getContenedor() {
		return contenedorLista;
	}

	

	public JLabel getLblNewLabelProvinciaSeleccionada() {
		return lblNewLabelProvinciaSeleccionada;
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

	public JComboBox getComboBoxDia() {
		return comboBoxDia;
	}

	public JLabel getLblNewLabelFondoMapas() {
		return lblNewLabelFondoMapas;
	}

	
	public JPanel getPanelProvincias() {
		return panelProvincias;
	}

	public JComboBox getComboBoxCiudades() {
		return comboBoxCiudades;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelEspania() {
		return panelEspania;
	}
	
	public void mostrarProvincia(List<JLabel> etiquetas) {
		for (JLabel jLabel : etiquetas) {
			panelProvincias.add(jLabel);
		}
	}

	public void mostrarMapaEspania() {

		for (JLabel jLabel : this.labels) {
			panelEspania.add(jLabel);
		}
	}
	public void refrescarEpania() {
		panelEspania.repaint();
		panelEspania.revalidate();
	}

	
	
}
