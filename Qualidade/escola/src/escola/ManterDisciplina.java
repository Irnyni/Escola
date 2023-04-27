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

public class ManterDisciplina extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManterDisciplina frame = new ManterDisciplina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public ManterDisciplina() {
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
		
				JButton btnSalvar = new JButton("DIARIO DE CLASSE");
				btnSalvar.setBounds(10, 125, 330, 39);
				btnSalvar.setForeground(new Color(64, 0, 0));
				btnSalvar.setBackground(new Color(255, 255, 255));
				btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnSalvar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
			
	
					}
				});
				btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
				contentPane.add(btnSalvar);

		JLabel lblInserirGuich = new JLabel("PORTAL");
		lblInserirGuich.setBounds(10, 11, 342, 98);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 81));
		contentPane.add(lblInserirGuich);
		
		JButton btnCancelarInscricao = new JButton("AVALIACOES E FALTAS");
		btnCancelarInscricao.setBounds(10, 190, 330, 39);
		btnCancelarInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelarInscricao.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao.setBackground(new Color(255, 255, 255));
		contentPane.add(btnCancelarInscricao);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setBounds(356, 428, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JButton btnBoletim = new JButton("BOLETIM");
		btnBoletim.setBounds(10, 251, 330, 39);
		btnBoletim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoletim.setForeground(new Color(64, 0, 0));
		btnBoletim.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim.setBackground(new Color(255, 255, 255));
		contentPane.add(btnBoletim);
		
		JButton btnSolicitarHistorico = new JButton("GRADES");
		btnSolicitarHistorico.setBounds(10, 314, 330, 39);
		btnSolicitarHistorico.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico.setBackground(new Color(255, 255, 255));
		contentPane.add(btnSolicitarHistorico);
		
		JButton btnVisualizarGrade = new JButton("HABILITACOES");
		btnVisualizarGrade.setBounds(10, 375, 330, 39);
		btnVisualizarGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVisualizarGrade.setForeground(new Color(64, 0, 0));
		btnVisualizarGrade.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVisualizarGrade.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVisualizarGrade);
		
		JLabel lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblProfessor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 35));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(305, 63, 219, 80);
		contentPane.add(lblProfessor);
	}
}

