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

public class CadastroProdutosView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtDdmmaa;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProdutosView frame = new CadastroProdutosView();
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
	public CadastroProdutosView() {
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
		
		JLabel label_1 = new JLabel("Administrador");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JSeparator separator_2 = new JSeparator();
		
		JSeparator separator_3 = new JSeparator();
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
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(separator_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(separator_3, Alignment.LEADING))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addComponent(label_1)))
					.addContainerGap(2, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(45)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
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
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(label_1)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblCadastroDeProdutos = new JLabel("CADASTRO DE PRODUTOS");
		lblCadastroDeProdutos.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblCadastroDeProdutos.setBounds(494, 19, 298, 26);
		contentPane.add(lblCadastroDeProdutos);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(309, 130, 56, 26);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("C\u00D3DIGO:");
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_2.setBounds(309, 105, 56, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("NOME:");
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_3.setBounds(410, 105, 43, 14);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(410, 130, 494, 26);
		contentPane.add(textField_1);
		
		JLabel lblDataDeValidade = new JLabel("DATA DE VALIDADE:");
		lblDataDeValidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDataDeValidade.setBounds(309, 197, 117, 14);
		contentPane.add(lblDataDeValidade);
		
		txtDdmmaa = new JTextField();
		txtDdmmaa.setText("DD/MM/AA");
		txtDdmmaa.setColumns(10);
		txtDdmmaa.setBounds(309, 222, 122, 26);
		contentPane.add(txtDdmmaa);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(458, 222, 92, 26);
		contentPane.add(textField_2);
		
		JLabel lblValorDoProduto = new JLabel("VALOR DO PRODUTO:");
		lblValorDoProduto.setToolTipText("");
		lblValorDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblValorDoProduto.setBounds(458, 197, 137, 14);
		contentPane.add(lblValorDoProduto);
		
		JLabel lblQuantidadeVendida = new JLabel("QUANTIDADE DE PRODUTOS:");
		lblQuantidadeVendida.setToolTipText("");
		lblQuantidadeVendida.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblQuantidadeVendida.setBounds(607, 197, 167, 14);
		contentPane.add(lblQuantidadeVendida);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(607, 222, 92, 26);
		contentPane.add(textField_3);
		
		JLabel lblPesoDoProduto = new JLabel("PESO DO PRODUTO:");
		lblPesoDoProduto.setToolTipText("");
		lblPesoDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblPesoDoProduto.setBounds(790, 197, 137, 14);
		contentPane.add(lblPesoDoProduto);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(785, 222, 92, 26);
		contentPane.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Produtos Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(309, 411, 595, 237);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 29, 562, 188);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Nome", "Validade", "Valor", "Quantidade", "Peso"
			}
		));
		
		JButton button_5 = new JButton("Salvar");
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_5.setBounds(309, 709, 89, 26);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Alterar");
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_6.setBounds(582, 709, 83, 26);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Sair");
		button_7.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_7.setBounds(815, 709, 89, 26);
		contentPane.add(button_7);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(94);
		table.getColumnModel().getColumn(3).setPreferredWidth(95);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		table.getColumnModel().getColumn(5).setPreferredWidth(97);
	}
}
