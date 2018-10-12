package BO;

import java.util.Date;

import DAO.RelatorioVendasDAO;
import VO.RelatorioVendasVO;

public class RelatorioVendasBO {

	public RelatorioVendasVO getDadosRelatoriosVendas(Date datainicio, Date datafinal) throws Exception {
		RelatorioVendasDAO relatorioVendasDAO = new RelatorioVendasDAO();
		
		
		return relatorioVendasDAO.getDadosRelatoriosVendas(datainicio, datafinal);
	}

}
