package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarEntrada extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		
		try {
			RegistrarEntrada dialog = new RegistrarEntrada();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarEntrada() {
		setFont(new Font("Segoe UI", Font.BOLD, 12));
		setBounds(100, 100, 430, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(143, 47, 46, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("C\u00F3digo do Produto:");
			lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblNewLabel.setBounds(10, 49, 114, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNomeDoProduto = new JLabel("Nome Do Produto:");
			lblNomeDoProduto.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblNomeDoProduto.setBounds(10, 117, 114, 14);
			contentPanel.add(lblNomeDoProduto);
		}
		{
			JLabel lblQuantidade = new JLabel("Quantidade:");
			lblQuantidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblQuantidade.setBounds(10, 184, 86, 14);
			contentPanel.add(lblQuantidade);
		}
		{
			JLabel lblPeso = new JLabel("Peso:");
			lblPeso.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblPeso.setBounds(10, 244, 46, 14);
			contentPanel.add(lblPeso);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(143, 115, 233, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(143, 182, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(143, 242, 86, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblFornecedor.setBounds(10, 311, 69, 14);
			contentPanel.add(lblFornecedor);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(143, 309, 233, 20);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Salvar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						RegistrarEntrada registrarEntrada = new RegistrarEntrada();
						 registrarEntrada.dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
