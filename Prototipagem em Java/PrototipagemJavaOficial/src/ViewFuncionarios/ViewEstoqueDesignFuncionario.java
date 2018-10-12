package ViewFuncionarios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.EstoqueController;
import Controller.ProdutoController;
import VO.EstoqueVO;
import VO.ProdutoVO;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.awt.Cursor;
import javax.swing.JToggleButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ViewEstoqueDesignFuncionario extends JFrame {

	private JPanel contentPane;
	public static JTable tableEstoque;
	private JTextField txtPesquisa;

	static ViewEstoqueDesignFuncionario frameEstoque = new ViewEstoqueDesignFuncionario();

	/**
	 * Launch the application.
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
			
			listarTodos();
		} catch( Exception ex) {
			System.err.println(ex);
		}
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameEstoque.setVisible(true);
					frameEstoque.setLocationRelativeTo(null);					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public ViewEstoqueDesignFuncionario(){
		setTitle("Cadastro de Estoque");
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
				
			}
			
			listarTodos();
		} catch( Exception ex) {
			System.err.println(ex);
		}
		
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane =

				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setIcon(
				new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-procurar-estoque-filled-25.png")));
		lblEstoque.setBounds(573, 35, 120, 32);
		lblEstoque.setForeground(Color.BLACK);
		lblEstoque.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(285, 119, 659, 399);
		panel_1.setBorder(
				new TitledBorder(null, "Estoque", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 74, 622, 306);

		CadastroProdutosViewFuncionario cadastroProdutosView = new CadastroProdutosViewFuncionario();

		tableEstoque = new JTable();
		tableEstoque.setEnabled(false);
		scrollPane.setViewportView(tableEstoque);
		tableEstoque.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "Tipo", "Quantidade", "Peso"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableEstoque.getColumnModel().getColumn(1).setPreferredWidth(134);
		tableEstoque.getColumnModel().getColumn(3).setPreferredWidth(133);
		
		txtPesquisa = new JTextField();
		txtPesquisa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				try {
					Pattern patternString = Pattern.compile("[A-Z]");
					Pattern patternNumeros = Pattern.compile("[0-9]");

					if (patternString.matcher(txtPesquisa.getText().toUpperCase()).find()) {

						pesquisaNome(txtPesquisa.getText());

					} else if (patternNumeros.matcher(txtPesquisa.getText()).find()) {

						pesquisaId(Integer.parseInt(txtPesquisa.getText()));
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Erro: " + e1.getMessage());
				}
				
			}
		});

		txtPesquisa.setBounds(101, 34, 136, 28);
		txtPesquisa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtPesquisa.setColumns(10);

		JLabel lblPesquisar = new JLabel("Pesquisar:");
		lblPesquisar.setBounds(21, 40, 74, 16);
		lblPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JButton button_5 = new JButton("Pesquisar");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Pattern patternString = Pattern.compile("[A-Z]");
					Pattern patternNumeros = Pattern.compile("[0-9]");

					if (patternString.matcher(txtPesquisa.getText().toUpperCase()).find()) {

						pesquisaNome(txtPesquisa.getText());

					} else if (patternNumeros.matcher(txtPesquisa.getText()).find()) {

						pesquisaId(Integer.parseInt(txtPesquisa.getText()));
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Erro: " + e1.getMessage());
				}

			}

		});
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setIcon(new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-pesquisar-filled-25.png")));
		button_5.setBounds(243, 34, 124, 28);
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		Panel panel = new Panel();
		panel.setBounds(0, 0, 268, 775);
		panel.setBackground(new Color(51, 0, 0));

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 492, 0, 2);

		JButton button = new JButton("Cadastro de Clientes");
	button .setMnemonic(KeyEvent.VK_1);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(0, 132, 270, 48);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroClienteViewFuncionario window = new CadastroClienteViewFuncionario();
				window.frmCadastroDeCliente.setVisible(true);

				dispose();
			}
		});
		button.setIcon(
				new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(51, 0, 0));

		JButton button_1 = new JButton("Estoque");
		button_1.setMnemonic(KeyEvent.VK_1);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBounds(0, 312, 270, 48);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = null;
				try {
					estoque = new ViewEstoqueDesignFuncionario();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				estoque.setVisible(true);

				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(51, 0, 0));

		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setMnemonic(KeyEvent.VK_2);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBounds(0, 192, 270, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FornecedorFuncionario fornecedor = new FornecedorFuncionario();
				fornecedor.frame.setVisible(true);

				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(51, 0, 0));

		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3 .setMnemonic(KeyEvent.VK_3);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setBounds(0, 252, 270, 48);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setVisible(true);

				dispose();
			}
		});
		button_3.setIcon(new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(51, 0, 0));

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setBounds(6, 45, 260, 32);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesignFuncionario menu = new ViewMenuDesignFuncionario();
				menu.setVisible(true);

				dispose();
			}
		});
		label.setIcon(new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(216, 99, 0, 2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(216, 91, 0, 2);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(6, 83, 204, 18);

		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setBounds(24, 525, 79, 16);
		lblFuncionrio.setForeground(Color.WHITE);
		lblFuncionrio.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 492, 270, 2);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(573, 65, 92, 2);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(708, 35, 0, 0);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(305, 11, 262, 0);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(671, 11, 261, 102);
		contentPane.setLayout(null);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(separator_4);
		panel.add(separator_3);
		panel.add(separator_1);
		panel.add(separator);
		panel.add(separator_5);
		panel.add(lblFuncionrio);
		panel.add(button);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_1);
		panel.add(label);
		contentPane.add(lblNewLabel);
		contentPane.add(label_3);
		contentPane.add(lblEstoque);
		contentPane.add(separator_2);
		contentPane.add(label_4);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(lblPesquisar);
		panel_1.add(txtPesquisa);
		panel_1.add(button_5);
		panel_1.add(scrollPane);

		JButton btnNewButton_2 = new JButton("Atualizar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					listarTodos();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2
				.setIcon(new ImageIcon(ViewEstoqueDesignFuncionario.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2.setBounds(414, 34, 141, 28);
		panel_1.add(btnNewButton_2);
	}

	private static void cleanTable(JTable tabela) {

		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}

	private static void listarTodos() throws Exception {

		cleanTable(tableEstoque);

		EstoqueController controller = new EstoqueController();
		List<EstoqueVO> lista = new ArrayList<EstoqueVO>();

		lista = controller.listarProdutos();

		for (EstoqueVO estoqueVO : lista) {

			DefaultTableModel dados = (DefaultTableModel) tableEstoque.getModel();

			String txt = Integer.toString(estoqueVO.getCodigo());

			String peso = Double.toString(estoqueVO.getPeso());
			String quantidade = Integer.toString(estoqueVO.getQuantidade());

			dados.addRow(new String[] { txt, estoqueVO.getNome(), estoqueVO.getTipo(), quantidade, peso });

		}

	}

	private void pesquisaNome(String nome) throws Exception {
		
		cleanTable(tableEstoque);

		EstoqueController controller = new EstoqueController();

		List<EstoqueVO> lista = controller.pesquisarNome(nome);

		for (EstoqueVO estoqueVO : lista) {

			DefaultTableModel dados = (DefaultTableModel) tableEstoque.getModel();

			String txt = Integer.toString(estoqueVO.getCodigo());

			String peso = Double.toString(estoqueVO.getPeso());
			String quantidade = Integer.toString(estoqueVO.getQuantidade());

			dados.addRow(new String[] { txt, estoqueVO.getNome(), estoqueVO.getTipo(), quantidade,   peso });

		}

	}

	private void pesquisaId(int id) throws Exception {
		
		cleanTable(tableEstoque);
		
		
		EstoqueController controller = new EstoqueController();

		EstoqueVO estoqueVO = controller.pesquisarId(id);

		DefaultTableModel dados = (DefaultTableModel) tableEstoque.getModel();

		String txt = Integer.toString(estoqueVO.getCodigo());

		String peso = Double.toString(estoqueVO.getPeso());
		String quantidade = Integer.toString(estoqueVO.getQuantidade());

		dados.addRow(new String[] { txt, estoqueVO.getNome(), estoqueVO.getTipo(), quantidade,  peso });

	}

}
