package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.LoginVO;

public class LoginDAO {

	private Connection connection;

	public LoginDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}
	
	public String logar(LoginVO loginVO) throws Exception {
		
		String retorno = "";
		
		PreparedStatement preparedStatement = this.connection.prepareStatement("Select tipoconta_usuario from usuario where login_usuario=? and senha_usuario=MD5(?)");
		
		preparedStatement.setString(1, loginVO.getLogin());
		preparedStatement.setString(2, loginVO.getSenha());
		
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()){
			
			retorno = rs.getString("tipoconta_usuario");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Login ou Senha Inválido");
		}
		
		return retorno;
	}

}
