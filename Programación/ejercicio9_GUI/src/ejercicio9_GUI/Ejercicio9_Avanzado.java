package ejercicio9_GUI;

import java.awt.EventQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio9_Avanzado {

	private JFrame frmEjercicioAvanzado;
	private JTextField textFieldNumero2;
	private JTextField textFieldNumero1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9_Avanzado window = new Ejercicio9_Avanzado();
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
	public Ejercicio9_Avanzado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Pattern formatoNumero=Pattern.compile("^[0-9]{1,6}$");
		
		frmEjercicioAvanzado = new JFrame();
		frmEjercicioAvanzado.setTitle("Ejercicio 9 Avanzado");
		frmEjercicioAvanzado.setBounds(100, 100, 450, 300);
		frmEjercicioAvanzado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioAvanzado.getContentPane().setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Introduzca número 1");
		lblNumero1.setBounds(60, 34, 146, 15);
		frmEjercicioAvanzado.getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Introduzca número 2");
		lblNumero2.setBounds(60, 94, 146, 15);
		frmEjercicioAvanzado.getContentPane().add(lblNumero2);
		
		textFieldNumero2 = new JTextField();
		textFieldNumero2.setColumns(10);
		textFieldNumero2.setBounds(248, 92, 114, 19);
		frmEjercicioAvanzado.getContentPane().add(textFieldNumero2);
		
		textFieldNumero1 = new JTextField();
		textFieldNumero1.setColumns(10);
		textFieldNumero1.setBounds(248, 32, 114, 19);
		frmEjercicioAvanzado.getContentPane().add(textFieldNumero1);
		
		JLabel lblElResultadoEs = new JLabel("El resultado es:");
		lblElResultadoEs.setBounds(101, 211, 114, 15);
		frmEjercicioAvanzado.getContentPane().add(lblElResultadoEs);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(227, 211, 70, 15);
		frmEjercicioAvanzado.getContentPane().add(lblResultado);
		
		JComboBox comboBoxOperacion = new JComboBox();
		comboBoxOperacion.setModel(new DefaultComboBoxModel(new String[] {"Sumar", "Restar", "Multiplicar", "Dividir", "Resto"}));
		comboBoxOperacion.setBounds(248, 143, 114, 19);
		frmEjercicioAvanzado.getContentPane().add(comboBoxOperacion);
		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String numeroEntrada1, numeroEntrada2, numeroSalida;
				int operando1, operando2, resultado;
				
				switch (comboBoxOperacion.getSelectedIndex()) {
				
				case 0: 
					
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

					}else {
						JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El segundo número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
						lblResultado.setText("");
					}
					}else {
						JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El primer número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
						lblResultado.setText("");
					} break;
				
				case 1:
							
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

				} else {
					JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El segundo número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblResultado.setText("");
				}
					}else {
						JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El primer número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
						lblResultado.setText("");
					} break;
				
				case 2: 
					
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

				}else {
					JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El segundo número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblResultado.setText("");
				}
					}else {
						JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El primer número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
						lblResultado.setText("");
					} break;
					
				case 3:
					
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
				}else {
					JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El segundo número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblResultado.setText("");
				}
					}else {
						JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El primer número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
						lblResultado.setText("");
					}break;
					
				case 4:
					
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
				}else {
					JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El segundo número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblResultado.setText("");
				}
					}else {
						JOptionPane.showMessageDialog(frmEjercicioAvanzado, "El primer número es inválido (1-6 cifras)","Advertencia",JOptionPane.ERROR_MESSAGE);
						lblResultado.setText("");
					}break;
				
				default: lblResultado.setText("Operación Inválida");
				break;
				}
			}
		});
		btnCalcular.setBounds(164, 174, 117, 25);
		frmEjercicioAvanzado.getContentPane().add(btnCalcular);	
		
		
		
		
		JLabel lblSeleccioneOperacin = new JLabel("Seleccione operación:");
		lblSeleccioneOperacin.setBounds(60, 145, 170, 15);
		frmEjercicioAvanzado.getContentPane().add(lblSeleccioneOperacin);
		
		
	}
}
