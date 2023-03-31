
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Ejercicios_Mano_Derecha extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios_Mano_Derecha frame = new Ejercicios_Mano_Derecha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int x=0;
	String nombre[]={
		"6yhnnhy6",
		"7ujmmju7",
		"8ikki8",
		"9ollo9",
		"0pññp0",
		"6yunj7mhjy",
		"89okl8io9k",
		"90oplñ",
		"hikl987pjm",
		"6uhhhipol90",
		"hjklñyuiopnm",
		"69huopm",
		"yiphk680nm",
		"68unmoplñh",
		"hjklñ09",
		"ñlkjhmn",
		"yuiop78",
		"nmñlkjhiop98",
		"78yjilpmh90",
		"yuiopñlkjhmn"
	};
	protected int Aciertos=0;
	protected int Errores=0;
	public Ejercicios_Mano_Derecha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPracticas = new JLabel("Ejercicios Mano Derecha");
		lblPracticas.setForeground(Color.YELLOW);
		lblPracticas.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPracticas.setBounds(135, 21, 369, 50);
		contentPane.add(lblPracticas);
		
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
			     Ejercicios_Mano_Derecha.this.dispose();
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
		lblNewLabel_2.setIcon(new ImageIcon("src\\imagenes\\ManoDerechaMecano.png"));
		lblNewLabel_2.setBounds(518, 350, 456, 243);
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
