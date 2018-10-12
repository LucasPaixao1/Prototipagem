package Controller;


import BO.ClienteBO;
import VO.ClienteVO;
import java.util.List;

public class ClienteController {

	public void cadastroDeCliente(ClienteVO cVO) throws Exception{
		ClienteBO cBO = new ClienteBO();
		cBO.cadastrarCliente(cVO);
	}

	public List<ClienteVO> pesquisarClienteTodos() throws Exception {
		ClienteBO cBO = new ClienteBO();
		
		return cBO.getDados();
	}

	public String excluirCliente(int codigo) throws Exception {
		ClienteBO cBO = new ClienteBO();
		
		return cBO.excluirCliente(codigo);
	}

	public ClienteVO pesquisarPorCodigo(int codigo) throws Exception {
		ClienteBO cBO = new ClienteBO();		
		return cBO.pesquisarPorCodigo(codigo);
	}

	public void alteraCliente(ClienteVO clienteVO) throws Exception {
		ClienteBO cBO = new ClienteBO();		
		cBO.alterarCliente(clienteVO);		
	}

	public List<ClienteVO> pesquisarNome(String nome) throws Exception {
		ClienteBO bo = new ClienteBO();
		return bo.pesquisarPorNome(nome);
	}

	
	
	
	
	

	
	
	
	
	
}
