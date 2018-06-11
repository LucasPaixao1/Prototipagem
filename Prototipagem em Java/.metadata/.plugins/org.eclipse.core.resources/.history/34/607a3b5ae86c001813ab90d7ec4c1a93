package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JPasswordField;

public class ViewLoginDesign extends JFrame {
	private JTextField textField;
	
	
	static ViewLoginDesign frameLogin = new ViewLoginDesign();
	private JPasswordField passwordField;

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
					frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewLoginDesign() {
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewLoginDesign.class.getResource("/imagens/Imagem1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(54,33,817, 564);
		JPanel contentPane = new JPanel();
		contentPane.setSize(new Dimension(788, 554));
		contentPane.setName("Login");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(340, 0, 471, 535);
		panel.setBackground(new Color(54, 33, 89));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(156, 75, 150, 171);
		lblNewLabel_1.setIcon(new ImageIcon(ViewLoginDesign.class.getResource("/imagens/Imagem1.png")));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Varej\u00E3o Santos");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(156, 258, 165, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblUsuario.setBounds(45, 125, 44, 16);
		
		textField = new JTextField();
		textField.setBounds(45, 152, 240, 27);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha.setBounds(45, 205, 36, 14);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(45, 292, 240, 32);
		btnEntrar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(54, 33, 89), new Color(54, 33, 89), new Color(54, 33, 89), new Color(54, 33, 89)));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(54,33,89));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				frameLogin.dispose();
				
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(17, 152, 28, 27);
		lblNewLabel.setIcon(new ImageIcon(ViewLoginDesign.class.getResource("/imagens/icons8-administrador-masculino-25.png")));
		
		JLabel label = new JLabel("");
		label.setBounds(17, 230, 28, 27);
		label.setIcon(new ImageIcon(ViewLoginDesign.class.getResource("/imagens/icons8-senha-25.png")));
		
		JLabel lblEsqueceuASenha = new JLabel("Esqueceu a senha?");
		lblEsqueceuASenha.setBounds(17, 345, 98, 16);
		lblEsqueceuASenha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.setLayout(null);
		contentPane.add(lblUsuario);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		contentPane.add(lblSenha);
		contentPane.add(label);
		contentPane.add(btnEntrar);
		contentPane.add(lblEsqueceuASenha);
		contentPane.add(panel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(45, 231, 240, 28);
		contentPane.add(passwordField);
	}
}

