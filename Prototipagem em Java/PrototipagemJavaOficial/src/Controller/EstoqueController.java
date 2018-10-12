package Controller;

import java.util.List;

import BO.EstoqueBO;
import VO.EstoqueVO;

public class EstoqueController {

	public List<EstoqueVO> listarProdutos() throws Exception {
		EstoqueBO estoqueBO = new EstoqueBO();
		
		return estoqueBO.listarProdutos();
		
	}

	public List<EstoqueVO> pesquisarNome(String nome) throws Exception {
		EstoqueBO bo = new EstoqueBO();
		return bo.pesquisaNome(nome);
	}

	public EstoqueVO pesquisarId(int id) throws Exception {
		EstoqueBO bo = new EstoqueBO();
		return bo.pesquisaId(id);
	}

}
