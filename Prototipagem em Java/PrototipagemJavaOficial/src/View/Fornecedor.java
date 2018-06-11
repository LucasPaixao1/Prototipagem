package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class Fornecedor extends JFrame {

	public  JFrame frame;
	private JTextField textCodigo;
	private JTextField textEmpresa;
	private JTextField textCnpj;
	private JTextField textRua;
	private JTextField textCep;
	private JTextField textNumero;
	private JTextField textBairro;
	private JTextField textTelefone;
	private JTextField textCelular;
	private JTable table;
	private JTextField textField_7;
	static Fornecedor windowFornecedor = new Fornecedor();
	private JTextField textCidade;

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
					windowFornecedor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fornecedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 12));
		frame.setBounds(100, 100, 1000, 815);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblId = new JLabel("C\u00D3DIGO:");
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblId.setBounds(299, 45, 63, 18);
		frame.getContentPane().add(lblId);

		textCodigo = new JTextField();
		textCodigo.setBounds(359, 40, 80, 23);
		frame.getContentPane().add(textCodigo);
		textCodigo.setColumns(10);

		textEmpresa = new JTextField();
		textEmpresa.setColumns(10);
		textEmpresa.setBounds(299, 112, 140, 31);
		frame.getContentPane().add(textEmpresa);

		JLabel lblEmpresa = new JLabel("EMPRESA:");
		lblEmpresa.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmpresa.setBounds(299, 86, 85, 14);
		frame.getContentPane().add(lblEmpresa);

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCnpj.setBounds(486, 86, 85, 14);
		frame.getContentPane().add(lblCnpj);

		textCnpj = new JTextField();
		textCnpj.setColumns(10);
		textCnpj.setBounds(486, 113, 180, 30);
		frame.getContentPane().add(textCnpj);

		textRua = new JTextField();
		textRua.setColumns(10);
		textRua.setBounds(299, 182, 180, 30);
		frame.getContentPane().add(textRua);

		JLabel lblRua = new JLabel("RUA:");
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblRua.setBounds(299, 157, 46, 14);
		frame.getContentPane().add(lblRua);

		textCep = new JTextField();
		textCep.setColumns(10);
		textCep.setBounds(486, 182, 120, 30);
		frame.getContentPane().add(textCep);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(491, 157, 46, 14);
		frame.getContentPane().add(lblCep);

		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(703, 182, 50, 30);
		frame.getContentPane().add(textNumero);

		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNumero.setBounds(704, 157, 86, 14);
		frame.getContentPane().add(lblNumero);

		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(299, 258, 180, 30);
		frame.getContentPane().add(textBairro);

		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(300, 233, 73, 14);
		frame.getContentPane().add(lblBairro);

		JLabel lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(486, 233, 85, 14);
		frame.getContentPane().add(lblCidade);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblUf.setBounds(705, 233, 46, 14);
		frame.getContentPane().add(lblUf);

		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(299, 304, 74, 14);
		frame.getContentPane().add(lblTelefone);

		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(298, 329, 180, 30);
		frame.getContentPane().add(textTelefone);

		JLabel lblTelefone_1 = new JLabel("TELEFONE CELULAR:");
		lblTelefone_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone_1.setBounds(486, 304, 132, 14);
		frame.getContentPane().add(lblTelefone_1);

		textCelular = new JTextField();
		textCelular.setColumns(10);
		textCelular.setBounds(485, 329, 180, 30);
		frame.getContentPane().add(textCelular);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"LISTA DE FORNECEDORES CADASTRADOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(299, 416, 652, 294);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 55, 621, 224);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setShowVerticalLines(true);
		table.setShowHorizontalLines(true);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		table.setBackground(new Color(255, 255, 255));
		table.setForeground(SystemColor.inactiveCaptionText);
		scrollPane.setViewportView(table);
		table.setToolTipText("LISTA DE FORNECEDORES");
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00D3DIGO", "EMPRESA", "CNPJ", "CEP", "TELEFONE", "CELULAR"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(62);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(258, 21, 90, 28);
		panel_2.add(btnPesquisar);

		textField_7 = new JTextField();
		textField_7.setBounds(107, 21, 122, 28);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pesquisar");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(16, 27, 55, 16);
		panel_2.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setIgnoreRepaint(true);
		panel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.setFocusTraversalPolicyProvider(true);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(new Color(17, 144, 147));
		panel.setToolTipText("");
		panel.setForeground(new Color(72, 61, 139));
		panel.setBounds(0, -6, 272, 778);
		frame.getContentPane().add(panel);

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
			}
		});
		label.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setBounds(17, 52, 199, 32);
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator = new JSeparator();
		separator.setBounds(17, 96, 199, 10);

		JButton button_2 = new JButton("Cadastro de Clientes");
		button_2.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button_2.setBounds(0, 136, 272, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				CadastroClienteView window = new CadastroClienteView();
				window.frmCadastroDeCliente.setVisible(true);
				
				windowFornecedor.dispose();
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17, 144, 147));

		JButton button_3 = new JButton("Cadastro de Fornecedores");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);
				
				windowFornecedor.dispose();
			}
		});
		button_3.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_3.setBounds(2, 196, 270, 48);
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17, 144, 147));

		JButton button_4 = new JButton("Cadastro de Produtos");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				
				windowFornecedor.dispose();
			}
		});
		button_4.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-produto-25.png")));
		button_4.setBounds(0, 256, 270, 48);
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17, 144, 147));

		JButton button_5 = new JButton("Vendas");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				
				windowFornecedor.dispose();
				
			}
		});
		button_5.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_5.setBounds(0, 316, 270, 48);
		button_5.setOpaque(true);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_5.setBackground(new Color(17, 144, 147));

		JButton button_6 = new JButton("Estoque");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				
				windowFornecedor.dispose();
				
			}
		});
		button_6.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_6.setBounds(2, 377, 270, 48);
		button_6.setOpaque(true);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_6.setBackground(new Color(17, 144, 147));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 517, 270, 2);

		JLabel label_1 = new JLabel("Administrador");
		label_1.setBounds(30, 531, 79, 16);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel.setLayout(null);
		panel.add(label);
		panel.add(separator);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_5);
		panel.add(button_6);
		panel.add(separator_1);
		panel.add(label_1);
		
		JButton button = new JButton("Relat\u00F3rios");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
				windowFornecedor.dispose();
				
			}
		});
		button.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-pdf-25.png")));
		button.setForeground(Color.WHITE);
		button.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17, 144, 147));
		button.setBounds(0, 437, 268, 48);
		panel.add(button);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(637, 55, 154, 1);
		frame.getContentPane().add(horizontalStrut);

		JLabel lblProduto = new JLabel("PRODUTO:");
		lblProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblProduto.setBounds(704, 304, 85, 14);
		frame.getContentPane().add(lblProduto);

		JComboBox Produto = new JComboBox();
		Produto.setBounds(703, 328, 140, 23);
		frame.getContentPane().add(Produto);

		JComboBox Uf = new JComboBox();
		Uf.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		Uf.setBounds(703, 258, 50, 30);
		frame.getContentPane().add(Uf);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(562, 722, 89, 23);
		frame.getContentPane().add(btnAlterar);

		JButton button_1 = new JButton("Salvar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigo = textCodigo.getText().trim();
				String emp = textEmpresa.getText().trim();
				String cnpj = textCnpj.getText().trim();
				String cep = textCep.getText().trim();
				String telefone = textTelefone.getText().trim();
				String celular = textCelular.getText().trim();
				
				DefaultTableModel val = (DefaultTableModel) table.getModel();
				val.addRow(new String[] {codigo, emp, cnpj, cep, telefone, celular});
				
				textCodigo.setText("");
				textEmpresa.setText("");
				textCnpj.setText("");
				textCep.setText("");
				textTelefone.setText("");
				textCelular.setText("");
				
				textCodigo.requestFocus();
			}
		});
		button_1.setBounds(300, 722, 89, 23);
		frame.getContentPane().add(button_1);

		JButton btnSair = new JButton("Excluir");
		btnSair.setBounds(819, 722, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JLabel lblCadastroDeFornecedores = new JLabel("Cadastro de Fornecedores");
		lblCadastroDeFornecedores.setForeground(Color.BLACK);
		lblCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblCadastroDeFornecedores.setBounds(438, 6, 297, 23);
		frame.getContentPane().add(lblCadastroDeFornecedores);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(436, 26, 299, 2);
		frame.getContentPane().add(separator_2);
		
		textCidade = new JTextField();
		textCidade.setBounds(486, 259, 180, 28);
		frame.getContentPane().add(textCidade);
		textCidade.setColumns(10);
	}
}
