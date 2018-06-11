package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
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
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class CadastroProdutosView extends JFrame {

	private JPanel contentPane;
	public JTextField txtCodigo;
	public JTextField txtNome;
	public JTextField txtData;
	public JTextField txtValor;
	public JTextField txtQuantidade;
	public JTextField txtPeso;
	public JTable table;
	
	public String codigo;
	public String nome;
	public String data;
	public String valor;
	public String quan;
	public String peso;
	
	static CadastroProdutosView frameProdutos = new CadastroProdutosView();
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
					
					frameProdutos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroProdutosView() {
		setResizable(false);
		setFont(new Font("Segoe UI", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 272, 775);
		panel.setBackground(new Color(17,144,147));
		contentPane.add(panel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 490, 0, 2);
		
		JButton button = new JButton("Cadastro de Clientes");
		button.setBounds(0, 131, 270, 48);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroClienteView window = new CadastroClienteView();
				window.frmCadastroDeCliente.setVisible(true);
				
				
			}
		});
		button.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
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
				
				
			}
		});
		button_1.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
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
				
				
			}
		});
		button_2.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
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
				
				
			}
		});
		button_3.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-produto-25.png")));
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
				
				
			}
		});
		button_4.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17,144,147));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 97, 0, 2);
		
		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setBounds(10, 45, 199, 32);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				
			}
		});
		label.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JLabel label_1 = new JLabel("Administrador");
		label_1.setBounds(24, 523, 79, 16);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 482, 270, 2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 89, 0, 2);
		panel.setLayout(null);
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
				
				
			}
		});
		btnRelatorios.setIcon(new ImageIcon(CadastroProdutosView.class.getResource("/imagens/icons8-pdf-25.png")));
		btnRelatorios.setBounds(0, 431, 268, 48);
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		panel.add(btnRelatorios);
		panel.add(separator);
		panel.add(button);
		panel.add(button_1);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(separator_1);
		panel.add(label);
		panel.add(separator_3);
		panel.add(label_1);
		panel.add(separator_2);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{button, button_1, button_2, button_3, separator, button_4, separator_1, label, separator_3, label_1, separator_2}));
		
		JLabel lblCadastroDeProdutos = new JLabel("CADASTRO DE PRODUTOS");
		lblCadastroDeProdutos.setBounds(494, 19, 298, 26);
		lblCadastroDeProdutos.setFont(new Font("Segoe UI", Font.BOLD, 22));
		contentPane.add(lblCadastroDeProdutos);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(309, 130, 56, 26);
		txtCodigo.setColumns(10);
		contentPane.add(txtCodigo);
		
		JLabel label_2 = new JLabel("C\u00D3DIGO:");
		label_2.setBounds(309, 105, 56, 14);
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("NOME:");
		label_3.setBounds(410, 105, 43, 14);
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contentPane.add(label_3);
		
		txtNome = new JTextField();
		txtNome.setBounds(410, 130, 494, 26);
		txtNome.setColumns(10);
		contentPane.add(txtNome);
		
		JLabel lblDataDeValidade = new JLabel("DATA DE VALIDADE:");
		lblDataDeValidade.setBounds(309, 197, 117, 14);
		lblDataDeValidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contentPane.add(lblDataDeValidade);
		
		txtData = new JTextField();
		txtData.setBounds(309, 222, 122, 26);
		txtData.setText("DD/MM/AA");
		txtData.setColumns(10);
		contentPane.add(txtData);
		
		txtValor = new JTextField();
		txtValor.setBounds(458, 222, 92, 26);
		txtValor.setColumns(10);
		contentPane.add(txtValor);
		
		JLabel lblValorDoProduto = new JLabel("VALOR DO PRODUTO:");
		lblValorDoProduto.setBounds(458, 197, 137, 14);
		lblValorDoProduto.setToolTipText("");
		lblValorDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contentPane.add(lblValorDoProduto);
		
		JLabel lblQuantidadeVendida = new JLabel("QUANTIDADE DE PRODUTOS:");
		lblQuantidadeVendida.setBounds(607, 197, 167, 14);
		lblQuantidadeVendida.setToolTipText("");
		lblQuantidadeVendida.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contentPane.add(lblQuantidadeVendida);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(606, 222, 92, 26);
		txtQuantidade.setColumns(10);
		contentPane.add(txtQuantidade);
		
		JLabel lblPesoDoProduto = new JLabel("PESO DO PRODUTO:");
		lblPesoDoProduto.setBounds(790, 197, 137, 14);
		lblPesoDoProduto.setToolTipText("");
		lblPesoDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contentPane.add(lblPesoDoProduto);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(785, 222, 92, 26);
		txtPeso.setColumns(10);
		contentPane.add(txtPeso);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(309, 411, 595, 237);
		panel_1.setBorder(new TitledBorder(null, "Produtos Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 29, 562, 188);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Validade", "Valor", "Quantidade", "Peso"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(94);
		table.getColumnModel().getColumn(3).setPreferredWidth(95);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		table.getColumnModel().getColumn(5).setPreferredWidth(97);
		
		JButton button_5 = new JButton("Salvar");
		button_5.setBounds(309, 709, 89, 26);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo = txtCodigo.getText().trim();
				nome = txtNome.getText().trim();
				data = txtData.getText().trim();
				valor = txtValor.getText().trim();
				quan = txtQuantidade.getText().trim();
				peso = txtPeso.getText().trim();
				
				txtCodigo.setText("");
				txtNome.setText("");
				txtData.setText("");
				txtValor.setText("");
				txtQuantidade.setText("");
				txtPeso.setText("");
				
				DefaultTableModel val = (DefaultTableModel) table.getModel();
				val.addRow(new String[] {codigo, nome, data, valor, quan, peso});
				
				txtCodigo.requestFocus();
				
			}
		});
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Alterar");
		button_6.setBounds(582, 709, 83, 26);
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.add(button_6);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(815, 709, 89, 26);
		btnExcluir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.add(btnExcluir);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(494, 41, 280, 2);
		contentPane.add(separator_4);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{separator, button, button_1, button_2, button_3, button_4, separator_1, label, separator_3, label_1, separator_2, lblCadastroDeProdutos, lblDataDeValidade, txtData, txtValor, lblValorDoProduto, lblQuantidadeVendida, txtQuantidade, lblPesoDoProduto, txtPeso, panel_1, scrollPane, table, button_5, button_6, btnExcluir, separator_4, label_3, txtNome, panel, txtCodigo, label_2}));
	}
	
	public void addDadosTable(JTable tabela) {
		
		DefaultTableModel val = (DefaultTableModel) tabela.getModel();
		val.addRow(new String[] {codigo, nome, quan, data});
		
	}
	
	
}
