package ViewFuncionarios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controller.LembreteController;
import VO.LembreteVO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;

public class AddLembreteFuncionario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtassunto;

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

		try {
			AddLembreteFuncionario dialog = new AddLembreteFuncionario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddLembreteFuncionario() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBounds(100, 100, 357, 459);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
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
			txtassunto = new JTextField();
			txtassunto.setBounds(96, 309, 209, 28);
			contentPanel.add(txtassunto);
			txtassunto.setColumns(10);
		}
		{
			JLabel lblLembretePersonalizado = new JLabel("Lembrete Personalizado");
			lblLembretePersonalizado.setIcon(new ImageIcon(AddLembreteFuncionario.class.getResource("/imagens/icons8-calend\u00E1rio-25 (1).png")));
//			lblLembretePersonalizado.setIcon(new ImageIcon(AddLembrete.class.getResource("/imagens/icons8-calend\u00E1rio-25.png")));
			lblLembretePersonalizado.setFont(new Font("Segoe UI", Font.BOLD, 24));
			lblLembretePersonalizado.setBounds(18, 11, 317, 54);
			contentPanel.add(lblLembretePersonalizado);
		}

		JTextArea txtdescricao = new JTextArea();
		txtdescricao.setBounds(96, 176, 209, 109);
		contentPanel.add(txtdescricao);

		JDateChooser txtdata = new JDateChooser();
		txtdata.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtdata.getCalendarButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtdata.setBounds(96, 113, 209, 28);
		contentPanel.add(txtdata);
		{
			JButton okButton = new JButton("Salvar");
			okButton.setBounds(96, 373, 88, 37);
			contentPanel.add(okButton);
			okButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			okButton.setIcon(new ImageIcon(AddLembreteFuncionario.class.getResource("/imagens/icons8-salvar-25 (2).png")));
//				okButton.setIcon(new ImageIcon(AddLembrete.class.getResource("/imagens/icons8-salvar-25.png")));
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						cadastrar();

						AddLembreteFuncionario lembrete = new AddLembreteFuncionario();
						dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				private void cadastrar() throws Exception {
					LembreteVO lVO = new LembreteVO();
					LembreteController lController = new LembreteController();

					lVO.setData(txtdata.getDate());
					lVO.setDescricao(txtdescricao.getText().trim());
					lVO.setAssunto(txtassunto.getText().trim());

					txtdescricao.setText("");
					txtassunto.setText("");

					txtdata.requestFocus();
					lController.cadastroDeLembrete(lVO);

				}

			});
			okButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancelar");
			cancelButton.setBounds(196, 373, 109, 37);
			contentPanel.add(cancelButton);
			cancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			cancelButton.setIcon(new ImageIcon(AddLembreteFuncionario.class.getResource("/imagens/icons8-excluir-25.png")));
//				cancelButton.setIcon(new ImageIcon(AddLembrete.class.getResource("/imagens/icons8-cancelar-25.png")));
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					AddLembreteFuncionario addLembrete = new AddLembreteFuncionario();
					dispose();

				}
			});
			cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			cancelButton.setActionCommand("Cancel");
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}

	}
}
