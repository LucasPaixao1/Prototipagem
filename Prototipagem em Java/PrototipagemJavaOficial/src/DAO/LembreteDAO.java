package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.LembreteVO;
import VO.ProdutoVO;

public class LembreteDAO {

	private Connection connection;

	public LembreteDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public void cadastraLembrete(LembreteVO lVO) throws Exception {

		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"INSERT INTO lembrete (Data_Lembrete,Descricao_Lembrete,Assunto_Lembrete) VALUES(?,?,?) ");
		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

		preparedStatement.setDate(1, new java.sql.Date(lVO.getData().getTime()));
		preparedStatement.setString(2, lVO.getDescricao());
		preparedStatement.setString(3, lVO.getAssunto());

		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Lembrete cadastrado com sucesso");
		}
	}

	public List<LembreteVO> pesquisaLembreteTodos() throws Exception {
		List<LembreteVO> retorno = new ArrayList<LembreteVO>();

		int cont = 1;
		PreparedStatement preparedStatement = this.connection.prepareStatement("Select*from lembrete");
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			LembreteVO lembreteVO = new LembreteVO();
			lembreteVO.setData(resultSet.getDate("Data_Lembrete"));
			lembreteVO.setAssunto(resultSet.getString("Assunto_Lembrete"));
			lembreteVO.setDescricao(resultSet.getString("Descricao_Lembrete"));
			retorno.add(lembreteVO);

			cont++;
		}
		return retorno;
	}

	public String delete(LembreteVO lVO) throws Exception {
		String retorno = "Não foi possivel excluir o produto";
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"DELETE FROM lembrete WHERE Data_lembrete = ? and assunto_lembrete = ? and descricao_lembrete = ? ");

		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

		preparedStatement.setDate(1, new java.sql.Date(lVO.getData().getTime()));
		preparedStatement.setString(2, lVO.getAssunto());
		preparedStatement.setString(3, lVO.getDescricao());

		int cont = preparedStatement.executeUpdate();
		
		if(cont==1){
			
			retorno="Lembrete Deletado com sucesso";
		
		}

		return retorno;
	}

}
