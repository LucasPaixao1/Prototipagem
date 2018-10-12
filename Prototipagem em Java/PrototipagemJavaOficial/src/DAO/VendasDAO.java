package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DAOFactory.DAOFactory;
import VO.ProdutoVO;
import VO.VendasVO;

public class VendasDAO {
	
	private Connection connection;
	
	public VendasDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public void cadastrarVendas(VendasVO vendasVO) throws Exception {
		
//		PreparedStatement preparedStatement1 = this.connection.prepareStatement("Select Quantidade_Produto, Peso_Produto From Estoque Where Codigo_Produto = ?");
//		preparedStatement1.setInt(1, vendasVO.getCodigoProduto());
//
//		double peso = 0;
//		int quan = 0;
//		ResultSet resultSet = preparedStatement1.executeQuery();	
//		if (resultSet.next()) {
//			peso = resultSet.getDouble("Peso_Produto");
//			quan = resultSet.getInt("Quantidade_Produto");
//		}
//		
//		preparedStatement1.execute();
//		
//		PreparedStatement preparedStatement2 = this.connection.prepareStatement("Update Estoque set Quantidade_Produto = ?, Peso_Produto = ? where Codigo_Produto = ?");
//		
//		preparedStatement2.setInt(1, quan - vendasVO.getQuantidade());
//		preparedStatement2.setDouble(2, peso - vendasVO.getPeso());
//		preparedStatement2.setInt(3, vendasVO.getCod igoProduto());
		
		PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT f_cadastra_venda(?,?,?,?,?,?,?);");
		preparedStatement.setInt(1, vendasVO.getCodigo());		
		preparedStatement.setInt(2, vendasVO.getCodigoProduto());
		preparedStatement.setInt(3, vendasVO.getCodigocliente());
		preparedStatement.setDouble(4,vendasVO.getValor());
		
		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
		
		preparedStatement.setDate(5, new java.sql.Date(vendasVO.getDataVenda().getTime()));
		preparedStatement.setDouble(6,vendasVO.getPeso());
		preparedStatement.setInt(7, vendasVO.getQuantidade());
	
		//preparedStatement2.execute();
		if(preparedStatement.execute()){
			JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso");;
		}
	}

	public List<VendasVO> pesquisarVendasTodos() throws Exception {
		List<VendasVO> retorno = new ArrayList<VendasVO>();
		
		PreparedStatement preparedStatement1 = this.connection.prepareStatement("Select Vendas.*, Produto.Nome_Produto, Cliente.Nome_Cliente From Produto inner join Vendas on(Vendas.Codigo_Produto = Produto.Codigo_Produto) inner join Cliente on(Vendas.Codigo_Cliente = Cliente.Codigo_Cliente);");
		
		
		ResultSet resultSet1 = preparedStatement1.executeQuery();
		
		while (resultSet1.next()) {

			VendasVO vendasVO = new VendasVO();
			vendasVO.setCodigo(resultSet1.getInt("Codigo_Vendas"));
			vendasVO.setDataVenda(resultSet1.getDate("data_venda"));
			vendasVO.setValor(resultSet1.getDouble("valor_venda"));
			vendasVO.setPeso(resultSet1.getDouble("peso_venda"));
			vendasVO.setQuantidade(resultSet1.getInt("quantidade_venda"));
			vendasVO.setNomeCliente(resultSet1.getString("Nome_Cliente"));
			vendasVO.setNomeProduto(resultSet1.getString("Nome_Produto"));
			retorno.add(vendasVO);
		}

		return retorno;
	}

	public void alteraVendas(VendasVO vendasVO) throws Exception {
		
		
		
		PreparedStatement preparedStatement = this.connection.prepareStatement("UPDATE Vendas SET data_venda =?, quantidade_venda=?,valor_venda=?,peso_venda=?,	Codigo_Cliente =?,Codigo_Produto =? WHERE Codigo_Vendas = ?;");

		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

		preparedStatement.setDate(1, new java.sql.Date(vendasVO.getDataVenda().getTime()));
		preparedStatement.setInt(2, vendasVO.getQuantidade());
		preparedStatement.setDouble(3, vendasVO.getValor());
		preparedStatement.setDouble(4, vendasVO.getPeso());
		preparedStatement.setInt(5, vendasVO.getCodigocliente());
		preparedStatement.setInt(6, vendasVO.getCodigoProduto());
		preparedStatement.setInt(7, vendasVO.getCodigo());
		
		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso");
		}
	
	}

	public boolean excluir(VendasVO vendasVO) throws Exception {
		boolean retorno = false;

		
		
		PreparedStatement preparedStatement = this.connection.prepareStatement("select f_excluir_venda(?,?);");
		
		preparedStatement.setInt(1, vendasVO.getCodigo());
		preparedStatement.setInt(2, vendasVO.getCodigoProduto());

		if (preparedStatement.execute()) {
			retorno = true;
		}
		
		return retorno;
	}

	public VendasVO pesquisarPorCodigo(int codigo) throws Exception {
		VendasVO vendasVO = new VendasVO();
		PreparedStatement preparedStatement = this.connection.prepareStatement("Select Vendas.*, Produto.Nome_Produto, Produto.Codigo_Produto, Cliente.Codigo_Cliente, Cliente.Nome_Cliente From Produto inner join Vendas on(Vendas.Codigo_Produto = Produto.Codigo_Produto) inner join Cliente on(Vendas.Codigo_Cliente = Cliente.Codigo_Cliente) where Codigo_Vendas = ? " );
		preparedStatement.setInt(1, codigo);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			vendasVO.setCodigo(resultSet.getInt("Codigo_Vendas"));
			vendasVO.setNomeCliente(resultSet.getString("Nome_Cliente"));
			vendasVO.setDataVenda(resultSet.getDate("data_venda"));
			vendasVO.setValor(resultSet.getDouble("valor_venda"));
			vendasVO.setQuantidade(resultSet.getInt("quantidade_venda"));
			vendasVO.setPeso(resultSet.getDouble("peso_venda"));
			vendasVO.setNomeProduto(resultSet.getString("Nome_Produto"));
			vendasVO.setCodigoProduto(resultSet.getInt("Codigo_Produto"));
			vendasVO.setCodigocliente(resultSet.getInt("Codigo_Cliente"));
		}
		
		return vendasVO;
	}

}
