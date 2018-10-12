package BO;

import DAO.EsquecerSenhaDAO;
import DAO.VendasDAO;
import VO.EsquecerSenhaVO;
import Validator.EsquecerSenhaValidation;
import Validator.VendasValidation;

public class EsquecerSenhaBO {

	public void criarSenha(EsquecerSenhaVO esquecerSenha) throws Exception {
		EsquecerSenhaValidation esquecerValidator = new EsquecerSenhaValidation();
		EsquecerSenhaDAO esquecerSenhaDAO = new EsquecerSenhaDAO();
		boolean retorno = esquecerValidator.esquecerSenha(esquecerSenha);
		
		if(retorno){
			esquecerSenhaDAO.esquecerSenha(esquecerSenha);
		}
		
	}
		
	}


