
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ejercicios_De_Palabras extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios_De_Palabras frame = new Ejercicios_De_Palabras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int x=0;
	String nombre[]={
			"aprende con mecatest en 123",
			"hola como estan",
			"pepito clavo cinco clavos",
			"vamo a calmarno",
			"hoy es miercoles",
			"me gusta aprender mecanografia",
			"yo tengo un coche",
			"me gustan las matematicas 8 y 8 16",
			"mañana entro a la secundaria",
			"mas vale tarde que nunca",
			"ya no tengo ideas",
			"yo toco el xilofono",
			"mi tia tiene una croz fox",
			"the walking dead es de zombies",
			"el ñu es un animal grande",
			"wow pero que coche",
			"me gusta patinar",
			"veo la tele todos los dias",
			"chivas es el mejor ",
			"ya mero es navidad es el 25",
			"estamos en el mes de diciembre del 2016"
	};
	protected int Aciertos=0;
	protected int Errores=0;
	public Ejercicios_De_Palabras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPractica = new JLabel("Ejercicios de palabras");
		lblPractica.setForeground(Color.YELLOW);
		lblPractica.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPractica.setBounds(142, 22, 433, 47);
		contentPane.add(lblPractica);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setForeground(Color.YELLOW);
		lblResultados.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblResultados.setBounds(710, 11, 159, 38);
		contentPane.add(lblResultados);
		
		JLabel lblAciertos = new JLabel("ACIERTOS:");
		lblAciertos.setForeground(new Color(0, 255, 0));
		lblAciertos.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblAciertos.setBounds(723, 64, 111, 25);
		contentPane.add(lblAciertos);
		
		JLabel lblErrores = new JLabel("ERRORES:");
		lblErrores.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblErrores.setForeground(Color.GREEN);
		lblErrores.setBounds(723, 108, 111, 25);
		contentPane.add(lblErrores);
		
		JLabel lblNewLabel_1 = new JLabel(nombre[0]);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setBounds(107, 84, 456, 155);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNotaDijitaCorrectamente = new JLabel("NOTA: Dijita correctamente las palabras o letras que aparecen en la parte de arriba con los dedos correspondientes");
		lblNotaDijitaCorrectamente.setForeground(Color.GREEN);
		lblNotaDijitaCorrectamente.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNotaDijitaCorrectamente.setBounds(10, 308, 759, 31);
		contentPane.add(lblNotaDijitaCorrectamente);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(20, 381, 360, 126);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(10, 11, 330, 104);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnVolver = new JButton("Volver\r\n\r\n");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 Menu a = new Menu();
			     a.setVisible(true);
			     Ejercicios_De_Palabras.this.dispose();
			}
		});
		btnVolver.setBounds(752, 627, 90, 23);
		contentPane.add(btnVolver);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AudioClip sonido;
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("No_mire_el_teclado.wav"));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String as = textField.getText();
				if (as.equals(nombre[x])){
					Aciertos++;
					lblAciertos.setText("ACIERTOS:"+Aciertos);
				}
				else{
					Errores++;
					lblErrores.setText("ERRORES:"+Errores);
				}
				x++;
				lblNewLabel_1.setText(nombre[x]);
			}		
		});
		btnNewButton.setBounds(885, 627, 89, 23);
		contentPane.add(btnNewButton);
				
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("src\\imagenes\\AmbasManosMecano.gif"));
		lblNewLabel_2.setBounds(448, 350, 526, 243);
		contentPane.add(lblNewLabel_2);
				
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src\\imagenes\\fondo-azul.jpg"));
		lblNewLabel.setBounds(0, 0, 984, 662);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AudioClip sonido;
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("EscribaLosSiguientesEjerciciosDeManeraCorrecta.wav"));
				sonido.play();
			}
		});
		contentPane.add(lblNewLabel);
	}
}
