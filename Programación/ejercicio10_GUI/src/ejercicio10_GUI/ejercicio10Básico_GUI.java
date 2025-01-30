package ejercicio10_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ejercicio10Básico_GUI {

	private JFrame frmEjercicioBsico;
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
					ejercicio10Básico_GUI window = new ejercicio10Básico_GUI();
					window.frmEjercicioBsico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejercicio10Básico_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicioBsico = new JFrame();
		frmEjercicioBsico.setTitle("Ejercicio 10 Básico");
		frmEjercicioBsico.setBounds(100, 100, 450, 300);
		frmEjercicioBsico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioBsico.getContentPane().setLayout(null);
		
		JLabel lbl1eva = new JLabel("1ª Evaluación:");
		lbl1eva.setBounds(98, 29, 104, 15);
		frmEjercicioBsico.getContentPane().add(lbl1eva);
		
		JLabel lbl2eva = new JLabel("2ª Evaluación:");
		lbl2eva.setBounds(98, 81, 104, 15);
		frmEjercicioBsico.getContentPane().add(lbl2eva);
		
		JLabel lbl3eva = new JLabel("3ª Evaluación:");
		lbl3eva.setBounds(98, 133, 104, 15);
		frmEjercicioBsico.getContentPane().add(lbl3eva);
		
		textField1eva = new JTextField();
		textField1eva.setBounds(228, 27, 113, 17);
		frmEjercicioBsico.getContentPane().add(textField1eva);
		textField1eva.setColumns(10);
		
		textField2eva = new JTextField();
		textField2eva.setColumns(10);
		textField2eva.setBounds(228, 79, 113, 17);
		frmEjercicioBsico.getContentPane().add(textField2eva);
		
		textField3eva = new JTextField();
		textField3eva.setColumns(10);
		textField3eva.setBounds(228, 131, 113, 17);
		frmEjercicioBsico.getContentPane().add(textField3eva);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(228, 211, 70, 15);
		frmEjercicioBsico.getContentPane().add(lblResultado);
		
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
			}
		});
		btnCalcularMedia.setBounds(145, 170, 138, 25);
		frmEjercicioBsico.getContentPane().add(btnCalcularMedia);
		
		JLabel lblMedia = new JLabel("Media:");
		lblMedia.setBounds(98, 211, 70, 15);
		frmEjercicioBsico.getContentPane().add(lblMedia);
		
		
	}

}
