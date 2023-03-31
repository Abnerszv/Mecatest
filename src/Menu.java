import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.applet.*;
public class Menu extends JFrame {
	private JPanel contentPane;
	
	public Menu() {
		setTitle("MECATEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNotaSon = new JLabel("Nota: Son 20 ejercicios en todas las opciones");
		lblNotaSon.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 19));
		lblNotaSon.setForeground(Color.GREEN);
		lblNotaSon.setBounds(35, 546, 432, 29);
		contentPane.add(lblNotaSon);
		
		JLabel lblNewLabel_6 = new JLabel("ordenadores (computadoras).");
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(35, 363, 366, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblComoLos = new JLabel("como los que poseen las m\u00E1quinas de escribir, los ");
		lblComoLos.setForeground(Color.YELLOW);
		lblComoLos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblComoLos.setBounds(35, 329, 449, 29);
		contentPane.add(lblComoLos);
		
		JLabel lblNewLabel_5 = new JLabel("alfanum\u00E9ricos en un dispositivo por medio de un teclado");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(35, 290, 449, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblLaMecanografaEs = new JLabel("La mecanograf\u00EDa es el proceso de introducir texto o caracteres \r\n");
		lblLaMecanografaEs.setForeground(Color.YELLOW);
		lblLaMecanografaEs.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblLaMecanografaEs.setBounds(35, 240, 518, 51);
		contentPane.add(lblLaMecanografaEs);
		
		JLabel lblMecatest = new JLabel("Bienvenido ");
		lblMecatest.setBounds(111, 11, 313, 51);
		lblMecatest.setForeground(Color.YELLOW);
		lblMecatest.setFont(new Font("Comic Sans MS", Font.BOLD, 54));
		contentPane.add(lblMecatest);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(589, 220, 338, 70);
		panel_2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEjerciciosConLa_1 = new JLabel("Ejercicios con la mano derecha");
		lblEjerciciosConLa_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblEjerciciosConLa_1.setBounds(10, 0, 324, 32);
		panel_2.add(lblEjerciciosConLa_1);
		
		JButton btnIr_1 = new JButton("Ir");
		btnIr_1.setBounds(134, 41, 55, 18);
		panel_2.add(btnIr_1);
		btnIr_1.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
		    	 Ejercicios_Mano_Derecha a = new Ejercicios_Mano_Derecha();
			        a.setVisible(true);
			        Menu.this.dispose();
		    }
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(589, 301, 338, 75);
		panel_3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEjerciciosConAmbas = new JLabel("Ejercicios con ambas manos");
		lblEjerciciosConAmbas.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblEjerciciosConAmbas.setBounds(10, 0, 291, 33);
		panel_3.add(lblEjerciciosConAmbas);
		
		JButton btnIr_2 = new JButton("Ir");
		btnIr_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AudioClip sonido;
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("Ejercicios_con_ambas_manos.wav"));
				sonido.play();
			}
		});
		btnIr_2.setBounds(134, 41, 55, 18);
		panel_3.add(btnIr_2);
		btnIr_2.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
		    	Ejercicios_Con_Ambas_Manos a1 = new Ejercicios_Con_Ambas_Manos();
		        a1.setVisible(true);
		        Menu.this.dispose();
		    }
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(589, 139, 338, 70);
		panel_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEjerciciosConLa = new JLabel("Ejercicios con la mano Izquierda");
		lblEjerciciosConLa.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblEjerciciosConLa.setBounds(10, 0, 328, 30);
		panel_1.add(lblEjerciciosConLa);
		
		JButton btnIr = new JButton("Ir");
		btnIr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AudioClip sonido;
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("Ejercicios_con_la_mano_izquierda.wav"));
			}
		});
		btnIr.setBounds(134, 41, 55, 18);
		panel_1.add(btnIr);
		btnIr.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
		    	Ejercicios_Mano_Izquierda a = new Ejercicios_Mano_Izquierda();
		        a.setVisible(true);
		        Menu.this.dispose();
		    }
		});
		
		JPanel panelGestion = new JPanel();
		panelGestion.setForeground(Color.LIGHT_GRAY);
		panelGestion.setBackground(Color.LIGHT_GRAY);
		panelGestion.setBounds(589, 490, 338, 70);
		contentPane.add(panelGestion);
		panelGestion.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Gestion de usuarios");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 11, 318, 23);
		panelGestion.add(lblNewLabel_4);
		
		JButton btnIr_4 = new JButton("Ir");
		btnIr_4.setBounds(134, 45, 55, 18);
		panelGestion.add(btnIr_4);
		btnIr_4.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
		    	GestionUsuarios a = new GestionUsuarios();
		        a.setVisible(true);
		        Menu.this.dispose();
		    }
		});
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(885, 628, 89, 23);
		contentPane.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
		    	 Menu.this.dispose();
		    }
		});
		
		JLabel lblNewLabel_1 = new JLabel("MEN\u00DA");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 47));
		lblNewLabel_1.setBounds(677, 66, 185, 62);
		contentPane.add(lblNewLabel_1);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(589, 387, 338, 92);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ejercicios de palabras");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 11, 324, 36);
		panel_4.add(lblNewLabel_2);
		
		JButton btnIr_3 = new JButton("Ir");
		btnIr_3.setBounds(134, 61, 55, 18);
		panel_4.add(btnIr_3);
		btnIr_3.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
			    	Ejercicios_De_Palabras a = new Ejercicios_De_Palabras();
			        a.setVisible(true);
			        Menu.this.dispose();
		    }
		});
		JLabel lblNewLabel_3 = new JLabel("\u00BFSabes que es MECANOGRAFIA?");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setBounds(86, 121, 338, 45);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblSiTuRespuesta = new JLabel("Si tu respuesta ha sido negativa, escucha este audio para sacarte de esa duda");
		lblSiTuRespuesta.setForeground(Color.GREEN);
		lblSiTuRespuesta.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblSiTuRespuesta.setBounds(10, 177, 583, 36);
		contentPane.add(lblSiTuRespuesta);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 984, 690);
		lblNewLabel.setIcon(new ImageIcon("src//imagenes//fondo-azul.jpg"));
		contentPane.add(lblNewLabel);
	}
}
