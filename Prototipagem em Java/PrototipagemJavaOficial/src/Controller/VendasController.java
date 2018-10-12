package Controller;

import java.util.List;

import BO.VendasBO;
import VO.VendasVO;

public class VendasController {

	public void cadastrarvendas(VendasVO vendas) throws Exception {

		VendasBO vendasBO = new VendasBO();
		vendasBO.cadastrarVendas(vendas);

	}

	public List<VendasVO> pesquisaVendasTodos() throws Exception {

		VendasBO vendasBO = new VendasBO();

		return vendasBO.getDados();
	}

	public void alteraVenda(VendasVO vendasVO) throws Exception {
		VendasBO vendasBO = new VendasBO();
		vendasBO.alteraVenda(vendasVO);
		
	}

	public boolean excluir(VendasVO vendasVO) throws Exception {
		VendasBO vendas = new VendasBO();
		
		return vendas.excluir(vendasVO);
	}

	public VendasVO pesquisarPorCodigo(int codigo) throws Exception {
		VendasBO vendasBO = new VendasBO();
		
		return vendasBO.pesquisarPorCodigo(codigo);
	}

}
