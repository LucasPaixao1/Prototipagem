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

public class CadastroClienteView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 927, 794);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 265, 129);
		panel.setBackground(new Color(72, 61, 139));
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblVarejoSantos = new JLabel("Varej\u00E3o Santos");
		lblVarejoSantos.setForeground(new Color(240, 248, 255));
		lblVarejoSantos.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblVarejoSantos);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 98, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField, -28, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblVarejoSantos, 0, SpringLayout.WEST, textField);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblVarejoSantos, -18, SpringLayout.NORTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 23, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField, 228, SpringLayout.WEST, panel);
		panel.add(textField);
		textField.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setBounds(0, 128, 265, 401);
		frame.getContentPane().add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(72, 61, 139));
		panel_2.setBounds(0, 520, 265, 235);
		frame.getContentPane().add(panel_2);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(302, 28, 46, 14);
		frame.getContentPane().add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(298, 53, 63, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(401, 28, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setBounds(401, 53, 480, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelResidencial = new JLabel("TEL. RESIDENCIAL(opcional):");
		lblTelResidencial.setFont(new Font("Arial", Font.BOLD, 11));
		lblTelResidencial.setBounds(302, 128, 163, 14);
		frame.getContentPane().add(lblTelResidencial);
		
		JFormattedTextField frmtdtxtfldxxXxxxxxxx = new JFormattedTextField();
		frmtdtxtfldxxXxxxxxxx.setText("(XX) XXXX-XXXX");
		frmtdtxtfldxxXxxxxxxx.setBounds(302, 153, 104, 20);
		frame.getContentPane().add(frmtdtxtfldxxXxxxxxxx);
		
		JLabel lblTelComercial = new JLabel("TEL. COMERCIAL");
		lblTelComercial.setFont(new Font("Arial", Font.BOLD, 11));
		lblTelComercial.setBounds(548, 128, 95, 14);
		frame.getContentPane().add(lblTelComercial);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("(XX) XXXX-XXXX");
		formattedTextField.setBounds(548, 153, 104, 20);
		frame.getContentPane().add(formattedTextField);
		
		JLabel lblTelCelular = new JLabel("TEL. CELULAR (opcional):");
		lblTelCelular.setFont(new Font("Arial", Font.BOLD, 11));
		lblTelCelular.setBounds(754, 128, 137, 14);
		frame.getContentPane().add(lblTelCelular);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Clientes Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
		panel_3.setBounds(302, 422, 589, 241);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Código", "Nome", "Tel. Residencial", "Tel. Comercial", "Tel. Celular", "CNPJ", "CPF", "Forma De Pagamento"
			}
		));
		table.setFont(new Font("Arial", Font.BOLD, 11));
		table.setBounds(10, 63, 569, 160);
		panel_3.add(table);
		
		JLabel lblCdigo = new JLabel("ID");
		lblCdigo.setFont(new Font("Arial", Font.BOLD, 12));
		lblCdigo.setBounds(35, 38, 22, 14);
		panel_3.add(lblCdigo);
		
		JLabel lblNome_1 = new JLabel("NOME");
		lblNome_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNome_1.setBounds(95, 38, 43, 14);
		panel_3.add(lblNome_1);
		
		JLabel lblTelRes = new JLabel("TEL. RES.");
		lblTelRes.setFont(new Font("Arial", Font.BOLD, 12));
		lblTelRes.setBounds(160, 38, 57, 14);
		panel_3.add(lblTelRes);
		
		JLabel lblTelCom = new JLabel("TEL. COM.");
		lblTelCom.setFont(new Font("Arial", Font.BOLD, 12));
		lblTelCom.setBounds(227, 38, 57, 14);
		panel_3.add(lblTelCom);
		
		JLabel lblTelCel = new JLabel("TEL. CEL.");
		lblTelCel.setFont(new Font("Arial", Font.BOLD, 12));
		lblTelCel.setBounds(301, 38, 57, 14);
		panel_3.add(lblTelCel);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Arial", Font.BOLD, 12));
		lblCnpj.setBounds(379, 38, 31, 14);
		panel_3.add(lblCnpj);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 12));
		lblCpf.setBounds(453, 38, 22, 14);
		panel_3.add(lblCpf);
		
		JLabel lblFormaPag = new JLabel("FORMA PAG.");
		lblFormaPag.setFont(new Font("Arial", Font.BOLD, 12));
		lblFormaPag.setBounds(505, 38, 84, 14);
		panel_3.add(lblFormaPag);
		
		JFormattedTextField frmtdtxtfldxxXxxxxxxxx = new JFormattedTextField();
		frmtdtxtfldxxXxxxxxxxx.setText("(XX) XXXXX-XXXX");
		frmtdtxtfldxxXxxxxxxxx.setBounds(754, 153, 104, 20);
		frame.getContentPane().add(frmtdtxtfldxxXxxxxxxxx);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(302, 237, 104, 20);
		frame.getContentPane().add(formattedTextField_1);
		
		JLabel lblCnpjopcional = new JLabel("CNPJ(opcional):");
		lblCnpjopcional.setFont(new Font("Arial", Font.BOLD, 11));
		lblCnpjopcional.setBounds(302, 212, 163, 14);
		frame.getContentPane().add(lblCnpjopcional);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(550, 237, 104, 20);
		frame.getContentPane().add(formattedTextField_2);
		
		JLabel lblCpfopcional = new JLabel("CPF(opcional:)");
		lblCpfopcional.setFont(new Font("Arial", Font.BOLD, 11));
		lblCpfopcional.setBounds(550, 212, 163, 14);
		frame.getContentPane().add(lblCpfopcional);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BOLETO", "DINHEIRO"}));
		comboBox.setBounds(754, 237, 127, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblFormaDePagamento = new JLabel("FORMA DE PAGAMENTO:");
		lblFormaDePagamento.setFont(new Font("Arial", Font.BOLD, 11));
		lblFormaDePagamento.setBounds(754, 212, 137, 14);
		frame.getContentPane().add(lblFormaDePagamento);
	}
	public JTable getTable() {

		return table;
	}
}
