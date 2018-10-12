package BO;

import java.util.List;

import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import VO.ClienteVO;
import VO.ProdutoVO;
import Validator.ClienteValidation;
import Validator.ProdutoValidation;

public class ClienteBO {

	public void cadastrarCliente(ClienteVO cVO) throws Exception {
		ClienteValidation cValidation = new ClienteValidation();
		ClienteDAO cDAO = new ClienteDAO();

		boolean retorno = cValidation.validaCliente(cVO);

		if (retorno) {
			cDAO.cadastraCliente(cVO);
		}
	}

	public List<ClienteVO> getDados() throws Exception {
		ClienteDAO cDAO = new ClienteDAO();

		return cDAO.pesquisarClienteTodos();
	}

	public String excluirCliente(int codigo) throws Exception {
		ClienteDAO cDAO = new ClienteDAO();
		
		return cDAO.excluirCliente(codigo);
	}

	public ClienteVO pesquisarPorCodigo(int codigo) throws Exception {
		ClienteDAO cDAO = new ClienteDAO();
		
		return cDAO.pesquisarContatoTodos(codigo);
	}

	public void alterarCliente(ClienteVO clienteVO) throws Exception {
		
		ClienteValidation cValidation = new ClienteValidation();
		ClienteDAO clienteDAO = new ClienteDAO();

		boolean retorno = cValidation.validaCliente(clienteVO);

		if (retorno) {
			clienteDAO.alteraCliente(clienteVO);
		}
		
	}

	public List<ClienteVO> pesquisarPorNome(String nome) throws Exception {
		ClienteDAO DAO = new ClienteDAO();
		return DAO.pesquisarNome(nome);
	}

}