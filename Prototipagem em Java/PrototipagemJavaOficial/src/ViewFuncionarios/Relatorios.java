package ViewFuncionarios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import java.awt.Cursor;

public class Relatorios extends JFrame {

	private JPanel contentPane;
	static Relatorios frameRelatorio = new Relatorios();

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
					frameRelatorio.setVisible(true);
					frameRelatorio.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Relatorios() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 951, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(new Color(17, 144, 147));
		panel.setBounds(0, 0, 268, 775);
		contentPane.add(panel);
		setContentPane(contentPane);
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 83, 204, 18);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(216, 91, 0, 2);
		panel.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(216, 99, 0, 2);
		panel.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 492, 0, 2);
		panel.add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 492, 270, 2);
		panel.add(separator_4);

		JLabel label = new JLabel("Administrador");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label.setBounds(24, 525, 79, 16);
		panel.add(label);

		JButton button = new JButton("Cadastro de Clientes");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteViewFuncionario windowCliente = new CadastroClienteViewFuncionario();
				windowCliente.frmCadastroDeCliente.setVisible(true);

				dispose();
			}
		});
		button.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17, 144, 147));
		button.setBounds(0, 132, 270, 48);
		panel.add(button);

		JButton button_1 = new JButton("Cadastro de Fornecedores");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FornecedorFuncionario fornecedor = new FornecedorFuncionario();
				fornecedor.frame.setVisible(true);

				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(17, 144, 147));
		button_1.setBounds(0, 192, 270, 48);
		panel.add(button_1);

		JButton button_2 = new JButton("Cadastro de Produtos");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setVisible(true);

				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-produto-25.png")));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17, 144, 147));
		button_2.setBounds(0, 252, 270, 48);
		panel.add(button_2);

		JButton button_3 = new JButton("Vendas");
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VendasViewFuncionario vendas = new VendasViewFuncionario();
				vendas.setVisible(true);

				dispose();
			}
		});
		button_3.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17, 144, 147));
		button_3.setBounds(0, 312, 270, 48);
		panel.add(button_3);

		JButton button_4 = new JButton("Estoque");
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = new ViewEstoqueDesignFuncionario();
				estoque.setVisible(true);

				dispose();
			}

		});
		button_4.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17, 144, 147));
		button_4.setBounds(0, 372, 270, 48);
		panel.add(button_4);

		JLabel label_1 = new JLabel("Varej\u00E3o Santos");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				ViewMenuDesignFuncionario menu = new ViewMenuDesignFuncionario();
				menu.setVisible(true);

				dispose();
			}
		});
		label_1.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label_1.setForeground(new Color(240, 248, 255));
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		label_1.setBounds(6, 45, 260, 32);
		panel.add(label_1);

		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});
		btnRelatorios.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-pdf-25.png")));
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		btnRelatorios.setBounds(0, 432, 268, 48);
		panel.add(btnRelatorios);

		JButton btnNewButton = new JButton("Gerar Relat\u00F3rio de vendas");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Document document = new Document();

				try {
					PdfWriter.getInstance(document, new FileOutputStream("C:/temp/RelatorioVendas.pdf"));

					document.open();
					document.add(new Paragraph("Relat�rio de Vendas\n"));
					document.add(new Paragraph(
							"\nFrangos resfriados vendidos: 100; \nFrangos Congelados: 150; \nFrangos Temperados Vendidos: 120;\n \nTotal vendido no m�s: 370; \nPre�o total: 10.000;"));

				} catch (DocumentException ex) {
					System.out.println("Error:" + ex);
				} catch (FileNotFoundException ex) {
					System.out.println("Error:" + ex);
				} finally {
					document.close();
				}

				try {
					Desktop.getDesktop().open(new File("C:/temp/RelatorioVendas.pdf"));
				} catch (IOException ex) {
					System.out.println("Error:" + ex);
				}

			}
		});
		btnNewButton.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-pdf-25.png")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(456, 28, 262, 63);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(0, 128, 128));
	}
}
