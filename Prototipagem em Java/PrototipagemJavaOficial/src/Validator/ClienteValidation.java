package Validator;




import VO.ClienteVO;


public class ClienteValidation {

	public boolean validaCliente(ClienteVO cVO) throws Exception {

		boolean retorno = true;

		if (cVO.getCodigo() == 0) {
			retorno = false;
			throw new Exception("Favor informar um C�digo v�lido");

		}
		if(cVO.getCodigo()<=0){
			retorno = false;
			throw new Exception("Favor informar um C�digo v�lido");
		}

		if (cVO.getNome().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o nome do produto");
		}
		if (cVO.getCnpj().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o CNPJ");
		}
		if (cVO.getCpf().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o CPF");
		}
		if (cVO.getBairro().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o Bairro");
		}
		if (cVO.getCel().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o Celular");
		}
		if (cVO.getCep().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o cep");
		}
		if (cVO.getCidade().equals("")) {
			retorno = false;
			throw new Exception("Favor informar a Cidade");
		}
		if (cVO.getFixo().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o telefone fixo");
		}

		if (cVO.getNextel().equals("")) {
			retorno = false;
			throw new Exception("Favor informar o N�mero do Nextel");
		}
	    return retorno;
	}
}

	