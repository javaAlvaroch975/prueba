package ejercicio10_GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio10Intermedio_GUI {

	private JFrame frmEjercicioIntermedio;
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
					Ejercicio10Intermedio_GUI window = new Ejercicio10Intermedio_GUI();
					window.frmEjercicioIntermedio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio10Intermedio_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicioIntermedio = new JFrame();
		frmEjercicioIntermedio.setTitle("Ejercicio 10 Intermedio");
		frmEjercicioIntermedio.setBounds(100, 100, 450, 300);
		frmEjercicioIntermedio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioIntermedio.getContentPane().setLayout(null);
		
		JLabel lbl1eva = new JLabel("1ª Evaluación:");
		lbl1eva.setBounds(98, 12, 104, 15);
		frmEjercicioIntermedio.getContentPane().add(lbl1eva);
		
		JLabel lbl2eva = new JLabel("2ª Evaluación:");
		lbl2eva.setBounds(98, 64, 104, 15);
		frmEjercicioIntermedio.getContentPane().add(lbl2eva);
		
		JLabel lbl3eva = new JLabel("3ª Evaluación:");
		lbl3eva.setBounds(98, 116, 104, 15);
		frmEjercicioIntermedio.getContentPane().add(lbl3eva);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(228, 194, 70, 15);
		frmEjercicioIntermedio.getContentPane().add(lblResultado);
		
		JLabel lblComprobante = new JLabel("");
		lblComprobante.setBounds(132, 221, 166, 30);
		frmEjercicioIntermedio.getContentPane().add(lblComprobante);
		
		JButton btnCalcularMedia = new JButton("Calcular Media");
		btnCalcularMedia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				float eva1 , eva2 , eva3;
				
				eva1=Integer.parseInt(textField1eva.getText());
				eva2=Integer.parseInt(textField2eva.getText());
				eva3=Integer.parseInt(textField3eva.getText());
				
				float media=(eva1+eva2+eva3)/3;
	
				lblResultado.setText(String.valueOf(media));
				
				if (media>=5) {
					lblComprobante.setText("APROBADO");
					lblComprobante.setForeground(Color.green);
				}else {
					lblComprobante.setText("SUSPENDIDO");
					lblComprobante.setForeground(Color.red);
				}
				
				
			}
		});
		btnCalcularMedia.setBounds(145, 153, 138, 25);
		frmEjercicioIntermedio.getContentPane().add(btnCalcularMedia);
		
		JLabel lblMedia = new JLabel("Media:");
		lblMedia.setBounds(98, 194, 70, 15);
		frmEjercicioIntermedio.getContentPane().add(lblMedia);
		
		textField1eva = new JTextField();
		textField1eva.setColumns(10);
		textField1eva.setBounds(228, 12, 113, 17);
		frmEjercicioIntermedio.getContentPane().add(textField1eva);
		
		textField2eva = new JTextField();
		textField2eva.setColumns(10);
		textField2eva.setBounds(228, 64, 113, 17);
		frmEjercicioIntermedio.getContentPane().add(textField2eva);
		
		textField3eva = new JTextField();
		textField3eva.setColumns(10);
		textField3eva.setBounds(228, 116, 113, 17);
		frmEjercicioIntermedio.getContentPane().add(textField3eva);
		
		
	}

}
