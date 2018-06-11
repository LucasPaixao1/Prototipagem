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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;

public class ViewMenuDesign extends JFrame {
	static ViewMenuDesign frameMenu = new ViewMenuDesign();

	private JPanel contentPane;
	private JTable table;

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
					frameMenu.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMenuDesign() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(270, 28, 678, 97);
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setLayout(null);
		
		JLabel lblBomDiaJose = new JLabel("Bom dia Usu\u00E1rio");
		lblBomDiaJose.setForeground(Color.WHITE);
		lblBomDiaJose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBomDiaJose.setBounds(22, 6, 221, 30);
		panel_1.add(lblBomDiaJose);
		
		JLabel lblSejaBemVindo = new JLabel("Seja bem Vindo!");
		lblSejaBemVindo.setForeground(Color.WHITE);
		lblSejaBemVindo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSejaBemVindo.setBounds(21, 52, 163, 39);
		panel_1.add(lblSejaBemVindo);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 270, 765);
		panel.setBackground(new Color(17,144,147));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 490, 0, 2);
		
		JButton button = new JButton("Cadastro de Clientes");
		button.setBounds(0, 131, 270, 48);
		button.setIcon(new ImageIcon(ViewMenuDesign.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroClienteView clientes = new CadastroClienteView();
				clientes.frmCadastroDeCliente.setVisible(true);
				
				frameMenu.dispose();
				
			}
		});
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17,144,147));
		
		JButton button_1 = new JButton("Estoque");
		button_1.setBounds(0, 371, 270, 48);
		button_1.setIcon(new ImageIcon(ViewMenuDesign.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				
				frameMenu.dispose();
			}
		});
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(17,144,147));
		
		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setBounds(0, 191, 270, 48);
		button_2.setIcon(new ImageIcon(ViewMenuDesign.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);
				
				frameMenu.dispose();
				
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17,144,147));
		
		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setBounds(0, 251, 270, 48);
		button_3.setIcon(new ImageIcon(ViewMenuDesign.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				
				frameMenu.dispose();
			
			}
		});
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17,144,147));
		
		JButton button_4 = new JButton("Vendas");
		button_4.setBounds(0, 311, 270, 48);
		button_4.setIcon(new ImageIcon(ViewMenuDesign.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				
				frameMenu.dispose();
				
			}
		});
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17,144,147));
		
		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setBounds(10, 39, 260, 32);
		label.setIcon(new ImageIcon(ViewMenuDesign.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 97, 0, 2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 89, 0, 2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 89, 204, 18);
		
		JLabel label_1 = new JLabel("Administrador");
		label_1.setBounds(24, 523, 79, 16);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(6, 482, 270, 2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(306, 134, 623, 364);
		panel_2.setBorder(new TitledBorder(null, "Lembretes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Data", "Descri\u00E7\u00E3o", "Assunto"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setPreferredWidth(354);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(910, 256, 38, 16);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Lembrete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddLembrete addLembrete = new AddLembrete();
				addLembrete.setVisible(true);
			}
		});
		btnNewButton.setBounds(409, 628, 105, 28);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel);
		contentPane.add(panel_2);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(label);
		panel.add(separator_2);
		panel.add(separator_1);
		panel.add(separator_3);
		panel.add(button);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_1);
		panel.add(separator_4);
		panel.add(separator);
		panel.add(label_1);
		
		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Relatorios relatorio = new Relatorios();
				relatorio.setVisible(true);
				
				frameMenu.dispose();
				
			}
		});
		btnRelatorios.setOpaque(true);
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		btnRelatorios.setBounds(0, 431, 270, 48);
		panel.add(btnRelatorios);
		contentPane.add(panel_1);
		
		JButton btnDeletarLembrete = new JButton("Deletar Lembrete");
		btnDeletarLembrete.setBounds(734, 628, 124, 28);
		contentPane.add(btnDeletarLembrete);
	}
}
