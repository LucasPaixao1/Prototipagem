package Controller;

import BO.EsquecerSenhaBO;
import VO.EsquecerSenhaVO;

public class EsquecerSenhaController {

	public void criarSenha(EsquecerSenhaVO esquecerSenha) throws Exception {
	EsquecerSenhaBO esquecerSenhaBO = new EsquecerSenhaBO();
	esquecerSenhaBO.criarSenha(esquecerSenha);
		
	}
	

}
