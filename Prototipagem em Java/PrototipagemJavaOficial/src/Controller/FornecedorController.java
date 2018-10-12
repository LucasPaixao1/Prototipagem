package Controller;

import java.util.List;

import BO.FornecedorBO;
import VO.FornecedorVO;
import Validator.FornecedorValidation;

public class FornecedorController {

	public void cadastrarFornecedor(FornecedorVO fornecedorVO) throws Exception {
		FornecedorBO fornecedorBO = new FornecedorBO();
		fornecedorBO.cadastrarFornecedor(fornecedorVO);
	}

	public void excluirFornecedor(int codigo) throws Exception {
		FornecedorBO fornecedorBO = new FornecedorBO();
		fornecedorBO.excluirFornecedor(codigo);

	}

	public void alterarFornecedor(FornecedorVO fornecedorVO) throws Exception {
		FornecedorBO fornecedorBO = new FornecedorBO();
		fornecedorBO.alterarFornecedor(fornecedorVO);

	}

	public FornecedorVO pesquisarPorCodigo(int codigo) throws Exception {
		FornecedorBO fornecedorBO = new FornecedorBO();

		return fornecedorBO.pesquisarPorCodigo(codigo);
	}

	public List<FornecedorVO> pesquisarFornecedorTodos() throws Exception {
		FornecedorBO fornecedorBO = new FornecedorBO();

		return fornecedorBO.getDados();
	}

	public List<FornecedorVO> pesquisarNome(String nome) throws Exception {
		FornecedorBO fornecedorBO = new FornecedorBO();

		return fornecedorBO.pesquisarPorNome(nome);
	}

}
