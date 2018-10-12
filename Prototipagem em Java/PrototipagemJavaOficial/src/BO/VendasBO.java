package BO;

import java.util.List;

import DAO.VendasDAO;
import VO.VendasVO;
import Validator.VendasValidation;

public class VendasBO {

	public void cadastrarVendas(VendasVO vendasVO) throws Exception {
		VendasValidation vendasvalidator = new VendasValidation();
		VendasDAO vendasDAO = new VendasDAO();
		boolean retorno = vendasvalidator.validarVendas(vendasVO);
		
		if(retorno){
			vendasDAO.cadastrarVendas(vendasVO);
		}
		
	}

	public List<VendasVO> getDados() throws Exception {
		
		VendasDAO vendasDAO = new VendasDAO();
		
		
		return vendasDAO.pesquisarVendasTodos();
	}

	public void alteraVenda(VendasVO vendasVO) throws Exception {
		
		VendasValidation vendasvalidator = new VendasValidation();
		VendasDAO vendasDAO = new VendasDAO();
		boolean retorno = vendasvalidator.validarVendas(vendasVO);
		
		if(retorno){
			vendasDAO.alteraVendas(vendasVO);
		}
		
	}

	public boolean excluir(VendasVO vendasVO) throws Exception {
		VendasDAO vendasDAO = new VendasDAO();
		return vendasDAO.excluir(vendasVO);
	}

	public VendasVO pesquisarPorCodigo(int codigo) throws Exception {
		VendasDAO vendasDAO = new VendasDAO();
		
		return vendasDAO.pesquisarPorCodigo(codigo);
	}

}
