package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
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
import java.awt.SystemColor;
import java.awt.Toolkit;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;

public class CadastroClienteView extends JInternalFrame{

	public JFrame frmCadastroDeCliente;
	public JTextField txtCodigo;
	public JTextField txtNome;
	public JTextField txtFixo;
	public JTextField txtNextel;
	public JTextField txtCelular;
	public JTextField txtCnpj;
	public JTextField txtCpf;
	public JTextField txtRua;
	public JTextField txtCep;
	public JComboBox comboBox;
	private JTable table;
	private JTextField textField;
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
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClienteView window = new CadastroClienteView();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroClienteView() {
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
		frmCadastroDeCliente.setBounds(100, 100, 956, 804);
		frmCadastroDeCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel Painel = new Panel();
		Painel.setBounds(0, 0, 272, 775);
		Painel.setBackground(new Color(17,144,147));
		
		JLabel lblVarejoSantos = new JLabel("Varej\u00E3o Santos");
		lblVarejoSantos.setBounds(10, 45, 199, 32);
		lblVarejoSantos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				
				frmCadastroDeCliente.dispose();
				
			}
		});
		lblVarejoSantos.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		lblVarejoSantos.setForeground(new Color(240, 248, 255));
		lblVarejoSantos.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 199, 2);
		
		JButton btnNewButton_3 = new JButton("Cadastro de Clientes");
		btnNewButton_3.setBounds(0, 131, 270, 48);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroClienteView windowCliente = new CadastroClienteView();
				windowCliente.frmCadastroDeCliente.setVisible(true);
				
				frmCadastroDeCliente.dispose();
				
			}
		});
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(17,144,147));
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnCadastroDeFornecedores = new JButton("Cadastro de Fornecedores");
		btnCadastroDeFornecedores.setBounds(0, 191, 270, 48);
		btnCadastroDeFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);
				
				frmCadastroDeCliente.dispose();
			}
		});
		btnCadastroDeFornecedores.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		btnCadastroDeFornecedores.setOpaque(true);
		btnCadastroDeFornecedores.setForeground(Color.WHITE);
		btnCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeFornecedores.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeFornecedores.setBackground(new Color(17,144,147));
		
		JButton btnCadastroDeProdutos = new JButton("Cadastro de Produtos");
		btnCadastroDeProdutos.setBounds(0, 251, 270, 48);
		btnCadastroDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				
				frmCadastroDeCliente.dispose();
				
			}
		});
		btnCadastroDeProdutos.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-produto-25.png")));
		btnCadastroDeProdutos.setOpaque(true);
		btnCadastroDeProdutos.setForeground(Color.WHITE);
		btnCadastroDeProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeProdutos.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeProdutos.setBackground(new Color(17,144,147));
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBounds(0, 311, 270, 48);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				
				frmCadastroDeCliente.dispose();
				
			}
		});
		btnVendas.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		btnVendas.setOpaque(true);
		btnVendas.setForeground(Color.WHITE);
		btnVendas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnVendas.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnVendas.setBackground(new Color(17,144,147));
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setBounds(0, 371, 270, 48);
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				
				frmCadastroDeCliente.dispose();
				
			}
		});
		btnEstoque.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		btnEstoque.setOpaque(true);
		btnEstoque.setForeground(Color.WHITE);
		btnEstoque.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnEstoque.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnEstoque.setBackground(new Color(17,144,147));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 490, 270, 2);
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setBounds(24, 523, 79, 16);
		lblAdministrador.setForeground(new Color(255, 255, 255));
		lblAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblId = new JLabel("C\u00D3DIGO:");
		lblId.setBounds(314, 74, 50, 14);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(314, 99, 89, 20);
		txtCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(415, 74, 38, 14);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		txtNome = new JTextField();
		txtNome.setBounds(415, 99, 492, 20);
		txtNome.setColumns(10);
		
		JLabel lblTelResidencial = new JLabel("TEL. FIXO(opcional):");
		lblTelResidencial.setBounds(314, 165, 161, 14);
		lblTelResidencial.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblTelComercial = new JLabel("TEL. NEXTEL");
		lblTelComercial.setBounds(557, 164, 67, 15);
		lblTelComercial.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblTelCelular = new JLabel("TEL. CELULAR (opcional):");
		lblTelCelular.setBounds(755, 165, 136, 15);
		lblTelCelular.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(314, 455, 621, 250);
		panel_3.setAlignmentX(10.0f);
		panel_3.setBorder(new TitledBorder(null, "Clientes Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 58, 581, 165);
		
		JLabel lblCnpjopcional = new JLabel("CNPJ(opcional):");
		lblCnpjopcional.setBounds(314, 244, 161, 14);
		lblCnpjopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblCpfopcional = new JLabel("CPF(opcional):");
		lblCpfopcional.setBounds(557, 244, 117, 14);
		lblCpfopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(755, 270, 92, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BOLETO", "DINHEIRO"}));
		
		JLabel lblFormaDePagamento = new JLabel("FORMA DE PAGAMENTO:");
		lblFormaDePagamento.setBounds(755, 244, 152, 14);
		lblFormaDePagamento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(567, 716, 83, 28);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(818, 716, 89, 28);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		
		JLabel lblRua = new JLabel("RUA:");
		lblRua.setBounds(314, 325, 161, 14);
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JTextField txtRua = new JTextField();
		txtRua.setBounds(314, 345, 161, 20);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(557, 325, 99, 14);
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblNmero = new JLabel("N\u00DAMERO:");
		lblNmero.setBounds(757, 325, 55, 14);
		lblNmero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(314, 386, 161, 14);
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JTextField txtCep = new JTextField();
		txtCep.setBounds(314, 411, 89, 20);
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setBounds(557, 386, 161, 14);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(557, 411, 161, 20);
		
		JLabel lblCadastroCliente = new JLabel("CADASTRO CLIENTE");
		lblCadastroCliente.setBounds(487, 22, 208, 30);
		lblCadastroCliente.setFont(new Font("Segoe UI", Font.BOLD, 22));
		
		JLabel lblPesquisarPorCdigo = new JLabel("Pesquisar por C\u00F3digo:");
		lblPesquisarPorCdigo.setBounds(16, 30, 128, 16);
		lblPesquisarPorCdigo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(156, 26, 63, 20);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(314, 716, 89, 28);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				codigo = txtCodigo.getText();
				nome = txtNome.getText();
				fixo = txtFixo.getText();
				celular = txtCelular.getText();
				cnpj = txtCnpj.getText();
				frmPag = (String) comboBox.getSelectedItem();
				
				txtCodigo.setText("");
				txtNome.setText("");
				txtFixo.setText("");
				txtNextel.setText("");
				txtCelular.setText("");
				txtCnpj.setText("");
				txtCpf.setText("");
				
				DefaultTableModel val = (DefaultTableModel) table.getModel();
				val.addRow(new String[] {codigo, nome, fixo, celular, cnpj, frmPag});
				
				txtCodigo.requestFocus();
				
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Tel. Comercial", "Tel. Celular", "CNPJ", "Forma De Pagamento"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(212);
		table.getColumnModel().getColumn(5).setPreferredWidth(133);
		table.getColumnModel().getColumn(5).setMinWidth(19);
		table.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(246, 26, 90, 20);
		btnPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(488, 50, 207, 2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 191, 117, 20);
		
		textField_2 = new JTextField();
		textField_2.setBounds(557, 191, 117, 20);
		
		textField_3 = new JTextField();
		textField_3.setBounds(755, 192, 117, 20);
		
		textField_4 = new JTextField();
		textField_4.setBounds(314, 276, 117, 20);
		
		textField_5 = new JTextField();
		textField_5.setBounds(557, 270, 117, 20);
		
		textField_6 = new JTextField();
		textField_6.setBounds(557, 345, 117, 20);
		
		textField_7 = new JTextField();
		textField_7.setBounds(757, 345, 117, 20);
		frmCadastroDeCliente.getContentPane().setLayout(null);
		frmCadastroDeCliente.getContentPane().add(Painel);
		Painel.setLayout(null);
		Painel.add(separator_1);
		Painel.add(btnNewButton_3);
		Painel.add(btnEstoque);
		Painel.add(btnCadastroDeFornecedores);
		Painel.add(btnCadastroDeProdutos);
		Painel.add(btnVendas);
		Painel.add(separator);
		Painel.add(lblVarejoSantos);
		Painel.add(lblAdministrador);
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
				
				frmCadastroDeCliente.dispose();
				
			}
		});
		btnRelatorios.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-pdf-25.png")));
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		btnRelatorios.setBounds(0, 431, 268, 48);
		Painel.add(btnRelatorios);
		frmCadastroDeCliente.getContentPane().add(separator_2);
		frmCadastroDeCliente.getContentPane().add(lblCadastroCliente);
		frmCadastroDeCliente.getContentPane().add(lblId);
		frmCadastroDeCliente.getContentPane().add(lblNome);
		frmCadastroDeCliente.getContentPane().add(txtCodigo);
		frmCadastroDeCliente.getContentPane().add(txtNome);
		frmCadastroDeCliente.getContentPane().add(lblTelResidencial);
		frmCadastroDeCliente.getContentPane().add(lblTelComercial);
		frmCadastroDeCliente.getContentPane().add(lblTelCelular);
		frmCadastroDeCliente.getContentPane().add(textField_1);
		frmCadastroDeCliente.getContentPane().add(textField_2);
		frmCadastroDeCliente.getContentPane().add(textField_3);
		frmCadastroDeCliente.getContentPane().add(lblCnpjopcional);
		frmCadastroDeCliente.getContentPane().add(lblCpfopcional);
		frmCadastroDeCliente.getContentPane().add(lblFormaDePagamento);
		frmCadastroDeCliente.getContentPane().add(textField_4);
		frmCadastroDeCliente.getContentPane().add(textField_5);
		frmCadastroDeCliente.getContentPane().add(comboBox);
		frmCadastroDeCliente.getContentPane().add(lblRua);
		frmCadastroDeCliente.getContentPane().add(lblBairro);
		frmCadastroDeCliente.getContentPane().add(lblNmero);
		frmCadastroDeCliente.getContentPane().add(txtRua);
		frmCadastroDeCliente.getContentPane().add(textField_6);
		frmCadastroDeCliente.getContentPane().add(textField_7);
		frmCadastroDeCliente.getContentPane().add(lblCep);
		frmCadastroDeCliente.getContentPane().add(lblCidade);
		frmCadastroDeCliente.getContentPane().add(txtCep);
		frmCadastroDeCliente.getContentPane().add(txtCidade);
		frmCadastroDeCliente.getContentPane().add(btnNewButton);
		frmCadastroDeCliente.getContentPane().add(btnNewButton_1);
		frmCadastroDeCliente.getContentPane().add(btnNewButton_2);
		frmCadastroDeCliente.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(lblPesquisarPorCdigo);
		panel_3.add(textField);
		panel_3.add(btnPesquisar);
		panel_3.add(scrollPane);
		

	}
	public JTable getTable() {

		return table;
	}
}
