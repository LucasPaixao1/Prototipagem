package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.EstoqueVO;
import VO.ProdutoVO;

public class EstoqueDAO {

	private Connection connection;

	public EstoqueDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public List<EstoqueVO> listarProdutos() throws Exception {
		List<EstoqueVO> retorno = new ArrayList<EstoqueVO>();

		PreparedStatement preparedStatement = this.connection.prepareStatement("Select  produto.codigo_produto, produto.nome_produto, produto.tipo_produto, Estoque.Peso_Produto, Sum(Estoque.Quantidade_Produto) as 'qtd_total' From Produto inner join Estoque on(Produto.Codigo_Produto = Estoque.codigo_Produto) group by produto.codigo_produto, produto.nome_produto ");
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			EstoqueVO estoqueVO = new EstoqueVO();
			estoqueVO.setCodigo(resultSet.getInt("produto.codigo_produto"));
			estoqueVO.setNome(resultSet.getString("produto.nome_produto"));
			estoqueVO.setPeso(resultSet.getDouble("Estoque.Peso_Produto"));
			estoqueVO.setQuantidade(resultSet.getInt("qtd_total"));
			estoqueVO.setTipo(resultSet.getString("produto.tipo_produto"));
			retorno.add(estoqueVO);

		}

		if(retorno.isEmpty()){
			
			throw new Exception("Não Há Produtos Cadastrados");
			
		}
		
		return retorno;
	}
	
	public List<EstoqueVO> pesquisaNome(String nome) throws Exception {
		List<EstoqueVO> retorno = new ArrayList<EstoqueVO>();

		int cont = 1;
		PreparedStatement preparedStatement = this.connection.prepareStatement("Select produto.codigo_produto, produto.nome_produto, produto.tipo_produto, Estoque.Peso_Produto, Sum(Estoque.Quantidade_Produto) as 'qtd_total' From Produto inner join Estoque on(Produto.Codigo_Produto = Estoque.codigo_Produto) where Nome_Produto like '%" + nome + "%' group by produto.codigo_produto, produto.nome_produto;");

//		preparedStatement.setString(1, nome);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			EstoqueVO estoqueVO = new EstoqueVO();
			estoqueVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			estoqueVO.setNome(resultSet.getString("Nome_Produto"));
			estoqueVO.setTipo(resultSet.getString("tipo_produto"));
			estoqueVO.setPeso(resultSet.getDouble("Peso_Produto"));
			estoqueVO.setQuantidade(resultSet.getInt("qtd_total"));
			retorno.add(estoqueVO);

			cont++;
		}
		
		if(retorno.isEmpty()){
			
			throw new Exception("Não Há Produtos Cadastrados Com Esse Nome");
			
		}

		return retorno;
	}

	public EstoqueVO pesquisaId(int id) throws Exception {
		PreparedStatement preparedStatement = this.connection.prepareStatement("Select produto.codigo_produto, produto.nome_produto, produto.tipo_produto, Estoque.Peso_Produto, Sum(Estoque.Quantidade_Produto) as 'qtd_total' From Produto inner join Estoque on(Produto.Codigo_Produto = Estoque.codigo_Produto) where produto.Codigo_Produto = ? ");

		preparedStatement.setInt(1, id);
		EstoqueVO estoqueVO = new EstoqueVO();
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {

			estoqueVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			estoqueVO.setNome(resultSet.getString("Nome_Produto"));
			estoqueVO.setTipo(resultSet.getString("tipo_produto"));
			estoqueVO.setPeso(resultSet.getDouble("Peso_Produto"));
			estoqueVO.setQuantidade(resultSet.getInt("qtd_total"));

		}else{
			
			throw new Exception("Não Há Produtos Cadastrados Com Esse Código");
			
		}

		return estoqueVO;

	}

}
