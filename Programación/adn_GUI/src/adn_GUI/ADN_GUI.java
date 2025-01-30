package adn_GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JScrollPane;

public class ADN_GUI {

	private JFrame frmAdn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADN_GUI window = new ADN_GUI();
					window.frmAdn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ADN_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdn = new JFrame();
		frmAdn.setTitle("ADN");
		frmAdn.setBounds(100, 100, 670, 434);
		frmAdn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdn.getContentPane().setLayout(null);
		
		JLabel lblHliceEstabilizadora = new JLabel("Hélice estabilizadora");
		lblHliceEstabilizadora.setBounds(12, 69, 155, 15);
		frmAdn.getContentPane().add(lblHliceEstabilizadora);
		
		JLabel lblHliceCodificadora = new JLabel("Hélice codificadora");
		lblHliceCodificadora.setBounds(26, 190, 141, 15);
		frmAdn.getContentPane().add(lblHliceCodificadora);
		
		JTextArea textAreaCad1 = new JTextArea();
		textAreaCad1.setWrapStyleWord(true);
		textAreaCad1.setLineWrap(true);
		textAreaCad1.setEditable(false);
		textAreaCad1.setForeground(Color.BLACK);
		textAreaCad1.setBackground(Color.YELLOW);
		textAreaCad1.setBounds(209, 69, 155, 31);
		frmAdn.getContentPane().add(textAreaCad1);
		
		
		JTextArea textAreaCad2 = new JTextArea();
		textAreaCad2.setWrapStyleWord(true);
		textAreaCad2.setLineWrap(true);
		textAreaCad2.setEditable(false);
		textAreaCad2.setForeground(Color.BLACK);
		textAreaCad2.setBackground(Color.MAGENTA);
		textAreaCad2.setBounds(209, 190, 155, 31);
		frmAdn.getContentPane().add(textAreaCad2);
		
		JButton btnA = new JButton("A");
		btnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaCad1.setText(textAreaCad1.getText()+"A");
			}
		});
		btnA.setBounds(94, 275, 52, 25);
		frmAdn.getContentPane().add(btnA);
		
		JButton btnT = new JButton("T");
		btnT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaCad1.setText(textAreaCad1.getText()+"T");
			}
		});
		btnT.setBounds(158, 275, 52, 25);
		frmAdn.getContentPane().add(btnT);
		
		JButton btnC = new JButton("C");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaCad1.setText(textAreaCad1.getText()+"C");
			}
		});
		btnC.setBounds(222, 275, 52, 25);
		frmAdn.getContentPane().add(btnC);
		
		JButton btnG = new JButton("G");
		btnG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaCad1.setText(textAreaCad1.getText()+"G");
			}
		});
		btnG.setBounds(286, 275, 52, 25);
		frmAdn.getContentPane().add(btnG);
		
		JButton btnCodificar = new JButton("Codificar");
		btnCodificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textAreaCad2.setText("");
				String adn=textAreaCad1.getText();
				for(int posicion=0;posicion<adn.length();posicion++) {
					switch(adn.charAt(posicion)) {
					
					case 'A':
						textAreaCad2.setText(textAreaCad2.getText()+'T');
						break;
						
					case 'T':
						textAreaCad2.setText(textAreaCad2.getText()+'A');
						break;	
						
					case 'C':
						textAreaCad2.setText(textAreaCad2.getText()+'G');
						break;
						
					case 'G':
						textAreaCad2.setText(textAreaCad2.getText()+'C');
						break;
						
					}
				}
				
			}
		});
		btnCodificar.setBounds(94, 324, 116, 25);
		frmAdn.getContentPane().add(btnCodificar);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaCad1.setText("");
				textAreaCad2.setText("");
			}
		});
		btnNewButton.setBounds(222, 324, 116, 25);
		frmAdn.getContentPane().add(btnNewButton);
		

		
		JLabel lblADN1 = new JLabel("");
		lblADN1.setBounds(368, 12, 116, 123);
		ImageIcon imagen=new ImageIcon("img/5806050.png");   //Usa el nombre de fichero adecuado
		Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(lblADN1.getWidth(), lblADN1.getHeight(), Image.SCALE_DEFAULT));
		lblADN1.setIcon(icono);
		frmAdn.getContentPane().add(lblADN1);
		
		JLabel lblADN2 = new JLabel("");
		lblADN2.setBounds(368, 146, 116, 123);
		imagen=new ImageIcon("img/5806050.png");   //Usa el nombre de fichero adecuado
		icono=new ImageIcon(imagen.getImage().getScaledInstance(lblADN2.getWidth(), lblADN2.getHeight(), Image.SCALE_DEFAULT));
		lblADN2.setIcon(icono);
		frmAdn.getContentPane().add(lblADN2);
		
		JScrollPane scrollPaneADN1 = new JScrollPane(textAreaCad1);
		scrollPaneADN1.setBounds(209, 69, 155, 38);
		frmAdn.getContentPane().add(scrollPaneADN1);
		
		JScrollPane scrollPaneADN2 = new JScrollPane(textAreaCad2);
		scrollPaneADN2.setBounds(209, 170, 155, 35);
		frmAdn.getContentPane().add(scrollPaneADN2);
		

		

	}
}
