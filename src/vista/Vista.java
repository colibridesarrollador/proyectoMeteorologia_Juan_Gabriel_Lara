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


public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//private List <JLabel> labels ;
	private JPanel panelEspania;
	private JComboBox comboBoxCiudades;
	private JLabel lblNewLabelFondoMapas;
	
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
	private JLabel lblNewLabelCastllaLaNavarra;
	private JLabel lblNewLabelPalencia;
	private JLabel lblNewLabelAlava;
	private JComboBox comboBoxDia;
	private JLabel lblNewLabelAlicante;
	private JLabel lblNewLabelLaRioja;
	private JLabel lblNewLabelAsturias;
	private JLabel lblNewLabelMalaga;
	private JLabel lblNewLabelCantabria;
	private JLabel lblNewLabelPntevedra;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelEspania = new JPanel();
		panelEspania.setBounds(0, 0, 729, 685);
		contentPane.add(panelEspania);
		panelEspania.setLayout(null);
		
		lblNewLabelAlicante = new JLabel("Alicante_Alacant");
		lblNewLabelAlicante.setBounds(444, 331, 45, 13);
		panelEspania.add(lblNewLabelAlicante);
		
		//labels = new ArrayList<>();
		
		
		ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		
		
		lblNewLabelLasPalmas = new JLabel("Palma_de_Mallorca");
		lblNewLabelLasPalmas.setBounds(615, 460, 45, 13);
		panelEspania.add(lblNewLabelLasPalmas);
		
		lblNewLabelSantaCruzTenerife = new JLabel("Santa_Cruz_de_Tenerife");
		lblNewLabelSantaCruzTenerife.setBounds(494, 455, 45, 23);
		panelEspania.add(lblNewLabelSantaCruzTenerife);
		
		lblNewLabelCadiz = new JLabel("Cadiz");
		lblNewLabelCadiz.setBounds(231, 427, 45, 13);
		panelEspania.add(lblNewLabelCadiz);
		
		lblNewLabelGranada = new JLabel("Granada");
		lblNewLabelGranada.setBounds(318, 394, 45, 13);
		panelEspania.add(lblNewLabelGranada);
		
		lblNewLabelAlmeria = new JLabel("Almeria");
		lblNewLabelAlmeria.setBounds(368, 394, 45, 13);
		panelEspania.add(lblNewLabelAlmeria);
		
		lblNewLabelJaen = new JLabel("Jaen");
		lblNewLabelJaen.setBounds(333, 348, 28, 13);
		panelEspania.add(lblNewLabelJaen);
		
		lblNewLabelCordoba = new JLabel("Cordoba");
		lblNewLabelCordoba.setBounds(265, 348, 45, 13);
		panelEspania.add(lblNewLabelCordoba);
		
		lblNewLabelSevilla = new JLabel("Sevilla");
		lblNewLabelSevilla.setBounds(231, 384, 45, 13);
		panelEspania.add(lblNewLabelSevilla);
		
		lblNewLabelHuelva = new JLabel("Huelva");
		lblNewLabelHuelva.setBounds(178, 373, 45, 13);
		panelEspania.add(lblNewLabelHuelva);
		
		lblNewLabelAlbacete = new JLabel("Albacete");
		lblNewLabelAlbacete.setBounds(386, 315, 45, 13);
		panelEspania.add(lblNewLabelAlbacete);
		
		lblNewLabelGuadalajara = new JLabel("Guadalajara");
		lblNewLabelGuadalajara.setBounds(357, 207, 45, 13);
		panelEspania.add(lblNewLabelGuadalajara);
		
		lblNewLabelMadrid = new JLabel("Madrid");
		lblNewLabelMadrid.setBounds(302, 227, 45, 13);
		panelEspania.add(lblNewLabelMadrid);
		
		lblNewLabelCuenca = new JLabel("Cuenca");
		lblNewLabelCuenca.setBounds(368, 257, 45, 13);
		panelEspania.add(lblNewLabelCuenca);
		
		lblNewLabelCiudadReal = new JLabel("Ciudad_Real");
		lblNewLabelCiudadReal.setBounds(302, 315, 45, 13);
		panelEspania.add(lblNewLabelCiudadReal);
		
		lblNewLabelBadajoz = new JLabel("Badajoz");
		lblNewLabelBadajoz.setBounds(203, 315, 45, 13);
		panelEspania.add(lblNewLabelBadajoz);
		
		lblNewLabelToledo = new JLabel("Toledo");
		lblNewLabelToledo.setBounds(280, 257, 45, 13);
		panelEspania.add(lblNewLabelToledo);
		
		lblNewLabelCaceres = new JLabel("Caceres");
		lblNewLabelCaceres.setBounds(206, 267, 45, 13);
		panelEspania.add(lblNewLabelCaceres);
		
		lblNewLabelTeruel = new JLabel("Teruel");
		lblNewLabelTeruel.setBounds(417, 212, 45, 13);
		panelEspania.add(lblNewLabelTeruel);
		
		lblNewLabelTarragona = new JLabel("Tarragona");
		lblNewLabelTarragona.setBounds(494, 192, 45, 13);
		panelEspania.add(lblNewLabelTarragona);
		
		lblNewLabelLerida = new JLabel("Lleida");
		lblNewLabelLerida.setBounds(494, 158, 45, 13);
		panelEspania.add(lblNewLabelLerida);
		
		lblNewLabelBarcelona = new JLabel("Barcelona");
		lblNewLabelBarcelona.setBounds(529, 169, 45, 13);
		panelEspania.add(lblNewLabelBarcelona);
		
		lblNewLabelGerona = new JLabel("Gerona");
		lblNewLabelGerona.setBounds(559, 135, 45, 13);
		panelEspania.add(lblNewLabelGerona);
		
		lblNewLabelZaragoza = new JLabel("Zaragoza");
		lblNewLabelZaragoza.setBounds(402, 169, 45, 13);
		panelEspania.add(lblNewLabelZaragoza);
		
		lblNewLabelSoria = new JLabel("Soria");
		lblNewLabelSoria.setBounds(347, 169, 45, 13);
		panelEspania.add(lblNewLabelSoria);
		
		lblNewLabelSegovia = new JLabel("Segovia");
		lblNewLabelSegovia.setBounds(295, 192, 45, 13);
		panelEspania.add(lblNewLabelSegovia);
		
		lblNewLabelAvila = new JLabel("Avila");
		lblNewLabelAvila.setBounds(263, 217, 45, 13);
		panelEspania.add(lblNewLabelAvila);
		
		lblNewLabelSalamanca = new JLabel("Salamanca");
		lblNewLabelSalamanca.setBounds(218, 202, 30, 23);
		panelEspania.add(lblNewLabelSalamanca);
		
		lblNewLabelBurgos = new JLabel("Burgos");
		lblNewLabelBurgos.setBounds(317, 128, 30, 27);
		panelEspania.add(lblNewLabelBurgos);
		
		lblNewLabelValladolid = new JLabel("Valladolid");
		lblNewLabelValladolid.setBounds(263, 169, 45, 13);
		panelEspania.add(lblNewLabelValladolid);
		
		lblNewLabelZamora = new JLabel("Zamora");
		lblNewLabelZamora.setBounds(218, 169, 45, 13);
		panelEspania.add(lblNewLabelZamora);
		
		lblNewLabelHuesca = new JLabel("Huesca");
		lblNewLabelHuesca.setBounds(458, 135, 45, 13);
		panelEspania.add(lblNewLabelHuesca);
		
		lblNewLabelLugo = new JLabel("Lugo");
		lblNewLabelLugo.setBounds(160, 90, 44, 13);
		panelEspania.add(lblNewLabelLugo);
		
		lblNewLabelLeon = new JLabel("Leon");
		lblNewLabelLeon.setBounds(218, 115, 58, 13);
		panelEspania.add(lblNewLabelLeon);
		
		lblNewLabelLaCorunia = new JLabel("A_Coruja");
		lblNewLabelLaCorunia.setBounds(105, 80, 45, 23);
		panelEspania.add(lblNewLabelLaCorunia);
		
		lblNewLabelBaleares = new JLabel("Baleares");
		lblNewLabelBaleares.setBounds(573, 267, 39, 13);
		panelEspania.add(lblNewLabelBaleares);
		
		lblNewLabelOrense = new JLabel("Ourense");
		lblNewLabelOrense.setBounds(160, 135, 36, 13);
		panelEspania.add(lblNewLabelOrense);
		
		lblNewLabelValencia = new JLabel("Valencia");
		lblNewLabelValencia.setBounds(430, 291, 38, 13);
		panelEspania.add(lblNewLabelValencia);
		
		lblNewLabeGuipuzcua = new JLabel("Pamplona_Iruna");
		lblNewLabeGuipuzcua.setBounds(373, 85, 40, 13);
		panelEspania.add(lblNewLabeGuipuzcua);
		
		lblNewLabelViscaya = new JLabel("Bilbao");
		lblNewLabelViscaya.setBounds(333, 80, 44, 13);
		panelEspania.add(lblNewLabelViscaya);
		
		lblNewLabelMurcia = new JLabel("Murcia");
		lblNewLabelMurcia.setBounds(401, 361, 30, 13);
		panelEspania.add(lblNewLabelMurcia);
		
		lblNewLabelCastllaLaNavarra = new JLabel("Navarra");
		lblNewLabelCastllaLaNavarra.setBounds(387, 108, 44, 27);
		panelEspania.add(lblNewLabelCastllaLaNavarra);
		
		lblNewLabelPalencia = new JLabel("Palencia");
		lblNewLabelPalencia.setBounds(265, 126, 43, 27);
		panelEspania.add(lblNewLabelPalencia);
		
		lblNewLabelAlava = new JLabel("Alava");
		lblNewLabelAlava.setBounds(347, 108, 30, 13);
		panelEspania.add(lblNewLabelAlava);
		
		
		lblNewLabelPntevedra = new JLabel("Pontevedra");
		lblNewLabelPntevedra.setBounds(105, 135, 45, 13);
		panelEspania.add(lblNewLabelPntevedra);
		
		lblNewLabelCantabria = new JLabel("Santander");
		lblNewLabelCantabria.setBounds(295, 80, 39, 23);
		panelEspania.add(lblNewLabelCantabria);
		
		lblNewLabelLaRioja = new JLabel("Logrono");
		lblNewLabelLaRioja.setBounds(357, 135, 28, 24);
		panelEspania.add(lblNewLabelLaRioja);
		
		lblNewLabelAsturias = new JLabel("Oviedo");
		lblNewLabelAsturias.setBounds(218, 78, 45, 13);
		panelEspania.add(lblNewLabelAsturias);
		
		
		lblNewLabelMalaga = new JLabel("Malaga");
		lblNewLabelMalaga.setBounds(263, 404, 45, 13);
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
	}
	

	public JComboBox getComboBoxDia() {
		return comboBoxDia;
	}

	public JLabel getLblNewLabelFondoMapas() {
		return lblNewLabelFondoMapas;
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

	public JLabel getLblNewLabelLasPalmas() {
		return lblNewLabelLasPalmas;
	}

	public JLabel getLblNewLabelSantaCruzTenerife() {
		return lblNewLabelSantaCruzTenerife;
	}

	public JLabel getLblNewLabelCadiz() {
		return lblNewLabelCadiz;
	}

	public JLabel getLblNewLabelGranada() {
		return lblNewLabelGranada;
	}

	public JLabel getLblNewLabelAlmeria() {
		return lblNewLabelAlmeria;
	}

	public JLabel getLblNewLabelJaen() {
		return lblNewLabelJaen;
	}

	public JLabel getLblNewLabelCordoba() {
		return lblNewLabelCordoba;
	}

	public JLabel getLblNewLabelSevilla() {
		return lblNewLabelSevilla;
	}

	public JLabel getLblNewLabelHuelva() {
		return lblNewLabelHuelva;
	}

	public JLabel getLblNewLabelAlbacete() {
		return lblNewLabelAlbacete;
	}

	public JLabel getLblNewLabelGuadalajara() {
		return lblNewLabelGuadalajara;
	}

	public JLabel getLblNewLabelMadrid() {
		return lblNewLabelMadrid;
	}

	public JLabel getLblNewLabelCuenca() {
		return lblNewLabelCuenca;
	}

	public JLabel getLblNewLabelCiudadReal() {
		return lblNewLabelCiudadReal;
	}

	public JLabel getLblNewLabelBadajoz() {
		return lblNewLabelBadajoz;
	}

	public JLabel getLblNewLabelToledo() {
		return lblNewLabelToledo;
	}

	public JLabel getLblNewLabelCaceres() {
		return lblNewLabelCaceres;
	}

	public JLabel getLblNewLabelTeruel() {
		return lblNewLabelTeruel;
	}

	public JLabel getLblNewLabelTarragona() {
		return lblNewLabelTarragona;
	}

	public JLabel getLblNewLabelLerida() {
		return lblNewLabelLerida;
	}

	public JLabel getLblNewLabelBarcelona() {
		return lblNewLabelBarcelona;
	}

	public JLabel getLblNewLabelGerona() {
		return lblNewLabelGerona;
	}

	public JLabel getLblNewLabelZaragoza() {
		return lblNewLabelZaragoza;
	}

	public JLabel getLblNewLabelSoria() {
		return lblNewLabelSoria;
	}

	public JLabel getLblNewLabelSegovia() {
		return lblNewLabelSegovia;
	}

	public JLabel getLblNewLabelAvila() {
		return lblNewLabelAvila;
	}

	public JLabel getLblNewLabelSalamanca() {
		return lblNewLabelSalamanca;
	}

	public JLabel getLblNewLabelBurgos() {
		return lblNewLabelBurgos;
	}

	public JLabel getLblNewLabelValladolid() {
		return lblNewLabelValladolid;
	}

	public JLabel getLblNewLabelZamora() {
		return lblNewLabelZamora;
	}

	public JLabel getLblNewLabelHuesca() {
		return lblNewLabelHuesca;
	}

	public JLabel getLblNewLabelLugo() {
		return lblNewLabelLugo;
	}

	public JLabel getLblNewLabelLeon() {
		return lblNewLabelLeon;
	}

	public JLabel getLblNewLabelLaCorunia() {
		return lblNewLabelLaCorunia;
	}

	public JLabel getLblNewLabelBaleares() {
		return lblNewLabelBaleares;
	}

	public JLabel getLblNewLabelOrense() {
		return lblNewLabelOrense;
	}

	public JLabel getLblNewLabelValencia() {
		return lblNewLabelValencia;
	}

	public JLabel getLblNewLabeGuipuzcua() {
		return lblNewLabeGuipuzcua;
	}

	public JLabel getLblNewLabelViscaya() {
		return lblNewLabelViscaya;
	}

	public JLabel getLblNewLabelMurcia() {
		return lblNewLabelMurcia;
	}

	public JLabel getLblNewLabelCastllaLaNavarra() {
		return lblNewLabelCastllaLaNavarra;
	}

	public JLabel getLblNewLabelPalencia() {
		return lblNewLabelPalencia;
	}

	public JLabel getLblNewLabelAlava() {
		return lblNewLabelAlava;
	}

}
