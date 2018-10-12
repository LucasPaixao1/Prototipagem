package ViewFuncionarios;

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

import Controller.LembreteController;
import DAO.LembreteDAO;
import VO.LembreteVO;
import View.ViewLoginDesign;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class  ViewMenuDesignFuncionario extends JFrame {

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
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					 ViewMenuDesignFuncionario frameMenu = new ViewMenuDesignFuncionario();
					frameMenu.setVisible(true);
					frameMenu.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMenuDesignFuncionario() {
		setTitle("Menu Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 955, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(270, 28, 678, 97);
		panel_1.setBackground(new Color(51, 0, 0));
		panel_1.setLayout(null);

		JLabel lblBomDiaJose = new JLabel("Bom dia Funcion\u00E1rio");
		lblBomDiaJose.setIcon(null);
		lblBomDiaJose.setForeground(Color.WHITE);
		lblBomDiaJose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBomDiaJose.setBounds(37, 6, 221, 30);
		panel_1.add(lblBomDiaJose);

		JLabel lblSejaBemVindo = new JLabel("Seja bem Vindo!");
		lblSejaBemVindo.setForeground(Color.WHITE);
		lblSejaBemVindo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSejaBemVindo.setBounds(37, 52, 163, 39);
		panel_1.add(lblSejaBemVindo);

		Panel panel = new Panel();
		panel.setBounds(0, 0, 270, 776);
		panel.setBackground(new Color(51, 0, 0));

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 490, 0, 2);

		JButton button = new JButton("Cadastro de Clientes");
		button .setMnemonic(KeyEvent.VK_1);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(0, 131, 270, 48);
		button.setIcon(
				new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteViewFuncionario clientes = new CadastroClienteViewFuncionario();
				clientes.frmCadastroDeCliente.setVisible(true);

				dispose();
			}
		});
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(51, 0, 0));

		JButton button_1 = new JButton("Estoque");
		button_1.setMnemonic(KeyEvent.VK_4);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBounds(0, 311, 270, 48);
		button_1.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = new ViewEstoqueDesignFuncionario();
				estoque.setVisible(true);

				dispose();
			}
		});
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(51, 0, 0));

		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setMnemonic(KeyEvent.VK_2);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBounds(0, 191, 270, 48);
		button_2.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FornecedorFuncionario fornecedor = new FornecedorFuncionario();
				fornecedor.frame.setVisible(true);

				dispose();
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(51, 0, 0));

		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setMnemonic(KeyEvent.VK_3);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setBounds(0, 251, 270, 48);
		button_3.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setVisible(true);

				dispose();
			}
		});
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(51, 0, 0));

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setBounds(10, 39, 260, 32);
		label.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 97, 0, 2);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 89, 0, 2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 89, 204, 18);

		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setBounds(24, 523, 79, 16);
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 501, 270, 2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(306, 134, 623, 364);
		panel_2.setBorder(new TitledBorder(null, "Lembretes", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(59, 59, 59)));

		JScrollPane scrollPane = new JScrollPane();

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Data", "Descri\u00E7\u00E3o", "Assunto" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setPreferredWidth(354);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(910, 256, 38, 16);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Add Lembrete");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(153, 153, 153));
		btnNewButton.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-mais-25 (1).png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddLembreteFuncionario addLembrete = new AddLembreteFuncionario();
				addLembrete.setVisible(true);
			}
		});
		btnNewButton.setBounds(306, 628, 146, 28);
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
		panel.add(button_1);
		panel.add(separator_4);
		panel.add(separator);
		panel.add(lblFuncionario);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Sair");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Atenção",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
				try {
					JOptionPane.showMessageDialog(null, "Obrigado, volte Sempre!");
					ViewLoginDesign login = new ViewLoginDesign();
					login.setVisible(true);
					dispose();
				}catch (Exception e) {

					e.printStackTrace();
				}
				}
			}
		});
		lblNewLabel_1.addKeyListener(new KeyAdapter() {
		
			
			
		});
		lblNewLabel_1.setBounds(615, 10, 57, 28);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-sair-25 (1).png")));

		JButton btnDeletarLembrete = new JButton("Deletar Lembrete");
		btnDeletarLembrete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Warning",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
				
				try {
					deletarLembrete();
					removeSelecionado();
				
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

			}
			
		

		});
		btnDeletarLembrete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletarLembrete.setBackground(new Color(153, 153, 153));
		btnDeletarLembrete.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-excluir-25.png")));
		btnDeletarLembrete.setBounds(776, 628, 153, 28);
		contentPane.add(btnDeletarLembrete);

		JButton btnatualizar = new JButton("Atualizar");
		btnatualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnatualizar.setBackground(new Color(153, 153, 153));
		btnatualizar.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
		btnatualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PesquisarLembreteTodos();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		btnatualizar.setBounds(564, 628, 136, 28);
		contentPane.add(btnatualizar);
	}
	
	private LembreteVO getLinha() throws Exception {
		int linha = table.getSelectedRow();
		DefaultTableModel dt2 = (DefaultTableModel) table.getModel();

		String data = dt2.getValueAt(linha, 0).toString();
		String desc = dt2.getValueAt(linha, 1).toString();
		String assunto = dt2.getValueAt(linha, 2).toString();

        String pattern = "yyyy-MM-dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Date date = df.parse(data);

		LembreteVO lVO = new LembreteVO();
		lVO.setData(date);
		lVO.setDescricao(desc);
		lVO.setAssunto(assunto);

		return lVO;

	}

	private void removeSelecionado() {
		int linha = table.getSelectedRow();
		removeIndice(linha);

	}

	private void removeIndice(int indice) {
		DefaultTableModel dt2 = getTableModel();
		dt2.removeRow(indice);
	}

	private DefaultTableModel getTableModel() {
		return (DefaultTableModel) table.getModel();

	}
	
	private void deletarLembrete() throws Exception {
		LembreteVO l = getLinha();
		LembreteDAO dao = new LembreteDAO();
		JOptionPane.showMessageDialog(null, dao.delete(l));
		//removeSelecionado();

	}
	
	private void PesquisarLembreteTodos() throws Exception {
		LembreteController controller = new LembreteController();
		List<LembreteVO> lista = new ArrayList<LembreteVO>();

		lista = controller.pesquisarLembreteTodos();

		cleanTable(table);

		for (LembreteVO lembreteVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();
			SimpleDateFormat out = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");

			String result = out.format(in.parse(lembreteVO.getData().toString()));
			

			dados.addRow(new String[] { result,lembreteVO.getDescricao(),lembreteVO.getAssunto()});

		}

	}

	private void cleanTable(JTable tabela) {

		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}
}
