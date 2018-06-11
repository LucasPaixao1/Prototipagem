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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddLembrete extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;

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
			AddLembrete dialog = new AddLembrete();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddLembrete() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBounds(100, 100, 357, 501);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Data:");
			lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblNewLabel.setBounds(10, 113, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o:");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblNewLabel_1.setBounds(10, 181, 65, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Assunto:");
			lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
			lblNewLabel_2.setBounds(10, 320, 65, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBounds(96, 111, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(96, 317, 221, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblLembretePersonalizado = new JLabel("Lembrete Personalizado");
			lblLembretePersonalizado.setFont(new Font("Segoe UI", Font.BOLD, 24));
			lblLembretePersonalizado.setBounds(39, 11, 278, 54);
			contentPanel.add(lblLembretePersonalizado);
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(96, 176, 209, 109);
		contentPanel.add(textArea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Salvar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						AddLembrete addLembrete= new AddLembrete();
						addLembrete.dispose();
					}
				});
				okButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
