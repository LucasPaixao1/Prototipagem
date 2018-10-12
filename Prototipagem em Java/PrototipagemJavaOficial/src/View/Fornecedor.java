package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.jgoodies.looks.common.ComboBoxEditorTextField;

import CEP.WebServiceCep;
import Controller.FornecedorController;
import VO.ClienteVO;
import VO.FornecedorVO;
import Validator.FornecedorValidation;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ComboBoxUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Fornecedor extends JFrame {

	public JFrame frame;
	private JTextField textEmpresa;
	private JTextField textCnpj;
	private JTextField textCnpj_1;
	private JTextField textRua;
	private JTextField textCep;
	private JTextField textNumero;
	private JTextField textBairro;
	private JTextField textTelefone;
	private JTextField textCelular;
	private JTable table;
	private JTextField textPesquisar;
	private JTextField textCidade;
	private JTextField textcodigo;
	private JComboBox comboBox;
	private MaskFormatter ftmCep;
	private MaskFormatter ftmTelefone;
	private MaskFormatter ftmCelular;
	private MaskFormatter ftmCnpj_1;
	private JTextField textEmail;
	private JTextField textNextel;
	private JTextField textComplemento;

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
					Fornecedor windowFornecedor = new Fornecedor();
					windowFornecedor.setVisible(true);
					windowFornecedor.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fornecedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 12));
		frame.setBounds(100, 100, 1000, 815);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblId = new JLabel("C\u00D3DIGO:");
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblId.setBounds(299, 55, 63, 18);
		frame.getContentPane().add(lblId);

		textEmpresa = new JTextField();
		textEmpresa.setColumns(10);
		textEmpresa.setBounds(486, 74, 310, 31);
		frame.getContentPane().add(textEmpresa);

		JLabel lblEmpresa = new JLabel("EMPRESA:");
		lblEmpresa.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmpresa.setBounds(486, 57, 85, 14);
		frame.getContentPane().add(lblEmpresa);

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCnpj.setBounds(299, 114, 85, 14);
		frame.getContentPane().add(lblCnpj);

		textCnpj_1 = new JTextField();
		textCnpj_1.addKeyListener(new KeyAdapter() {

		});
		try {
			ftmCnpj_1 = new MaskFormatter("##.###.###/####-##");
		} catch (ParseException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		textCnpj_1 = new JFormattedTextField(ftmCnpj_1);
		textCnpj_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		textCnpj_1.setColumns(10);
		textCnpj_1.setBounds(299, 140, 180, 30);
		frame.getContentPane().add(textCnpj_1);

		textRua = new JTextField();
		textRua.setColumns(10);
		textRua.setBounds(486, 217, 305, 30);
		frame.getContentPane().add(textRua);

		JLabel lblRua = new JLabel("RUA:");
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblRua.setBounds(486, 191, 46, 14);
		frame.getContentPane().add(lblRua);

		textCep = new JTextField();
		try {
			ftmCep = new MaskFormatter("#####-###");
			textCep = new JFormattedTextField(ftmCep);
			textCep.setBounds(299, 217, 180, 30);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		textCep.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String cp = textCep.getText();
				cp = cp.replaceAll("\\D*", "");
				int cont = cp.length();

				if (cont == 8) {
					try {
						correio();
					} catch (Exception e3) {
						JOptionPane.showMessageDialog(null, e3);
					}
				}

			}
		});
		textCep.setColumns(10);

		frame.getContentPane().add(textCep);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(299, 191, 46, 14);
		frame.getContentPane().add(lblCep);

		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(803, 217, 50, 30);
		frame.getContentPane().add(textNumero);

		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNumero.setBounds(803, 191, 86, 14);
		frame.getContentPane().add(lblNumero);

		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(299, 290, 180, 30);
		frame.getContentPane().add(textBairro);

		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(299, 264, 73, 14);
		frame.getContentPane().add(lblBairro);

		JLabel lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(486, 264, 85, 14);
		frame.getContentPane().add(lblCidade);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblUf.setBounds(875, 264, 46, 14);
		frame.getContentPane().add(lblUf);

		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(299, 348, 74, 14);
		frame.getContentPane().add(lblTelefone);

		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		try {
			ftmTelefone = new MaskFormatter("(###)####-####");
			textTelefone = new JFormattedTextField(ftmTelefone);

		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		textTelefone.setBounds(299, 374, 180, 30);

		frame.getContentPane().add(textTelefone);

		JLabel lblTelefone_1 = new JLabel("TELEFONE CELULAR:");
		lblTelefone_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone_1.setBounds(486, 348, 132, 14);
		frame.getContentPane().add(lblTelefone_1);

		textCelular = new JTextField();
		textCelular.addKeyListener(new KeyAdapter() {

		});
		try {
			ftmCelular = new MaskFormatter("(###)####-#####");
			textCelular = new JFormattedTextField(ftmCelular);

		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		textCelular.setColumns(10);
		textCelular.setBounds(486, 374, 180, 30);
		frame.getContentPane().add(textCelular);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"LISTA DE FORNECEDORES CADASTRADOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(299, 416, 652, 294);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 55, 621, 224);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setShowVerticalLines(true);
		table.setShowHorizontalLines(true);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		table.setBackground(new Color(255, 255, 255));
		table.setForeground(SystemColor.inactiveCaptionText);
		scrollPane.setViewportView(table);
		table.setToolTipText("LISTA DE FORNECEDORES");
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "C\u00D3DIGO", "EMPRESA", "CNPJ", "CEP", "TELEFONE", "CELULAR" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(62);

		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * try { addDadosTable(pesquisarPorCodigo(Integer.parseInt(
				 * textPesquisar.getText()))); } catch (Exception e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */

			}

		});
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-pesquisar-filled-25.png")));
		btnPesquisar.setBounds(241, 21, 46, 28);
		panel_2.add(btnPesquisar);

		textPesquisar = new JTextField();
		textPesquisar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {

				// String nome = textPesquisar.getText();
				// String cnpj = textPesquisar.getText();
				try {

					Pattern patternString = Pattern.compile("[A-Z]");
					Pattern patternNumeros = Pattern.compile("[0-9]");

					if (patternNumeros.matcher(textPesquisar.getText()).find()) {

						addDadosTable(pesquisarPorCodigo(Integer.parseInt(textPesquisar.getText())));

					} else /*
							 * if
							 * (patternString.matcher(textPesquisar.getText()).
							 * find())
							 */ {

						pesquisarPorNome(textPesquisar.getText());

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		textPesquisar.setBounds(107, 21, 122, 28);
		panel_2.add(textPesquisar);
		textPesquisar.setColumns(10);

		JLabel lblNewLabel = new JLabel("Pesquisar");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(16, 27, 55, 16);
		panel_2.add(lblNewLabel);

		JButton btnPreencherCampos = new JButton("Preencher Campos");
		btnPreencherCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					preencherCampos();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		btnPreencherCampos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPreencherCampos
				.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-cor-de-preenchimento-25.png")));
		btnPreencherCampos.setBounds(336, 21, 165, 28);
		panel_2.add(btnPreencherCampos);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					pesquisarFornecedorTodos();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro Interno" + e.getMessage(), "Atenção",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtualizar.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
		btnAtualizar.setBounds(515, 21, 122, 28);
		panel_2.add(btnAtualizar);

		JPanel panel = new JPanel();
		panel.setIgnoreRepaint(true);
		panel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.setFocusTraversalPolicyProvider(true);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(new Color(17, 144, 147));
		panel.setToolTipText("");
		panel.setForeground(new Color(72, 61, 139));
		panel.setBounds(0, -6, 272, 793);
		frame.getContentPane().add(panel);

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		label.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setBounds(17, 52, 199, 32);
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator = new JSeparator();
		separator.setBounds(17, 96, 199, 10);

		JButton button_2 = new JButton("Cadastro de Clientes");
		button_2 .setMnemonic(KeyEvent.VK_1);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button_2.setBounds(0, 136, 272, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				CadastroClienteView window = new CadastroClienteView();
				window.frmCadastroDeCliente.setVisible(true);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17, 144, 147));

		JButton button_3 = new JButton("Cadastro de Fornecedores");
		button_3 .setMnemonic(KeyEvent.VK_2);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		button_3.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_3.setBounds(2, 196, 270, 48);
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17, 144, 147));

		JButton button_4 = new JButton("Cadastro de Produtos");
		button_3 .setMnemonic(KeyEvent.VK_3);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		button_4.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-produto-25.png")));
		button_4.setBounds(0, 256, 270, 48);
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17, 144, 147));

		JButton button_5 = new JButton("Vendas");
		button_5 .setMnemonic(KeyEvent.VK_4);
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VendasView vendas = new VendasView();
				vendas.setVisible(true);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();

			}
		});
		button_5.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_5.setBounds(0, 316, 270, 48);
		button_5.setOpaque(true);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_5.setBackground(new Color(17, 144, 147));

		JButton button_6 = new JButton("Estoque");
		button_6 .setMnemonic(KeyEvent.VK_5);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();

			}
		});
		button_6.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_6.setBounds(2, 377, 270, 48);
		button_6.setOpaque(true);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_6.setBackground(new Color(17, 144, 147));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(2, 497, 270, 2);

		JLabel label_1 = new JLabel("Administrador");
		label_1.setBounds(30, 531, 79, 16);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel.setLayout(null);
		panel.add(label);
		panel.add(separator);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_5);
		panel.add(button_6);
		panel.add(separator_1);
		panel.add(label_1);

		JButton button = new JButton("Relat\u00F3rios");
		button .setMnemonic(KeyEvent.VK_6);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();

			}
		});
		button.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-pdf-25.png")));
		button.setForeground(Color.WHITE);
		button.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17, 144, 147));
		button.setBounds(0, 437, 272, 48);
		panel.add(button);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(637, 55, 154, 1);
		frame.getContentPane().add(horizontalStrut);

		comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA",
						"PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
		comboBox.setBounds(870, 290, 73, 30);
		frame.getContentPane().add(comboBox);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					alterarFornecedor();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		btnAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-alterar-25.png")));
		btnAlterar.setBounds(436, 722, 104, 37);
		frame.getContentPane().add(btnAlterar);

		JButton button_1 = new JButton("Salvar");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-salvar-25 (2).png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					cadastrarFonercecor();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		button_1.setBounds(300, 722, 105, 37);
		frame.getContentPane().add(button_1);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Warning",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {

					try {

						excluirFornecedor();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (dialogResult == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Fornecedor não excluido");

				}
			}
		});
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-excluir-25.png")));
		btnExcluir.setBounds(819, 722, 104, 37);
		frame.getContentPane().add(btnExcluir);

		JLabel lblCadastroDeFornecedores = new JLabel("CADASTRO DE FORNECEDORES");
		lblCadastroDeFornecedores.setIcon(new ImageIcon(
				Fornecedor.class.getResource("/imagens/icons8-caminh\u00E3o-interestadual-filled-25.png")));
		lblCadastroDeFornecedores.setForeground(Color.BLACK);
		lblCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblCadastroDeFornecedores.setBounds(396, 6, 393, 23);
		frame.getContentPane().add(lblCadastroDeFornecedores);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(436, 26, 299, 2);
		frame.getContentPane().add(separator_2);

		textCidade = new JTextField();
		textCidade.setBounds(486, 291, 180, 28);
		frame.getContentPane().add(textCidade);
		textCidade.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();

			}

		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(Fornecedor.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnLimpar.setBounds(686, 722, 104, 37);
		frame.getContentPane().add(btnLimpar);

		textcodigo = new JTextField();
		textcodigo.addKeyListener(new KeyAdapter() {

		});
		textcodigo.setColumns(10);
		textcodigo.setBounds(299, 74, 116, 31);
		frame.getContentPane().add(textcodigo);

		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setBounds(486, 114, 85, 14);
		frame.getContentPane().add(lblEmail);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(485, 140, 310, 31);
		frame.getContentPane().add(textEmail);

		JLabel lblNextel = new JLabel("NEXTEL");
		lblNextel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNextel.setBounds(678, 348, 74, 14);
		frame.getContentPane().add(lblNextel);

		textNextel = new JTextField();
		textNextel.setColumns(10);
		textNextel.setBounds(678, 375, 180, 30);
		frame.getContentPane().add(textNextel);

		textComplemento = new JTextField();
		textComplemento.setColumns(10);
		textComplemento.setBounds(678, 292, 180, 28);
		frame.getContentPane().add(textComplemento);

		JLabel lblComplemento = new JLabel("COMPLEMENTO");
		lblComplemento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplemento.setBounds(678, 265, 104, 14);
		frame.getContentPane().add(lblComplemento);
	}

	private void cadastrarFonercecor() throws Exception {
		/*
		 * if(textcodigo.getText().equals("lucas")){
		 * textcodigo.setBackground(Color.red);
		 * 
		 * }
		 */
		FornecedorVO fornecedorVO = new FornecedorVO();
		String uf = comboBox.getSelectedItem().toString();
		try {
			fornecedorVO.setCodigoFornecedor(Integer.parseInt(textcodigo.getText()));
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Digite apenas números no campo do Código");

		}

		fornecedorVO.setEmpresa(textEmpresa.getText());
		fornecedorVO.setCnpj(textCnpj_1.getText());
		fornecedorVO.setCep(textCep.getText());
		fornecedorVO.setRua(textRua.getText());
		fornecedorVO.setComplemento(textComplemento.getText());
		fornecedorVO.setNumero(textNumero.getText());
		fornecedorVO.setUf(uf);
		fornecedorVO.setBairro(textBairro.getText());
		fornecedorVO.setCidade(textCidade.getText());
		fornecedorVO.setEmail(textEmail.getText());
		fornecedorVO.setTelefone(textTelefone.getText());
		fornecedorVO.setTelefoneCelular(textCelular.getText());
		fornecedorVO.setNextel(textNextel.getText());

		FornecedorController controller = new FornecedorController();
		controller.cadastrarFornecedor(fornecedorVO);
		deixarEmBranco();

	}

	private void deixarEmBranco() {
		textcodigo.setBackground(Color.white);
		textEmpresa.setBackground(Color.white);
		textCnpj_1.setBackground(Color.WHITE);
		textNumero.setBackground(Color.WHITE);
		textRua.setBackground(Color.WHITE);
		textCep.setBackground(Color.WHITE);
		textBairro.setBackground(Color.WHITE);
		textCidade.setBackground(Color.WHITE);
	}

	private void excluirFornecedor() throws Exception {
		int codigo = Integer.parseInt(textcodigo.getText());
		FornecedorController fornecedorController = new FornecedorController();
		fornecedorController.excluirFornecedor(codigo);
	}

	private void limpar() {

		textcodigo.setText("");
		textBairro.setText("");
		textCelular.setText("");
		textCep.setText("");
		textCidade.setText("");
		textCnpj_1.setText("");
		textEmpresa.setText("");
		textNumero.setText("");
		textTelefone.setText("");
		textRua.setText("");
		comboBox.setSelectedItem("");
		textcodigo.requestFocus();
		textPesquisar.setText("");
		textEmail.setText("");
		textNextel.setText("");
		textComplemento.setText("");
		cleanTable(table);
		textcodigo.enable(true);

	}

	private void alterarFornecedor() throws Exception {
		FornecedorVO fornecedorVO = new FornecedorVO();
		String uf = comboBox.getSelectedItem().toString();
		fornecedorVO.setCodigoFornecedor(Integer.parseInt(textcodigo.getText()));
		fornecedorVO.setBairro(textBairro.getText());
		fornecedorVO.setCep(textCep.getText());
		fornecedorVO.setCidade(textCidade.getText());
		fornecedorVO.setCnpj(textCnpj_1.getText());
		fornecedorVO.setEmail(textEmail.getText());
		fornecedorVO.setComplemento(textComplemento.getText());
		fornecedorVO.setNextel(textNextel.getText());
		fornecedorVO.setEmpresa(textEmpresa.getText());
		fornecedorVO.setNumero(textNumero.getText());
		fornecedorVO.setRua(textRua.getText());
		fornecedorVO.setTelefone(textTelefone.getText());
		fornecedorVO.setTelefoneCelular(textCelular.getText());
		fornecedorVO.setUf(uf);

		FornecedorController controller = new FornecedorController();
		controller.alterarFornecedor(fornecedorVO);

	}

	private void preencherCampos() throws Exception {
		int linhaSelecionada = table.getSelectedRow();
		if (linhaSelecionada != -1) {

			String codigo = table.getValueAt(linhaSelecionada, 0).toString();

			FornecedorVO fornecedorVO = pesquisarPorCodigo(Integer.parseInt(codigo));

			textcodigo.enable(false);
			textcodigo.setText(Integer.toString(fornecedorVO.getCodigoFornecedor()));
			textEmpresa.setText(fornecedorVO.getEmpresa());
			textCnpj_1.setText(fornecedorVO.getCnpj());
			textEmail.setText(fornecedorVO.getEmail());
			textNumero.setText(fornecedorVO.getNumero());
			textRua.setText(fornecedorVO.getRua());
			textComplemento.setText(fornecedorVO.getComplemento());
			textCep.setText(fornecedorVO.getCep());
			comboBox.setSelectedItem(fornecedorVO.getUf());
			textBairro.setText(fornecedorVO.getBairro());
			textCidade.setText(fornecedorVO.getCidade());
			textTelefone.setText(fornecedorVO.getTelefone());
			textCelular.setText(fornecedorVO.getTelefoneCelular());
			textNextel.setText(fornecedorVO.getNextel());

		} else {
			JOptionPane.showMessageDialog(frame, "Favor selecionar uma linha", "Atenção", JOptionPane.ERROR_MESSAGE);
		}

	}

	private FornecedorVO pesquisarPorCodigo(int codigo) throws Exception {
		FornecedorController fornecedorController = new FornecedorController();
		return fornecedorController.pesquisarPorCodigo(codigo);
	}

	private void addDadosTable(FornecedorVO fornecedorVO) {
		cleanTable(table);
		DefaultTableModel dados = (DefaultTableModel) table.getModel();
		String Codigo = Integer.toString(fornecedorVO.getCodigoFornecedor());
		dados.addRow(new String[] { Codigo, fornecedorVO.getEmpresa(), fornecedorVO.getCnpj(), fornecedorVO.getCep(),
				fornecedorVO.getTelefoneCelular(), fornecedorVO.getTelefone() });
	}

	private void cleanTable(JTable tabela) {
		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}

	private void pesquisarFornecedorTodos() throws Exception {
		FornecedorController fornecedorController = new FornecedorController();
		List<FornecedorVO> lista = new ArrayList<FornecedorVO>();
		lista = fornecedorController.pesquisarFornecedorTodos();
		cleanTable(table);

		for (FornecedorVO fornecedorVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String Codigo = Integer.toString(fornecedorVO.getCodigoFornecedor());
			dados.addRow(new String[] { Codigo, fornecedorVO.getEmpresa(), fornecedorVO.getCnpj(),
					fornecedorVO.getCep(), fornecedorVO.getTelefoneCelular(), fornecedorVO.getTelefone() });

		}

	}

	private void pesquisarPorNome(String nome) throws Exception {
		cleanTable(table);
		FornecedorController controller = new FornecedorController();
		List<FornecedorVO> lista = controller.pesquisarNome(nome);
		for (FornecedorVO fornecedorVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();
			String codigo = Integer.toString(fornecedorVO.getCodigoFornecedor());
			dados.addRow(new String[] { codigo, fornecedorVO.getEmpresa(), fornecedorVO.getCnpj(),
					fornecedorVO.getCep(), fornecedorVO.getTelefoneCelular(), fornecedorVO.getTelefone() });
		}

	}

	private void correio() {
		String cep = textCep.getText();
		String uf = comboBox.getSelectedItem().toString();
		WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
		if (webServiceCep.wasSuccessful()) {
			textRua.setText(webServiceCep.getLogradouroFull());
			textBairro.setText(webServiceCep.getBairro());
			textCidade.setText(webServiceCep.getCidade());
			comboBox.setSelectedItem(webServiceCep.getUf());

		} else {
			JOptionPane.showMessageDialog(null, webServiceCep.getResultText());
		}
	}
}
