package Validator;

import java.util.regex.Pattern;

import VO.ProdutoVO;

public class ProdutoValidation {

	public boolean validaProduto(ProdutoVO pVO) throws Exception{
	
		boolean retorno = true;
		
		if(pVO.getCodigo() == 0){
			retorno = false;
			throw new Exception("Favor informar um Código válido");
		}
		
		if(pVO.getNome().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o Nome do produto");
		}
		
//		if(pVO.getData() == null) {
//			retorno = false;
//			throw new Exception("Favor informar a Data De Validade do produto");	
//		}
//		
//		if(pVO.getValor() == 0.0) {
//			retorno = false;
//			throw new Exception("Favor informar o Valor do produto");
//		}
//		
//		if(pVO.getQuan() == 0) {
//			retorno = false;
//			throw new Exception("Favor informar a Quantidade do produto");
//		}
//		
//		if(pVO.getPeso() == 0.0) {
//			retorno = false;
//			throw new Exception("Favor informar o Peso do produto");
//		}
		
		return retorno;
		
	}

}
