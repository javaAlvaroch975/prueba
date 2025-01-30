package ejercicio9_GUI;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Ejercicio9Intermedio_GUI {

	private JFrame frmEjercicioIntermedio;
	private JFrame frmEjercicioIntermedio_1;
	private JTextField textFieldNumero1;
	private JTextField textFieldNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9Intermedio_GUI window = new Ejercicio9Intermedio_GUI();
					window.frmEjercicioIntermedio_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio9Intermedio_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Pattern formatoNumero=Pattern.compile("^[0-9]{1,6}$");
		
		frmEjercicioIntermedio = new JFrame();
		frmEjercicioIntermedio.setTitle("Ejercicio 9 Intermedio");
		frmEjercicioIntermedio.setBounds(100, 100, 450, 300);
		frmEjercicioIntermedio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioIntermedio.getContentPane().setLayout(null);
		frmEjercicioIntermedio_1 = new JFrame();
		frmEjercicioIntermedio_1.setTitle("Ejercicio 9 Intermedio");
		frmEjercicioIntermedio_1.setBounds(100, 100, 450, 300);
		frmEjercicioIntermedio_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioIntermedio_1.getContentPane().setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Introduzca número 1");
		lblNumero1.setBounds(31, 42, 146, 15);
		frmEjercicioIntermedio_1.getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Introduzca número 2");
		lblNumero2.setBounds(31, 102, 146, 15);
		frmEjercicioIntermedio_1.getContentPane().add(lblNumero2);
		
		textFieldNumero1 = new JTextField();
		textFieldNumero1.setBounds(195, 40, 114, 19);
		frmEjercicioIntermedio_1.getContentPane().add(textFieldNumero1);
		textFieldNumero1.setColumns(10);
		
		textFieldNumero2 = new JTextField();
		textFieldNumero2.setColumns(10);
		textFieldNumero2.setBounds(195, 100, 114, 19);
		frmEjercicioIntermedio_1.getContentPane().add(textFieldNumero2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(195, 211, 70, 15);
		frmEjercicioIntermedio_1.getContentPane().add(lblResultado);
		
		JLabel lblError1 = new JLabel("");
		lblError1.setForeground(Color.RED);
		lblError1.setBounds(334, 42, 343, 15);
		frmEjercicioIntermedio_1.getContentPane().add(lblError1);
		
		JLabel lblError2 = new JLabel("");
		lblError2.setForeground(Color.RED);
		lblError2.setBounds(334, 102, 343, 15);
		frmEjercicioIntermedio_1.getContentPane().add(lblError2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				Matcher sumar1=formatoNumero.matcher(numeroEntrada1);
				if (sumar1.matches()) {
				numeroEntrada2=textFieldNumero2.getText();
				Matcher sumar2=formatoNumero.matcher(numeroEntrada2);
				if (sumar2.matches()) {
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1+operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
				lblError1.setText("");
				lblError2.setText("");
				}else {
					lblError2.setText("El número no es válido (1-6 cifras)");
					lblResultado.setText("");
				}
				}else {
					lblError1.setText("El número no es válido (1-6 Cifras)");
					lblResultado.setText("");
				}
			}
		});
		btnSumar.setBounds(9, 157, 79, 25);
		frmEjercicioIntermedio_1.getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				Matcher restar1= formatoNumero.matcher(numeroEntrada1);
				if (restar1.matches()) {
				numeroEntrada2=textFieldNumero2.getText();
				Matcher restar2=formatoNumero.matcher(numeroEntrada2);
				if (restar2.matches()) {
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1-operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
				lblError1.setText("");
				lblError2.setText("");
			} else {
				lblError2.setText("El número no es válido (1-6 cifras)");
				lblResultado.setText("");
			}
				}else {
					lblError1.setText("El número no es válido (1-6 cifras)");
					lblResultado.setText("");
				}
				}
		});
		btnRestar.setBounds(97, 157, 79, 25);
		frmEjercicioIntermedio_1.getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				Matcher multiplicar1= formatoNumero.matcher(numeroEntrada1);
				if (multiplicar1.matches()) {
				numeroEntrada2=textFieldNumero2.getText();
				Matcher multiplicar2= formatoNumero.matcher(numeroEntrada2);
				if (multiplicar2.matches()) {
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1*operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
				lblError1.setText("");
				lblError2.setText("");
			}else {
				lblError2.setText("El número no es válido (1-6 cifras)");
				lblResultado.setText("");
			}
				}else {
					lblError1.setText("El número no es válido (1-6 cifras)");
					lblResultado.setText("");
				}
			}
		});
		btnMultiplicar.setBounds(185, 157, 79, 25);
		frmEjercicioIntermedio_1.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				Matcher dividir1= formatoNumero.matcher(numeroEntrada1);
				if (dividir1.matches()) {
				numeroEntrada2=textFieldNumero2.getText();
				Matcher dividir2= formatoNumero.matcher(numeroEntrada2);
				if (dividir2.matches()) {
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1/operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
				lblError1.setText("");
				lblError2.setText("");
			}else {
				lblError2.setText("El número no es válido (1-6 cifras)");
				lblResultado.setText("");
			}
				}else {
					lblError1.setText("El número no es válido (1-6 cifras)");
					lblResultado.setText("");
				}
			}
		});
		btnDividir.setBounds(273, 157, 79, 25);
		frmEjercicioIntermedio_1.getContentPane().add(btnDividir);
		
		JButton btnResto = new JButton("Resto");
		btnResto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				numeroEntrada1=textFieldNumero1.getText();
				Matcher resto1= formatoNumero.matcher(numeroEntrada1);
				if (resto1.matches()) {
				numeroEntrada2=textFieldNumero2.getText();
				Matcher resto2= formatoNumero.matcher(numeroEntrada2);
				if (resto2.matches()) {
				operando1=Integer.parseInt(numeroEntrada1);
				operando2=Integer.parseInt(numeroEntrada2);
				resultado=operando1%operando2;
				numeroSalida=String.valueOf(resultado);
				lblResultado.setText(numeroSalida);
				lblError1.setText("");
				lblError2.setText("");
			}else {
				lblError2.setText("El número no es válido (1-6 cifras)");
				lblResultado.setText("");
			}
				}else {
					lblError1.setText("El número no es válido (1-6 cifras)");
					lblResultado.setText("");
				}
			}
		});
		btnResto.setBounds(361, 157, 79, 25);
		frmEjercicioIntermedio_1.getContentPane().add(btnResto);
		
		JLabel lblElResultadoEs = new JLabel("El resultado es:");
		lblElResultadoEs.setBounds(31, 211, 146, 15);
		frmEjercicioIntermedio_1.getContentPane().add(lblElResultadoEs);
		

	}
}

