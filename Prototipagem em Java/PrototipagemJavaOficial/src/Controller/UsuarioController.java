package Controller;

import BO.UsuarioBO;
import VO.UsuarioVO;

public class UsuarioController {

		public void cadastroDeUsuario(UsuarioVO uVO) throws Exception{
			UsuarioBO uBO = new UsuarioBO();
			uBO.cadastrarUsuario(uVO);
			
		}
}
