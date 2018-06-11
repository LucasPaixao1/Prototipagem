package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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

public class ViewEstoqueDesign extends JFrame {

	private JPanel contentPane;
	public JTable tableEstoque;
	private JTextField textField;
	
	static ViewEstoqueDesign frameEstoque = new ViewEstoqueDesign();

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
					frameEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewEstoqueDesign() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = 
				
				
				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setBounds(573, 35, 92, 32);
		lblEstoque.setForeground(Color.BLACK);
		lblEstoque.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(285, 119, 659, 399);
		panel_1.setBorder(new TitledBorder(null, "Estoque", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 74, 622, 306);
		
		CadastroProdutosView cadastroProdutosView = new CadastroProdutosView();
		
		tableEstoque = new JTable();
		scrollPane.setViewportView(tableEstoque);
		tableEstoque.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "Quantidade", "Validade"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableEstoque.getColumnModel().getColumn(1).setPreferredWidth(134);
		tableEstoque.getColumnModel().getColumn(2).setPreferredWidth(133);
		tableEstoque.getColumnModel().getColumn(3).setPreferredWidth(170);
		
		
		
		textField = new JTextField();
		textField.setBounds(101, 34, 136, 28);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("Pesquisar:");
		lblPesquisar.setBounds(21, 40, 74, 16);
		lblPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton button_5 = new JButton("Pesquisar");
		button_5.setBounds(243, 38, 90, 20);
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 268, 775);
		panel.setBackground(new Color(17,144,147));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 492, 0, 2);
		
		JButton button = new JButton("Cadastro de Clientes");
		button.setBounds(0, 132, 270, 48);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroClienteView window = new CadastroClienteView();
				window.frmCadastroDeCliente.setVisible(true);
				
				frameEstoque.dispose();
			}
		});
		button.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17,144,147));
		
		JButton button_1 = new JButton("Estoque");
		button_1.setBounds(0, 372, 270, 48);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				
				frameEstoque.dispose();
				
			}
		});
		button_1.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(17,144,147));
		
		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setBounds(0, 192, 270, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);
				
				frameEstoque.dispose();
			}
		});
		button_2.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17,144,147));
		
		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setBounds(0, 252, 270, 48);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				
				frameEstoque.dispose();
				
			}
		});
		button_3.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17,144,147));
		
		JButton button_4 = new JButton("Vendas");
		button_4.setBounds(0, 312, 270, 48);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				
				frameEstoque.dispose();
				
			}
		});
		button_4.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17,144,147));
		
		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setBounds(6, 45, 260, 32);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				
				frameEstoque.dispose();
			}
		});
		label.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(216, 99, 0, 2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(216, 91, 0, 2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(6, 83, 204, 18);
		
		JLabel label_1 = new JLabel("Administrador");
		label_1.setBounds(24, 525, 79, 16);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
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
		panel.add(label_1);
		panel.add(button);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_1);
		panel.add(label);
		
		JButton btnNewButton_1 = new JButton("Relatorios");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
				
				frameEstoque.dispose();
			}
		});
		btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnNewButton_1.setIcon(new ImageIcon(ViewEstoqueDesign.class.getResource("/imagens/icons8-pdf-25.png")));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(17,144,147));
		btnNewButton_1.setBounds(0, 432, 268, 48);
		panel.add(btnNewButton_1);
		contentPane.add(lblNewLabel);
		contentPane.add(label_3);
		contentPane.add(lblEstoque);
		contentPane.add(separator_2);
		contentPane.add(label_4);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(lblPesquisar);
		panel_1.add(textField);
		panel_1.add(button_5);
		panel_1.add(scrollPane);
		
		JButton btnNewButton = new JButton("Registrar Entrada De Produtos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistrarEntrada registrarEntrada = new RegistrarEntrada();
				registrarEntrada.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(285, 593, 206, 28);
		contentPane.add(btnNewButton);
	}
}
