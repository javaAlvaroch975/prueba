package ventanaHelloWorld;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class VentanaHelloWorld {

	private JFrame frmHelloWorld;
	private JTextField textFieldNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaHelloWorld window = new VentanaHelloWorld();
					window.frmHelloWorld.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaHelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHelloWorld = new JFrame();
		frmHelloWorld.getContentPane().setBackground(Color.GREEN);
		frmHelloWorld.setBackground(Color.GREEN);
		frmHelloWorld.setTitle("Mi_ventana");
		frmHelloWorld.setBounds(100, 100, 450, 300);
		frmHelloWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHelloWorld.getContentPane().setLayout(null);
		
		JLabel lblHolaMundo = new JLabel("");
		lblHolaMundo.setBounds(24, 60, 120, 112);
		lblHolaMundo.setFont(new Font("Courier 10 Pitch", Font.BOLD, 13));
		lblHolaMundo.setForeground(Color.GREEN);
		lblHolaMundo.setBackground(Color.GREEN);
		frmHelloWorld.getContentPane().add(lblHolaMundo);
		
		JButton botonIncrementar = new JButton("Incrementar");
		botonIncrementar.setBounds(318, 69, 120, 67);
		botonIncrementar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada, numeroSalida;
				int numero;
				
				numeroEntrada=textFieldNumero.getText();
				numero=Integer.parseInt(numeroEntrada);
				numero++;
				numeroSalida=String.valueOf(numero);
				lblHolaMundo.setText(numeroSalida);
			}
		});
		frmHelloWorld.getContentPane().add(botonIncrementar);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(186, 83, 120, 39);
		textFieldNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				frmHelloWorld.getContentPane().setBackground(Color.RED);
				botonIncrementar.setEnabled(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frmHelloWorld.getContentPane().setBackground(Color.BLUE);
				botonIncrementar.setEnabled(true);
			}
		});
		textFieldNumero.setText("0");
		frmHelloWorld.getContentPane().add(textFieldNumero);
		textFieldNumero.setColumns(10);
	}

}
