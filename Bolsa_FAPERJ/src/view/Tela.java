package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JLabel;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private final JPanel panel_2 = new JPanel();

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1280, 768,1280, 768);
		getContentPane().setLayout(null);
		
		//Background inicial
		ImageIcon imgInicial = new ImageIcon(getClass().getResource("/imagens/telaInicial.jpg"));
		JLabel Inicial = new JLabel(imgInicial);
		Inicial.setBounds(0, 0, 1280,768);
		getContentPane().add(Inicial);		
		

		//Tela inicial
		
		JButton btnNewButton = new JButton("Iniciar jogo");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 getContentPane().removeAll();
				 //Muda o background
				 ImageIcon imgFase = new ImageIcon(getClass().getResource("/imagens/telaPadrao.jpg"));
   			     JLabel Fase = new JLabel(imgFase);
			     Fase.setBounds(0, 0, 1280,768); 
			     getContentPane().add(Fase);    
			     getContentPane().revalidate();
			     getContentPane().repaint();
			}
		});
		btnNewButton.setBounds(525, 500, 250, 85);
		getContentPane().add(btnNewButton);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(440, 220, 420, 250);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(50, 500, 160, 250);
		getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(240, 500, 160, 250);
		getContentPane().add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(1070, 500, 160, 250);
		getContentPane().add(panel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(880, 500, 160, 250);
		getContentPane().add(panel_1_3);
		panel_2.setBounds(0, 0, 1280, 740);
		getContentPane().add(panel_2);
		
		//Tela de fase
//		  JPanel panel = new JPanel();
//        panel.setBounds(10, 10, 130, 130);
//        getContentPane().add(panel);
//        JPanel panel_1 = new JPanel();
//        panel_1.setBounds(1126, 10, 130, 130);
//        getContentPane().add(panel_1);
//        JPanel panel_3 = new JPanel();
//        panel_3.setBounds(150, 10, 290, 130);
//        getContentPane().add(panel_3);
//        JPanel panel_3_1 = new JPanel();
//        panel_3_1.setBounds(883, 10, 230, 130);
//        getContentPane().add(panel_3_1);
//        JPanel panel_4 = new JPanel();
//        panel_4.setBounds(380, 285, 520, 320);
//        panel_4.setLayout(new BorderLayout());
//        panel_4.setBackground(new Color(194, 218, 255));
//        getContentPane().add(panel_4);
//        // Painel central para as alternativas
//        JPanel panelAlternativas = new JPanel();
//        panelAlternativas.setLayout(new BoxLayout(panelAlternativas, BoxLayout.Y_AXIS));
//        // RadioButtons para alternativas
//        ButtonGroup grupoAlternativas = new ButtonGroup();
//        JRadioButton radioA = new JRadioButton("A) Alternativa A");
//        JRadioButton radioB = new JRadioButton("B) Alternativa B");
//        JRadioButton radioC = new JRadioButton("C) Alternativa C");
//        JRadioButton radioD = new JRadioButton("D) Alternativa D");
//        radioA.setAlignmentX(Component.CENTER_ALIGNMENT);
//        radioB.setAlignmentX(Component.CENTER_ALIGNMENT);
//        radioC.setAlignmentX(Component.CENTER_ALIGNMENT);
//        radioD.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        radioA.setAlignmentY(Component.CENTER_ALIGNMENT);
//        radioB.setAlignmentY(Component.CENTER_ALIGNMENT);
//        radioC.setAlignmentY(Component.CENTER_ALIGNMENT);
//        radioD.setAlignmentY(Component.CENTER_ALIGNMENT);
//        grupoAlternativas.add(radioA);
//        grupoAlternativas.add(radioB);
//        grupoAlternativas.add(radioC);
//        grupoAlternativas.add(radioD);
//        panelAlternativas.add(radioA);
//        panelAlternativas.add(radioB);
//        panelAlternativas.add(radioC);
//        panelAlternativas.add(radioD);
//        panel_4.add(panelAlternativas, BorderLayout.CENTER);
//        // Painel para os botões (alinhados horizontalmente na parte inferior)
//        JPanel panelBotoes = new JPanel(new FlowLayout());
//        JButton btnEnviar = new JButton("Enviar Resposta");
//        JButton btnAjuda = new JButton("Pedir Ajuda");
//        btnEnviar.setFocusPainted(false);
//        btnEnviar.setForeground(Color.WHITE);
//        btnEnviar.setBackground(new Color(66, 133, 244));
//        btnEnviar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
//        btnEnviar.setContentAreaFilled(false);
//        btnEnviar.setOpaque(true);
//        btnEnviar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//        btnEnviar.setBounds(63, 178, 130, 40);
//        btnEnviar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
//
//        btnAjuda.setFocusPainted(false);
//        btnAjuda.setForeground(Color.WHITE);
//        btnAjuda.setBackground(new Color(66, 133, 244));
//        btnAjuda.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
//        btnAjuda.setContentAreaFilled(false);
//        btnAjuda.setOpaque(true);
//        btnAjuda.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//        btnAjuda.setBounds(63, 178, 130, 40);
//        btnAjuda.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
//
//        panelBotoes.add(btnEnviar);
//        panelBotoes.add(btnAjuda);
//        panel_4.add(panelBotoes, BorderLayout.SOUTH); 
//		
		
		
		//Tela de fim  de fase
		
//		JPanel panel = new JPanel();
//		panel.setBounds(515, 320, 250, 250);
//		panel.setBackground(new Color(194, 218, 255));
//		getContentPane().add(panel);
//		
//		JButton btnNewButton = new JButton("Avançar ");
//		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
//		btnNewButton.setBounds(63, 178, 130, 40);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		panel.setLayout(null);
//		panel.add(btnNewButton);
//		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBounds(48, 35, 160, 130);
//		panel.add(panel_1);
		
		//Tela de início de fase
		
//		JPanel panel = new JPanel();
//		panel.setBounds(515, 320, 270, 270);
//		panel.setBackground(new Color(194, 218, 255));
//		getContentPane().add(panel);
//		
//		JButton btnNewButton = new JButton("Iniciar Fase");
//		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
//		btnNewButton.setBounds(70, 200, 130, 40);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		panel.setLayout(null);
//		panel.add(btnNewButton);
//		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBounds(55, 75, 160, 100);
//		panel.add(panel_1);
//		
//		JLabel lblNewLabel = new JLabel("Fase 2");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
//		lblNewLabel.setBounds(96, 35, 79, 30);
//		panel.add(lblNewLabel);
	}
}
