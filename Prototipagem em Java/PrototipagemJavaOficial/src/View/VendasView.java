package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class VendasView extends JFrame {

	private JPanel contentPane;
	private JTextField codigoVen;
	private JTextField txtNomeCli;
	private JTextField txtData;
	private JTextField txtValorProd;
	private JTextField txtQuanProd;
	private JTextField txtPesoProd;
	private JTable table;
	private JTextField textField_6;
	private JTextField txtCodProd;
	private JTextField txtNomeProd;
	static VendasView frameVendas = new VendasView();

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
					frameVendas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VendasView() {
		setTitle("Vendas");
		setResizable(false);
		setFont(new Font("Segoe UI", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 270, 770);
		panel.setBackground(new Color(17,144,147));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 490, 0, 2);
		
		JButton button = new JButton("Cadastro de Clientes");
		button.setBounds(0, 131, 270, 48);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroClienteView window = new CadastroClienteView();
				window.frmCadastroDeCliente.setVisible(true);
				
				frameVendas.dispose();
			}
		});
		button.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17,144,147));
		
		JButton button_1 = new JButton("Estoque");
		button_1.setBounds(0, 371, 270, 48);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				
				frameVendas.dispose();
			}
		});
		button_1.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(17,144,147));
		
		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setBounds(0, 191, 270, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);
				
				frameVendas.dispose();
				
			}
		});
		button_2.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17,144,147));
		
		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setBounds(0, 251, 270, 48);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				
				frameVendas.dispose();
			}
		});
		button_3.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17,144,147));
		
		JButton button_4 = new JButton("Vendas");
		button_4.setBounds(0, 311, 270, 48);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				
				frameVendas.dispose();
				
			}
		});
		button_4.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17,144,147));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 97, 0, 2);
		
		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setBounds(10, 39, 260, 32);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				
				frameVendas.dispose();
			}
		});
		label.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 89, 0, 2);
		
		JLabel label_1 = new JLabel("Administrador");
		label_1.setBounds(24, 523, 79, 16);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(6, 482, 270, 2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(12, 89, 204, 18);
		
		codigoVen = new JTextField();
		codigoVen.setBounds(304, 136, 56, 26);
		codigoVen.setColumns(10);
		
		JLabel lblCdigoDaVenda = new JLabel("C\u00D3DIGO DA VENDA:");
		lblCdigoDaVenda.setBounds(304, 111, 122, 14);
		lblCdigoDaVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblNomeDoCliente = new JLabel("NOME DO CLIENTE:");
		lblNomeDoCliente.setBounds(444, 111, 122, 14);
		lblNomeDoCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		txtNomeCli = new JTextField();
		txtNomeCli.setBounds(444, 136, 494, 26);
		txtNomeCli.setColumns(10);
		
		txtData = new JTextField();
		txtData.setBounds(633, 228, 122, 26);
		txtData.setText("DD/MM/AA");
		txtData.setColumns(10);
		
		JLabel lblDataDaVenda = new JLabel("DATA DA VENDA");
		lblDataDaVenda.setBounds(633, 203, 117, 14);
		lblDataDaVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		txtValorProd = new JTextField();
		txtValorProd.setBounds(786, 228, 92, 26);
		txtValorProd.setColumns(10);
		
		JLabel label_5 = new JLabel("VALOR DO PRODUTO:");
		label_5.setBounds(786, 203, 124, 14);
		label_5.setToolTipText("");
		label_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		txtQuanProd = new JTextField();
		txtQuanProd.setBounds(444, 314, 92, 26);
		txtQuanProd.setColumns(10);
		
		JLabel lblQuantidadeVendida = new JLabel("QUANTIDADE VENDIDA:");
		lblQuantidadeVendida.setBounds(444, 289, 167, 14);
		lblQuantidadeVendida.setToolTipText("");
		lblQuantidadeVendida.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel label_7 = new JLabel("PESO DO PRODUTO:");
		label_7.setBounds(305, 289, 137, 14);
		label_7.setToolTipText("");
		label_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		txtPesoProd = new JTextField();
		txtPesoProd.setBounds(304, 314, 92, 26);
		txtPesoProd.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(287, 418, 646, 257);
		panel_1.setBorder(new TitledBorder(null, "Vendas Cadastradas", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 66, 613, 174);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome Do Cliente", "Data da Venda", "Valor", "Quantidade", "Peso ", "Nome Prod."
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(103);
		table.getColumnModel().getColumn(3).setPreferredWidth(59);
		table.getColumnModel().getColumn(4).setPreferredWidth(74);
		table.getColumnModel().getColumn(5).setPreferredWidth(54);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		
		JLabel lblPesquisarPorVenda = new JLabel("Pesquisar por Venda C\u00F3digo:");
		lblPesquisarPorVenda.setBounds(24, 23, 171, 16);
		lblPesquisarPorVenda.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		textField_6 = new JTextField();
		textField_6.setBounds(192, 21, 63, 20);
		textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_6.setColumns(10);
		
		JButton button_8 = new JButton("Pesquisar");
		button_8.setBounds(277, 21, 90, 20);
		button_8.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton button_5 = new JButton("Alterar");
		button_5.setBounds(577, 715, 83, 26);
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton button_6 = new JButton("Salvar");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigoVendas = codigoVen.getText().trim();
				String nomeClin =txtNomeCli.getText().trim();
				String data = txtData.getText().trim();
				String valor = txtValorProd.getText().trim();
				String peso = txtPesoProd.getText().trim();
				String quan = txtQuanProd.getText().trim();
				String nomeProd = txtNomeProd.getText().trim();
				
				codigoVen.setText("");
				txtNomeCli.setText("");
				txtData.setText("");
				txtValorProd.setText("");
				txtQuanProd.setText("");
				txtPesoProd.setText("");
				txtNomeProd.setText("");
				
				
				DefaultTableModel val = (DefaultTableModel) table.getModel();
				val.addRow(new String[] {codigoVendas, nomeClin, data, valor, quan, peso, nomeProd});
				
				codigoVen.requestFocus();
				
			}
		});
		button_6.setBounds(304, 715, 89, 26);
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(810, 715, 89, 26);
		btnExcluir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setBounds(577, 31, 92, 26);
		lblVendas.setFont(new Font("Segoe UI", Font.BOLD, 22));
		
		txtCodProd = new JTextField();
		txtCodProd.setBounds(309, 228, 70, 26);
		txtCodProd.setColumns(10);
		
		txtNomeProd = new JTextField();
		txtNomeProd.setBounds(449, 228, 152, 26);
		txtNomeProd.setColumns(10);
		
		JLabel lblNomeDoProduto = new JLabel("NOME DO PRODUTO:");
		lblNomeDoProduto.setBounds(449, 203, 152, 14);
		lblNomeDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00D3DIGO DO PRODUTO:");
		lblCdigoDoProduto.setBounds(304, 203, 133, 14);
		lblCdigoDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(580, 55, 80, 2);
		contentPane.setLayout(null);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(label);
		panel.add(separator_2);
		panel.add(separator_1);
		panel.add(separator_4);
		panel.add(button);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_1);
		panel.add(separator_3);
		panel.add(separator);
		panel.add(label_1);
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
				
				frameVendas.dispose();
				
			}
		});
		btnRelatorios.setIcon(new ImageIcon(VendasView.class.getResource("/imagens/icons8-pdf-25.png")));
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		btnRelatorios.setBounds(0, 431, 268, 48);
		panel.add(btnRelatorios);
		contentPane.add(separator_5);
		contentPane.add(lblVendas);
		contentPane.add(lblCdigoDaVenda);
		contentPane.add(lblNomeDoCliente);
		contentPane.add(label_7);
		contentPane.add(lblQuantidadeVendida);
		contentPane.add(txtPesoProd);
		contentPane.add(txtQuanProd);
		contentPane.add(button_6);
		contentPane.add(button_5);
		contentPane.add(btnExcluir);
		contentPane.add(codigoVen);
		contentPane.add(txtNomeCli);
		contentPane.add(txtCodProd);
		contentPane.add(txtNomeProd);
		contentPane.add(txtData);
		contentPane.add(lblCdigoDoProduto);
		contentPane.add(lblNomeDoProduto);
		contentPane.add(lblDataDaVenda);
		contentPane.add(label_5);
		contentPane.add(txtValorProd);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(textField_6);
		panel_1.add(lblPesquisarPorVenda);
		panel_1.add(button_8);
		panel_1.add(scrollPane);
	}
}
