package ejercicio9_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio9Basico_GUI {

	private JFrame frmEjercicioBsico;
	private JTextField textFieldNumero1;
	private JTextField textFieldNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9Basico_GUI window = new Ejercicio9Basico_GUI();
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
	public Ejercicio9Basico_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicioBsico = new JFrame();
		frmEjercicioBsico.setTitle("Ejercicio 9 Básico");
		frmEjercicioBsico.setBounds(100, 100, 450, 300);
		frmEjercicioBsico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioBsico.getContentPane().setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Introduzca número 1");
		lblNumero1.setBounds(57, 42, 146, 15);
		frmEjercicioBsico.getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Introduzca número 2");
		lblNumero2.setBounds(57, 102, 146, 15);
		frmEjercicioBsico.getContentPane().add(lblNumero2);
		
		textFieldNumero1 = new JTextField();
		textFieldNumero1.setBounds(245, 40, 114, 19);
		frmEjercicioBsico.getContentPane().add(textFieldNumero1);
		textFieldNumero1.setColumns(10);
		
		textFieldNumero2 = new JTextField();
		textFieldNumero2.setColumns(10);
		textFieldNumero2.setBounds(245, 100, 114, 19);
		frmEjercicioBsico.getContentPane().add(textFieldNumero2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(245, 211, 70, 15);
		frmEjercicioBsico.getContentPane().add(lblResultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				numeroEntrada2=textFieldNumero2.getText();
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1+operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
			}
		});
		btnSumar.setBounds(9, 157, 79, 25);
		frmEjercicioBsico.getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				numeroEntrada2=textFieldNumero2.getText();
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1-operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
			}
		});
		btnRestar.setBounds(97, 157, 79, 25);
		frmEjercicioBsico.getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				numeroEntrada2=textFieldNumero2.getText();
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1*operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
			}
		});
		btnMultiplicar.setBounds(185, 157, 79, 25);
		frmEjercicioBsico.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				numeroEntrada2=textFieldNumero2.getText();
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1/operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
			}
		});
		btnDividir.setBounds(273, 157, 79, 25);
		frmEjercicioBsico.getContentPane().add(btnDividir);
		
		JButton btnResto = new JButton("Resto");
		btnResto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				numeroEntrada2=textFieldNumero2.getText();
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1%operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
			}
		});
		btnResto.setBounds(361, 157, 79, 25);
		frmEjercicioBsico.getContentPane().add(btnResto);
		
		JLabel lblElResultadoEs = new JLabel("El resultado es:");
		lblElResultadoEs.setBounds(57, 211, 146, 15);
		frmEjercicioBsico.getContentPane().add(lblElResultadoEs);
		

	}
}
