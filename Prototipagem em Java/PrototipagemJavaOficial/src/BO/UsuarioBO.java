package BO;

import DAO.UsuarioDAO;
import VO.UsuarioVO;
import Validator.UsuarioValidation;

public class UsuarioBO {

	public void cadastrarUsuario(UsuarioVO uVO) throws Exception {
		UsuarioValidation uValidation = new UsuarioValidation();
		UsuarioDAO uDAO = new UsuarioDAO();

		boolean retorno = uValidation.validaUsuario(uVO);

		if (retorno) {
			uDAO.cadastrarUsuario(uVO);
		}

	}

}
