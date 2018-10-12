package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.RelatorioVendasVO;

public class RelatorioVendasDAO {

	private Connection connection;

	public RelatorioVendasDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public RelatorioVendasVO getDadosRelatoriosVendas(Date datainicio, Date datafinal) throws Exception {
		RelatorioVendasVO relatorio = new RelatorioVendasVO();
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"Select produto.tipo_produto,sum(vendas.quantidade_venda) as 'Relatorios' from vendas inner join produto on(vendas.Codigo_Produto = produto.Codigo_Produto) where data_venda between ? and ? and produto.tipo_produto='CONGELADO';");
		PreparedStatement preparedStatement2 = this.connection.prepareStatement(
				"Select produto.tipo_produto,sum(vendas.quantidade_venda) as 'Relatorios' from vendas inner join produto on(vendas.Codigo_Produto = produto.Codigo_Produto) where data_venda between ? and ? and produto.tipo_produto='RESFRIADO'");
		PreparedStatement preparedStatement3 = this.connection.prepareStatement(
				"Select produto.tipo_produto,sum(vendas.quantidade_venda) as 'Relatorios' from vendas inner join produto on(vendas.Codigo_Produto = produto.Codigo_Produto) where data_venda between ? and ? and produto.tipo_produto='TEMPERADO'");
		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

		preparedStatement.setDate(1, new java.sql.Date(datainicio.getTime()));
		preparedStatement.setDate(2, new java.sql.Date(datafinal.getTime()));
		
		
		java.util.Date dataUtil2 = new java.util.Date();
		java.sql.Date dataSql2 = new java.sql.Date(dataUtil.getTime());

		preparedStatement2.setDate(1, new java.sql.Date(datainicio.getTime()));
		preparedStatement2.setDate(2, new java.sql.Date(datafinal.getTime()));
		
		
		java.util.Date dataUtil3 = new java.util.Date();
		java.sql.Date dataSql3 = new java.sql.Date(dataUtil.getTime());

		preparedStatement3.setDate(1, new java.sql.Date(datainicio.getTime()));
		preparedStatement3.setDate(2, new java.sql.Date(datafinal.getTime()));

		ResultSet resultSet = preparedStatement.executeQuery();
		ResultSet resultSet1 = preparedStatement2.executeQuery();
		ResultSet resultSet2 = preparedStatement3.executeQuery();
		

		if (resultSet.next() && resultSet1.next() && resultSet2.next()) {
			relatorio.setCongelados(resultSet.getInt("Relatorios"));
			relatorio.setResfriados(resultSet1.getInt("Relatorios"));
			relatorio.setTemperados(resultSet2.getInt("Relatorios"));
			

		}
		
		return relatorio;
	}

}
