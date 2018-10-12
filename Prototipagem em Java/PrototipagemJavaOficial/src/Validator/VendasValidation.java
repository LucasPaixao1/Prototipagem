package Validator;

import VO.VendasVO;

public class VendasValidation {

	public boolean validarVendas(VendasVO vendasVO) throws Exception {
		boolean retorno = true;

		if (vendasVO.getCodigo() < 0) {
			retorno = false;
			throw new Exception("Favor informar um código maior que 0");
		}
		if (vendasVO.getCodigo() == 0) {
			retorno = false;
			throw new Exception("Favor informar um código válido");
		}
		if (vendasVO.getCodigoProduto() == 0) {
			retorno = false;
			throw new Exception("Favor informar um código válido");
		}
		if (vendasVO.getCodigoProduto() < 0) {
			retorno = false;
			throw new Exception("Favor informar um código maior que 0");
		}
		if (vendasVO.getDataVenda() == null) {
			retorno = false;
			throw new Exception("Favor informar a data da venda");
		}
		
		if (vendasVO.getPeso() <= 0) {
			retorno = false;
			throw new Exception("Favor informar o peso do produto");
		}
		if (vendasVO.getQuantidade() <= 0) {
			retorno = false;
			throw new Exception("Favor informar a quantidade");
		}
		if (vendasVO.getValor() <= 0) {
			retorno = false;
			throw new Exception("Favor informar o valor do produto");
		}

		return retorno;

	}

}
