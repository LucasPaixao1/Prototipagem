package Email;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.VendasVO;

public class JavaMailApp {

	private Connection connection;

	public JavaMailApp() throws SQLException {
		this.connection = DAOFactory.conexao();

	}

	public void enviarEmail(String login, int senha, String email){
		
		Properties props = new Properties();
		/** Parâmetros de conexão com servidor Gmail */
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("portalviciogames123@gmail.com", "81298488e");
			}
		});

		/** Ativa Debug para sessão */
		session.setDebug(true);

		try {

			

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("portalviciogames123@gmail.com")); // Remetente

			Address[] toUser = InternetAddress // Destinatário(s)
					.parse(email);

			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Recuperação de senha");// Assunto
			message.setText("A equipe da Nemesys gostaria de informar que estamos enviando sua nova senha que foi solicitada./n A partir de agora sua nova senha é:" + senha);
			/** Método para enviar a mensagem criada */
			Transport.send(message);
			JOptionPane.showMessageDialog(null, "Email enviado com sucesso");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	}
}