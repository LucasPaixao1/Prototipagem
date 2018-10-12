package Validator;

import VO.EsquecerSenhaVO;

public class EsquecerSenhaValidation {

	public boolean esquecerSenha(EsquecerSenhaVO esquecerSenha) throws Exception {

		boolean retorno = true;

		if (esquecerSenha.getEmail().equals("")) {
			retorno = false;
			throw new Exception("Campo de email vazio");
		}

		return retorno;

	}

}
