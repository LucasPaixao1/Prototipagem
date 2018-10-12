package ViewFuncionarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import CEP.WebServiceCep;
import Controller.ClienteController;
import Controller.ProdutoController;
import VO.ClienteVO;
import VO.ProdutoVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JToggleButton;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;

public class CadastroClienteViewFuncionario extends JInternalFrame {

	public JFrame frmCadastroDeCliente;
	public JTextField txtCodigo;
	public JTextField txtNome;
	public JTextField txtRua;
	public JTextField txtCep;
	public static JComboBox comboBox;
	public  JComboBox comboBox2;
	private JTextField txtPesquisa;
	public String codigo;
	public String nome;
	public String fixo;
	public String nextel;
	public String celular;
	public String cnpj;
	public String cpf;
	public String frmPag;
	public String rua;
	public String bairro;
	public String num;
	public String cep;
	public String cidade;
	private MaskFormatter ftmTelefone;
	private MaskFormatter ftmNextel;
	private MaskFormatter ftmCnpj;
	private MaskFormatter ftmCpf;
	private MaskFormatter ftmCep;
	private JTextField txtFixo;
	private JTextField txtNextel;
	private JTextField txtCelular;
	private JTextField txtCnpj;
	private JTextField txtCpf;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtCidade;
	private static JTable table;
	private JTextField txtrua;
	private JTextField txtemail;
	private JTextField txtcomplemento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClienteViewFuncionario window = new CadastroClienteViewFuncionario();
					window.setVisible(true);

					pesquisarClienteTodos();
					// window.setLocation(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroClienteViewFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeCliente = new JFrame();
		frmCadastroDeCliente.setResizable(false);
		frmCadastroDeCliente.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 12));
		frmCadastroDeCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		frmCadastroDeCliente.setTitle("Cadastro de Cliente");
		frmCadastroDeCliente.setBounds(100, 100, 944, 804);
		frmCadastroDeCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Panel Painel = new Panel();
		Painel.setBounds(0, 0, 272, 775);
		Painel.setBackground(new Color(51, 0, 0));

		JLabel lblVarejoSantos = new JLabel("Varej\u00E3o Santos");
		lblVarejoSantos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVarejoSantos.setBounds(10, 45, 199, 32);
		lblVarejoSantos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ViewMenuDesignFuncionario menu = new ViewMenuDesignFuncionario();
				menu.setVisible(true);

				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		lblVarejoSantos.setIcon(
				new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		lblVarejoSantos.setForeground(new Color(240, 248, 255));
		lblVarejoSantos.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 199, 2);

		JButton btnNewButton_3 = new JButton("Cadastro de Clientes");
		btnNewButton_3 .setMnemonic(KeyEvent.VK_1);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setBounds(0, 131, 270, 48);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteViewFuncionario windowCliente = new CadastroClienteViewFuncionario();
				windowCliente.frmCadastroDeCliente.setVisible(true);

				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setIcon(
				new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(51, 0, 0));
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JButton btnCadastroDeFornecedores = new JButton("Cadastro de Fornecedores");
		btnCadastroDeFornecedores.setMnemonic(KeyEvent.VK_2);
		btnCadastroDeFornecedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastroDeFornecedores.setBounds(0, 191, 270, 48);
		btnCadastroDeFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FornecedorFuncionario fornecedor = new FornecedorFuncionario();
				fornecedor.frame.setVisible(true);

				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();
			}
		});
		btnCadastroDeFornecedores
				.setIcon(new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		btnCadastroDeFornecedores.setOpaque(true);
		btnCadastroDeFornecedores.setForeground(Color.WHITE);
		btnCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeFornecedores.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeFornecedores.setBackground(new Color(51, 0, 0));

		JButton btnCadastroDeProdutos = new JButton("Cadastro de Produtos");
		btnCadastroDeProdutos .setMnemonic(KeyEvent.VK_3);
		btnCadastroDeProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastroDeProdutos.setBounds(0, 251, 270, 48);
		btnCadastroDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setVisible(true);

				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnCadastroDeProdutos
				.setIcon(new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-produto-25.png")));
		btnCadastroDeProdutos.setOpaque(true);
		btnCadastroDeProdutos.setForeground(Color.WHITE);
		btnCadastroDeProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeProdutos.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeProdutos.setBackground(new Color(51, 0, 0));

		JButton btnEstoque = new JButton("Estoque");
	btnEstoque.setMnemonic(KeyEvent.VK_1);
		btnEstoque.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEstoque.setBounds(0, 311, 270, 48);
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = new ViewEstoqueDesignFuncionario();
				estoque.setVisible(true);

				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnEstoque.setIcon(
				new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		btnEstoque.setOpaque(true);
		btnEstoque.setForeground(Color.WHITE);
		btnEstoque.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnEstoque.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnEstoque.setBackground(new Color(51, 0, 0));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 490, 270, 2);

		JLabel lblAdministrador = new JLabel("Funcion\u00E1rio");
		lblAdministrador.setBounds(24, 523, 79, 16);
		lblAdministrador.setForeground(new Color(255, 255, 255));
		lblAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblId = new JLabel("C\u00D3DIGO:");
		lblId.setBounds(314, 74, 50, 14);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtCodigo = new JTextField();
		txtCodigo.setBounds(314, 99, 89, 30);
		txtCodigo.setColumns(10);

		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(425, 74, 38, 14);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtNome = new JTextField();
		txtNome.setBounds(425, 99, 249, 30);
		txtNome.setColumns(10);

		JLabel lblTelResidencial = new JLabel("TEL. FIXO(opcional):");
		lblTelResidencial.setBounds(314, 165, 161, 14);
		lblTelResidencial.setFont(new Font("Arial", Font.BOLD, 11));

		JLabel lblTelComercial = new JLabel("TEL. NEXTEL");
		lblTelComercial.setBounds(550, 164, 67, 15);
		lblTelComercial.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblTelCelular = new JLabel("TEL. CELULAR (opcional):");
		lblTelCelular.setBounds(739, 164, 136, 15);
		lblTelCelular.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(314, 455, 621, 250);
		panel_3.setAlignmentX(10.0f);
		panel_3.setBorder(new TitledBorder(null, "Clientes Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null,
				new Color(0, 0, 0)));

		JLabel lblCnpjopcional = new JLabel("CNPJ(opcional):");
		lblCnpjopcional.setBounds(314, 244, 161, 14);
		lblCnpjopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblCpfopcional = new JLabel("CPF(opcional):");
		lblCpfopcional.setBounds(540, 244, 82, 14);
		lblCpfopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));

		comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(739, 276, 142, 30);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "BOLETO", "DINHEIRO", "CART\u00C3O", "CHEQUE"}));

		JLabel lblFormaDePagamento = new JLabel("FORMA DE PAGAMENTO:");
		lblFormaDePagamento.setBounds(739, 244, 152, 14);
		lblFormaDePagamento.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblRua = new JLabel("RUA:");
		lblRua.setBounds(452, 318, 161, 14);
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(314, 394, 99, 14);
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblNmero = new JLabel("N\u00DAMERO:");
		lblNmero.setBounds(761, 325, 55, 14);
		lblNmero.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(314, 325, 161, 14);
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtCep = new JTextField();
		try {
			ftmCep = new MaskFormatter("#####-###");
			txtCep = new JFormattedTextField(ftmCep);
			txtCep.setBounds(755, 192, 117, 29);
		} catch (ParseException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}

		txtCep.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String cp = txtCep.getText();
				cp = cp.replaceAll("\\D*", "");
				int cont = cp.length();

				if (cont == 8) {
					try {
						PesquisarPorCep();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			}

		});
		txtCep.setBounds(314, 344, 122, 30);

		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setBounds(452, 394, 57, 14);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblCadastroCliente = new JLabel("CADASTRO CLIENTE");
		lblCadastroCliente.setIcon(new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-filled-25.png")));
		lblCadastroCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblCadastroCliente.setBounds(487, 22, 255, 30);
		lblCadastroCliente.setFont(new Font("Segoe UI", Font.BOLD, 22));

		JLabel lblPesquisarPorCdigo = new JLabel("Pesquisar ");
		lblPesquisarPorCdigo.setBounds(16, 30, 128, 16);
		lblPesquisarPorCdigo.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		txtPesquisa = new JTextField();
		txtPesquisa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				String nome = txtPesquisa.getText();

				try {
					pesquisarPorNome(nome);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		txtPesquisa.setBounds(144, 21, 63, 28);
		txtPesquisa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtPesquisa.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setIcon(new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-salvar-25 (2).png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(314, 716, 117, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cadastraCliente();
					pesquisarClienteTodos();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					Pattern patternString = Pattern.compile("[A-Z]");
					Pattern patternNumeros = Pattern.compile("[0-9]");

					if (patternNumeros.matcher(txtPesquisa.getText()).find()) {

						addDadosTable(pesquisaPorCodigo(Integer.parseInt(txtPesquisa.getText())));

					} else if (patternString.matcher(txtPesquisa.getText()).find()) {

						pesquisarPorNome(txtPesquisa.getText());

					}

				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}

		});
		btnPesquisar.setIcon(
				new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-pesquisar-filled-25.png")));
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setBounds(222, 21, 40, 28);
		btnPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(488, 50, 207, 2);

		try {
			ftmTelefone = new MaskFormatter("(###)####-####");
			txtFixo = new JFormattedTextField(ftmTelefone);
			txtFixo.setBounds(314, 191, 117, 30);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			ftmNextel = new MaskFormatter("(####)####-####");
			txtNextel = new JFormattedTextField(ftmNextel);
			txtNextel.setBounds(530, 191, 117, 30);
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

		try {

			ftmNextel = new MaskFormatter("(##)#########");
			txtCelular = new JFormattedTextField(ftmNextel);
			txtCelular.setBounds(739, 192, 136, 29);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		txtCnpj = new JTextField();

		try {
			ftmCnpj = new MaskFormatter("##.###.###/####-##");
			txtCnpj = new JFormattedTextField(ftmCnpj);

		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		txtCnpj.setBounds(314, 276, 117, 30);

		txtCpf = new JTextField();
		try {
			ftmCpf = new MaskFormatter("###.###.###-##");
			txtCpf = new JFormattedTextField(ftmCpf);
			txtCpf.setBounds(530, 277, 117, 29);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		txtBairro = new JTextField();
		txtBairro.setBounds(314, 414, 117, 29);

		txtNumero = new JTextField();
		txtNumero.setBounds(761, 345, 64, 29);
		frmCadastroDeCliente.getContentPane().setLayout(null);
		frmCadastroDeCliente.getContentPane().add(Painel);
		Painel.setLayout(null);
		Painel.add(separator_1);
		Painel.add(btnNewButton_3);
		Painel.add(btnEstoque);
		Painel.add(btnCadastroDeFornecedores);
		Painel.add(btnCadastroDeProdutos);
		Painel.add(separator);
		Painel.add(lblVarejoSantos);
		Painel.add(lblAdministrador);
		frmCadastroDeCliente.getContentPane().add(separator_2);
		frmCadastroDeCliente.getContentPane().add(lblCadastroCliente);
		frmCadastroDeCliente.getContentPane().add(lblId);
		frmCadastroDeCliente.getContentPane().add(lblNome);
		frmCadastroDeCliente.getContentPane().add(txtCodigo);
		frmCadastroDeCliente.getContentPane().add(txtNome);
		frmCadastroDeCliente.getContentPane().add(lblTelResidencial);
		frmCadastroDeCliente.getContentPane().add(lblTelComercial);
		frmCadastroDeCliente.getContentPane().add(lblTelCelular);
		frmCadastroDeCliente.getContentPane().add(txtFixo);
		frmCadastroDeCliente.getContentPane().add(txtNextel);
		frmCadastroDeCliente.getContentPane().add(txtCelular);
		frmCadastroDeCliente.getContentPane().add(lblCnpjopcional);
		frmCadastroDeCliente.getContentPane().add(lblCpfopcional);
		frmCadastroDeCliente.getContentPane().add(lblFormaDePagamento);
		frmCadastroDeCliente.getContentPane().add(txtCnpj);
		frmCadastroDeCliente.getContentPane().add(txtCpf);
		frmCadastroDeCliente.getContentPane().add(comboBox);
		frmCadastroDeCliente.getContentPane().add(lblRua);
		frmCadastroDeCliente.getContentPane().add(lblBairro);
		frmCadastroDeCliente.getContentPane().add(lblNmero);
		frmCadastroDeCliente.getContentPane().add(txtBairro);
		frmCadastroDeCliente.getContentPane().add(txtNumero);
		frmCadastroDeCliente.getContentPane().add(lblCep);
		frmCadastroDeCliente.getContentPane().add(lblCidade);
		frmCadastroDeCliente.getContentPane().add(txtCep);
		frmCadastroDeCliente.getContentPane().add(btnNewButton);
		frmCadastroDeCliente.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(lblPesquisarPorCdigo);
		panel_3.add(txtPesquisa);
		panel_3.add(btnPesquisar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 58, 571, 174);
		panel_3.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Codigo", "Nome", "CNPJ", "CPF", "Pagamento" }));

		txtCidade = new JTextField();
		txtCidade.setBounds(452, 414, 120, 28);
		frmCadastroDeCliente.getContentPane().add(txtCidade);
		txtCidade.setColumns(10);

		txtrua = new JTextField();
		txtrua.setBounds(452, 347, 290, 28);
		frmCadastroDeCliente.getContentPane().add(txtrua);
		txtrua.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setIcon(
				new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnLimpar.setBounds(656, 716, 107, 37);
		frmCadastroDeCliente.getContentPane().add(btnLimpar);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(314, 191, 89, 28);
		frmCadastroDeCliente.getContentPane().add(formattedTextField);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(739, 73, 55, 16);
		frmCadastroDeCliente.getContentPane().add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBounds(739, 100, 136, 28);
		frmCadastroDeCliente.getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		txtcomplemento = new JTextField();
		txtcomplemento.setBounds(584, 414, 158, 28);
		frmCadastroDeCliente.getContentPane().add(txtcomplemento);
		txtcomplemento.setColumns(10);
		
		JLabel lblComplemento = new JLabel("COMPLEMENTO");
		lblComplemento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplemento.setBounds(584, 393, 111, 16);
		frmCadastroDeCliente.getContentPane().add(lblComplemento);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		comboBox2.setBounds(761, 415, 64, 26);
		frmCadastroDeCliente.getContentPane().add(comboBox2);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblUf.setBounds(761, 393, 55, 16);
		frmCadastroDeCliente.getContentPane().add(lblUf);
		
				JButton btnPreencherCampos = new JButton("Detalhes");
				btnPreencherCampos.setBounds(452, 716, 165, 37);
				frmCadastroDeCliente.getContentPane().add(btnPreencherCampos);
				btnPreencherCampos.setIcon(
						new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-ver-detalhes-25.png")));
				
						JButton btnAtualizar = new JButton("Atualizar");
						btnAtualizar.setBounds(790, 718, 111, 35);
						frmCadastroDeCliente.getContentPane().add(btnAtualizar);
						btnAtualizar
								.setIcon(new ImageIcon(CadastroClienteViewFuncionario.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
						btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnAtualizar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								try {
									pesquisarClienteTodos();
								} catch (Exception e) {

									JOptionPane.showMessageDialog(null, "Erro Interno: " + e.getMessage(), "Atenção",
											JOptionPane.ERROR_MESSAGE);

								}

							}
						});
				btnPreencherCampos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						try {
							preencherCampos();
						} catch (Exception e1) {

							e1.printStackTrace();
						}

					}

				});

	}

	public JTable getTable() {

		return table;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void cadastraCliente() throws Exception {
		ClienteVO cVO = new ClienteVO();
		ClienteController cController = new ClienteController();

		cVO = getDados();
		limpar();

		cController.cadastroDeCliente(cVO);

	}

	private ClienteVO getDados() {

		ClienteVO clienteVO = new ClienteVO();

		String pagamento = comboBox.getSelectedItem().toString();
		
		clienteVO.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
		clienteVO.setNome(txtNome.getText().trim());
		clienteVO.setFixo(txtFixo.getText().trim());
		clienteVO.setNextel(txtNextel.getText().trim());
		clienteVO.setFormaDePagamento(pagamento);
		clienteVO.setCel(txtCelular.getText().trim());
		clienteVO.setCnpj(txtCnpj.getText().trim());
		clienteVO.setCpf(txtCpf.getText().trim());
		clienteVO.setRua(txtrua.getText().trim());
		clienteVO.setBairro(txtBairro.getText().trim());
		clienteVO.setNumero(txtNumero.getText().trim());
		clienteVO.setCep(txtCep.getText().trim());
		clienteVO.setCidade(txtCidade.getText().trim());
		clienteVO.setComplemento(txtcomplemento.getText().trim());
		clienteVO.setEmail(txtemail.getText().trim());
		String uf = comboBox2.getSelectedItem().toString();
		clienteVO.setUf(uf);
	

		return clienteVO;
	}


	private void limpar() {

		txtCodigo.setText("");
		txtNome.setText("");
		txtFixo.setText("");
		txtNextel.setText("");
		txtCelular.setText("");
		txtCnpj.setText("");
		txtCpf.setText("");
		txtrua.setText("");
		txtBairro.setText("");
		txtNumero.setText("");
		txtCep.setText("");
		txtCidade.setText("");
		txtcomplemento.setText("");
		txtemail.setText("");
		comboBox2.setSelectedIndex(0);
		comboBox.setSelectedIndex(0);
		txtCodigo.requestFocus();
	}

	private static void pesquisarClienteTodos() throws Exception {
		ClienteController cController = new ClienteController();
		List<ClienteVO> lista = new ArrayList<ClienteVO>();
		lista = cController.pesquisarClienteTodos();
		cleanTable(table);

		for (ClienteVO clienteVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String Codigo = Integer.toString(clienteVO.getCodigo());

			dados.addRow(new String[] { Codigo, clienteVO.getNome(), clienteVO.getCnpj(), clienteVO.getCpf(),
					clienteVO.getFormaDePagamento() });

		}

	}

	private void excluirCliente() throws Exception {
		txtCodigo.enable(true);
		ClienteController clienteController = new ClienteController();

		JOptionPane.showMessageDialog(frmCadastroDeCliente,
				clienteController.excluirCliente(Integer.parseInt(txtCodigo.getText())));

	}

	private static void cleanTable(JTable tabela) {

		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}

	private void preencherCampos() throws Exception {
		int linhaSelecionada = table.getSelectedRow();

		if (linhaSelecionada != -1) {

			String codigo = table.getValueAt(linhaSelecionada, 0).toString();

			ClienteVO clienteVO = pesquisaPorCodigo(Integer.parseInt(codigo));



			txtCodigo.enable(false);
			txtCodigo.setText(Integer.toString(clienteVO.getCodigo()));
			txtNome.setText(clienteVO.getNome());
			txtFixo.setText(clienteVO.getFixo());
			txtNextel.setText(clienteVO.getNextel());
			txtCelular.setText(clienteVO.getCel());
			comboBox.setSelectedItem(clienteVO.getFormaDePagamento());
			txtCnpj.setText(clienteVO.getCnpj());
			txtCpf.setText(clienteVO.getCpf());
			txtrua.setText(clienteVO.getRua());
			txtBairro.setText(clienteVO.getBairro());
			txtNumero.setText(clienteVO.getNumero());
			txtCep.setText(clienteVO.getCep());
			txtCidade.setText(clienteVO.getCidade());
			txtemail.setText(clienteVO.getEmail());
			txtcomplemento.setText(clienteVO.getComplemento());

		} else {

			JOptionPane.showMessageDialog(frmCadastroDeCliente, "Favor selecionar uma linha", "Atenção",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	private ClienteVO pesquisaPorCodigo(int codigo) throws Exception {
		ClienteController clienteController = new ClienteController();

		return clienteController.pesquisarPorCodigo(codigo);
	}

	private void addDadosTable(ClienteVO clienteVO) {

		cleanTable(table);

		DefaultTableModel dados = (DefaultTableModel) table.getModel();

		String Codigo = Integer.toString(clienteVO.getCodigo());

		dados.addRow(new String[] { Codigo, clienteVO.getNome(), clienteVO.getCnpj(), clienteVO.getCpf(),
				clienteVO.getFormaDePagamento() });

	}

	private void alterarCliente() throws Exception {

		txtCodigo.enable(true);

		ClienteVO clienteVO = new ClienteVO();

		String pagamento = comboBox.getSelectedItem().toString();
		clienteVO.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
		clienteVO.setNome(txtNome.getText().trim());
		clienteVO.setFixo(txtFixo.getText().trim());
		clienteVO.setNextel(txtNextel.getText().trim());
		clienteVO.setFormaDePagamento(pagamento);
		clienteVO.setCel(txtCelular.getText().trim());
		clienteVO.setCnpj(txtCnpj.getText().trim());
		clienteVO.setCpf(txtCpf.getText().trim());
		clienteVO.setRua(txtrua.getText().trim());
		clienteVO.setBairro(txtBairro.getText().trim());
		clienteVO.setNumero(txtNumero.getText().trim());
		clienteVO.setCep(txtCep.getText().trim());
		clienteVO.setCidade(txtCidade.getText().trim());
		String uf = comboBox2.getSelectedItem().toString();
		clienteVO.setUf(uf);
		clienteVO.setEmail(txtemail.getText().trim());
		clienteVO.setComplemento(txtcomplemento.getText().trim());

		ClienteController controller = new ClienteController();
		controller.alteraCliente(clienteVO);

		limpar();
	}

	private void pesquisarPorNome(String nome) throws Exception {
		cleanTable(table);
		ClienteController controller = new ClienteController();

		List<ClienteVO> lista = controller.pesquisarNome(nome);

		for (ClienteVO clienteVO : lista) {

			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String codigo = Integer.toString(clienteVO.getCodigo());

			dados.addRow(new String[] { codigo, clienteVO.getNome(), clienteVO.getCnpj(), clienteVO.getCpf(),
					clienteVO.getFormaDePagamento() });
		}

	}

	private void PesquisarPorCep() {
		String cep = txtCep.getText();
		String uf = comboBox2.getSelectedItem().toString();
		WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

		if (webServiceCep.wasSuccessful()) {

			
			txtrua.setText(webServiceCep.getLogradouroFull());
			txtBairro.setText(webServiceCep.getBairro());
			txtCidade.setText(webServiceCep.getCidade());
			comboBox2.setSelectedItem(webServiceCep.getUf());

		} else {
			JOptionPane.showMessageDialog(null, webServiceCep.getResultText());

		}

	}
}

	