import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.applet.AudioClip;

import java.applet.*;
public class mecatest extends JFrame {

	private JPanel contentPane;
	private JTextField textUsu;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public mecatest() {
		setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		setForeground(Color.BLUE);
		setType(Type.POPUP);
		setTitle("Mecatest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("CONTRASE\u00D1A:");
		lblUsuario.setBounds(95, 292, 155, 23);
		lblUsuario.setForeground(Color.GREEN);
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(264, 292, 203, 23);
		contentPane.add(passwordField);
		
		JLabel lblNombre = new JLabel("IDUSUARIO:");
		lblNombre.setBounds(104, 220, 123, 30);
		lblNombre.setForeground(Color.GREEN);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblNombre);
		
		textUsu = new JTextField();
		textUsu.setBounds(260, 224, 207, 23);
		contentPane.add(textUsu);
		textUsu.setColumns(10);
		
		JLabel lblIngresaLosDatos = new JLabel("Ingresa los datos necesarios para poder iniciar el programa");
		lblIngresaLosDatos.setBounds(104, 154, 677, 30);
		lblIngresaLosDatos.setForeground(Color.GREEN);
		lblIngresaLosDatos.setFont(new Font("Arial", Font.PLAIN, 25));
		contentPane.add(lblIngresaLosDatos);
		
		JLabel lblBienvenidoAMecatest = new JLabel("BIENVENIDO A MECATEST");
		lblBienvenidoAMecatest.setBounds(223, 42, 622, 59);
		lblBienvenidoAMecatest.setBackground(new Color(240, 240, 240));
		lblBienvenidoAMecatest.setForeground(Color.GREEN);
		lblBienvenidoAMecatest.setFont(new Font("Comic Sans MS", Font.BOLD, 43));
		contentPane.add(lblBienvenidoAMecatest);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AudioClip sonido;
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("Bienvenidos_a_mecatest.wav"));
				sonido.play();
			}      
		});
		buttonGroup.add(btnRegistrarse);
		btnRegistrarse.setBounds(819, 623, 107, 28);
		contentPane.add(btnRegistrarse);
		btnRegistrarse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String contra=passwordField.getText();
				String usuario=textUsu.getText();
				if(e.getSource()==btnRegistrarse){
					
					if (usuario.equals("")){
						usuario=null;
					}
					if (contra.equals("")){
						contra=null;
					}
					if(contra!=null&&usuario!=null){
						
						JOptionPane.showMessageDialog(null, "Haz registrado el siguiente usuario '"+usuario+"' con la contraseña '"+contra,"' Registro completo",JOptionPane.INFORMATION_MESSAGE);
						passwordField.setBackground(Color.green);
						Menu a = new Menu();
				        a.setVisible(true);
				        mecatest.this.dispose();
					}
					
					if (usuario==null){
						JOptionPane.showMessageDialog(null, "Correo no valido, ingrese uno correcto","Error", JOptionPane.ERROR_MESSAGE);
						textUsu.setText("");
						textUsu.setBackground(Color.red);
					}
					if(contra==null){
						JOptionPane.showMessageDialog(null, "Contraseña no valida, ingrese una correcta","Error", JOptionPane.ERROR_MESSAGE);
						passwordField.setText("");
						passwordField.setBackground(Color.red);
						
					}
					
				}
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("src//imagenes//15139363_1264828260244828_513556457_n.gif"));
		lblNewLabel_1.setBounds(514, 217, 422, 234);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabelContra = new JLabel("New label");
		lblNewLabelContra.setBounds(0, 0, 942, 690);
		lblNewLabelContra.setIcon(new ImageIcon("src//imagenes//fondo-azul.jpg"));
		contentPane.add(lblNewLabelContra);
				
	}
}