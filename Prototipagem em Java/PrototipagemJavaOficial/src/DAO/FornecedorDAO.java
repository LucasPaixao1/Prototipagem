package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DAOFactory.DAOFactory;
import VO.FornecedorVO;

public class FornecedorDAO {
	private Connection connection;

	public FornecedorDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public void cadastrarFornecedor(FornecedorVO fornecedorVO) throws Exception {
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"INSERT INTO fornecedor(Codigo_Fornecedor,Nome_Fornecedor,CNPJ_Fornecedor,Email_Fornecedor) VALUES (?,?,?,?)");
		PreparedStatement preparedStatement1 = this.connection
				.prepareStatement("INSERT INTO endereco(Rua_Endereco, Bairro_Endereco,Numero_Endereco, Cep_Endereco,"
						+ " Cidade_Endereco,UF_Endereco, Complemento_Endereco, Codigo_Fornecedor) VALUES(?,?,?,?,?,?,?,?)");
		PreparedStatement preparedStatement2 = this.connection
				.prepareStatement("INSERT INTO contato(Cel_Contato, Fixo_Contato, Nextel_Contato, Codigo_Fornecedor) VALUES(?,?,?,?)");
		
		preparedStatement.setInt(1, fornecedorVO.getCodigoFornecedor());
		preparedStatement.setString(2, fornecedorVO.getEmpresa());
		preparedStatement.setString(3, fornecedorVO.getCnpj());
		preparedStatement.setString(4, fornecedorVO.getEmail());
		
		preparedStatement1.setString(1, fornecedorVO.getRua());
		preparedStatement1.setString(2, fornecedorVO.getBairro());
		preparedStatement1.setString(3, fornecedorVO.getNumero());
		preparedStatement1.setString(4, fornecedorVO.getCep());
		preparedStatement1.setString(5, fornecedorVO.getCidade());
		preparedStatement1.setString(6, fornecedorVO.getUf());
		preparedStatement1.setString(7, fornecedorVO.getComplemento());
		preparedStatement1.setInt(8, fornecedorVO.getCodigoFornecedor());
		
		preparedStatement2.setString(1, fornecedorVO.getTelefoneCelular());
		preparedStatement2.setString(2, fornecedorVO.getTelefone());
		preparedStatement2.setString(3, fornecedorVO.getNextel());
		preparedStatement2.setInt(4, fornecedorVO.getCodigoFornecedor());
		if (preparedStatement.executeUpdate() == 1 && preparedStatement1.executeUpdate() == 1
				&& preparedStatement2.executeUpdate() == 1) {
			JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com Sucesso");

		} else {
			JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fornecedor");
		}
	}

	public void excluirFornecedor(int codigo) throws SQLException {
		PreparedStatement preparedStatement = this.connection
				.prepareStatement("DELETE FROM endereco WHERE Codigo_Fornecedor=?");
		PreparedStatement preparedStatement1 = this.connection
				.prepareStatement("DELETE FROM contato WHERE Codigo_Fornecedor=?");
		PreparedStatement preparedStatement2 = this.connection
				.prepareStatement("DELETE FROM fornecedor WHERE Codigo_Fornecedor=?");

		preparedStatement.setInt(1, codigo);
		preparedStatement1.setInt(1, codigo);
		preparedStatement2.setInt(1, codigo);

		if (preparedStatement.executeUpdate() == 1 && preparedStatement1.executeUpdate() == 1
				&& preparedStatement2.executeUpdate() == 1) {
			JOptionPane.showMessageDialog(null, "Fornecedor Excluido com Sucesso");
		}

	}

	public void alterarFornecedor(FornecedorVO fornecedorVO) throws SQLException {

		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"UPDATE fornecedor set Nome_Fornecedor=?, CNPJ_Fornecedor=?,Email_Fornecedor=? WHERE Codigo_Fornecedor=?;");
		PreparedStatement preparedStatement1 = this.connection.prepareStatement(
				"UPDATE endereco set Rua_Endereco=?, Bairro_Endereco=?, Numero_Endereco=?, Cep_Endereco=?,Cidade_Endereco=?, UF_Endereco=?, Complemento_Endereco=? WHERE Codigo_Fornecedor=?;");
		PreparedStatement preparedStatement2 = this.connection
				.prepareStatement("UPDATE contato set Cel_Contato=?, Fixo_Contato=?, Nextel_Contato=? WHERE Codigo_Fornecedor=?;");

		preparedStatement.setString(1, fornecedorVO.getEmpresa());
		preparedStatement.setString(2, fornecedorVO.getCnpj());
		preparedStatement.setString(3, fornecedorVO.getEmail());
		preparedStatement.setInt(4, fornecedorVO.getCodigoFornecedor());

		preparedStatement1.setString(1, fornecedorVO.getRua());
		preparedStatement1.setString(2, fornecedorVO.getBairro());
		preparedStatement1.setString(3, fornecedorVO.getNumero());
		preparedStatement1.setString(4, fornecedorVO.getCep());
		preparedStatement1.setString(5, fornecedorVO.getCidade());
		preparedStatement1.setString(6, fornecedorVO.getUf());
		preparedStatement1.setString(7, fornecedorVO.getComplemento());
		preparedStatement1.setInt(8, fornecedorVO.getCodigoFornecedor());

		preparedStatement2.setString(1, fornecedorVO.getTelefoneCelular());
		preparedStatement2.setString(2, fornecedorVO.getTelefone());
		preparedStatement2.setString(3, fornecedorVO.getNextel());
		preparedStatement2.setInt(4, fornecedorVO.getCodigoFornecedor());

		int result1 = preparedStatement.executeUpdate();
		int result2 = preparedStatement1.executeUpdate();
		int result3 = preparedStatement2.executeUpdate();

		if (result1 == 1 && result2 == 1 && result3 == 1) {
			JOptionPane.showMessageDialog(null, "Fornecedor Alterado com Sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao Alterar Fornecedor");
		}

	}

	public FornecedorVO PesquisarPorCodigo(int codigo) throws SQLException {
		FornecedorVO fornecedorVO = new FornecedorVO();
		PreparedStatement preparedStatement1 = this.connection
				.prepareStatement("SELECT * FROM fornecedor WHERE Codigo_Fornecedor=?");
		PreparedStatement preparedStatement2 = this.connection
				.prepareStatement("SELECT * FROM Endereco WHERE Codigo_Fornecedor=?");
		PreparedStatement preparedStatement3 = this.connection
				.prepareStatement("SELECT * FROM Contato WHERE Codigo_Fornecedor=?");

		preparedStatement1.setInt(1, codigo);
		preparedStatement2.setInt(1, codigo);
		preparedStatement3.setInt(1, codigo);

		ResultSet resultSet1 = preparedStatement1.executeQuery();
		ResultSet resultSet2 = preparedStatement2.executeQuery();
		ResultSet resultSet3 = preparedStatement3.executeQuery();

		if (resultSet1.next() && resultSet2.next() && resultSet3.next()) {
			fornecedorVO.setCodigoFornecedor(resultSet1.getInt("Codigo_Fornecedor"));
			fornecedorVO.setEmpresa(resultSet1.getString("Nome_Fornecedor"));
			fornecedorVO.setCnpj(resultSet1.getString("CNPJ_Fornecedor"));
			fornecedorVO.setEmail(resultSet1.getString("Email_Fornecedor"));

			fornecedorVO.setRua(resultSet2.getString("Rua_Endereco"));
			fornecedorVO.setBairro(resultSet2.getString("Bairro_Endereco"));
			fornecedorVO.setNumero(resultSet2.getString("Numero_Endereco"));
			fornecedorVO.setCep(resultSet2.getString("Cep_Endereco"));
			fornecedorVO.setCidade(resultSet2.getString("Cidade_Endereco"));
			fornecedorVO.setUf(resultSet2.getString("UF_Endereco"));
			fornecedorVO.setComplemento(resultSet2.getString("Complemento_Endereco"));

			fornecedorVO.setTelefone(resultSet3.getString("Cel_Contato"));
			fornecedorVO.setTelefoneCelular(resultSet3.getString("Fixo_Contato"));
			fornecedorVO.setNextel(resultSet3.getString("Nextel_Contato"));
			
		}
		return fornecedorVO;

	}

	public List<FornecedorVO> pesquisarFornecedorTodos() throws Exception {
		List<FornecedorVO> retorno = new ArrayList<FornecedorVO>();

		PreparedStatement preparedStatement1 = this.connection.prepareStatement(
				"SELECT Fornecedor.Codigo_Fornecedor, Fornecedor.Nome_Fornecedor,Fornecedor.CNPJ_Fornecedor,endereco.Cep_Endereco,contato.Fixo_Contato,contato.Cel_Contato FROM endereco inner join fornecedor on(Fornecedor.Codigo_Fornecedor = endereco.Codigo_Fornecedor) inner join contato on (fornecedor.Codigo_Fornecedor = contato.Codigo_Fornecedor);");

		ResultSet resultSet = preparedStatement1.executeQuery();

		while (resultSet.next()) {
			FornecedorVO fornecedorVO = new FornecedorVO();
			fornecedorVO.setCodigoFornecedor(resultSet.getInt("Codigo_Fornecedor"));
			fornecedorVO.setEmpresa(resultSet.getString("Nome_Fornecedor"));
			fornecedorVO.setCnpj(resultSet.getString("CNPJ_Fornecedor"));
			fornecedorVO.setCep(resultSet.getString("Cep_Endereco"));
			fornecedorVO.setTelefoneCelular(resultSet.getString("Fixo_Contato"));
			fornecedorVO.setTelefone(resultSet.getString("Cel_Contato"));
			retorno.add(fornecedorVO);
		}
		return retorno;
	}

	public List<FornecedorVO> pesquisarPorNome(String nome) throws Exception {
		List<FornecedorVO> retorno = new ArrayList<FornecedorVO>();
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"SELECT Fornecedor.Codigo_Fornecedor, Fornecedor.Nome_Fornecedor,Fornecedor.CNPJ_Fornecedor,endereco.Cep_Endereco,contato.Fixo_Contato,contato.Cel_Contato FROM endereco inner join fornecedor on(Fornecedor.Codigo_Fornecedor = endereco.Codigo_Fornecedor) inner join contato on (fornecedor.Codigo_Fornecedor = contato.Codigo_Fornecedor)where Nome_Fornecedor like'%"
						+ nome + "%'");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			FornecedorVO fornecedorVO = new FornecedorVO();
			fornecedorVO.setCodigoFornecedor(resultSet.getInt("Codigo_Fornecedor"));
			fornecedorVO.setEmpresa(resultSet.getString("Nome_Fornecedor"));
			fornecedorVO.setCnpj(resultSet.getString("CNPJ_Fornecedor"));
			fornecedorVO.setCep(resultSet.getString("Cep_Endereco"));
			fornecedorVO.setTelefoneCelular(resultSet.getString("Fixo_Contato"));
			fornecedorVO.setTelefone(resultSet.getString("Cel_Contato"));
			retorno.add(fornecedorVO);

		}

		return retorno;
	}

	public boolean verificaExistenciaCodigo_Fornecedor(int codigoFornecedor) throws SQLException {
		PreparedStatement preparedStatement=this.connection.prepareStatement( "select Codigo_Fornecedor from fornecedor where Codigo_Fornecedor=?");
		int parameterIndex =1;
		preparedStatement.setInt(parameterIndex++, codigoFornecedor);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			return false;
		}else{
			return true;
		}
	}


}
