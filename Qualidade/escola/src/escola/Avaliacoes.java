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

public class Avaliacoes extends JFrame {
	

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avaliacoes frame = new Avaliacoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public Avaliacoes() {
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
		
				JToggleButton btnSalvar = new JToggleButton("BIOLOGIA 5 ANO  1/2016");
				btnSalvar.setBounds(89, 326, 592, 39);
				btnSalvar.setForeground(new Color(64, 0, 0));
				btnSalvar.setBackground(new Color(255, 255, 255));
				btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
				contentPane.add(btnSalvar);

		JLabel lblInserirGuich = new JLabel("VISUALIZAR");
		lblInserirGuich.setBounds(10, 11, 638, 169);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 99));
		contentPane.add(lblInserirGuich);
		
		JToggleButton btnCancelarInscricao = new JToggleButton("CIÊNCIAS 5 ANO 1/2016");
		btnCancelarInscricao.setBounds(89, 406, 592, 39);
		btnCancelarInscricao.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao.setBackground(new Color(255, 255, 255));
		contentPane.add(btnCancelarInscricao);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAluno frame= new TelaAluno();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(31, 690, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JToggleButton btnBoletim = new JToggleButton("BIOLOGIA 5 ANO 1/2016");
		btnBoletim.setBounds(89, 483, 592, 39);
		btnBoletim.setForeground(new Color(64, 0, 0));
		btnBoletim.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim.setBackground(new Color(255, 255, 255));
		contentPane.add(btnBoletim);
		
		JToggleButton btnSolicitarHistorico = new JToggleButton("CIENCIAS 5 ANO 1/2016");
		btnSolicitarHistorico.setBounds(89, 569, 592, 39);
		btnSolicitarHistorico.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico.setBackground(new Color(255, 255, 255));
		contentPane.add(btnSolicitarHistorico);
		
		JLabel lblTurmas = new JLabel("AVALIAÇÕES");
		lblTurmas.setForeground(Color.WHITE);
		lblTurmas.setFont(new Font("Javanese Text", Font.BOLD, 50));
		lblTurmas.setAutoscrolls(true);
		lblTurmas.setAlignmentY(1.0f);
		lblTurmas.setBounds(404, 135, 344, 70);
		contentPane.add(lblTurmas);
		
		JButton btnSeguir = new JButton("SEGUIR");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avaliacoes2 frame = new Avaliacoes2();
				frame.setVisible(true);
				dispose();	
			
			}
		});
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(600, 690, 148, 39);
		contentPane.add(btnSeguir);
		
		JLabel lblTurmasParaLanamento = new JLabel("SEMESTRES");
		lblTurmasParaLanamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurmasParaLanamento.setForeground(Color.WHITE);
		lblTurmasParaLanamento.setFont(new Font("Javanese Text", Font.BOLD, 35));
		lblTurmasParaLanamento.setAutoscrolls(true);
		lblTurmasParaLanamento.setAlignmentY(1.0f);
		lblTurmasParaLanamento.setBounds(89, 221, 592, 70);
		contentPane.add(lblTurmasParaLanamento);
	}
}

