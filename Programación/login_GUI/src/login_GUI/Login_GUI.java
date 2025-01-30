package login_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.regex.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
public class Login_GUI {

	private JFrame frmLogin;
	private JTextField textFieldLogin;
	private JTextField textFieldCorreo;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldRepetir;
	
	
	boolean comprobarExpReg(String cadena, String patron) {
		Pattern pat=Pattern.compile(patron);
		Matcher mat=pat.matcher(cadena);
		
		if (mat.matches()) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI window = new Login_GUI();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 908, 375);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		
		JLabel lblFormularioDeRegistro = new JLabel("Formulario de Registro");
		lblFormularioDeRegistro.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblFormularioDeRegistro.setForeground(Color.BLUE);
		lblFormularioDeRegistro.setBounds(12, 12, 237, 36);
		frmLogin.getContentPane().add(lblFormularioDeRegistro);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(32, 55, 70, 15);
		frmLogin.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 125, 70, 15);
		frmLogin.getContentPane().add(lblPassword);
		
		JLabel lblRepitePassword = new JLabel("Repite Password");
		lblRepitePassword.setBounds(32, 195, 133, 15);
		frmLogin.getContentPane().add(lblRepitePassword);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(32, 265, 70, 15);
		frmLogin.getContentPane().add(lblCorreo);
		
				textFieldLogin = new JTextField();
		textFieldLogin.setBounds(187, 60, 114, 19);
		frmLogin.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
				passwordField = new JPasswordField();
		passwordField.setBounds(187, 123, 114, 19);
		frmLogin.getContentPane().add(passwordField);
		
		passwordFieldRepetir = new JPasswordField();
		passwordFieldRepetir.setBounds(187, 193, 114, 19);
		frmLogin.getContentPane().add(passwordFieldRepetir);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBounds(187, 263, 114, 19);
		frmLogin.getContentPane().add(textFieldCorreo);
		
		JLabel lblRegistro = new JLabel("");
		lblRegistro.setForeground(Color.GREEN);
		lblRegistro.setBounds(319, 301, 176, 25);
		frmLogin.getContentPane().add(lblRegistro);
		
		JLabel lblLoginError = new JLabel("");
		lblLoginError.setForeground(Color.RED);
		lblLoginError.setBounds(319, 55, 471, 25);
		frmLogin.getContentPane().add(lblLoginError);
		
		JLabel lblPasswordError = new JLabel("");
		lblPasswordError.setForeground(Color.RED);
		lblPasswordError.setBounds(319, 125, 471, 25);
		frmLogin.getContentPane().add(lblPasswordError);
		
		JLabel lblRepitePasswordError = new JLabel("");
		lblRepitePasswordError.setForeground(Color.RED);
		lblRepitePasswordError.setBounds(319, 195, 471, 25);
		frmLogin.getContentPane().add(lblRepitePasswordError);
		
		JLabel lblCorreoError = new JLabel("");
		lblCorreoError.setForeground(Color.RED);
		lblCorreoError.setBounds(319, 265, 471, 25);
		frmLogin.getContentPane().add(lblCorreoError);
						
		JButton btnRegistrarme = new JButton("Registrarme");
		btnRegistrarme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Login_GUI lg=new Login_GUI();
				
				if (!comprobarExpReg(textFieldLogin.getText(), "^\\w+$")) {
					JOptionPane.showMessageDialog(frmLogin, "El login está vacío","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblLoginError.setText("El login está vacío");
				}else {
					lblLoginError.setText("");
				}
				
				if (!comprobarExpReg(passwordField.getText(), "^\\w{6,}$")) {
					JOptionPane.showMessageDialog(frmLogin, "La contraseña es demasiado corta","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblPasswordError.setText("La contraseña es demasiado corta");
				}else {
					lblPasswordError.setText("");
				}
				
				if (!passwordFieldRepetir.getText().equals(passwordField.getText())) {
					JOptionPane.showMessageDialog(frmLogin, "La contraseña no coincide","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblRepitePasswordError.setText("Las contraseñas no coinciden");
				}else {
					lblRepitePasswordError.setText("");
				}
				
				if (!comprobarExpReg(textFieldCorreo.getText(), "^\\w+@\\w+\\.\\w{2,4}$")) {
					JOptionPane.showMessageDialog(frmLogin, "El correo no tiene el formato correcto","Advertencia",JOptionPane.ERROR_MESSAGE);
					lblCorreoError.setText("El correo no tiene el formato correcto (@ y .)");
				}else {
					lblCorreoError.setText("");
				}
				
			if (comprobarExpReg(textFieldLogin.getText(),"^\\w+$")&&(comprobarExpReg(passwordField.getText(), "^\\w{6,}$"))&&(passwordFieldRepetir.getText().equals(passwordField.getText()))&&(comprobarExpReg(textFieldCorreo.getText(), "^\\w+@\\w+\\.\\w{2,4}$") )){
				lblRegistro.setText("Registro Completado");
			}else {
				lblRegistro.setText("");
			}
			}
		});
		btnRegistrarme.setBounds(175, 301, 126, 25);
		frmLogin.getContentPane().add(btnRegistrarme);
		


		

	}
}
