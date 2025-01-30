package tema3Ejercicio44;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Prueba1 {

	private JFrame frmPrueba;
	private JTextField txtIntroduzcaSuNombre;
	private JTextField txtIndiqueSuEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 window = new Prueba1();
					window.frmPrueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prueba1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrueba = new JFrame();
		frmPrueba.setTitle("Prueba");
		frmPrueba.getContentPane().setBackground(new Color(87, 227, 137));
		frmPrueba.setBounds(100, 100, 549, 461);
		frmPrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrueba.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Login");
		lblNombre.setBounds(29, 38, 70, 15);
		frmPrueba.getContentPane().add(lblNombre);
		
		txtIntroduzcaSuNombre = new JTextField();
		txtIntroduzcaSuNombre.setBounds(120, 36, 159, 19);
		frmPrueba.getContentPane().add(txtIntroduzcaSuNombre);
		txtIntroduzcaSuNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Password");
		lblEdad.setBounds(29, 83, 70, 15);
		frmPrueba.getContentPane().add(lblEdad);
		
		txtIndiqueSuEdad = new JTextField();
		txtIndiqueSuEdad.setBounds(120, 81, 114, 19);
		frmPrueba.getContentPane().add(txtIndiqueSuEdad);
		txtIndiqueSuEdad.setColumns(10);
		
		JButton btnEnviar = new JButton("Acceder");
		btnEnviar.setBounds(136, 238, 117, 25);
		frmPrueba.getContentPane().add(btnEnviar);
		
		JCheckBox chckbxGuardarMiLogin = new JCheckBox("Guardar mi login durante 3 meses");
		chckbxGuardarMiLogin.setBounds(29, 128, 266, 23);
		frmPrueba.getContentPane().add(chckbxGuardarMiLogin);
		
		JLabel lblResolucin = new JLabel("Resolución");
		lblResolucin.setBounds(29, 188, 82, 15);
		frmPrueba.getContentPane().add(lblResolucin);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(289, 238, 117, 25);
		frmPrueba.getContentPane().add(btnCancelar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(120, 299, 300, 23);
		frmPrueba.getContentPane().add(textArea);
		
		JLabel lblBuscar = new JLabel("Buscar: ");
		lblBuscar.setBounds(29, 299, 70, 15);
		frmPrueba.getContentPane().add(lblBuscar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1024x768", "1280x720", "1280x1024"}));
		comboBox.setBounds(120, 188, 184, 24);
		frmPrueba.getContentPane().add(comboBox);
	}
}
