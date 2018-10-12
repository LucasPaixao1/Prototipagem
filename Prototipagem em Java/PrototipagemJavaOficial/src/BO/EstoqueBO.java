package BO;

import java.util.List;

import DAO.EstoqueDAO;
import VO.EstoqueVO;

public class EstoqueBO {

	public List<EstoqueVO> listarProdutos() throws Exception {
		EstoqueDAO estoqueDAO = new EstoqueDAO();
		return estoqueDAO.listarProdutos();
	}

	public List<EstoqueVO> pesquisaNome(String nome) throws Exception {
		EstoqueDAO estoqueDAO = new EstoqueDAO();
		return estoqueDAO.pesquisaNome(nome);
	}

	public EstoqueVO pesquisaId(int id) throws Exception {
		EstoqueDAO estoqueDAO = new EstoqueDAO();
		return estoqueDAO.pesquisaId(id);
	}


}
