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

public class VendasView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendasView frame = new VendasView();
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
	public VendasView() {
		setFont(new Font("Segoe UI", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(54, 33, 89));
		panel.setBounds(0, 0, 272, 765);
		contentPane.add(panel);
		
		JSeparator separator = new JSeparator();
		
		JButton button = new JButton("Cadastro de Clientes");
		button.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-gest\u00E3o-de-cliente-25.png"));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(54, 33, 89));
		
		JButton button_1 = new JButton("Estoque");
		button_1.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-procurar-estoque-25.png"));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(54, 33, 89));
		
		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-caminh\u00E3o-25.png"));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(54, 33, 89));
		
		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-produto-25.png"));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(54, 33, 89));
		
		JButton button_4 = new JButton("Vendas");
		button_4.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-performance-de-vendas-25.png"));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(54, 33, 89));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-p\u00E1gina-inicial-25.png"));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel label_1 = new JLabel("Administrador");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JSeparator separator_3 = new JSeparator();
		
		JSeparator separator_4 = new JSeparator();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(10)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(2)
										.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
										.addGap(54)))
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addComponent(label_1)))
					.addContainerGap(2, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(label)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(32))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(24)))
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(label_1)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(299, 131, 56, 26);
		contentPane.add(textField);
		
		JLabel lblCdigoDaVenda = new JLabel("C\u00D3DIGO DA VENDA:");
		lblCdigoDaVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCdigoDaVenda.setBounds(299, 106, 122, 14);
		contentPane.add(lblCdigoDaVenda);
		
		JLabel label_3 = new JLabel("NOME:");
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_3.setBounds(439, 106, 43, 14);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(439, 131, 494, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("DD/MM/AA");
		textField_2.setColumns(10);
		textField_2.setBounds(628, 223, 122, 26);
		contentPane.add(textField_2);
		
		JLabel lblDataDaVenda = new JLabel("DATA DA VENDA");
		lblDataDaVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDataDaVenda.setBounds(628, 198, 117, 14);
		contentPane.add(lblDataDaVenda);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(782, 223, 92, 26);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("VALOR DO PRODUTO:");
		label_5.setToolTipText("");
		label_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_5.setBounds(782, 198, 137, 14);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(439, 309, 92, 26);
		contentPane.add(textField_4);
		
		JLabel lblQuantidadeVendida = new JLabel("QUANTIDADE VENDIDA:");
		lblQuantidadeVendida.setToolTipText("");
		lblQuantidadeVendida.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblQuantidadeVendida.setBounds(439, 284, 167, 14);
		contentPane.add(lblQuantidadeVendida);
		
		JLabel label_7 = new JLabel("PESO DO PRODUTO:");
		label_7.setToolTipText("");
		label_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_7.setBounds(300, 284, 137, 14);
		contentPane.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(299, 309, 92, 26);
		contentPane.add(textField_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Vendas Cadastradas", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(299, 412, 634, 257);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 66, 618, 174);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Nome", "Data da Venda", "Valor", "Quantidade", "Peso ", "Cod. Prod.", "Nome Prod."
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(103);
		table.getColumnModel().getColumn(3).setPreferredWidth(59);
		table.getColumnModel().getColumn(4).setPreferredWidth(74);
		table.getColumnModel().getColumn(5).setPreferredWidth(54);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(7).setPreferredWidth(80);
		
		JLabel lblPesquisarPorVenda = new JLabel("Pesquisar por Venda C\u00F3digo:");
		lblPesquisarPorVenda.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblPesquisarPorVenda.setBounds(16, 23, 171, 16);
		panel_1.add(lblPesquisarPorVenda);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(184, 21, 63, 20);
		panel_1.add(textField_6);
		
		JButton button_8 = new JButton("Pesquisar");
		button_8.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_8.setBounds(269, 21, 90, 20);
		panel_1.add(button_8);
		
		JButton button_5 = new JButton("Alterar");
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_5.setBounds(572, 710, 83, 26);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Salvar");
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_6.setBounds(299, 710, 89, 26);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Sair");
		button_7.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_7.setBounds(805, 710, 89, 26);
		contentPane.add(button_7);
		
		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblVendas.setBounds(572, 26, 92, 26);
		contentPane.add(lblVendas);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(304, 223, 92, 26);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(444, 223, 152, 26);
		contentPane.add(textField_8);
		
		JLabel label_2 = new JLabel("NOME:");
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_2.setBounds(444, 198, 152, 14);
		contentPane.add(label_2);
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00D3DIGO DO PRODUTO:");
		lblCdigoDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCdigoDoProduto.setBounds(299, 198, 133, 14);
		contentPane.add(lblCdigoDoProduto);
	}

}
