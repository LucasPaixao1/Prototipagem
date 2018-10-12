package Validator;

import VO.UsuarioVO;

public class UsuarioValidation {

	public boolean validaUsuario(UsuarioVO uVO) throws Exception {
		boolean retorno = true;

		if (uVO.getNome().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o nome");

		}
		if (uVO.getLogin().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o Login");
		}
		if (uVO.getSenha().equals("")) {
			retorno = false;
			throw new Exception("Favor informar a senha");
		}
		if (uVO.getEmail().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o Email");

		}

		return retorno;
	}

}
