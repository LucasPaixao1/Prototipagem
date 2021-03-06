package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class CadastroClienteView {

	private JFrame frmCadastroDeCliente;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
					CadastroClienteView window = new CadastroClienteView();
					window.frmCadastroDeCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroClienteView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeCliente = new JFrame();
		frmCadastroDeCliente.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 12));
		frmCadastroDeCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		frmCadastroDeCliente.setTitle("Cadastro de Cliente");
		frmCadastroDeCliente.setBounds(100, 100, 956, 804);
		frmCadastroDeCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel Painel = new Panel();
		Painel.setBounds(0, 0, 272, 765);
		Painel.setBackground(new Color(54, 33, 89));
		
		JLabel lblVarejoSantos = new JLabel("Varej\u00E3o Santos");
		lblVarejoSantos.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-p\u00E1gina-inicial-25.png"));
		lblVarejoSantos.setForeground(new Color(240, 248, 255));
		lblVarejoSantos.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JSeparator separator = new JSeparator();
		
		JButton btnNewButton_3 = new JButton("Cadastro de Clientes");
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-gest\u00E3o-de-cliente-25.png"));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(54, 33, 89));
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnCadastroDeFornecedores = new JButton("Cadastro de Fornecedores");
		btnCadastroDeFornecedores.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-caminh\u00E3o-25.png"));
		btnCadastroDeFornecedores.setOpaque(true);
		btnCadastroDeFornecedores.setForeground(Color.WHITE);
		btnCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeFornecedores.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeFornecedores.setBackground(new Color(54, 33, 89));
		
		JButton btnCadastroDeProdutos = new JButton("Cadastro de Produtos");
		btnCadastroDeProdutos.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-produto-25.png"));
		btnCadastroDeProdutos.setOpaque(true);
		btnCadastroDeProdutos.setForeground(Color.WHITE);
		btnCadastroDeProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeProdutos.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeProdutos.setBackground(new Color(54, 33, 89));
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-performance-de-vendas-25.png"));
		btnVendas.setOpaque(true);
		btnVendas.setForeground(Color.WHITE);
		btnVendas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnVendas.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnVendas.setBackground(new Color(54, 33, 89));
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setIcon(new ImageIcon("D:\\Lucas\\Xiss Ressurge\\TCC\\src\\imagens\\icons8-procurar-estoque-25.png"));
		btnEstoque.setOpaque(true);
		btnEstoque.setForeground(Color.WHITE);
		btnEstoque.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnEstoque.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnEstoque.setBackground(new Color(54, 33, 89));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setForeground(new Color(255, 255, 255));
		lblAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 12));
		GroupLayout gl_Painel = new GroupLayout(Painel);
		gl_Painel.setHorizontalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel.createSequentialGroup()
					.addGroup(gl_Painel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Painel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(separator_1, Alignment.LEADING)
							.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(btnEstoque, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(btnCadastroDeFornecedores, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(btnCadastroDeProdutos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addComponent(btnVendas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_Painel.createSequentialGroup()
								.addGap(10)
								.addGroup(gl_Painel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(separator, Alignment.LEADING)
									.addComponent(lblVarejoSantos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_Painel.createSequentialGroup()
							.addGap(24)
							.addComponent(lblAdministrador)))
					.addContainerGap(2, Short.MAX_VALUE))
		);
		gl_Painel.setVerticalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel.createSequentialGroup()
					.addGap(45)
					.addComponent(lblVarejoSantos)
					.addGap(20)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCadastroDeFornecedores, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCadastroDeProdutos, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnVendas, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEstoque, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(lblAdministrador)
					.addContainerGap(233, Short.MAX_VALUE))
		);
		Painel.setLayout(gl_Painel);
		
		JLabel lblId = new JLabel("C\u00D3DIGO:");
		lblId.setBounds(314, 74, 56, 14);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 99, 89, 20);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(415, 74, 43, 14);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		textField_2 = new JTextField();
		textField_2.setBounds(415, 99, 494, 20);
		textField_2.setColumns(10);
		
		JLabel lblTelResidencial = new JLabel("TEL. FIXO(opcional):");
		lblTelResidencial.setBounds(314, 165, 161, 14);
		lblTelResidencial.setFont(new Font("Arial", Font.BOLD, 11));
		
		JFormattedTextField frmtdtxtfldxxXxxxxxxx = new JFormattedTextField();
		frmtdtxtfldxxXxxxxxxx.setBounds(314, 190, 97, 26);
		frmtdtxtfldxxXxxxxxxx.setText("(XX) XXXX-XXXX");
		
		JLabel lblTelComercial = new JLabel("TEL. NEXTEL");
		lblTelComercial.setBounds(519, 164, 83, 14);
		lblTelComercial.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(519, 190, 97, 26);
		formattedTextField.setText("(XX) XXXX-XXXX");
		
		JLabel lblTelCelular = new JLabel("TEL. CELULAR (opcional):");
		lblTelCelular.setBounds(670, 165, 136, 14);
		lblTelCelular.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(314, 455, 595, 241);
		panel_3.setBorder(new TitledBorder(null, "Clientes Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 57, 578, 166);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("");
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
			},
			new String[] {
				"Codigo", "Nome", "Tel. Residencial", "Tel. Comercial", "Tel. Celular", "CNPJ", "CPF", "Forma De Pagamento"
			}
		));
		table.getColumnModel().getColumn(7).setPreferredWidth(133);
		table.getColumnModel().getColumn(7).setMinWidth(19);
		table.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField frmtdtxtfldxxXxxxxxxxx = new JFormattedTextField();
		frmtdtxtfldxxXxxxxxxxx.setBounds(670, 190, 104, 26);
		frmtdtxtfldxxXxxxxxxxx.setText("(XX) XXXXX-XXXX");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(314, 269, 161, 20);
		
		JLabel lblCnpjopcional = new JLabel("CNPJ(opcional):");
		lblCnpjopcional.setBounds(314, 244, 161, 14);
		lblCnpjopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(487, 269, 161, 20);
		
		JLabel lblCpfopcional = new JLabel("CPF(opcional:)");
		lblCpfopcional.setBounds(487, 244, 183, 14);
		lblCpfopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(670, 269, 104, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BOLETO", "DINHEIRO"}));
		
		JLabel lblFormaDePagamento = new JLabel("FORMA DE PAGAMENTO:");
		lblFormaDePagamento.setBounds(670, 244, 130, 14);
		lblFormaDePagamento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(314, 707, 89, 26);
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setBounds(587, 707, 83, 26);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.setBounds(820, 707, 89, 26);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		
		JLabel lblRua = new JLabel("RUA:");
		lblRua.setBounds(314, 319, 161, 14);
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setBounds(314, 344, 161, 20);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(487, 319, 56, 14);
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setBounds(487, 344, 161, 20);
		
		JLabel lblNmero = new JLabel("N\u00DAMERO:");
		lblNmero.setBounds(660, 319, 56, 14);
		lblNmero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		formattedTextField_5.setBounds(660, 344, 114, 20);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(314, 386, 161, 14);
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField_6 = new JFormattedTextField();
		formattedTextField_6.setBounds(314, 411, 161, 20);
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setBounds(487, 386, 161, 14);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JFormattedTextField formattedTextField_7 = new JFormattedTextField();
		formattedTextField_7.setBounds(487, 411, 161, 20);
		
		JLabel lblCadastroCliente = new JLabel("CADASTRO CLIENTE");
		lblCadastroCliente.setBounds(501, 26, 226, 26);
		lblCadastroCliente.setFont(new Font("Segoe UI", Font.BOLD, 22));
		
		JLabel lblPesquisarPorCdigo = new JLabel("Pesquisar por C\u00F3digo:");
		lblPesquisarPorCdigo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblPesquisarPorCdigo.setBounds(16, 30, 128, 16);
		panel_3.add(lblPesquisarPorCdigo);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(156, 26, 63, 20);
		panel_3.add(textField);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnPesquisar.setBounds(246, 26, 90, 20);
		panel_3.add(btnPesquisar);
		frmCadastroDeCliente.getContentPane().setLayout(null);
		frmCadastroDeCliente.getContentPane().add(Painel);
		frmCadastroDeCliente.getContentPane().add(lblCadastroCliente);
		frmCadastroDeCliente.getContentPane().add(lblId);
		frmCadastroDeCliente.getContentPane().add(lblNome);
		frmCadastroDeCliente.getContentPane().add(textField_1);
		frmCadastroDeCliente.getContentPane().add(textField_2);
		frmCadastroDeCliente.getContentPane().add(lblTelResidencial);
		frmCadastroDeCliente.getContentPane().add(lblTelComercial);
		frmCadastroDeCliente.getContentPane().add(lblTelCelular);
		frmCadastroDeCliente.getContentPane().add(frmtdtxtfldxxXxxxxxxx);
		frmCadastroDeCliente.getContentPane().add(formattedTextField);
		frmCadastroDeCliente.getContentPane().add(frmtdtxtfldxxXxxxxxxxx);
		frmCadastroDeCliente.getContentPane().add(lblCnpjopcional);
		frmCadastroDeCliente.getContentPane().add(lblCpfopcional);
		frmCadastroDeCliente.getContentPane().add(lblFormaDePagamento);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_1);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_2);
		frmCadastroDeCliente.getContentPane().add(comboBox);
		frmCadastroDeCliente.getContentPane().add(lblRua);
		frmCadastroDeCliente.getContentPane().add(lblBairro);
		frmCadastroDeCliente.getContentPane().add(lblNmero);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_3);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_4);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_5);
		frmCadastroDeCliente.getContentPane().add(lblCep);
		frmCadastroDeCliente.getContentPane().add(lblCidade);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_6);
		frmCadastroDeCliente.getContentPane().add(formattedTextField_7);
		frmCadastroDeCliente.getContentPane().add(btnNewButton);
		frmCadastroDeCliente.getContentPane().add(btnNewButton_1);
		frmCadastroDeCliente.getContentPane().add(btnNewButton_2);
		frmCadastroDeCliente.getContentPane().add(panel_3);
	}
	public JTable getTable() {

		return table;
	}
}
