
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.LabelUI;

import java.awt.Font;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

public class Ejercicios_Mano_Izquierda extends Menu {
	private JPanel contentPane;
	private JTextField textField;
	int x=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios_Mano_Izquierda frame = new Ejercicios_Mano_Izquierda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	String nombre [] = {
			"1qazzaq1",
			"2wsxxsw2",
			"3edccde3",
			"4rfvvfr4",
			"5tgbbgt5",
			"aqz11zqa",
			"x2swws2x",
			"dec33cde",
			"fr4v4vfr",
			"gt5bt5gb",
			"1sqwazx2",
			"sq2xz1qa",
			"qde3s2zxc",
			"e4vdf3crc",
			"ebg35dct3",
			"rg4vbf5gr",
			"1tga5zbqz",
			"1rfsvgbs34rdsa",
			"sex24rtwqaz35f",
			"4fcxvw21asbfgs"
		};
	protected int Aciertos=0;
	protected int Errores=0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public Ejercicios_Mano_Izquierda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mecatest Practicas");
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(nombre[0]);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setBounds(108, 93, 456, 155);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPractica = new JLabel("Ejercicios Mano Izquierda");
		lblPractica.setForeground(Color.YELLOW);
		lblPractica.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPractica.setBounds(142, 22, 387, 47);
		contentPane.add(lblPractica);
		
		JLabel lblNotaDijitaCorrectamente = new JLabel("NOTA: Dijita correctamente las palabras o letras que aparecen en la parte de arriba con los dedos correspondientes");
		lblNotaDijitaCorrectamente.setForeground(Color.GREEN);
		lblNotaDijitaCorrectamente.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNotaDijitaCorrectamente.setBounds(10, 293, 759, 31);
		contentPane.add(lblNotaDijitaCorrectamente);
		
		textField = new JTextField();
		textField.setBounds(10, 80, 518, 180);
		textField.setColumns(10);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setForeground(Color.YELLOW);
		lblResultados.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblResultados.setBounds(710, 11, 159, 38);
		contentPane.add(lblResultados);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(20, 381, 360, 126);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 330, 104);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblErrores = new JLabel("ERRORES:");
		lblErrores.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblErrores.setForeground(Color.GREEN);
		lblErrores.setBounds(723, 108, 111, 25);
		contentPane.add(lblErrores);
		
		JLabel lblAciertos = new JLabel("ACIERTOS:");
		lblAciertos.setForeground(new Color(0, 255, 0));
		lblAciertos.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblAciertos.setBounds(723, 64, 111, 25);
		contentPane.add(lblAciertos);
		
		JButton btnVolver = new JButton("Volver\r\n\r\n");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 Menu a = new Menu();
			     a.setVisible(true);
			     Ejercicios_Mano_Izquierda.this.dispose();
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
				String as = textField_1.getText();
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src//imagenes//ManoIzquierdaMecano.png"));
		lblNewLabel.setBounds(518, 350, 456, 243);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabelContra = new JLabel("New label");
		lblNewLabelContra.setBounds(0, 0, 984, 690);
		lblNewLabelContra.setIcon(new ImageIcon("src//imagenes//fondo-azul.jpg"));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AudioClip sonido;
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("EscribaLosSiguientesEjerciciosDeManeraCorrecta.wav"));
				sonido.play();
			}
		});
		contentPane.add(lblNewLabelContra);
	
	}
}