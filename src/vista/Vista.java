package vista;

import controlador.Controlador;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;

import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.Icon;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabelCiudad;
	private JLabel lblNewLabelEstadocClimatico;
	private JLabel lblNewLabelTmpMax;
	private JLabel lblNewLabelTmpMinima;
	private JComboBox comboBoxCiudades;
	private JLabel lblNewLabelFondoMapas;

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
		
		JPanel panelEspania = new JPanel();
		panelEspania.setBounds(0, 0, 729, 685);
		contentPane.add(panelEspania);
		panelEspania.setLayout(null);
		
		ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/mapa_espania.jpg").getPath());
		
		JLabel lblNewLabelCantabria = new JLabel("Cantabria");
		lblNewLabelCantabria.setBounds(267, 42, 44, 13);
		panelEspania.add(lblNewLabelCantabria);
		
		JLabel lblNewLabelCastillaLeon = new JLabel("Castilla-Leon");
		lblNewLabelCastillaLeon.setBounds(299, 135, 58, 13);
		panelEspania.add(lblNewLabelCastillaLeon);
		
		JLabel lblNewLabelGalicia = new JLabel("Galicia");
		lblNewLabelGalicia.setBounds(184, 80, 30, 13);
		panelEspania.add(lblNewLabelGalicia);
		
		JLabel lblNewLabelBaleares = new JLabel("Baleares");
		lblNewLabelBaleares.setBounds(612, 246, 39, 13);
		panelEspania.add(lblNewLabelBaleares);
		
		JLabel lblNewLabelCanarias = new JLabel("Canarias");
		lblNewLabelCanarias.setBounds(98, 490, 40, 13);
		panelEspania.add(lblNewLabelCanarias);
		
		JLabel lblNewLabelNavarra = new JLabel("Navarra");
		lblNewLabelNavarra.setBounds(398, 42, 36, 13);
		panelEspania.add(lblNewLabelNavarra);
		
		JLabel lblNewLabelValencia = new JLabel("Valencia");
		lblNewLabelValencia.setBounds(481, 257, 38, 13);
		panelEspania.add(lblNewLabelValencia);
		
		JLabel lblNewLabelCatalunia = new JLabel("Cataluña");
		lblNewLabelCatalunia.setBounds(569, 135, 40, 13);
		panelEspania.add(lblNewLabelCatalunia);
		
		JLabel lblNewLabelAragon = new JLabel("Aragon");
		lblNewLabelAragon.setBounds(481, 154, 33, 13);
		panelEspania.add(lblNewLabelAragon);
		
		JLabel lblNewLabelMurcia = new JLabel("Murcia");
		lblNewLabelMurcia.setBounds(454, 332, 30, 13);
		panelEspania.add(lblNewLabelMurcia);
		
		JLabel lblNewLabelCastllaLaMancha = new JLabel("Castilla la Mancha");
		lblNewLabelCastllaLaMancha.setBounds(373, 257, 82, 13);
		panelEspania.add(lblNewLabelCastllaLaMancha);
		
		JLabel lblNewLabelMadrid = new JLabel("Madrid");
		lblNewLabelMadrid.setBounds(357, 200, 31, 13);
		panelEspania.add(lblNewLabelMadrid);
		
		JLabel lblNewLabelExtremadura = new JLabel("Extremadura");
		lblNewLabelExtremadura.setBounds(250, 269, 58, 13);
		panelEspania.add(lblNewLabelExtremadura);
		
		lblNewLabelTmpMinima = new JLabel("New label");
		lblNewLabelTmpMinima.setBounds(228, 565, 55, 16);
		lblNewLabelTmpMinima.setFont(new Font("Dialog", Font.BOLD, 12));
		panelEspania.add(lblNewLabelTmpMinima);
		
		JLabel lblNewLabel = new JLabel("Ciudad: ");
		lblNewLabel.setBounds(31, 566, 48, 15);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelEspania.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estado climatico: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 580, 126, 27);
		panelEspania.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Maxima:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(25, 608, 104, 27);
		panelEspania.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Minima: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(31, 533, 97, 23);
		panelEspania.add(lblNewLabel_3);
		
		lblNewLabelCiudad = new JLabel("New label");
		lblNewLabelCiudad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelCiudad.setBounds(228, 587, 156, 22);
		panelEspania.add(lblNewLabelCiudad);
		
		lblNewLabelEstadocClimatico = new JLabel("New label");
		lblNewLabelEstadocClimatico.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelEstadocClimatico.setBounds(228, 618, 151, 20);
		panelEspania.add(lblNewLabelEstadocClimatico);
		
		lblNewLabelTmpMax = new JLabel("New label");
		lblNewLabelTmpMax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelTmpMax.setBounds(228, 542, 119, 13);
		panelEspania.add(lblNewLabelTmpMax);
		
		comboBoxCiudades = new JComboBox();
		comboBoxCiudades.setBackground(new Color(255, 255, 255));
		comboBoxCiudades.setBounds(559, 535, 143, 21);
		panelEspania.add(comboBoxCiudades);
		
		JLabel lblNewLabelPaisVasco = new JLabel("Pais Vasco");
		lblNewLabelPaisVasco.setBounds(343, 42, 45, 13);
		panelEspania.add(lblNewLabelPaisVasco);
		
		JLabel lblNewLabelLaRioja = new JLabel("La Rioja");
		lblNewLabelLaRioja.setBounds(398, 90, 39, 23);
		panelEspania.add(lblNewLabelLaRioja);
		
		JLabel lblNewLabelAndalucia = new JLabel("Andalucia");
		lblNewLabelAndalucia.setBounds(312, 347, 45, 13);
		panelEspania.add(lblNewLabelAndalucia);
		
		JLabel lblNewLabelPamplona = new JLabel("Pamplona");
		lblNewLabelPamplona.setBounds(430, 65, 45, 13);
		panelEspania.add(lblNewLabelPamplona);
		lblNewLabelFondoMapas = new JLabel(fondo);
		lblNewLabelFondoMapas.setBackground(Color.WHITE);
		lblNewLabelFondoMapas.setBounds(10, 10, 709, 515);
		panelEspania.add(lblNewLabelFondoMapas);
		
		
		
		
	}

	
	
	public JLabel getLblNewLabelFondoMapas() {
		return lblNewLabelFondoMapas;
	}

	public JLabel getLblNewLabelTmpMinima() {
		return lblNewLabelTmpMinima;
	}

	public JComboBox getComboBoxCiudades() {
		return comboBoxCiudades;
	}

	public JLabel getLblNewLabelCiudad() {
		return lblNewLabelCiudad;
	}

	public JLabel getLblNewLabelEstadocClimatico() {
		return lblNewLabelEstadocClimatico;
	}

	public JLabel getLblNewLabelTmpMax() {
		return lblNewLabelTmpMax;
	}

	public JPanel getContentPane() {
		return contentPane;
	}
}
