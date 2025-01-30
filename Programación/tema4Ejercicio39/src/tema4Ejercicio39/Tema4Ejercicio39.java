package tema4Ejercicio39;

import java.awt.EventQueue;
import com.toedter.calendar.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tema4Ejercicio39 {

	private JFrame frmFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema4Ejercicio39 window = new Tema4Ejercicio39();
					window.frmFecha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tema4Ejercicio39() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFecha = new JFrame();
		frmFecha.setTitle("Fecha");
		frmFecha.setBounds(100, 100, 450, 300);
		frmFecha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFecha.getContentPane().setLayout(null);
				
		JDateChooser calendario = new JDateChooser();
		calendario.setBounds(54, 87, 164, 15);
		frmFecha.getContentPane().add(calendario);
	}
}
