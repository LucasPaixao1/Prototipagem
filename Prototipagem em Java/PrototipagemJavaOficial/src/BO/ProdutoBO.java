package BO;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import DAO.ProdutoDAO;
import VO.ProdutoVO;
import Validator.ProdutoValidation;

public class ProdutoBO {

	public void cadastrarProduto(ProdutoVO produtoVO) throws Exception {
		ProdutoValidation pValidation = new ProdutoValidation();
		ProdutoDAO produtoDAO = new ProdutoDAO();

		boolean retorno = pValidation.validaProduto(produtoVO);

		if (retorno) {
			produtoDAO.cadastraProduto(produtoVO);
		}
	}

	public List<ProdutoVO> getDados() throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		return produtoDAO.pesquisarProdutoTodos();
	}

	public String excluir(ProdutoVO produtoVO) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		return produtoDAO.excluir(produtoVO);

	}

	public void alterarProduto(ProdutoVO produtoVO) throws Exception {
		ProdutoValidation pValidation = new ProdutoValidation();
		ProdutoDAO produtoDAO = new ProdutoDAO();

		boolean retorno = pValidation.validaProduto(produtoVO);

		if (retorno) {
			produtoDAO.alteraProduto(produtoVO);
		}
	}

	public ProdutoVO pesquisarPorCodigo(int codigo) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		return produtoDAO.pesquisarPorId(codigo);
	}

	public List<ProdutoVO> pesquisarPorNome(String nome) throws Exception {
		ProdutoDAO DAO = new ProdutoDAO();
		return DAO.pesquisarPorNome(nome);
	}

	public void cadastrarEntrada(ProdutoVO produtoVO) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		produtoDAO.cadastraEntrada(produtoVO);
	}

	public List<ProdutoVO> listarLotes() throws Exception {
		ProdutoDAO DAO = new ProdutoDAO();
		return DAO.listarLotes();
	}

	public ProdutoVO pesquisarPorLote(int codigo) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		return produtoDAO.pesquisarPorLote(codigo);
	}

	public void alterarLote(ProdutoVO produtoVO) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		produtoDAO.alteraLote(produtoVO);

	}

	public String excluirLote(int codigo) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();

		return produtoDAO.excluirLote(codigo);
	}

}
