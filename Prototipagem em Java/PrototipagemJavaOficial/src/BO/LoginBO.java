package BO;

import DAO.LoginDAO;
import VO.LoginVO;

public class LoginBO {

	public String logar(LoginVO loginVO) throws Exception {
		LoginDAO loginDAO = new LoginDAO();
		return loginDAO.logar(loginVO);
	}

}
