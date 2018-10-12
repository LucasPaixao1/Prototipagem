package Controller;

import java.util.Date;

import BO.RelatorioVendasBO;
import VO.RelatorioVendasVO;

public class RelatorioController {

	public RelatorioVendasVO getDadosRelatoriosVendas(Date datainicio, Date datafinal) throws Exception {
		RelatorioVendasBO relatorioVendasBO = new RelatorioVendasBO();

		return relatorioVendasBO.getDadosRelatoriosVendas(datainicio, datafinal);
	}

}
