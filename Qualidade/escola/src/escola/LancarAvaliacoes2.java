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
import java.awt.Choice;

public class LancarAvaliacoes2 extends JFrame {
	

	private JPanel contentPane;
	private int cont;
	private int a;
	private JLabel lblN;
	private JLabel lblN_2;
	private JLabel lblN_1;
	private JLabel lblTurmas;
	private JLabel lblInserirGuich;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LancarAvaliacoes2 frame = new LancarAvaliacoes2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public LancarAvaliacoes2() {
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
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LancarAvaliacoes frame = new LancarAvaliacoes();
				frame.setVisible(true);
				dispose();			}
		});
		btnVoltar.setBounds(30, 686, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JButton btnSeguir = new JButton("SALVAR");
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(601, 686, 148, 39);
		contentPane.add(btnSeguir);
		
		JLabel lblTurmasParaLanamento = new JLabel("LISTA DOS ALUNOS");
		lblTurmasParaLanamento.setForeground(Color.WHITE);
		lblTurmasParaLanamento.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblTurmasParaLanamento.setAutoscrolls(true);
		lblTurmasParaLanamento.setAlignmentY(1.0f);
		lblTurmasParaLanamento.setBounds(81, 130, 153, 70);
		contentPane.add(lblTurmasParaLanamento);
		
		JLabel lblMatruicula = new JLabel("MATRÍCULA");
		lblMatruicula.setForeground(Color.WHITE);
		lblMatruicula.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblMatruicula.setAutoscrolls(true);
		lblMatruicula.setAlignmentY(1.0f);
		lblMatruicula.setBounds(317, 130, 97, 70);
		contentPane.add(lblMatruicula);
		
		lblN = new JLabel("A1");
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setForeground(Color.WHITE);
		lblN.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblN.setAutoscrolls(true);
		lblN.setAlignmentY(1.0f);
		lblN.setBounds(462, 130, 37, 70);
		contentPane.add(lblN);
		
		lblN_2 = new JLabel("A2");
		lblN_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblN_2.setForeground(Color.WHITE);
		lblN_2.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblN_2.setAutoscrolls(true);
		lblN_2.setAlignmentY(1.0f);
		lblN_2.setBounds(531, 130, 34, 70);
		contentPane.add(lblN_2);
		
		lblN_1 = new JLabel("FALTAS");
		lblN_1.setForeground(Color.WHITE);
		lblN_1.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblN_1.setAutoscrolls(true);
		lblN_1.setAlignmentY(1.0f);
		lblN_1.setBounds(584, 130, 62, 70);
		contentPane.add(lblN_1);
		
		JLabel lblN_1_1 = new JLabel("STATUS");
		lblN_1_1.setForeground(Color.WHITE);
		lblN_1_1.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblN_1_1.setAutoscrolls(true);
		lblN_1_1.setAlignmentY(1.0f);
		lblN_1_1.setBounds(683, 130, 79, 70);
		contentPane.add(lblN_1_1);
		
		lblTurmas = new JLabel("TURMAS");
		lblTurmas.setForeground(Color.WHITE);
		lblTurmas.setFont(new Font("Javanese Text", Font.BOLD, 35));
		lblTurmas.setAutoscrolls(true);
		lblTurmas.setAlignmentY(1.0f);
		lblTurmas.setBounds(521, 91, 172, 70);
		contentPane.add(lblTurmas);
		
		lblInserirGuich = new JLabel("LANÇAMENTO");
		lblInserirGuich.setForeground(Color.WHITE);
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 60));
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setAlignmentY(1.0f);
		lblInserirGuich.setBounds(136, 40, 452, 70);
		contentPane.add(lblInserirGuich);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(30, 428, 243, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(30, 457, 243, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(30, 486, 243, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(30, 515, 243, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(30, 544, 243, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(30, 573, 243, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(30, 602, 243, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(30, 631, 243, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(329, 631, 75, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(329, 602, 75, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(329, 573, 75, 19);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(329, 544, 75, 19);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(329, 515, 75, 19);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(329, 486, 75, 19);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(329, 457, 75, 19);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(329, 428, 75, 19);
		contentPane.add(textField_15);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(30, 198, 243, 19);
		contentPane.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(30, 227, 243, 19);
		contentPane.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(30, 256, 243, 19);
		contentPane.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(30, 285, 243, 19);
		contentPane.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(30, 314, 243, 19);
		contentPane.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(30, 343, 243, 19);
		contentPane.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(30, 372, 243, 19);
		contentPane.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(30, 401, 243, 19);
		contentPane.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(329, 401, 75, 19);
		contentPane.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(329, 372, 75, 19);
		contentPane.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(329, 343, 75, 19);
		contentPane.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(329, 314, 75, 19);
		contentPane.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(329, 285, 75, 19);
		contentPane.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(329, 256, 75, 19);
		contentPane.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(329, 227, 75, 19);
		contentPane.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(329, 198, 75, 19);
		contentPane.add(textField_63);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(462, 198, 37, 19);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(462, 227, 37, 19);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(462, 256, 37, 19);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(462, 285, 37, 19);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(462, 314, 37, 19);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(462, 343, 37, 19);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(462, 372, 37, 19);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(528, 198, 37, 19);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(528, 227, 37, 19);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(528, 256, 37, 19);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(528, 285, 37, 19);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(528, 314, 37, 19);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(528, 343, 37, 19);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(528, 372, 37, 19);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(593, 198, 37, 19);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(593, 227, 37, 19);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(593, 256, 37, 19);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(593, 285, 37, 19);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(593, 314, 37, 19);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(593, 343, 37, 19);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(593, 372, 37, 19);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(462, 401, 37, 19);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(528, 401, 37, 19);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(593, 401, 37, 19);
		contentPane.add(textField_39);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(462, 428, 37, 19);
		contentPane.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(462, 457, 37, 19);
		contentPane.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(462, 486, 37, 19);
		contentPane.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(462, 515, 37, 19);
		contentPane.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(462, 544, 37, 19);
		contentPane.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(462, 573, 37, 19);
		contentPane.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(462, 602, 37, 19);
		contentPane.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(528, 428, 37, 19);
		contentPane.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(528, 457, 37, 19);
		contentPane.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(528, 486, 37, 19);
		contentPane.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(528, 515, 37, 19);
		contentPane.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(528, 544, 37, 19);
		contentPane.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(528, 573, 37, 19);
		contentPane.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(528, 602, 37, 19);
		contentPane.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(593, 428, 37, 19);
		contentPane.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(593, 457, 37, 19);
		contentPane.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(593, 486, 37, 19);
		contentPane.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(593, 515, 37, 19);
		contentPane.add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(593, 544, 37, 19);
		contentPane.add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(593, 573, 37, 19);
		contentPane.add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(593, 602, 37, 19);
		contentPane.add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(462, 631, 37, 19);
		contentPane.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(528, 631, 37, 19);
		contentPane.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(593, 631, 37, 19);
		contentPane.add(textField_87);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBackground(Color.GREEN);
		textField_40.setBounds(697, 198, 37, 19);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBackground(Color.RED);
		textField_41.setBounds(697, 227, 37, 19);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBackground(Color.RED);
		textField_42.setBounds(697, 256, 37, 19);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBackground(Color.RED);
		textField_43.setBounds(697, 285, 37, 19);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBackground(Color.GREEN);
		textField_44.setBounds(697, 314, 37, 19);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBackground(Color.RED);
		textField_45.setBounds(697, 343, 37, 19);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBackground(Color.GREEN);
		textField_46.setBounds(697, 372, 37, 19);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBackground(Color.GREEN);
		textField_47.setBounds(697, 401, 37, 19);
		contentPane.add(textField_47);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBackground(Color.GREEN);
		textField_88.setBounds(697, 428, 37, 19);
		contentPane.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBackground(Color.RED);
		textField_89.setBounds(697, 457, 37, 19);
		contentPane.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBackground(Color.RED);
		textField_90.setBounds(697, 486, 37, 19);
		contentPane.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBackground(Color.RED);
		textField_91.setBounds(697, 515, 37, 19);
		contentPane.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBackground(Color.GREEN);
		textField_92.setBounds(697, 544, 37, 19);
		contentPane.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBackground(Color.RED);
		textField_93.setBounds(697, 573, 37, 19);
		contentPane.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBackground(Color.GREEN);
		textField_94.setBounds(697, 602, 37, 19);
		contentPane.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBackground(Color.GREEN);
		textField_95.setBounds(697, 631, 37, 19);
		contentPane.add(textField_95);
	}
}

