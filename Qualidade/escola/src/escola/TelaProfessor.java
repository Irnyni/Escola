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

public class TelaProfessor extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessor frame = new TelaProfessor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public TelaProfessor() {
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

		JLabel lblInserirGuich = new JLabel("PORTAL");
		lblInserirGuich.setBounds(190, 41, 342, 98);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 81));
		contentPane.add(lblInserirGuich);
		
		JButton btnVoltar = new JButton("SAIR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginProf frame = new loginProf();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(600, 693, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JLabel lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblProfessor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 35));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(475, 84, 219, 80);
		contentPane.add(lblProfessor);
		
		JButton btnSalvar = new JButton("DIÁRIO DE CLASSE");
		btnSalvar.setForeground(new Color(64, 0, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(162, 283, 450, 39);
		contentPane.add(btnSalvar);
		
		JButton btnCancelarInscricao = new JButton("AVALIAÇÕES E FALTAS");
		btnCancelarInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LancarAvaliacoes frame = new LancarAvaliacoes();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancelarInscricao.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao.setBackground(Color.WHITE);
		btnCancelarInscricao.setBounds(162, 348, 450, 39);
		contentPane.add(btnCancelarInscricao);
		
		JButton btnBoletim = new JButton("BOLETIM");
		btnBoletim.setForeground(new Color(64, 0, 0));
		btnBoletim.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim.setBackground(Color.WHITE);
		btnBoletim.setBounds(162, 409, 450, 39);
		contentPane.add(btnBoletim);
		
		JButton btnSolicitarHistorico = new JButton("GRADES");
		btnSolicitarHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GradeDisponibilidade frame = new GradeDisponibilidade();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnSolicitarHistorico.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico.setBackground(Color.WHITE);
		btnSolicitarHistorico.setBounds(162, 472, 450, 39);
		contentPane.add(btnSolicitarHistorico);
		
		JButton btnVisualizarGrade = new JButton("HABILITAÇOES");
		btnVisualizarGrade.setForeground(new Color(64, 0, 0));
		btnVisualizarGrade.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVisualizarGrade.setBackground(Color.WHITE);
		btnVisualizarGrade.setBounds(162, 533, 450, 39);
		contentPane.add(btnVisualizarGrade);
	}
}

