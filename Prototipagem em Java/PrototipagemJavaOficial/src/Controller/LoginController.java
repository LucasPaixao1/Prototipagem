package Controller;

import BO.LoginBO;
import VO.LoginVO;

public class LoginController {

	public String logar(LoginVO loginVO) throws Exception {
		LoginBO loginBO = new LoginBO();
		
		return loginBO.logar(loginVO);
		// TODO Auto-generated method stub
		
	}

}
