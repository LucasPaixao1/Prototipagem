package Controller;

import java.util.List;

import BO.ProdutoBO;
import VO.ProdutoVO;

public class ProdutoController {

	public void cadastroDeProduto(ProdutoVO produtoVO) throws Exception {
		ProdutoBO produtoBO = new ProdutoBO();
		produtoBO.cadastrarProduto(produtoVO);

	}

	public List<ProdutoVO> pesquisarProdutoTodos() throws Exception {

		ProdutoBO produtoBO = new ProdutoBO();
		return produtoBO.getDados();

	}

	public String excluir(ProdutoVO produtoVO) throws Exception {

		ProdutoBO produtoBO = new ProdutoBO();

		return produtoBO.excluir(produtoVO);

	}

	public void alteraProduto(ProdutoVO produtoVO) throws Exception {
		ProdutoBO produtoBO = new ProdutoBO();

		produtoBO.alterarProduto(produtoVO);
	}

	public ProdutoVO pesquisarPorCodigo(int codigo) throws Exception {
		
		ProdutoBO produtoBO = new ProdutoBO();

		return produtoBO.pesquisarPorCodigo(codigo);
		
	}

	public List<ProdutoVO> pesquisarPorNome(String nome) throws Exception {
		ProdutoBO bo = new ProdutoBO();
		
		return bo.pesquisarPorNome(nome);
	}

	public void cadastroDeEntrada(ProdutoVO produtoVO) throws Exception {
		
		ProdutoBO bo = new ProdutoBO();
		
		bo.cadastrarEntrada(produtoVO);
		
	}

	public List<ProdutoVO> listarLotes() throws Exception {
		ProdutoBO produtoBO = new ProdutoBO();

		return produtoBO.listarLotes();
	}

	public ProdutoVO pesquisarPorLote(int codigo) throws Exception {
		ProdutoBO produtoBO = new ProdutoBO();

		return produtoBO.pesquisarPorLote(codigo);
	}

	public void alteraLote(ProdutoVO produtoVO) throws Exception {
		ProdutoBO produtoBO = new ProdutoBO();

		produtoBO.alterarLote(produtoVO);
		
	}

	public String excluirLote(int codigo) throws Exception {
		ProdutoBO produtoBO = new ProdutoBO();

		return produtoBO.excluirLote(codigo);

	}

}
