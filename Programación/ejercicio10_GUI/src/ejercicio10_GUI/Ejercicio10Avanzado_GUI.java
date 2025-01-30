package ejercicio10_GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio10Avanzado_GUI {

	private JFrame frmEjercicioAvanzado;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField1eva;
	private JTextField textField2eva;
	private JTextField textField3eva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10Avanzado_GUI window = new Ejercicio10Avanzado_GUI();
					window.frmEjercicioAvanzado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio10Avanzado_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicioAvanzado = new JFrame();
		frmEjercicioAvanzado.setTitle("Ejercicio 10 Avanzado");
		frmEjercicioAvanzado.setBounds(100, 100, 450, 300);
		frmEjercicioAvanzado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioAvanzado.getContentPane().setLayout(null);
		
		JLabel lbl1eva = new JLabel("1ª Evaluación:");
		lbl1eva.setBounds(98, 12, 104, 15);
		frmEjercicioAvanzado.getContentPane().add(lbl1eva);
		
		JLabel lbl2eva = new JLabel("2ª Evaluación:");
		lbl2eva.setBounds(98, 64, 104, 15);
		frmEjercicioAvanzado.getContentPane().add(lbl2eva);
		
		JLabel lbl3eva = new JLabel("3ª Evaluación:");
		lbl3eva.setBounds(98, 116, 104, 15);
		frmEjercicioAvanzado.getContentPane().add(lbl3eva);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(228, 194, 70, 15);
		frmEjercicioAvanzado.getContentPane().add(lblResultado);
		
		JLabel lblComprobante = new JLabel("");
		lblComprobante.setBounds(132, 221, 166, 30);
		frmEjercicioAvanzado.getContentPane().add(lblComprobante);
		
		JLabel lblComprobante1eva = new JLabel("");
		lblComprobante1eva.setBounds(316, 12, 89, 15);
		frmEjercicioAvanzado.getContentPane().add(lblComprobante1eva);
		
		JLabel lblComprobante2eva = new JLabel("");
		lblComprobante2eva.setBounds(316, 64, 89, 15);
		frmEjercicioAvanzado.getContentPane().add(lblComprobante2eva);
		
		JLabel lblComprobante3eva = new JLabel("");
		lblComprobante3eva.setBounds(316, 116, 89, 15);
		frmEjercicioAvanzado.getContentPane().add(lblComprobante3eva);
		
		JButton btnCalcularMedia = new JButton("Calcular Media");
		btnCalcularMedia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				float eva1 , eva2 , eva3;
				
				eva1=Integer.parseInt(textField1eva.getText());
				
				if (eva1>=5) {
					lblComprobante1eva.setText("APROBADO");
					lblComprobante1eva.setForeground(Color.green);
				}else {
					lblComprobante1eva.setText("SUSPENDIDO");
					lblComprobante1eva.setForeground(Color.red);
				}
				
				eva2=Integer.parseInt(textField2eva.getText());
				
				if (eva2>=5) {
					lblComprobante2eva.setText("APROBADO");
					lblComprobante2eva.setForeground(Color.green);
				}else {
					lblComprobante2eva.setText("SUSPENDIDO");
					lblComprobante2eva.setForeground(Color.red);
				}
				
				eva3=Integer.parseInt(textField3eva.getText());
				
				if (eva3>=5) {
					lblComprobante3eva.setText("APROBADO");
					lblComprobante3eva.setForeground(Color.green);
				}else {
					lblComprobante3eva.setText("SUSPENDIDO");
					lblComprobante3eva.setForeground(Color.red);
				}
				
				float media=(eva1+eva2+eva3)/3;
	
				lblResultado.setText(String.valueOf(media));
				
				if (media>=5) {
					lblComprobante.setText("APROBADO");
					lblComprobante.setForeground(Color.green);
				}else {
					lblComprobante.setText("SUSPENDIDO");
					lblComprobante.setForeground(Color.red);
				}}}
				
				
			
		);
		btnCalcularMedia.setBounds(145, 153, 138, 25);
		frmEjercicioAvanzado.getContentPane().add(btnCalcularMedia);
		
		JLabel lblMedia = new JLabel("Media:");
		lblMedia.setBounds(98, 194, 70, 15);
		frmEjercicioAvanzado.getContentPane().add(lblMedia);
		
		textField1eva = new JTextField();
		textField1eva.setBounds(228, 12, 70, 15);
		frmEjercicioAvanzado.getContentPane().add(textField1eva);
		textField1eva.setColumns(10);
		
		textField2eva = new JTextField();
		textField2eva.setColumns(10);
		textField2eva.setBounds(228, 62, 70, 15);
		frmEjercicioAvanzado.getContentPane().add(textField2eva);
		
		textField3eva = new JTextField();
		textField3eva.setColumns(10);
		textField3eva.setBounds(228, 114, 70, 15);
		frmEjercicioAvanzado.getContentPane().add(textField3eva);
		}
	

	}

