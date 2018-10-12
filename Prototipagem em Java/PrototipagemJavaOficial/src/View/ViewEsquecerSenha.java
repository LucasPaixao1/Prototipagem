package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Controller.EsquecerSenhaController;
import VO.EsquecerSenhaVO;

import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewEsquecerSenha extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEsquecerSenha frame = new ViewEsquecerSenha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewEsquecerSenha() {
		setResizable(false);
		setTitle("Esqueceu a senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51,51,51));
		panel.setBounds(0, 0, 735, 528);
		contentPane.add(panel);
		
		JLabel lblEsqueceuASenha = new JLabel("Esqueceu a Senha");
		lblEsqueceuASenha.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		lblEsqueceuASenha.setForeground(Color.WHITE);
		
		txtUsuario = new JTextField();
		txtUsuario.setToolTipText("");
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setColumns(10);
		txtUsuario.setBorder(null);
		txtUsuario.setBackground((new Color(51,51,51)));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(new Color(51,51,51));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ViewEsquecerSenha.class.getResource("/imagens/icons8-administrador-masculino-25 (3).png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ViewEsquecerSenha.class.getResource("/imagens/icons8-nova-mensagem-25.png")));
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setIcon(new ImageIcon(ViewEsquecerSenha.class.getResource("/imagens/icons8-voltar-25.png")));
		lblVoltar.setForeground(Color.WHITE);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					criarSenha();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}

			
		});
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBorder(new BevelBorder(BevelBorder.LOWERED, (new Color(51,51,51)), (new Color(51,51,51)),
				(new Color(51,51,51)), new Color(51,51,51)));
		btnEnviar.setBackground(new Color(102, 102, 102));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ViewEsquecerSenha.class.getResource("/imagens/icons8-cadeado-2-25.png")));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addComponent(lblVoltar, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(277)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(283)
					.addComponent(lblEsqueceuASenha, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(239)
					.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(205)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(239)
					.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(205)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(436)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblVoltar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(lblEsqueceuASenha)
					.addGap(104)
					.addComponent(lblUsuario)
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addComponent(lblEmail)
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
	}
	private void criarSenha() throws Exception {
		EsquecerSenhaVO esquecerSenha = new EsquecerSenhaVO();
		esquecerSenha.setEmail(txtEmail.getText());
		esquecerSenha.setLogin(txtUsuario.getText());
		
		EsquecerSenhaController esquecerSenhaController = new EsquecerSenhaController();
		esquecerSenhaController.criarSenha(esquecerSenha);
		
	}
}
