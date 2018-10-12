package ViewFuncionarios;

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
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import java.awt.Toolkit;
import com.toedter.calendar.JDateChooser;

import Controller.VendasController;
import VO.VendasVO;

import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VendasViewFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField codigoVen;
	private JTextField txtValorProd;
	private JTextField txtQuanProd;
	private JTextField txtPesoProd;
	private static JTable table;
	private JTextField txtpesquisa;
	private JTextField txtCodProd;
	static VendasViewFuncionario frameVendas = new VendasViewFuncionario();
	private JTextField txtCodigoCli;
	private JDateChooser txtdata;

	/**
	 * Launch the application.
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			listarVendasTodos();
		} catch (Exception ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameVendas.setVisible(true);
					frameVendas.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public VendasViewFuncionario() {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			listarVendasTodos();
		} catch (Exception ex) {
			System.err.println(ex);
		}

		setTitle("Vendas");
		setResizable(false);
		setFont(new Font("Segoe UI", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		Panel panel = new Panel();
		panel.setBounds(0, 0, 270, 776);
		panel.setBackground(new Color(51, 0, 0));

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 478, 270, 2);

		JButton button = new JButton("Cadastro de Clientes");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(0, 131, 270, 48);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteViewFuncionario window = new CadastroClienteViewFuncionario();
				window.frmCadastroDeCliente.setVisible(true);

				dispose();
			}
		});
		button.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(51, 0, 0));

		JButton button_1 = new JButton("Estoque");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBounds(0, 371, 270, 48);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = new ViewEstoqueDesignFuncionario();
				estoque.setVisible(true);

				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(51, 0, 0));

		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBounds(0, 191, 270, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FornecedorFuncionario fornecedor = new FornecedorFuncionario();
				fornecedor.frame.setVisible(true);

				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(51, 0, 0));

		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setBounds(0, 251, 270, 48);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setVisible(true);

				dispose();
			}
		});
		button_3.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(51, 0, 0));

		JButton button_4 = new JButton("Vendas");
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.setBounds(0, 311, 270, 48);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					VendasViewFuncionario vendas = new VendasViewFuncionario();
					vendas.setVisible(true);

					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_4.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(51, 0, 0));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 97, 0, 2);

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setBounds(10, 39, 260, 32);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesignFuncionario menu = new ViewMenuDesignFuncionario();
				menu.setVisible(true);

				dispose();
			}
		});
		label.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 89, 0, 2);

		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setBounds(24, 523, 79, 16);
		lblFuncionrio.setForeground(Color.WHITE);
		lblFuncionrio.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(12, 89, 204, 18);

		codigoVen = new JTextField();
		codigoVen.setBounds(298, 136, 56, 26);
		codigoVen.setColumns(10);

		JLabel lblCdigoDaVenda = new JLabel("C\u00D3DIGO DA VENDA:");
		lblCdigoDaVenda.setBounds(298, 111, 122, 14);
		lblCdigoDaVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblDataDaVenda = new JLabel("DATA DA VENDA:");
		lblDataDaVenda.setBounds(298, 203, 117, 14);
		lblDataDaVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtValorProd = new JTextField();
		txtValorProd.setBounds(786, 136, 92, 26);
		txtValorProd.setColumns(10);

		JLabel lblValorTotal = new JLabel("VALOR TOTAL:");
		lblValorTotal.setBounds(786, 111, 124, 14);
		lblValorTotal.setToolTipText("");
		lblValorTotal.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtQuanProd = new JTextField();
		txtQuanProd.setBounds(786, 229, 92, 26);
		txtQuanProd.setColumns(10);

		JLabel lblQuantidadeVendida = new JLabel("QUANTIDADE VENDIDA:");
		lblQuantidadeVendida.setBounds(786, 203, 167, 14);
		lblQuantidadeVendida.setToolTipText("");
		lblQuantidadeVendida.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JLabel lblPesoTotal = new JLabel("PESO TOTAL:");
		lblPesoTotal.setBounds(550, 203, 137, 14);
		lblPesoTotal.setToolTipText("");
		lblPesoTotal.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtPesoProd = new JTextField();
		txtPesoProd.setBounds(550, 229, 92, 26);
		txtPesoProd.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(287, 418, 656, 257);
		panel_1.setBorder(new TitledBorder(null, "Vendas Cadastradas", TitledBorder.LEFT, TitledBorder.TOP, null,
				new Color(0, 0, 0)));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 66, 613, 174);

		table = new JTable();
		table.setDoubleBuffered(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Codigo", "Nome Do Cliente",
				"Data da Venda", "Valor", "Quantidade", "Peso ", "Nome Prod." }));
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

		txtpesquisa = new JTextField();
		txtpesquisa.addFocusListener(new FocusAdapter() {
			
			
	
		});
		txtpesquisa.setBounds(192, 21, 63, 23);
		txtpesquisa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtpesquisa.setColumns(10);

		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					addDadosTable(pesquisaPorCodigo(Integer.parseInt(txtpesquisa.getText())));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-pesquisar-filled-25.png")));
		button_8.setBounds(267, 16, 47, 28);
		button_8.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JButton button_6 = new JButton("Salvar");
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-salvar-25 (2).png")));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cadastrar();
					listarVendasTodos();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		button_6.setBounds(304, 715, 89, 37);
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-vender-estoque-filled-25.png")));
		lblVendas.setBounds(577, 31, 122, 26);
		lblVendas.setFont(new Font("Segoe UI", Font.BOLD, 22));

		txtCodProd = new JTextField();
		txtCodProd.setBounds(617, 136, 70, 26);
		txtCodProd.setColumns(10);

		JLabel lblCdigoDoProduto = new JLabel("C\u00D3DIGO DO PRODUTO:");
		lblCdigoDoProduto.setBounds(617, 111, 133, 14);
		lblCdigoDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(580, 55, 119, 2);
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
		panel.add(separator);
		panel.add(lblFuncionrio);
		contentPane.add(separator_5);
		contentPane.add(lblVendas);
		contentPane.add(lblCdigoDaVenda);
		contentPane.add(lblPesoTotal);
		contentPane.add(lblQuantidadeVendida);
		contentPane.add(txtPesoProd);
		contentPane.add(txtQuanProd);
		contentPane.add(button_6);
		contentPane.add(codigoVen);
		contentPane.add(txtCodProd);
		contentPane.add(lblCdigoDoProduto);
		contentPane.add(lblDataDaVenda);
		contentPane.add(lblValorTotal);
		contentPane.add(txtValorProd);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(txtpesquisa);
		panel_1.add(lblPesquisarPorVenda);
		panel_1.add(button_8);
		panel_1.add(scrollPane);

		txtdata = new JDateChooser();
		txtdata.setDateFormatString("yyyy/MM/dd");
		txtdata.setBounds(298, 227, 136, 28);
		contentPane.add(txtdata);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnLimpar.setBounds(667, 715, 102, 37);
		contentPane.add(btnLimpar);

		txtCodigoCli = new JTextField();
		txtCodigoCli.setBounds(448, 135, 70, 28);
		contentPane.add(txtCodigoCli);
		txtCodigoCli.setColumns(10);

		JLabel lblCdigoDoCliente = new JLabel("C\u00D3DIGO DO CLIENTE:");
		lblCdigoDoCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCdigoDoCliente.setBounds(448, 111, 122, 14);
		contentPane.add(lblCdigoDoCliente);
		
				JButton btnPreencherCampos = new JButton("Preencher Campos");
				btnPreencherCampos.setBounds(436, 715, 182, 37);
				contentPane.add(btnPreencherCampos);
				btnPreencherCampos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							preencher();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				});
				btnPreencherCampos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnPreencherCampos
						.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-cor-de-preenchimento-25.png")));
				
						JButton btnAtualizar = new JButton("Atualizar");
						btnAtualizar.setBounds(799, 715, 118, 37);
						contentPane.add(btnAtualizar);
						btnAtualizar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								try {

									listarVendasTodos();

								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						});
						btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnAtualizar.setIcon(new ImageIcon(VendasViewFuncionario.class.getResource("/imagens/icons8-actualizar-25 (1).png")));

		try {
			listarVendasTodos();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void cadastrar() throws Exception {
		VendasVO vendas = new VendasVO();
		VendasController vendascontroller = new VendasController();

		vendas.setCodigo(Integer.parseInt(codigoVen.getText().trim()));
		vendas.setPeso(Double.parseDouble(txtPesoProd.getText().trim()));
		vendas.setQuantidade(Integer.parseInt(txtQuanProd.getText().trim()));
		vendas.setValor(Double.parseDouble(txtValorProd.getText().trim()));
		vendas.setCodigoProduto(Integer.parseInt(txtCodProd.getText().trim()));
		vendas.setDataVenda(txtdata.getDate());
		vendas.setCodigocliente(Integer.parseInt(txtCodigoCli.getText().trim()));

		vendascontroller.cadastrarvendas(vendas);

	}

	private static void listarVendasTodos() throws Exception {
		VendasController controller = new VendasController();
		List<VendasVO> lista = new ArrayList<VendasVO>();

		lista = controller.pesquisaVendasTodos();

		limparTabela(table);

		for (VendasVO vendasVO : lista) {

			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String cod = Integer.toString(vendasVO.getCodigo());
			String nomeProduto = vendasVO.getNomeProduto();
			String nomeCliente = vendasVO.getNomeCliente();

			SimpleDateFormat out = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");

			String data = out.format(in.parse(vendasVO.getDataVenda().toString()));
			String valor = Double.toString(vendasVO.getValor());
			String quantidade = Integer.toString(vendasVO.getQuantidade());
			String peso = Double.toString(vendasVO.getPeso());

			dados.addRow(new String[] { cod, nomeCliente, data, valor, quantidade, peso, nomeProduto });

		}

	}

	private static void limparTabela(JTable table2) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();

		dtm.setNumRows(0);

	}

	private void alteraVenda() throws Exception {
		codigoVen.enable(true);
		VendasVO vendasVO = new VendasVO();

		vendasVO.setCodigo(Integer.parseInt(codigoVen.getText()));
		vendasVO.setCodigocliente(Integer.parseInt(txtCodigoCli.getText().trim()));
		vendasVO.setCodigoProduto(Integer.parseInt(txtCodProd.getText().trim()));
		vendasVO.setDataVenda(txtdata.getDate());
		vendasVO.setPeso(Double.parseDouble(txtPesoProd.getText().trim()));
		vendasVO.setQuantidade(Integer.parseInt(txtQuanProd.getText().trim()));
		vendasVO.setValor(Double.parseDouble(txtValorProd.getText().trim()));

		VendasController vendas = new VendasController();
		vendas.alteraVenda(vendasVO);
		limpar();

	}

	private void limpar() {
		codigoVen.setText("");
		txtCodigoCli.setText("");
		txtCodProd.setText("");
		txtdata.setDate(null);
		txtPesoProd.setText("");
		txtQuanProd.setText("");
		txtValorProd.setText("");

		codigoVen.requestFocus();
	}

	private void excluir() throws Exception {
		codigoVen.enable(true);
		VendasVO vendasVO = new VendasVO();

		int cod = Integer.parseInt(codigoVen.getText());
		vendasVO.setCodigo(cod);
		int codprod = Integer.parseInt(txtCodProd.getText());
		vendasVO.setCodigoProduto(codprod);

		VendasController controller = new VendasController();

		if (controller.excluir(vendasVO)) {
			JOptionPane.showMessageDialog(null, "Venda Excluida com sucesso");
		}
		limpar();

	}

	private void preencher() throws Exception {
		int linhaSelecionada = table.getSelectedRow();
		String codigo = table.getValueAt(linhaSelecionada, 0).toString();
		VendasVO vendasVO = pesquisaPorCodigo(Integer.parseInt(codigo));

		codigoVen.enable(false);
		codigoVen.setText(Integer.toString(vendasVO.getCodigo()));
		txtCodigoCli.setText(Integer.toString(vendasVO.getCodigocliente()));
		txtCodProd.setText(Integer.toString(vendasVO.getCodigoProduto()));
		txtdata.setDate(vendasVO.getDataVenda());
		txtPesoProd.setText(Double.toString(vendasVO.getPeso()));
		txtQuanProd.setText(Integer.toString(vendasVO.getQuantidade()));
		txtValorProd.setText(Double.toString(vendasVO.getValor()));

	}

	private VendasVO pesquisaPorCodigo(int codigo) throws Exception {
		VendasController vendasController = new VendasController();
		return vendasController.pesquisarPorCodigo(codigo);

	}

	private void addDadosTable(VendasVO vVO) throws Exception {
		cleanTable(table);

		SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat out = new SimpleDateFormat("yyyy-MM-dd");

		String result = out.format(in.parse(vVO.getDataVenda().toString()));

		DefaultTableModel dados = (DefaultTableModel) table.getModel();

		dados.addRow(new String[] { Integer.toString(vVO.getCodigo()), vVO.getNomeCliente(), result,
				Double.toString(vVO.getValor()), Double.toString(vVO.getQuantidade()), Double.toString(vVO.getPeso()),
				vVO.getNomeProduto() });

	}

	private void cleanTable(JTable table2) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();

		dtm.setNumRows(0);

	}

}
