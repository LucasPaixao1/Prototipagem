package Validator;

import VO.LembreteVO;

public class LembreteValidation {

	public boolean validaLembrete(LembreteVO lVO) throws Exception {
		boolean retorno = true;

		
		if (lVO.getData().equals("")) {
			retorno = false;
			throw new Exception("Favor informar a data ");
		}

		if (lVO.getDescricao().equals("")) {
			retorno = false;
			
			throw new Exception("Favor informar a descrição");
		}
		if (lVO.getAssunto().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o assunto");
		}
		return retorno;

	}
}
