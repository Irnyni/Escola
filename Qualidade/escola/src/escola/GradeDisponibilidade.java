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

public class GradeDisponibilidade extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeDisponibilidade frame = new GradeDisponibilidade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public GradeDisponibilidade() {
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
		
		JLabel lblGrade = new JLabel("GRADE");
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setFont(new Font("Javanese Text", Font.BOLD, 99));
		lblGrade.setAutoscrolls(true);
		lblGrade.setAlignmentY(1.0f);
		lblGrade.setBounds(81, 10, 452, 129);
		contentPane.add(lblGrade);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(31, 694, 148, 39);
		contentPane.add(btnVoltar);
		
		JLabel lblDisponibilidade = new JLabel("DISPONIBILIDADE");
		lblDisponibilidade.setForeground(Color.WHITE);
		lblDisponibilidade.setFont(new Font("Javanese Text", Font.BOLD, 35));
		lblDisponibilidade.setAutoscrolls(true);
		lblDisponibilidade.setAlignmentY(1.0f);
		lblDisponibilidade.setBounds(414, 94, 334, 70);
		contentPane.add(lblDisponibilidade);
		
		JButton btnSeguir = new JButton("SEGUIR");
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(600, 694, 148, 39);
		contentPane.add(btnSeguir);
		
		JLabel lblTurmasParaLanamento = new JLabel("DISCIPLINAS DISPONÍVEIS");
		lblTurmasParaLanamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurmasParaLanamento.setForeground(Color.WHITE);
		lblTurmasParaLanamento.setFont(new Font("Javanese Text", Font.BOLD, 35));
		lblTurmasParaLanamento.setAutoscrolls(true);
		lblTurmasParaLanamento.setAlignmentY(1.0f);
		lblTurmasParaLanamento.setBounds(86, 162, 594, 70);
		contentPane.add(lblTurmasParaLanamento);
		
		JToggleButton btnSalvar = new JToggleButton("BIOLOGIA 5 ANO");
		btnSalvar.setForeground(new Color(64, 0, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(31, 322, 272, 39);
		contentPane.add(btnSalvar);
		
		JToggleButton btnCancelarInscricao = new JToggleButton("CIÊNCIAS 2 ANO");
		btnCancelarInscricao.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao.setBackground(Color.WHITE);
		btnCancelarInscricao.setBounds(31, 402, 272, 39);
		contentPane.add(btnCancelarInscricao);
		
		JToggleButton btnBoletim = new JToggleButton("BIOLOGIA 8 ANO");
		btnBoletim.setForeground(new Color(64, 0, 0));
		btnBoletim.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim.setBackground(Color.WHITE);
		btnBoletim.setBounds(31, 479, 272, 39);
		contentPane.add(btnBoletim);
		
		JToggleButton btnSolicitarHistorico = new JToggleButton("CIENCIAS 1 ANO");
		btnSolicitarHistorico.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico.setBackground(Color.WHITE);
		btnSolicitarHistorico.setBounds(31, 565, 272, 39);
		contentPane.add(btnSolicitarHistorico);
		
		JToggleButton tglbtnManh = new JToggleButton("MANHÃ");
		tglbtnManh.setForeground(new Color(64, 0, 0));
		tglbtnManh.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnManh.setBackground(Color.WHITE);
		tglbtnManh.setBounds(329, 322, 133, 39);
		contentPane.add(tglbtnManh);
		
		JToggleButton tglbtnManh_1 = new JToggleButton("MANHÃ");
		tglbtnManh_1.setForeground(new Color(64, 0, 0));
		tglbtnManh_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnManh_1.setBackground(Color.WHITE);
		tglbtnManh_1.setBounds(329, 402, 133, 39);
		contentPane.add(tglbtnManh_1);
		
		JToggleButton tglbtnManh_3 = new JToggleButton("MANHÃ");
		tglbtnManh_3.setForeground(new Color(64, 0, 0));
		tglbtnManh_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnManh_3.setBackground(Color.WHITE);
		tglbtnManh_3.setBounds(329, 479, 133, 39);
		contentPane.add(tglbtnManh_3);
		
		JToggleButton tglbtnManh_2 = new JToggleButton("MANHÃ");
		tglbtnManh_2.setForeground(new Color(64, 0, 0));
		tglbtnManh_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnManh_2.setBackground(Color.WHITE);
		tglbtnManh_2.setBounds(329, 565, 133, 39);
		contentPane.add(tglbtnManh_2);
		
		JToggleButton btnSalvar_1_1 = new JToggleButton("TARDE");
		btnSalvar_1_1.setForeground(new Color(64, 0, 0));
		btnSalvar_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar_1_1.setBackground(Color.WHITE);
		btnSalvar_1_1.setBounds(488, 322, 133, 39);
		contentPane.add(btnSalvar_1_1);
		
		JToggleButton btnCancelarInscricao_1_1 = new JToggleButton("TARDE");
		btnCancelarInscricao_1_1.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao_1_1.setBackground(Color.WHITE);
		btnCancelarInscricao_1_1.setBounds(488, 402, 133, 39);
		contentPane.add(btnCancelarInscricao_1_1);
		
		JToggleButton btnBoletim_1_1 = new JToggleButton("TARDE");
		btnBoletim_1_1.setForeground(new Color(64, 0, 0));
		btnBoletim_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim_1_1.setBackground(Color.WHITE);
		btnBoletim_1_1.setBounds(488, 479, 133, 39);
		contentPane.add(btnBoletim_1_1);
		
		JToggleButton btnSolicitarHistorico_1_1 = new JToggleButton("TARDE");
		btnSolicitarHistorico_1_1.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico_1_1.setBackground(Color.WHITE);
		btnSolicitarHistorico_1_1.setBounds(488, 565, 133, 39);
		contentPane.add(btnSolicitarHistorico_1_1);
		
		JToggleButton btnSalvar_1_2 = new JToggleButton("NOITE");
		btnSalvar_1_2.setForeground(new Color(64, 0, 0));
		btnSalvar_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar_1_2.setBackground(Color.WHITE);
		btnSalvar_1_2.setBounds(643, 322, 133, 39);
		contentPane.add(btnSalvar_1_2);
		
		JToggleButton btnCancelarInscricao_1_2 = new JToggleButton("NOITE");
		btnCancelarInscricao_1_2.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao_1_2.setBackground(Color.WHITE);
		btnCancelarInscricao_1_2.setBounds(643, 402, 133, 39);
		contentPane.add(btnCancelarInscricao_1_2);
		
		JToggleButton btnBoletim_1_2 = new JToggleButton("NOITE");
		btnBoletim_1_2.setForeground(new Color(64, 0, 0));
		btnBoletim_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim_1_2.setBackground(Color.WHITE);
		btnBoletim_1_2.setBounds(643, 479, 133, 39);
		contentPane.add(btnBoletim_1_2);
		
		JToggleButton btnSolicitarHistorico_1_2 = new JToggleButton("NOITE");
		btnSolicitarHistorico_1_2.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico_1_2.setBackground(Color.WHITE);
		btnSolicitarHistorico_1_2.setBounds(643, 565, 133, 39);
		contentPane.add(btnSolicitarHistorico_1_2);
		
		JLabel lblDisciplinas = new JLabel("DISCIPLINAS ");
		lblDisciplinas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas.setForeground(Color.WHITE);
		lblDisciplinas.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblDisciplinas.setAutoscrolls(true);
		lblDisciplinas.setAlignmentY(1.0f);
		lblDisciplinas.setBounds(31, 253, 272, 70);
		contentPane.add(lblDisciplinas);
		
		JLabel lblPerodos = new JLabel("PERÍODOS");
		lblPerodos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerodos.setForeground(Color.WHITE);
		lblPerodos.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblPerodos.setAutoscrolls(true);
		lblPerodos.setAlignmentY(1.0f);
		lblPerodos.setBounds(329, 253, 447, 70);
		contentPane.add(lblPerodos);
	}
}

