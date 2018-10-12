package View;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.UsuarioController;
import VO.UsuarioVO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.geom.Point2D;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog.ModalExclusionType;

public class CadastroUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JPasswordField txtsenha;
	private JTextField txtlogin;
	private JTextField txtemail;
	private JPasswordField txtsenhaadm;

	/**
	 * Launch the application.
	 * 
	 * @return
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
							.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							javax.swing.UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| javax.swing.UnsupportedLookAndFeelException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				try {
					CadastroUsuarioView frame = new CadastroUsuarioView();
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
	public CadastroUsuarioView() {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}

		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Cadastro de Usuario");
		setResizable(false);
		setBounds(100, 100, 701, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 791, 493);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(17, 144, 147));
		panel_1.setBounds(0, 0, 359, 530);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/logoOficial.png")));
		label.setBounds(45, 147, 240, 160);
		panel_1.add(label);

		JLabel lblVarejoSantos = new JLabel("Varej\u00E3o Santos");
		lblVarejoSantos.setFont(new Font("Elephant", Font.PLAIN, 21));
		lblVarejoSantos.setForeground(Color.WHITE);
		lblVarejoSantos.setBounds(82, 92, 171, 27);
		panel_1.add(lblVarejoSantos);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(71, 130, 182, 2);
		panel_1.add(separator_3);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(82, 319, 182, 2);
		panel_1.add(separator_7);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(25, 25, 112));
		panel_2.setBounds(357, 0, 368, 506);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblCadastroDeUsuario = new JLabel("Cadastro De Usuario");
		lblCadastroDeUsuario.setIcon(
				new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-administrador-masculino.png")));
		lblCadastroDeUsuario.setForeground(Color.WHITE);
		lblCadastroDeUsuario.setFont(new Font("Elephant", Font.PLAIN, 18));
		lblCadastroDeUsuario.setBounds(36, 11, 245, 26);
		panel_2.add(lblCadastroDeUsuario);

		JSeparator separator = new JSeparator();
		separator.setBounds(36, 35, 226, 2);
		panel_2.add(separator);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setIcon(
				new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-usu\u00E1rio-15 (1).png")));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(10, 82, 67, 14);
		panel_2.add(lblNome);

		txtnome = new JTextField();
		txtnome.setBorder(null);
		txtnome.setForeground(Color.WHITE);
		txtnome.setBackground(new Color(25, 25, 112));
		txtnome.setBounds(10, 107, 311, 20);
		panel_2.add(txtnome);
		txtnome.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-cadeado-2-15.png")));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(10, 153, 86, 14);
		panel_2.add(lblSenha);

		txtsenha = new JPasswordField();
		txtsenha.setForeground(Color.WHITE);
		txtsenha.setBackground(new Color(25, 25, 112));
		txtsenha.setBorder(null);
		txtsenha.setBounds(10, 178, 311, 14);
		panel_2.add(txtsenha);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setIcon(
				new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-usu\u00E1rio-15 (1).png")));
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(10, 209, 67, 14);
		panel_2.add(lblLogin);

		txtlogin = new JTextField();
		txtlogin.setForeground(Color.WHITE);
		txtlogin.setBackground(new Color(25, 25, 112));
		txtlogin.setBorder(null);
		txtlogin.setColumns(10);
		txtlogin.setBounds(10, 234, 311, 14);
		panel_2.add(txtlogin);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-mensagem-15.png")));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(10, 265, 86, 14);
		panel_2.add(lblEmail);

		txtemail = new JTextField();
		txtemail.setForeground(Color.WHITE);
		txtemail.setBackground(new Color(25, 25, 112));
		txtemail.setBorder(null);
		txtemail.setColumns(10);
		txtemail.setBounds(10, 290, 271, 14);
		panel_2.add(txtemail);

		JLabel lblTipoDeConta = new JLabel("Tipo de Conta");
		lblTipoDeConta.setIcon(
				new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-ordem-de-compra-15.png")));
		lblTipoDeConta.setForeground(Color.WHITE);
		lblTipoDeConta.setBounds(10, 378, 97, 14);
		panel_2.add(lblTipoDeConta);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Administrador", "Funcionario" }));
		comboBox.setBorder(null);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(10, 404, 311, 20);
		panel_2.add(comboBox);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					validarSenhaAdm();
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, e.getMessage());
					e.printStackTrace();
				}

			}

			private void validarSenhaAdm() throws Exception {

				if (txtsenhaadm.getText().equals("Admin")) {
					cadastraUsuario();

				} else {
					JOptionPane.showMessageDialog(null, "Senha do administrador incorreta");
				}
			}

			private void cadastraUsuario() throws Exception {

				UsuarioVO uVO = new UsuarioVO();
				UsuarioController uController = new UsuarioController();

				uVO = getDados();
				limpar();

				uController.cadastroDeUsuario(uVO);
			}

			private UsuarioVO getDados() {
				UsuarioVO uVO = new UsuarioVO();
				String conta = comboBox.getSelectedItem().toString();
				uVO.setNome(txtnome.getText().trim());
				uVO.setLogin(txtlogin.getText().trim());
				uVO.setSenha(txtsenha.getText().trim());
				uVO.setEmail(txtemail.getText().trim());
				uVO.setTipo_conta(conta);

				return uVO;
			}

			private void limpar() {
				txtnome.setText("");
				txtlogin.setText("");
				txtsenha.setText("");
				txtemail.setText("");
				txtsenhaadm.setText("");
				txtnome.requestFocus();

			}
		});
		btnSalvar.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-salvar-25 (4).png")));
		btnSalvar.setBounds(10, 448, 97, 33);
		panel_2.add(btnSalvar);

		JButton btnCancelar = new JButton("Limpar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtnome.setText("");
				txtlogin.setText("");
				txtsenha.setText("");
				txtemail.setText("");
				txtsenhaadm.setText("");

				txtnome.requestFocus();

			}

		});
		btnCancelar.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-vassoura-25.png")));
		btnCancelar.setBounds(119, 448, 107, 33);
		panel_2.add(btnCancelar);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 127, 311, 17);
		panel_2.add(separator_4);
		separator_4.setForeground(Color.WHITE);

		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(10, 191, 311, 17);
		panel_2.add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(10, 247, 311, 17);
		panel_2.add(separator_6);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(10, 304, 311, 17);
		panel_2.add(separator_1);

		JLabel lblSenhaAdministrador = new JLabel("Senha Administrador");
		lblSenhaAdministrador
				.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-cadeado-2-15.png")));
		lblSenhaAdministrador.setForeground(Color.WHITE);
		lblSenhaAdministrador.setBackground(Color.WHITE);
		lblSenhaAdministrador.setBounds(10, 318, 146, 16);
		panel_2.add(lblSenhaAdministrador);

		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.WHITE);
		separator_8.setBounds(10, 361, 311, 17);
		panel_2.add(separator_8);

		txtsenhaadm = new JPasswordField();
		txtsenhaadm.setForeground(Color.WHITE);
		txtsenhaadm.setBorder(null);
		txtsenhaadm.setBackground(new Color(25, 25, 112));
		txtsenhaadm.setBounds(10, 346, 271, 14);
		panel_2.add(txtsenhaadm);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewLoginDesign menu = new ViewLoginDesign();
				menu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/imagens/icons8-voltar-25.png")));
		btnVoltar.setBounds(231, 448, 90, 33);
		panel_2.add(btnVoltar);
	}
}
