package tema4Proyecto;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tema4Proyecto {
	
			Jugador j=new Jugador();
		Enemigo en=new Enemigo();

	int atacarT(Jugador j, Enemigo en) {		//Esta es para el textarea, la de abajo también
		int danyo=j.getAtk()-en.getDefE();
		return danyo;
	}
	
	int contratacarT(Enemigo en, Jugador j) {		
		int danyo=en.getAtkE()-j.getDef();
		return danyo;
	}
	
	int atacar(Jugador j, Enemigo en) {						//Esta es la que sí hace el daño, la de abajo también
		int danyo=j.getAtk()-en.getDefE();
		en.setVida(en.getVida()-danyo);
		return en.getVida();
	}
	
	int contratacar(Enemigo en, Jugador j) {
		int danyo=en.getAtkE()-j.getDef();
		j.setVida(j.getVida()-danyo);
		return j.getVida();
	}
		
	boolean  comprobarVida (int vida) {			//Esto es para saber si están muertos o no
		if (vida>0) {
			return true;
		}else {
			return false;
		}
		
		}
	
		static boolean comprobarExpReg (String nombre, String patron) {
			Pattern pat = Pattern.compile(patron);
			Matcher mat = pat.matcher(nombre);
			
			if (mat.matches()) {
				return true;
			}else {
				return false;
			}
		
	}

	private JFrame frmJuego;
	private JTextField textFieldNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema4Proyecto window = new Tema4Proyecto();
					window.frmJuego.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tema4Proyecto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJuego = new JFrame();
		frmJuego.setTitle("Juego");
		frmJuego.setBounds(100, 100, 712, 976);
		frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJuego.getContentPane().setLayout(null);
		
		
				JLabel labelNombre = new JLabel("");
		labelNombre.setBounds(98, 264, 70, 15);
		labelNombre.setVisible(false);
		frmJuego.getContentPane().add(labelNombre);
		
				
		JLabel labelHP = new JLabel("1000");
		labelHP.setBounds(126, 17, 42, 15);
		labelHP.setText(String.valueOf(j.getVida()));
		labelHP.setVisible(false);
		frmJuego.getContentPane().add(labelHP);
		
				JLabel labelHPE = new JLabel("500");
		labelHPE.setBounds(501, 22, 42, 15);
		labelHPE.setText(String.valueOf(en.getVida()));
		labelHPE.setVisible(false);
		frmJuego.getContentPane().add(labelHPE);
		
				JLabel labelPociones = new JLabel("");
		labelPociones.setBounds(436, 342, 70, 15);
		labelPociones.setText(String.valueOf(j.getPociones()));
		labelPociones.setVisible(false);
		frmJuego.getContentPane().add(labelPociones);
		
		JLabel labelAtk = new JLabel("");
		labelAtk.setBounds(126, 44, 42, 15);
		labelAtk.setText(String.valueOf(j.getAtk()));
		labelAtk.setVisible(false);
		frmJuego.getContentPane().add(labelAtk);
		
		JLabel labelAtkE = new JLabel("92");
		labelAtkE.setBounds(501, 49, 42, 15);
		labelAtkE.setText(String.valueOf(en.getAtkE()));
		labelAtkE.setVisible(false);
		frmJuego.getContentPane().add(labelAtkE);
		
		JLabel labelDef = new JLabel("");
		labelDef.setBounds(126, 71, 42, 15);
		labelDef.setText(String.valueOf(j.getDef()));
		labelDef.setVisible(false);
		frmJuego.getContentPane().add(labelDef);
		
		JLabel labelDefE = new JLabel("45");
		labelDefE.setBounds(501, 76, 42, 15);
		labelDefE.setText(String.valueOf(en.getDefE()));
		labelDefE.setVisible(false);
		frmJuego.getContentPane().add(labelDefE);
		
		JLabel labelJugador = new JLabel("");
		labelJugador.setBounds(57, 100, 163, 146);
		ImageIcon imagen=new ImageIcon("img/ZeldaOcarinaDelTiempo.gif");   //Usa el nombre de fichero adecuado
		Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(labelJugador.getWidth(), labelJugador.getHeight(), Image.SCALE_DEFAULT));
		labelJugador.setIcon(icono);
		labelJugador.setVisible(false);
		frmJuego.getContentPane().add(labelJugador);
		
		JLabel labelEnemigo = new JLabel("");
		labelEnemigo.setBounds(410, 105, 163, 146);
		ImageIcon imagenE=new ImageIcon("img/Enemigo"+en.getNumEnemigo()+".gif");	//Así tengo seguro el que el gif corresponda al número
		Icon iconoE=new ImageIcon(imagenE.getImage().getScaledInstance(labelEnemigo.getWidth(), labelEnemigo.getHeight(), Image.SCALE_DEFAULT));
		labelEnemigo.setIcon(iconoE);
		labelEnemigo.setVisible(false);
		frmJuego.getContentPane().add(labelEnemigo);
		
		JLabel lblNewLabel = new JLabel("Turno:");
		lblNewLabel.setBounds(202, 17, 83, 14);
		lblNewLabel.setVisible(false);
		frmJuego.getContentPane().add(lblNewLabel);
		
		JLabel lblTurno = new JLabel("");
		lblTurno.setBounds(297, 17, 46, 14);
		lblTurno.setVisible(false);
		frmJuego.getContentPane().add(lblTurno);
		
		JLabel lblNumEnemigo = new JLabel("");
		lblNumEnemigo.setBounds(297, 44, 46, 14);
		frmJuego.getContentPane().add(lblNumEnemigo);
		lblNumEnemigo.setVisible(false);
		lblNumEnemigo.setText(String.valueOf(en.getNumEnemigo()));
		
		JTextArea textAreaVictoria = new JTextArea("Tras muchas dificultades has logrado llegar a tu destino. En tu camino, has adquirido una experiencia incalculable... Tu nombre será recordado por aquellos que observan");
				textAreaVictoria.setLineWrap(true);
				textAreaVictoria.setEditable(false);
				textAreaVictoria.setVisible(false);
		textAreaVictoria.setBounds(1, 1, 19, 15);
		frmJuego.getContentPane().add(textAreaVictoria);
		
		JScrollPane scrollPane = new JScrollPane(textAreaVictoria);
		scrollPane.setBounds(57, 368, 575, 96);
		scrollPane.setVisible(false);
		frmJuego.getContentPane().add(scrollPane);
		
		JTextArea textAreaCombate = new JTextArea();
		textAreaCombate.setLineWrap(true);
		textAreaCombate.setEditable(false);
		textAreaCombate.setBounds(57, 494, 57, 15);
		textAreaCombate.setVisible(false);
		frmJuego.getContentPane().add(textAreaCombate);
		
		JScrollPane scrollPane_1 = new JScrollPane(textAreaCombate);
		scrollPane_1.setBounds(57, 507, 573, 146);
		scrollPane_1.setVisible(false);
		frmJuego.getContentPane().add(scrollPane_1);		
		
		JTextArea TextAreaDerrota = new JTextArea("");
		TextAreaDerrota.setBounds(245, 134, 145, 59);
		TextAreaDerrota.setVisible(false);
		TextAreaDerrota.setEditable(false);
		frmJuego.getContentPane().add(TextAreaDerrota);
		
		JProgressBar progressBarHPJugador = new JProgressBar(0, j.getVida());
		progressBarHPJugador.setString(String.valueOf(j.getVida()));
		progressBarHPJugador.setValue(j.getVida());		//El límite y valor actual deben ser el .getVida
		progressBarHPJugador.setForeground(Color.GREEN);
		progressBarHPJugador.setBounds(111, 17, 57, 15);
		progressBarHPJugador.setVisible(false);
		frmJuego.getContentPane().add(progressBarHPJugador);
		
		JProgressBar progressBarHPEnemigo = new JProgressBar(0, en.getVida());
		progressBarHPEnemigo.setString(String.valueOf(en.getVida()));
		progressBarHPEnemigo.setValue(en.getVida());
		progressBarHPEnemigo.setForeground(Color.GREEN);
		progressBarHPEnemigo.setBounds(482, 22, 57, 15);
		progressBarHPEnemigo.setVisible(false);
		frmJuego.getContentPane().add(progressBarHPEnemigo);
		
		JButton btnCurarse = new JButton("CURARSE");
		btnCurarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tema4Proyecto p=new Tema4Proyecto();
				if (j.getPociones()==0) {
					btnCurarse.setEnabled(false);	//Esta línea deshabilita el botón si no te quedan pociones
				}else {
				j.setVida(j.getVida()+100);	
				labelHP.setText(String.valueOf(j.getVida()));
				j.setPociones(j.getPociones()-1);
				labelPociones.setText(String.valueOf(j.getPociones()));
				textAreaCombate.setText(textAreaCombate.getText()+"\nHas recuperado 100 de vida, ahora tienes "+j.getVida()+"  de vida.");
				j.setVida(p.contratacar(en, j));
				labelHP.setText(String.valueOf(j.getVida()));
				textAreaCombate.setText(textAreaCombate.getText()+"\n¡El enemigo ataca! Has sufrido "+p.contratacarT(en, j)+" de daño, ahora tienes "+j.getVida()+" de vida.");
				progressBarHPJugador.setValue(j.getVida());
				en.setTurno(en.getTurno()+1);
				lblTurno.setText(String.valueOf(en.getTurno()));
				}
			}
		});
		btnCurarse.setBounds(422, 289, 117, 25);
		btnCurarse.setVisible(false);
		frmJuego.getContentPane().add(btnCurarse);
		
		JButton btnAtacar = new JButton("ATACAR");
		btnAtacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tema4Proyecto p=new Tema4Proyecto();
				if (p.comprobarVida(en.getVida())) {
				en.setVida(p.atacar(j, en));	//Esta línea altera la vida
				labelHPE.setText(String.valueOf(en.getVida()));
				textAreaCombate.setText(textAreaCombate.getText()+"\n¡Atacas al enemigo! Has hecho "+p.atacarT(j, en)+" de daño, ahora le queda "+en.getVida()+" de vida.");
				}else {													//Esto ↑ es para que el historial se mantenga
					en.setNumEnemigo(en.getNumEnemigo()+1);
					if (en.getNumEnemigo()!=10) {		//El enemigo 10 tendrá 2000 de vida
					en.setVida(500);
					}else {
						en.setVida(2000);
					}
					ImageIcon imagenE=new ImageIcon("img/Enemigo"+en.getNumEnemigo()+".gif");	//Así hago que cambie de imagen
					Icon iconoE=new ImageIcon(imagenE.getImage().getScaledInstance(labelEnemigo.getWidth(), labelEnemigo.getHeight(), Image.SCALE_DEFAULT));
					labelEnemigo.setIcon(iconoE);
					en.setAtkE(51,100);
					en.setDefE(1,50);
					en.setTurno(0);
					labelAtkE.setText(String.valueOf(en.getAtkE()));
					labelDefE.setText(String.valueOf(en.getDefE()));
					lblNumEnemigo.setText(String.valueOf(en.getNumEnemigo()));
					textAreaCombate.setText(textAreaCombate.getText()+"\n¡Ha aparecido un enemigo con "+en.getAtkE()+" de ataque y "+en.getDefE()+" de defensa!");
					
				}
				progressBarHPEnemigo.setValue(en.getVida());
				if (p.comprobarVida(j.getVida())) {
					j.setVida(p.contratacar(en, j));
					labelHP.setText(String.valueOf(j.getVida()));
					textAreaCombate.setText(textAreaCombate.getText()+"\n¡El enemigo ataca! Has sufrido "+p.contratacarT(en, j)+" de daño, ahora tienes "+j.getVida()+" de vida.");
				}else {
					btnAtacar.setEnabled(false);
					btnCurarse.setEnabled(false);
					TextAreaDerrota.setVisible(true);
					TextAreaDerrota.setText("Has Perdido... ¿Volverás a levantarte?");
				}
				
				en.setTurno(en.getTurno()+1);
				lblTurno.setText(String.valueOf(en.getTurno()));
				progressBarHPJugador.setValue(j.getVida());
				progressBarHPJugador.setString(String.valueOf(j.getVida()));
				
				if ((en.getVida()<1)&&(en.getNumEnemigo()==10)) {
					btnAtacar.setEnabled(false);
					btnCurarse.setEnabled(false);
					textAreaVictoria.setVisible(true);
				}
			}
		});
		btnAtacar.setBounds(113, 289, 117, 25);
		btnAtacar.setVisible(false);
		frmJuego.getContentPane().add(btnAtacar);
		
		JButton btnJuegoNuevo = new JButton("JUEGO NUEVO");
		btnJuegoNuevo.addMouseListener(new MouseAdapter() {		//Así no hace falta abrir y cerrar el programa constantemente
			@Override
			public void mouseClicked(MouseEvent e) {
				j.setVida(1000);
				j.setPociones(3);
				j.setAtk(51, 100);
				j.setDef(1, 50);
				en.setVida(500);
				en.setAtkE(51,100);
				en.setDefE(1,50);
				en.setNumEnemigo(1);
				en.setTurno(1);
				
				labelHP.setText(String.valueOf(j.getVida()));
				labelPociones.setText(String.valueOf(j.getPociones()));
				labelAtk.setText(String.valueOf(j.getAtk()));
				labelDef.setText(String.valueOf(j.getDef()));
				
				labelHPE.setText(String.valueOf(en.getVida()));
				lblTurno.setText(String.valueOf(en.getTurno()));
				labelAtkE.setText(String.valueOf(en.getAtkE()));
				labelDefE.setText(String.valueOf(en.getDefE()));
				lblNumEnemigo.setText(String.valueOf(en.getNumEnemigo()));
				
				btnAtacar.setEnabled(true);
				btnCurarse.setEnabled(true);
				TextAreaDerrota.setText("");
				TextAreaDerrota.setVisible(false);
				textAreaCombate.setText("");
			}
		});
		btnJuegoNuevo.setBounds(251, 887, 160, 23);
		btnJuegoNuevo.setVisible(false);
		frmJuego.getContentPane().add(btnJuegoNuevo);
		
		JLabel lblPocionesRestantes = new JLabel("Pociones restantes:");
		lblPocionesRestantes.setBounds(277, 342, 145, 15);
		lblPocionesRestantes.setVisible(false);
		frmJuego.getContentPane().add(lblPocionesRestantes);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setBounds(47, 12, 42, 25);
		lblVida.setVisible(false);
		frmJuego.getContentPane().add(lblVida);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setBounds(47, 44, 70, 15);
		lblAtaque.setVisible(false);
		frmJuego.getContentPane().add(lblAtaque);
		
		JLabel lblDefensa = new JLabel("Defensa:");
		lblDefensa.setBounds(47, 71, 70, 15);
		lblDefensa.setVisible(false);
		frmJuego.getContentPane().add(lblDefensa);
		
		JLabel lblDefensaE = new JLabel("Defensa:");
		lblDefensaE.setBounds(422, 76, 70, 15);
		lblDefensaE.setVisible(false);
		frmJuego.getContentPane().add(lblDefensaE);
		
		JLabel lblAtaqueE = new JLabel("Ataque:");
		lblAtaqueE.setBounds(422, 49, 70, 15);
		lblAtaqueE.setVisible(false);
		frmJuego.getContentPane().add(lblAtaqueE);
		
		JLabel lblVidaE = new JLabel("Vida:");
		lblVidaE.setBounds(422, 17, 42, 25);
		lblVidaE.setVisible(false);
		frmJuego.getContentPane().add(lblVidaE);
		
		JLabel lblNewLabel_1 = new JLabel("Enemigo:");
		lblNewLabel_1.setBounds(202, 44, 83, 14);
		lblNewLabel_1.setVisible(false);
		frmJuego.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane_2 = new JScrollPane(TextAreaDerrota);
		scrollPane_2.setBounds(57, 700, 575, 146);
		scrollPane_2.setVisible(false);
		frmJuego.getContentPane().add(scrollPane_2);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(29, 264, 64, 14);
		lblNewLabel_2.setVisible(false);
		frmJuego.getContentPane().add(lblNewLabel_2);
				
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(251, 155, 119, 25);
		frmJuego.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
				
		JLabel lblIntroduceNombre = new JLabel("Introduce tu nombre");
		lblIntroduceNombre.setBounds(251, 100, 117, 43);
		frmJuego.getContentPane().add(lblIntroduceNombre);
		
		JScrollPane scrollPaneNombre = new JScrollPane(lblIntroduceNombre);
		scrollPaneNombre.setBounds(202, 71, 168, 72);
		frmJuego.getContentPane().add(scrollPaneNombre);		//Suficientes labels
		
		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		
			if	(!Tema4Proyecto.comprobarExpReg(textFieldNombre.getText(), "^[A-Z][a-z]{1,6}$")) { //Como me vuelva a olvidar que no puedo poner ",num" . Me va a dar algo
				JOptionPane.showMessageDialog(frmJuego,
					    "El nombre debe comenzar en mayúscula y tener 7 o menos carácteres.",
					    "Error",
					   JOptionPane.ERROR_MESSAGE);
			
			}else {
				textFieldNombre.setVisible(false);
				btnIniciar.setVisible(false);
				lblIntroduceNombre.setVisible(false);
				scrollPaneNombre.setVisible(false);
				labelNombre.setVisible(true); 
				labelHP.setVisible(true);
				labelHPE.setVisible(true);
				labelPociones.setVisible(true);
				labelAtk.setVisible(true);
				labelAtkE.setVisible(true);
				labelDef.setVisible(true);
				labelDefE.setVisible(true);
				labelJugador.setVisible(true);
				labelEnemigo.setVisible(true);
				lblNewLabel.setVisible(true);
				lblTurno.setVisible(true);
				lblNumEnemigo.setVisible(true);
				scrollPane.setVisible(true);
				textAreaCombate.setVisible(true);
				scrollPane_1.setVisible(true);
				progressBarHPJugador.setVisible(true);
				progressBarHPEnemigo.setVisible(true);
				btnCurarse.setVisible(true);
				btnAtacar.setVisible(true);
				btnJuegoNuevo.setVisible(true);
				lblPocionesRestantes.setVisible(true);
				lblVida.setVisible(true);
				lblAtaque.setVisible(true);
				lblDefensa.setVisible(true);
				lblDefensaE.setVisible(true);
				lblAtaqueE.setVisible(true);
				lblVidaE.setVisible(true);
				lblNewLabel_1.setVisible(true);
				scrollPane_2.setVisible(true);
				lblNewLabel_2.setVisible(true);
			}
			
			labelNombre.setText(textFieldNombre.getText());
			
			} 
	
		});
		btnIniciar.setBounds(253, 195, 117, 25);
		frmJuego.getContentPane().add(btnIniciar);
		
	}
}