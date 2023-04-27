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
import java.awt.TextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;



public class Aluno extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno frame = new Aluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public Aluno() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 50, 800, 800);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBackground(new Color(47, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JLabel lblInserirGuich = new JLabel("ALUNO");
		lblInserirGuich.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirGuich.setBounds(149, 25, 455, 145);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 99));
		contentPane.add(lblInserirGuich);
		
		JButton btnVoltar = new JButton("SAIR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(601, 690, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JButton btnSolicitarHistorico = new JButton("EXCLUIR DISCIPLINA");
		btnSolicitarHistorico.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico.setBackground(Color.WHITE);
		btnSolicitarHistorico.setBounds(154, 416, 450, 39);
		contentPane.add(btnSolicitarHistorico);
		
		JButton btnBoletim = new JButton("ALTERAR DISCIPLINA");
		btnBoletim.setForeground(new Color(64, 0, 0));
		btnBoletim.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim.setBackground(Color.WHITE);
		btnBoletim.setBounds(154, 323, 450, 39);
		contentPane.add(btnBoletim);
		
		JButton btnSalvar = new JButton("ADICIONAR DISCIPLINA");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inscricoes frame = new Inscricoes();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnSalvar.setForeground(new Color(64, 0, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(154, 230, 450, 39);
		contentPane.add(btnSalvar);
		
		JButton btnVisualizarGrade = new JButton("PESQUISAR");
		btnVisualizarGrade.setForeground(new Color(64, 0, 0));
		btnVisualizarGrade.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVisualizarGrade.setBackground(Color.WHITE);
		btnVisualizarGrade.setBounds(154, 508, 450, 39);
		contentPane.add(btnVisualizarGrade);
	}
}

