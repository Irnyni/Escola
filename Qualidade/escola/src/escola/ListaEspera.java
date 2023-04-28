package escola;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.TextArea;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import java.awt.TextField;

public class ListaEspera extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEspera frame = new ListaEspera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public ListaEspera() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 50, 800, 800);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBackground(new Color(47, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JLabel lblInserirGuich = new JLabel("LISTA DE ESPERA");
		lblInserirGuich.setBounds(25, 17, 734, 98);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 80));
		contentPane.add(lblInserirGuich);
		
		JToggleButton tglbtnBiologia_2 = new JToggleButton("BIOLOGIA 2");
		tglbtnBiologia_2.setForeground(new Color(64, 0, 0));
		tglbtnBiologia_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBiologia_2.setBackground(Color.WHITE);
		tglbtnBiologia_2.setBounds(155, 234, 388, 39);
		contentPane.add(tglbtnBiologia_2);
		
		JLabel lblListaDeTurmas = new JLabel("LISTA DE TURMAS");
		lblListaDeTurmas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeTurmas.setForeground(Color.WHITE);
		lblListaDeTurmas.setFont(new Font("Javanese Text", Font.BOLD, 45));
		lblListaDeTurmas.setAutoscrolls(true);
		lblListaDeTurmas.setAlignmentY(1.0f);
		lblListaDeTurmas.setBounds(83, 125, 522, 58);
		contentPane.add(lblListaDeTurmas);
		
		JToggleButton tglbtnCincias_1 = new JToggleButton("CIÊNCIAS 2");
		tglbtnCincias_1.setForeground(new Color(64, 0, 0));
		tglbtnCincias_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnCincias_1.setBackground(Color.WHITE);
		tglbtnCincias_1.setBounds(155, 314, 388, 39);
		contentPane.add(tglbtnCincias_1);
		
		JToggleButton tglbtnBiologia_1 = new JToggleButton("HISTÓRIA 2");
		tglbtnBiologia_1.setForeground(new Color(64, 0, 0));
		tglbtnBiologia_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBiologia_1.setBackground(Color.WHITE);
		tglbtnBiologia_1.setBounds(155, 389, 388, 39);
		contentPane.add(tglbtnBiologia_1);
		
		JToggleButton tglbtnMatemtica = new JToggleButton("MATEMÁTICA 2");
		tglbtnMatemtica.setForeground(new Color(64, 0, 0));
		tglbtnMatemtica.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnMatemtica.setBackground(Color.WHITE);
		tglbtnMatemtica.setBounds(156, 465, 387, 39);
		contentPane.add(tglbtnMatemtica);
		
		JButton btnSeguir = new JButton("AVANÇAR");
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(561, 672, 181, 39);
		contentPane.add(btnSeguir);
		
		JButton btnVoltar_2 = new JButton("VOLTAR");
		btnVoltar_2.setForeground(new Color(64, 0, 0));
		btnVoltar_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2.setBackground(Color.WHITE);
		btnVoltar_2.setBounds(25, 672, 148, 39);
		contentPane.add(btnVoltar_2);
	}
}

